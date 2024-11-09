package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static String cantidadCreados;
	
	
	int cantidadAsientos() {
		int cantAsientos = 0;
		for (int i = 0; i<asientos.length;i++) {
			if (asientos[i] != null) {
				cantAsientos++;
			}
		}
		return cantAsientos;
	}
	
	String verificarIntegridad() {
		String mensaje = "Las piezas no son originales";
		if (asientos.length != 0) {
			if(registro == motor.registro) {
				int j = 0;
				for (int i = 0; i<asientos.length;i++) {
					if(registro != asientos[i].registro) {
						break;
					}
					j++;
				}
				if (j != 0 && j == asientos.length) {
					mensaje = "Auto original";
				}
			}
		}
		return mensaje;
	}
}
