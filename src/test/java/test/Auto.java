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
		return asientos.length;
	}
	
	String verificarIntegridad() {
		String mensaje = "";
		if(registro == motor.registro && motor.registro == asientos[0].registro) {
			int j = 0;
			for (int i = 0; i<asientos.length-1; i++) {
				if(asientos[i].registro != asientos[i+1].registro) {
					break;
				}
				j++;
			}
			if (j == asientos.length-1) {
				mensaje = "Auto original";
			}
			else {
				mensaje = "Las piezas no son originales";
			}
		}
		else {
			mensaje = "Las piezas no son originales";
		}
		
		return mensaje;
	}
}
