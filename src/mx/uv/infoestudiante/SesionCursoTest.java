package mx.uv.infoestudiante;
import junit.framework.TestCase;
import java.util.*;





public class SesionCursoTest extends junit.framework.TestCase{
   private SessionCurso sesion;
   private Date  FechaInicio;
   
	 
	public void setUp(){
		FechaInicio = crearFecha(2003, 1 , 6);
		sesion = new SessionCurso("ENGL", "101", FechaInicio);
		
	}
	
	Date crearFecha(int anio, int mes, int dia) {
		GregorianCalendar calendario = new GregorianCalendar();
		calendario.clear();
		calendario.set(Calendar.YEAR,anio);
		calendario.set(Calendar.MONDAY, mes -1);
		calendario.set(Calendar.DAY_OF_MONTH,dia);
		return calendario.getTime();
	}
	
	public void testCrear() {		
	//	assertEquals("ENG",sesion.getDepartamento());
		assertEquals("101",sesion.getNumero());
		assertEquals(0, sesion.getNumeroDeEstudiantes());
		assertEquals(FechaInicio, sesion.getFechaInicio());
		
	}

	
	public void testInscribirEstudiantes(){
		
		
		Estudiante estudiante1 = new Estudiante("Cesar Ricardo");
		sesion.inscribir(estudiante1);
		assertEquals(1,sesion.getNumeroDeEstudiantes());
		assertEquals(estudiante1, sesion.get(0));
					
//		java.util.ArrayList<Estudiante> todosLosEstudiantes = sesion.getTodosLosEstudiantes();
//		assertEquals(1,todosLosEstudiantes.size());		
//		assertEquals(estudiante1,((ArrayList<Estudiante>) todosLosEstudiantes).get(0));		
//		assertEquals(estudiante1, TodosLosEstudiantes.get(0));		
		
		Estudiante estudiante2 = new Estudiante("Cesarin");
		sesion.inscribir(estudiante2);
		
		assertEquals(2, sesion.getNumeroDeEstudiantes());
		assertEquals(estudiante1,  sesion.get(0));
		assertEquals(estudiante1,  sesion.get(0));
//		assertEquals(estudiante1,  todosLosEstudiantes.get(0));
//		assertEquals(estudiante2,  todosLosEstudiantes.get(1));
				
		
	}
	
	public void testFechasCurso(){
		Date diezYSiesSemanas = crearFecha(2003,4,25);
		assertEquals(diezYSiesSemanas, sesion.getFechaFin());
			
	}
	
	public void testListaReporte(){
		sesion.inscribir(new Estudiante("A"));
		sesion.inscribir(new Estudiante("B"));
		
		String listReporte = sesion.getListaReporte();
		assertEquals(SessionCurso.ENCABEZADO_LISTA_REPORTE +
				"A\nB\n" + 
				SessionCurso.PIE_DE_PAGINA_LISTA_REPORTE + "\2n",listaReporte);
		
	}

}
