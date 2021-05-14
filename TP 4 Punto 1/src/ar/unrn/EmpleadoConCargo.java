package ar.unrn;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoConCargo implements Empleados {

	private String nombreEmpleado;
	private int montoSalarial;

	List<Empleados> empleados = new ArrayList<Empleados>();

	public EmpleadoConCargo(String nombreEmpleado, int montoSalarial) {
		super();
		this.nombreEmpleado = nombreEmpleado;
		this.montoSalarial = montoSalarial;
	}

	public void agregarEmpleado(Empleados empleado) {
		empleados.add(empleado);

	}

	public void removerEmpleado(Empleados empleado) {
		empleados.remove(empleado);
	}

	public Empleados obtenerHijoEmpleado() {
		return null;
	}


	public void mostrarEmpleados() {
		for (Empleados empleado : empleados) {
			System.out.println(empleado.toString());
		}
	}

	@Override
	public int calcularSueldo() {
		int SueldoTotal = 0;

		for (Empleados empleado : empleados) {
			SueldoTotal = this.montoSalarial + empleado.calcularSueldo();
		}

		return SueldoTotal;
	}

}
