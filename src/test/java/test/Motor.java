package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	
	void cambiarRegistro(int nuevoRegistro) {
		registro = nuevoRegistro;
	}
	
	void asignarTipo(String tipoMotor) {
		if (tipoMotor.equals("electrico") || tipoMotor.equals("gasolina")) {
			tipo = tipoMotor;
		}
	}
}
