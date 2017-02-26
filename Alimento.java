
public class Alimento {
	
	private String nombreAlimento;
	private String tipoAlimento;
	private int vidaAlimento;
	
	public Alimento(String nombreAlimento, int vidaAlimento, String tipoAlimento) {
	this.nombreAlimento = nombreAlimento;
	this.vidaAlimento = vidaAlimento;
	this.tipoAlimento = tipoAlimento;
		
	}

	public String getNombreAlimento() {
		return nombreAlimento;
	}

	public void setNombreAlimento(String nombreAlimento) {
		this.nombreAlimento = nombreAlimento;
	}

	public String getTipoAlimento() {
		return tipoAlimento;
	}

	public void setTipoAlimento(String tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}

	public int getVidaAlimento() {
		return vidaAlimento;
	}

	public void setVidaAlimento(int vidaAlimento) {
		this.vidaAlimento = vidaAlimento;
	}
	
	

}
