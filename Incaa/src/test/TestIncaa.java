package test;


import modelo.Incaa;


public class TestIncaa {

	public static void main(String[] args) {
		Incaa L1 = new Incaa();
		try{
			L1.agregarPelicula("El �ltimo Samurai");
			L1.agregarPelicula("Piratas del Caribe");
			L1.agregarPelicula("IronMan");
			L1.agregarPelicula("IronMan 2");
			L1.agregarPelicula("Avengers");
			L1.agregarPelicula("Avengers Age of Ultron");
			L1.agregarPelicula("Juego de Honor");
			L1.agregarPelicula("Golpe Bajo");
			L1.agregarPelicula("Guardianes de la Galaxia");
			L1.agregarPelicula("Doctor Strange");
			L1.agregarPelicula("V de Venganza");
			L1.agregarPelicula("Gladiador");
			L1.agregarPelicula("Capit�n Am�rica");
			L1.agregarPelicula("El peleador");
			L1.agregarPelicula("El �ltimo Samurai");
			L1.agregarPelicula("Space Jam");
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
			}
		System.out.println("El �ltimo Samurai, corta y no agrega -Space Jam-\n");
		System.out.println("---Cat�logo de pel�culas---");	
		System.out.println(L1.getCatalogo());
		//------------------------------------
		//------------------------------------ Traer pel�cula ID
		int idTraer = 2;
		try{
			System.out.println("Traer pelicula: " + idTraer);
			System.out.println(L1.traerPelicula(idTraer));
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------ Traer pel�cula ID No Existe
		idTraer = 15;
		try{
			System.out.println("Traer pelicula: " + idTraer);
			System.out.println(L1.traerPelicula(idTraer));
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------
		//------------------------------------ Traer pel�cula partePelicula
		String parte = "iratas";
		try{
			System.out.println("\nTraer pelicula: " + parte);
			System.out.println(L1.traerPelicula(parte));
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------ Traer pel�cula partePelicula No Existe
		parte = "Guerra";
		try{
			System.out.println("\nTraer pelicula: " + parte);
			System.out.println(L1.traerPelicula(parte));
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------
		//------------------------------------ Modificar pel�cula
		int idModificar = 13;
		String tituloModificar = "Capit�n Am�rica: Civil War";
		try{
			System.out.println("\nModificar pelicula: " + idModificar);
			L1.modificarPelicula(idModificar, tituloModificar);
			System.out.println("---Cat�logo de pel�culas modificado---");	
			System.out.println(L1.getCatalogo());
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------ Modificar pel�cula Error ID
		idModificar = 17;
		tituloModificar = "Hombres de honor";
		try{
			System.out.println("\nModificar pelicula: " + idModificar);
			L1.modificarPelicula(idModificar, tituloModificar);
			System.out.println("---Cat�logo de pel�culas modificado---");	
			System.out.println(L1.getCatalogo());
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------
		//------------------------------------ Eliminar pel�cula
		int idEliminar = 11;
		try{
			System.out.println("\nEliminar pelicula: " + idEliminar);
			L1.eliminarPelicula(idEliminar);
			System.out.println("---Cat�logo de pel�culas modificado---");	
			System.out.println(L1.getCatalogo());
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------
		//------------------------------------ Eliminar pel�cula Error ID
		idEliminar = 18;
		try{
			System.out.println("\nEliminar pelicula: " + idEliminar);
			L1.eliminarPelicula(idEliminar);
			System.out.println("\n---Cat�logo de pel�culas modificado---");	
			System.out.println(L1.getCatalogo());
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
	}

}
