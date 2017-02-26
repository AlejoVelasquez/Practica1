
public class Pokemon {
	
	private String nombrePokemon;
	private int vidaPokemon;
	private String imagenPokemon;
	private String estadoPokemon;
	
	
	public Pokemon(String nombrePokemon, int vidaPokemon, String imagenPokemon, String estadoPokemon) {
		
		this.nombrePokemon = nombrePokemon;
		this.vidaPokemon = vidaPokemon;
		this.imagenPokemon = imagenPokemon;
		this.estadoPokemon = estadoPokemon;
	}


	public String getNombrePokemon() {
		return nombrePokemon;
	}


	public void setNombrePokemon(String nombrePokemon) {
		this.nombrePokemon = nombrePokemon;
	}


	public int getVidaPokemon() {
		return vidaPokemon;
	}


	public void setVidaPokemon(int vidaPokemon) {
		this.vidaPokemon = vidaPokemon;
	}


	public String getImagenPokemon() {
		return imagenPokemon;
	}


	public void setImagenPokemon(String imagenPokemon) {
		this.imagenPokemon = imagenPokemon;
	}


	public String getEstadoPokemon() {
		return estadoPokemon;
	}


	public void setEstadoPokemon(String estadoPokemon) {
		this.estadoPokemon = estadoPokemon;
	}
	
	
	
	

}
