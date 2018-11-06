package modelo;

public class TipoDeEnvio {
	private int id;
	private String nombre;
	private float precio;
	private float pesoMaximoEnKilos;
	private float precioPorKilosExcedente;
	public TipoDeEnvio(int id, String nombre, float precio, float pesoMaximoEnKilos, float precioPorKilosExcedente) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.pesoMaximoEnKilos = pesoMaximoEnKilos;
		this.precioPorKilosExcedente = precioPorKilosExcedente;
	}
	//------------------------------------
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getPesoMaximoEnKilos() {
		return pesoMaximoEnKilos;
	}
	public void setPesoMaximoEnKilos(float pesoMaximoEnKilos) {
		this.pesoMaximoEnKilos = pesoMaximoEnKilos;
	}
	public float getPrecioPorKilosExcedente() {
		return precioPorKilosExcedente;
	}
	public void setPrecioPorKilosExcedente(float precioPorKilosExcedente) {
		this.precioPorKilosExcedente = precioPorKilosExcedente;
	}
	//------------------------------------
	@Override
	public String toString() {
		return "TipoDeEnvio [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", pesoMaximoEnKilos="
				+ pesoMaximoEnKilos + ", precioPorKilosExcedente=" + precioPorKilosExcedente + "]\n";
	}
	

}
