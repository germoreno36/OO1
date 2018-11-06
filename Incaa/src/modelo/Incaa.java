package modelo;

import java.util.ArrayList;
import java.util.List;
import modelo.Pelicula;

public class Incaa {
	private List<Pelicula> catalogo;
	
	public Incaa() {
		this.catalogo = new ArrayList<Pelicula>();
	}
	//------------------------------------
	public List<Pelicula> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}
	//------------------------------------ Agregar película
	public boolean agregarPelicula(String pelicula)throws Exception{
		Pelicula existe = this.traerPeliculaNombreC(pelicula);
		if (existe != null) throw new Exception("La pelícla ya existe");
		int id = 1;
		if (!catalogo.isEmpty()){
			id = (catalogo.get(catalogo.size()-1).getIdPelicula())+1;
		}
		return catalogo.add(new Pelicula(id, pelicula));
	}
	//------------------------------------ """Traer película Nombre Completo"""
	public Pelicula traerPeliculaNombreC (String pelicula){
		Pelicula peliculaExiste = null;
		int i = 0;
		while (peliculaExiste == null && i < catalogo.size()) {
			if (catalogo.get(i).getPelicula().equalsIgnoreCase(pelicula)){
				peliculaExiste = catalogo.get(i);	
			}
			i++;
		}
		return peliculaExiste;
	}
	//------------------------------------ Traer película ID
	public Pelicula traerPelicula(int idPelicula)throws Exception{
		Pelicula peliculaBuscada = null;
		int i = 0;
		while (peliculaBuscada == null && i< catalogo.size()) {
			if (idPelicula == catalogo.get(i).getIdPelicula()){
				peliculaBuscada = catalogo.get(i);
			}
			i++;
		}
		if (peliculaBuscada == null) throw new Exception ("La película no existe (ID)");
		return peliculaBuscada;
	}
	//------------------------------------ Traer partePelícula
	public List<Pelicula> traerPelicula(String partePelicula)throws Exception{
		List<Pelicula> peliculasBuscadasP = new ArrayList<Pelicula>();
		for (int i = 0; i < catalogo.size(); i++) {
			if (catalogo.get(i).getPelicula().contains(partePelicula)){
				peliculasBuscadasP.add(catalogo.get(i));
			}
		}
		if (peliculasBuscadasP.isEmpty()) throw new Exception ("No existen películas con ese nombre");
		return peliculasBuscadasP;
	}
	//------------------------------------ Modificar película
	public boolean modificarPelicula(int idPelicula, String pelicula)throws Exception{
		Pelicula peliculaModificar = this.traerPelicula(idPelicula);
		if (peliculaModificar == null)throw new Exception ("No existe una pelicula con ese ID");
		int i = 0;
		boolean salir = false;
		while (salir == false && i < catalogo.size()){
			if (idPelicula == catalogo.get(i).getIdPelicula()){
				catalogo.get(i).setPelicula(pelicula);
				salir = true;
			}
			i++;
		}
		return true;
	}
	//------------------------------------ Eliminar película
	public boolean eliminarPelicula(int idPelicula)throws Exception{
		Pelicula peliculaEliminar = this.traerPelicula(idPelicula);
		if (peliculaEliminar == null)throw new Exception ("No existe una pelicula con ese ID");
		return catalogo.remove(peliculaEliminar);		
	}
	//------------------------------------
}
