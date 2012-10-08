package mx.uv.infoestudiante;
public class EstudianteTest extends junit.framework.TestCase {
  
   public void testCrear(){
   	
	   final String primerNombreEstudiante = "Cesar";	   
	   Estudiante estudiante = new Estudiante(primerNombreEstudiante);
	   assertEquals(primerNombreEstudiante, estudiante.getNombre());
	   
	   final String segundoNombreEstudiante ="Ricardo";
	   Estudiante segundoEstudiante = new Estudiante (segundoNombreEstudiante);
	   assertEquals(segundoNombreEstudiante, segundoEstudiante.getNombre());
	   
	   
   }
   
	
}

   