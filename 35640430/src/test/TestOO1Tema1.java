package test;
import modelo.SistemaCorreo;
import modelo.Funciones;
public class TestOO1Tema1 {

	public static void main(String[] args) {
		SistemaCorreo sistema = new SistemaCorreo();
		//------------------------------------ 1) Agregar e imprimir los tipos de envio
		System.out.println("1) Agregar e imprimir los tipos de envio");
		try {
			sistema.agregarTipoDeEnvio("estandar", 5.0f, 350.0f, 100.0f);
			sistema.agregarTipoDeEnvio("prioritario", 5.0f, 550.0f, 150.0f);
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------
		System.out.println("Prueba por ID 2");
		System.out.println(sistema.traerTipoDeEnvio(2));
		
		System.out.println("Lista de tipos de envios");
		System.out.println(sistema.traerTipoDeEnvio());
		//------------------------------------
		//------------------------------------ 2) Agregar e imprimir los clientes
		System.out.println("2) Agregar e imprimir los clientes");
		try {
			sistema.agregarCliente("Alejandra", "Vranic", 15351456, "Malabia 123");
			sistema.agregarCliente("Romina", "Mansilla", 30741265, "Yrigoyen 7530");
			sistema.agregarCliente("Gustavo", "Siciliano", 32473231, "Santo Domingo 153");
			sistema.agregarCliente("Alejandro", "macula", 37841354, "Saenz Pena 432");
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------
		System.out.println("Prueba por DNI 32473231");
		System.out.println(sistema.traerCliente(32473231));
		
		System.out.println("Lista de clientes");
		System.out.println(sistema.traerCliente());
		//------------------------------------
		//------------------------------------ 3) Intentar agregar (falido) cliente existente
		System.out.println("3) Intentar agregar (falido) cliente existente");
		try {
			sistema.agregarCliente("Alejandra", "Vranic", 15351456, "Malabia 123");
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------
		//------------------------------------ 4) Agregar e imprimir los paquetes
		System.out.println("4) Agregar e imprimir los paquetes");
		try {
			sistema.agregarPaquete("KFB477", 7);
			sistema.agregarPaquete("RXZ421", 5);
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------
		System.out.println("Prueba por codigo KFB477");
		System.out.println(sistema.traerPaquete("KFB477"));
		
		System.out.println("Lista de paquetes");
		System.out.println(sistema.traerPaquete());
		//------------------------------------
		//------------------------------------ 5) Intentar agregar (fallido) paquete con peso negativo
		System.out.println("5) Intentar agregar (fallido) paquete con peso negativo");
		try {
			sistema.agregarPaquete("JLM777", -4);
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------
		//------------------------------------ 6) Agregar e imprimir los envios con su respectivos paquetes
		System.out.println("6) Agregar e imprimir los envios con su respectivos paquetes");
		try {
			sistema.agregarEnvio("D983FS1", sistema.traerCliente(15351456), sistema.traerCliente(30741265), sistema.traerPaquete("KFB477"), sistema.traerTipoDeEnvio(1), Funciones.traerFecha("18/06/2018"), false);
			sistema.agregarEnvio("KN77L2D", sistema.traerCliente(32473231), sistema.traerCliente(37841354), sistema.traerPaquete("RXZ421"), sistema.traerTipoDeEnvio(2), Funciones.traerFecha("17/06/2018"), false);
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------
		System.out.println("Prueba por codigo D983FS1");
		System.out.println(sistema.traerEnvio("D983FS1"));
		
		System.out.println("Lista de envios");
		System.out.println(sistema.traerEnvio());
		//------------------------------------
		//------------------------------------ 7) Intentar agregar (fallido) envio con el mismo remitente y detinatario
		System.out.println("7) Intentar agregar (fallido) envio con el mismo remitente y detinatario");
		System.out.println("Cliente 2 como remitente y detinatario");
		try {
			sistema.agregarEnvio("AAA999B", sistema.traerCliente(30741265), sistema.traerCliente(30741265), sistema.traerPaquete("KFB477"), sistema.traerTipoDeEnvio(1), Funciones.traerFecha("18/06/2018"), false);
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------
		//------------------------------------ 8) Cotizar un envio de 7kg con todos los tipos de envio
		System.out.println("8) Cotizar un envio de 7kg con todos los tipos de envio");
		try {
			System.out.println(sistema.cotizarEnvio(7f));
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------
		//------------------------------------ 9) Traer todos los envios no entregados del dia 18/06/2018
		System.out.println("9) Traer todos los envios no entregados del dia 18/06/2018");
		try {
			System.out.println(sistema.traerEnvio(Funciones.traerFecha("18/06/2018"), false));
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------
		//------------------------------------ 10) Traer el peso total de todos los paquetes enviados o por enviar del dia 18/06/2018
		System.out.println("10) Traer el peso total de todos los paquetes enviados o por enviar del dia 18/06/2018");
		try {
			System.out.println(sistema.calcularPesoTotalPaquetes(Funciones.traerFecha("18/06/2018")));
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}	
	}
}
