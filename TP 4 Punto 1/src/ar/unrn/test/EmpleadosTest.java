package ar.unrn.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.unrn.EmpleadoConCargo;
import ar.unrn.EmpleadoSinCargo;

class EmpleadosTest {

	@Test
	void testEmpleadosConCargo() {
		
		EmpleadoConCargo directores = new EmpleadoConCargo("Director", 2000);
		EmpleadoConCargo gerentes = new EmpleadoConCargo("Gerente", 1500);
		EmpleadoConCargo mandosMedios = new EmpleadoConCargo("Mandos Medio", 1000);
		EmpleadoConCargo lideresProyecto = new EmpleadoConCargo("Lideres de Proyecto", 800);

		EmpleadoSinCargo empleadosRegulares = new EmpleadoSinCargo("Empleado Regular", 500);

		lideresProyecto.agregarEmpleado(empleadosRegulares);

		mandosMedios.agregarEmpleado(lideresProyecto);

		gerentes.agregarEmpleado(mandosMedios);

		directores.agregarEmpleado(gerentes);
		
		assertEquals(directores.calcularSueldo(), 5800);

	}
	
	@Test
	void testEmpleadosSinCargo() {

		EmpleadoSinCargo empleadosRegulares = new EmpleadoSinCargo("Empleado Regular", 500);


		assertEquals(empleadosRegulares.calcularSueldo(), 500);

	}

}
