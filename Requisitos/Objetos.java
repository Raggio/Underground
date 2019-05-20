package Requisitos;

import java.util.Scanner;

public class Objetos {

	private String arma;
	private String linterna;
	private String armadura;

	public Objetos() {
		super();
	}

	public Objetos(String arma, String linterna, String armadura) {
		super();
		this.arma = arma;
		this.linterna = linterna;
		this.armadura = armadura;
	}

	@Override
	public String toString() {
		return "Objetos [arma=" + arma + ", linterna=" + linterna + ", armadura=" + armadura + "]";
	}
}
