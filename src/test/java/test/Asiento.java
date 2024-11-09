package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	void cambiarColor(String nuevoColor) {
		if (nuevoColor.equals("rojo")||nuevoColor.equals("verde")||nuevoColor.equals("amarillo")||nuevoColor.equals("negro")||nuevoColor.equals("blanco")) {
			color = nuevoColor;
		}
	}
}
