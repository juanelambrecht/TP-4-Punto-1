package ar.unrn;

public class EmpleadoSinCargo implements Empleados {
	private String nombreEmpleado;
	private int montoSalarial;

	public EmpleadoSinCargo(String nombreEmpleado, int montoSalarial) {

		this.nombreEmpleado = nombreEmpleado;
		this.montoSalarial = montoSalarial;
	}

	@Override
	public int calcularSueldo() {
		return this.montoSalarial;
	}


}
