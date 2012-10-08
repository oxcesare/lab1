import java.util.ArrayList;

public class SesionCursotest extends junit.framework.TestCase{
   private SessionCurso sesion;
	 
	public void setUp(){
		sesion = new SessionCurso("ENGL", "101");
		
	}
	
	public void testCrear() {		
		assertEquals("ENG",sesion.getDepartamento());
		assertEquals("101",sesion.getNumero());
		assertEquals(0, sesion.getNumeroDeEstudiantes());
		
	}
	
	public void testInscribirEstudiantes(){
		
		
		Estudiante estudiante1 = new Estudiante("Cesar Ricardo");
		sesion.inscribir(estudiante1);
		
				
		java.util.ArrayList<Estudiante> todosLosEstudiantes = sesion.getTodosLosEstudiantes();
		assertEquals(1,todosLosEstudiantes.size());
		
		assertEquals(estudiante1,((ArrayList<Estudiante>) todosLosEstudiantes).get(0));
		
		Estudiante estudiante2 = new Estudiante("Cesarin");
		sesion.inscribir(estudiante2);
		
		assertEquals(2, sesion.getNumeroDeEstudiantes());
		assertEquals(estudiante1,  todosLosEstudiantes.get(0));
		assertEquals(estudiante2,  todosLosEstudiantes.get(1));
		
		
	}

}
