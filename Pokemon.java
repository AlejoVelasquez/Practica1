
public class Pokemon {
	
	private String nombrePokemon;
	private String estadoPokemon;
	private int vidaPokemon;
	
	public Pokemon() {
		this.nombrePokemon = "";
		this.estadoPokemon = "";
		this.vidaPokemon = 10;
		
	}

	public String getNombrePokemon() {
		return nombrePokemon;
	}

	public void setNombrePokemon(String nombrePokemon) {
		this.nombrePokemon = nombrePokemon;
	}

	public String getEstadoPokemon() {
		return estadoPokemon;
	}

	public void setEstadoPokemon(String estadoPokemon) {
		this.estadoPokemon = estadoPokemon;
	}

	public int getVidaPokemon() {
		return vidaPokemon;
	}

	public void setVidaPokemon(int vidaPokemon) {
		this.vidaPokemon = vidaPokemon;
	}
	
	

}
