package Requisitos;

import java.util.Scanner;

public class Personaje {

	private String personaje;

	public Personaje(String personaje) {
		super();
		this.personaje = personaje;
	}

	public String getPersonaje() {
		return personaje;
	}

	public void setPersonaje(String personaje) {
		this.personaje = personaje;
	}

	@Override
	public String toString() {
		return "Personaje [personaje=" + personaje + "]";
	}

	public static void PedirDatos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre de tu personaje:");
		String nombre = sc.nextLine();
	}
}
