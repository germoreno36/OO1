package modelo;

import java.util.List;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class SistemaCorreo {
	private List<Cliente> lstClientes;
	private List<Envio> lstEnvios;
	private List<TipoDeEnvio> lstTiposDeEnvio;
	private List<Paquete> lstPaquetes;
	// ------------------------------------
	public SistemaCorreo() {

		this.lstClientes = new ArrayList<Cliente>();
		this.lstEnvios = new ArrayList<Envio>();
		this.lstTiposDeEnvio = new ArrayList<TipoDeEnvio>();
		this.lstPaquetes = new ArrayList<Paquete>();
	}
	// ------------------------------------
	public List<Cliente> getLstClientes() {
		return lstClientes;
	}
	public void setLstClientes(List<Cliente> lstClientes) {
		this.lstClientes = lstClientes;
	}
	public List<Envio> getLstEnvios() {
		return lstEnvios;
	}
	public void setLstEnvios(List<Envio> lstEnvios) {
		this.lstEnvios = lstEnvios;
	}
	public List<TipoDeEnvio> getLstTiposDeEnvio() {
		return lstTiposDeEnvio;
	}
	public void setLstTiposDeEnvio(List<TipoDeEnvio> lstTiposDeEnvio) {
		this.lstTiposDeEnvio = lstTiposDeEnvio;
	}
	public List<Paquete> getLstPaquetes() {
		return lstPaquetes;
	}
	public void setLstPaquetes(List<Paquete> lstPaquetes) {
		this.lstPaquetes = lstPaquetes;
	}
	// ------------------------------------
	@Override
	public String toString() {
		return "SistemaCorreo [lstClientes=" + lstClientes + ", lstEnvios=" + lstEnvios + ", lstTiposDeEnvio="
				+ lstTiposDeEnvio + ", lstPaquetes=" + lstPaquetes + "]";
	}
	// ------------------------------------
	// ------------------------------------ 1+agregarTipoDeEnvio
	public boolean agregarTipoDeEnvio(String nombre, float pesoMaximoEnKilos, float precio, float precioPorKiloExcedente) {
		int id = 1;
		if (!lstTiposDeEnvio.isEmpty()){
			id = (lstTiposDeEnvio.get(lstTiposDeEnvio.size()-1).getId())+1;
		}
		return (lstTiposDeEnvio.add(new TipoDeEnvio(id, nombre, precio, pesoMaximoEnKilos, precioPorKiloExcedente)));
	}
	// ------------------------------------
	// ------------------------------------2+traerTipoDeEnvio
	public TipoDeEnvio traerTipoDeEnvio(int id){
		TipoDeEnvio tipoDeEnvioBuscado = null;
		int i = 0;
		while (tipoDeEnvioBuscado == null && i< lstTiposDeEnvio.size()) {
			if (id == lstTiposDeEnvio.get(i).getId()){
				tipoDeEnvioBuscado = lstTiposDeEnvio.get(i);
			}
			i++;
		}
		return tipoDeEnvioBuscado;
	}
	// ------------------------------------
	// ------------------------------------3+traerTipoDeEnvio
	public List<TipoDeEnvio> traerTipoDeEnvio(){
		return lstTiposDeEnvio;
	}
	// ------------------------------------
	// ------------------------------------4+traerCliente
	public Cliente traerCliente(int dni){
		Cliente clienteBuscado = null;
		int i = 0;
		while (clienteBuscado == null && i< lstClientes.size()) {
			if (dni == lstClientes.get(i).getDni()){
				clienteBuscado = lstClientes.get(i);
			}
			i++;
		}
		return clienteBuscado;
	}
	// ------------------------------------
	// ------------------------------------5+agregarCliente
	public boolean agregarCliente(String nombre, String apellido, int dni, String direccion) throws Exception{
		Cliente clienteBuscado = traerCliente(dni);
		if(clienteBuscado != null) throw new Exception ("Error: el cliente que intenta ingresar ya existe en el sistema\n");
		int id = 1;
		if (!lstClientes.isEmpty()){
			id = (lstClientes.get(lstClientes.size()-1).getId())+1;
		}
		return (lstClientes.add(new Cliente(id, nombre, apellido, dni, direccion)));
	}
	// ------------------------------------
	// ------------------------------------6+traerCliente
	public List<Cliente> traerCliente(){
		return lstClientes;
	}
	// ------------------------------------
	// ------------------------------------7+traerPaquete
	public Paquete traerPaquete(String codigo){
		Paquete paqueteBuscado = null;
		int i = 0;
		while (paqueteBuscado == null && i< lstPaquetes.size()) {
			if (codigo.compareToIgnoreCase(lstPaquetes.get(i).getCodigo()) == 0){
				paqueteBuscado = lstPaquetes.get(i);
			}
			i++;
		}
		return paqueteBuscado;
	}
	// ------------------------------------
	// ------------------------------------8+agregarPaquete
	public boolean agregarPaquete(String codigo, int pesoEnKilos) throws Exception{
		Paquete paqueteBuscado = traerPaquete(codigo);
		if(paqueteBuscado != null) throw new Exception ("Paquete ya existente en la lista\n");
		if(pesoEnKilos<0) throw new Exception ("Error: el peso del paquete no puede ser negativo\n");
		int id = 1;
		if (!lstPaquetes.isEmpty()){
			id = (lstPaquetes.get(lstPaquetes.size()-1).getId())+1;
		}
		return (lstPaquetes.add(new Paquete(id, codigo, pesoEnKilos)));
	}
	// ------------------------------------
	// ------------------------------------9+traerPaquete
	public List<Paquete> traerPaquete(){
		return lstPaquetes;
	}
	// ------------------------------------
	// ------------------------------------10+traerEnvio
	public Envio traerEnvio(String codigo){
		Envio envioBuscado = null;
		int i = 0;
		while (envioBuscado == null && i< lstEnvios.size()) {
			if (codigo.compareToIgnoreCase(lstEnvios.get(i).getCodigo()) == 0){
				envioBuscado = lstEnvios.get(i);
			}
			i++;
		}
		return envioBuscado;
	}
	// ------------------------------------
	// ------------------------------------11+agregarEnvio
	public boolean agregarEnvio(String codigo, Cliente remitente, Cliente destinatario, Paquete paquete, TipoDeEnvio tipoDeEnvio, GregorianCalendar fechaDeAlta, boolean entregado) throws Exception{
		Envio envioBuscado = traerEnvio(codigo);
		if(envioBuscado != null) throw new Exception ("Envio ya existente en la lista\n");
		if(paquete == null) throw new Exception ("El paquete es null, no se puede agregar el envio\n");
		if(remitente.getDni() == destinatario.getDni()) throw new Exception ("Error: El remitente no puede ser el destinatario\n");
		return (lstEnvios.add(new Envio(codigo, paquete, remitente, destinatario, tipoDeEnvio, fechaDeAlta, entregado)));
	}
	// ------------------------------------
	// ------------------------------------12+traerEnvio
	public List<Envio> traerEnvio(){
		return lstEnvios;
	}
	// ------------------------------------
	// ------------------------------------13+traerEnvio
	public List<Envio> traerEnvio(GregorianCalendar fIni, boolean entregado){
		List<Envio> enviosBuscados = new ArrayList<Envio>();
		for (int i = 0; i < lstEnvios.size(); i++) {
			if (Funciones.sonFechasIguales(lstEnvios.get(i).getFechaDeAlta(), fIni) && lstEnvios.get(i).isEntregado() == entregado){
				enviosBuscados.add(lstEnvios.get(i));
			}
		}
		return enviosBuscados;
	}
	// ------------------------------------
	// ------------------------------------14+cotizarEnvio
	public String cotizarEnvio(float peso) {
		TipoDeEnvio envioEstandar = traerTipoDeEnvio(1);
		TipoDeEnvio envioPrioritario = traerTipoDeEnvio(2);
		float cotizacionEstandar = envioEstandar.getPesoMaximoEnKilos() * envioEstandar.getPrecio() + (peso - envioEstandar.getPesoMaximoEnKilos()) * envioEstandar.getPrecioPorKilosExcedente();
		float cotizacionPrioritario = envioPrioritario.getPesoMaximoEnKilos() * envioPrioritario.getPrecio() + (peso - envioPrioritario.getPesoMaximoEnKilos()) * envioPrioritario.getPrecioPorKilosExcedente();
		return ("Cotizacion Estandar: " + String.valueOf(cotizacionEstandar) + "\nCotizacion Prioritaria: " + String.valueOf(cotizacionPrioritario));
	}
	// ------------------------------------
	// ------------------------------------15+calcularPesoTotalPaquetes
	public float calcularPesoTotalPaquetes(GregorianCalendar fecha) {
		List<Envio> enviosBuscadosFalse = traerEnvio(fecha, false);
		int pesoTotalPaquetes = 0;
		for (int i=0; i < enviosBuscadosFalse.size(); i++) {
			pesoTotalPaquetes = pesoTotalPaquetes + enviosBuscadosFalse.get(i).getPaquete().getPesoEnKilos();
		}
		List<Envio> enviosBuscadosTrue = traerEnvio(fecha, true);
		for (int i=0; i < enviosBuscadosTrue.size(); i++) {
			pesoTotalPaquetes = pesoTotalPaquetes + enviosBuscadosTrue.get(i).getPaquete().getPesoEnKilos();
		}
		return pesoTotalPaquetes;
	}
}
