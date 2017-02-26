
public class Actividad {
	
	private String nombreAvtividad;
	private int vidaActividad;
	private String tipoActividad;
	
	public Actividad(String nombreActividad, int vidaActividad, String tipoActividad) {
		this.nombreAvtividad = nombreActividad;
		this.vidaActividad = vidaActividad;
		this.tipoActividad = tipoActividad;
		
	}

	public String getNombreAvtividad() {
		return nombreAvtividad;
	}

	public void setNombreAvtividad(String nombreAvtividad) {
		this.nombreAvtividad = nombreAvtividad;
	}

	public int getVidaActividad() {
		return vidaActividad;
	}

	public void setVidaActividad(int vidaActividad) {
		this.vidaActividad = vidaActividad;
	}

	public String getTipoActividad() {
		return tipoActividad;
	}

	public void setTipoActividad(String tipoActividad) {
		this.tipoActividad = tipoActividad;
	}
	
	
	

}
