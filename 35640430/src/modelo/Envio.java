package modelo;
import java.util.GregorianCalendar;

public class Envio {
	private String codigo;
	private Paquete paquete;
	private Cliente remitente;
	private Cliente destinatario;
	private TipoDeEnvio tipoDeEnvio;
	private GregorianCalendar fechaDeAlta;
	private boolean entregado;
	//------------------------------------
	public Envio(String codigo, Paquete paquete, Cliente remitente, Cliente destinatario, TipoDeEnvio tipoDeEnvio,
			GregorianCalendar fechaDeAlta, boolean entregado) {
		this.codigo = codigo;
		this.paquete = paquete;
		this.remitente = remitente;
		this.destinatario = destinatario;
		this.tipoDeEnvio = tipoDeEnvio;
		this.fechaDeAlta = fechaDeAlta;
		this.entregado = entregado;
	}
	//------------------------------------
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Paquete getPaquete() {
		return paquete;
	}
	public void setPaquete(Paquete paquete) {
		this.paquete = paquete;
	}
	public Cliente getRemitente() {
		return remitente;
	}
	public void setRemitente(Cliente remitente) {
		this.remitente = remitente;
	}
	public Cliente getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(Cliente destinatario) {
		this.destinatario = destinatario;
	}
	public TipoDeEnvio getTipoDeEnvio() {
		return tipoDeEnvio;
	}
	public void setTipoDeEnvio(TipoDeEnvio tipoDeEnvio) {
		this.tipoDeEnvio = tipoDeEnvio;
	}
	public GregorianCalendar getFechaDeAlta() {
		return fechaDeAlta;
	}
	public void setFechaDeAlta(GregorianCalendar fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}
	public boolean isEntregado() {
		return entregado;
	}
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	//------------------------------------
	@Override
	public String toString() {
		return "Envio [codigo=" + codigo + ", paquete=" + paquete + ", remitente=" + remitente + ", destinatario="
				+ destinatario + ", tipoDeEnvio=" + tipoDeEnvio + ", fechaDeAlta=" + Funciones.traerFechaCorta(fechaDeAlta) + ", entregado="
				+ entregado + "]\n";
	}
	
	

}
