package test;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestCiudades {
	static CiudadesService service=new CiudadesService();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		service.guardarCiudad("Murcia", 100000, "España");
		service.guardarCiudad("Madrid", 3100000, "España");
		service.guardarCiudad("Paris", 6100000, "Francia");
		service.guardarCiudad("Venecia", 400000, "Italia");
	}

	@Test
	void testCiudadMasPoblada() {
		assertEquals("Paris", service.ciudadMasPoplada().getNombre)
	}

	@Test
	void testCiudadesPorPais() {
		
	}

}
