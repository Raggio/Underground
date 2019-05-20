package Requisitos;

public class Habilidades {

	private int fuerza;
	private int rapidez;
	private int resistencia;
	private int agilidad;

	public Habilidades() {
		super();
	}

	public Habilidades(int fuerza, int rapidez, int resistencia, int agilidad) {
		super();
		this.fuerza = fuerza;
		this.rapidez = rapidez;
		this.resistencia = resistencia;
		this.agilidad = agilidad;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getRapidez() {
		return rapidez;
	}

	public void setRapidez(int rapidez) {
		this.rapidez = rapidez;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	public int getAgilidad() {
		return agilidad;
	}

	public void setAgilidad(int agilidad) {
		this.agilidad = agilidad;
	}

	@Override
	public String toString() {
		return "Habilidades [fuerza=" + fuerza + ", rapidez=" + rapidez + ", resistencia=" + resistencia + ", agilidad="
				+ agilidad + "]";
	}

}
