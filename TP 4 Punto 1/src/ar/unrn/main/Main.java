package ar.unrn.main;

import ar.unrn.EmpleadoConCargo;
import ar.unrn.EmpleadoSinCargo;

public class Main {

	public static void main(String[] args) {
		
		EmpleadoConCargo directores = new EmpleadoConCargo("Director", 2000);
		EmpleadoConCargo gerentes = new EmpleadoConCargo("Gerente", 1500);
		EmpleadoConCargo mandosMedios = new EmpleadoConCargo("Mandos Medio", 1000);
		EmpleadoConCargo lideresProyecto = new EmpleadoConCargo("Lideres de Proyecto", 800);

		EmpleadoSinCargo empleadosRegulares = new EmpleadoSinCargo("Empleado Regular", 500);

		lideresProyecto.agregarEmpleado(empleadosRegulares);

		mandosMedios.agregarEmpleado(lideresProyecto);

		gerentes.agregarEmpleado(mandosMedios);

		directores.agregarEmpleado(gerentes);

	//	directores.mostrarEmpleados();
		
		System.out.println("Sueldo Total: " + directores.calcularSueldo());

	}

}
