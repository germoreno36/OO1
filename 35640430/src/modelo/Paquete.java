package modelo;

public class Paquete {
	private int id;
	private String codigo;
	private int pesoEnKilos;
	public Paquete(int id, String codigo, int pesoEnKilos) {
		this.id = id;
		this.codigo = codigo;
		this.pesoEnKilos = pesoEnKilos;
	}
	//------------------------------------
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getPesoEnKilos() {
		return pesoEnKilos;
	}
	public void setPesoEnKilos(int pesoEnKilos) {
		this.pesoEnKilos = pesoEnKilos;
	}
	//------------------------------------
	@Override
	public String toString() {
		return "Paquete [id=" + id + ", codigo=" + codigo + ", pesoEnKilos=" + pesoEnKilos + "]\n";
	}
	

}
