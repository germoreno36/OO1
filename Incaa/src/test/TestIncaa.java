package test;


import modelo.Incaa;


public class TestIncaa {

	public static void main(String[] args) {
		Incaa L1 = new Incaa();
		try{
			L1.agregarPelicula("El último Samurai");
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
			L1.agregarPelicula("Capitán América");
			L1.agregarPelicula("El peleador");
			L1.agregarPelicula("El último Samurai");
			L1.agregarPelicula("Space Jam");
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
			}
		System.out.println("El último Samurai, corta y no agrega -Space Jam-\n");
		System.out.println("---Catálogo de películas---");	
		System.out.println(L1.getCatalogo());
		//------------------------------------
		//------------------------------------ Traer película ID
		int idTraer = 2;
		try{
			System.out.println("Traer pelicula: " + idTraer);
			System.out.println(L1.traerPelicula(idTraer));
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------ Traer película ID No Existe
		idTraer = 15;
		try{
			System.out.println("Traer pelicula: " + idTraer);
			System.out.println(L1.traerPelicula(idTraer));
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------
		//------------------------------------ Traer película partePelicula
		String parte = "iratas";
		try{
			System.out.println("\nTraer pelicula: " + parte);
			System.out.println(L1.traerPelicula(parte));
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------ Traer película partePelicula No Existe
		parte = "Guerra";
		try{
			System.out.println("\nTraer pelicula: " + parte);
			System.out.println(L1.traerPelicula(parte));
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------
		//------------------------------------ Modificar película
		int idModificar = 13;
		String tituloModificar = "Capitán América: Civil War";
		try{
			System.out.println("\nModificar pelicula: " + idModificar);
			L1.modificarPelicula(idModificar, tituloModificar);
			System.out.println("---Catálogo de películas modificado---");	
			System.out.println(L1.getCatalogo());
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------ Modificar película Error ID
		idModificar = 17;
		tituloModificar = "Hombres de honor";
		try{
			System.out.println("\nModificar pelicula: " + idModificar);
			L1.modificarPelicula(idModificar, tituloModificar);
			System.out.println("---Catálogo de películas modificado---");	
			System.out.println(L1.getCatalogo());
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------
		//------------------------------------ Eliminar película
		int idEliminar = 11;
		try{
			System.out.println("\nEliminar pelicula: " + idEliminar);
			L1.eliminarPelicula(idEliminar);
			System.out.println("---Catálogo de películas modificado---");	
			System.out.println(L1.getCatalogo());
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
		//------------------------------------
		//------------------------------------ Eliminar película Error ID
		idEliminar = 18;
		try{
			System.out.println("\nEliminar pelicula: " + idEliminar);
			L1.eliminarPelicula(idEliminar);
			System.out.println("\n---Catálogo de películas modificado---");	
			System.out.println(L1.getCatalogo());
		}
		catch (Exception e){
			System.out.println("Excepcion: " + e.getMessage());
		}
	}

}
