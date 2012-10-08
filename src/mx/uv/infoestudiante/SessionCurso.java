package mx.uv.infoestudiante;
import java.util.*;

/**
 * Proove una representacion de una sesion de 
 * un semestre de un curso universitario en particular
 * @author Cesa Ricardo Alducin Ruiz
 *
 */

public class SessionCurso {
	static final String NUEVA_LINEA = System.getProperty("line.separator");
	
	static final String ENCABEZADO_LISTA_REPORTE = "Estudiante" + NUEVA_LINEA + "----" +  NUEVA_LINEA;
	
	static final String PIE_DE_PAGINA_LISTA_REPORTE = NUEVA_LINEA + "# estudiantes="; 
	
	
	
	
	private String departamento;
	private String numero;
	private java.util.ArrayList<Estudiante> estudiantes = new java.util.ArrayList<Estudiante>();
	private Date fechaInicio;
	
		
	SessionCurso(String departamento, String numero){
		this.departamento= departamento;
		this.numero = numero;
						
	}
	
	
	SessionCurso(String departamento, String numero, Date fechaInicio){
		this.departamento= departamento;
		this.numero = numero;
		this.fechaInicio = fechaInicio;				
	}
	
	
	/**
	 * 
	 * @return Date el ultimo dia de la fecha de un curso 
	 */
	
	Date getFechaFin(){
		GregorianCalendar  calendario = new GregorianCalendar();
	    calendario.setTime(fechaInicio);
	    
	    final int numeroSesiones =16;
	    final int diasEnLaSemana =7;
	    final int diasDeViernesALunes=3;
	    int numeroDeDias = numeroSesiones * diasEnLaSemana - diasDeViernesALunes; 
		
		calendario.add(Calendar.DAY_OF_YEAR,numeroDeDias);
		Date fechaFin = calendario.getTime();
		return fechaFin;
	}
	
	Date getFechaInicio(){
		return fechaInicio;
	}
		   
	String getDepartamento(){
		return departamento;
	}
	
	String getNumero(){
		return numero;
	
	}

	public int  getNumeroDeEstudiantes() {		
		return estudiantes.size();
	}

	void inscribir(Estudiante estudiante) {		
        estudiantes.add(estudiante);		
	}
	
	
	java.util.ArrayList<Estudiante> getTodosLosEstudiantes(){
		return estudiantes;
	}
	
	Estudiante get(int indice){
		return estudiantes.get(indice);
	}
	
	String getListaReporte(){
		StringBuilder buffer = new StringBuilder();
		buffer.append(ENCABEZADO_LISTA_REPORTE);
		Estudiante estudiante = estudiantes.get(0);
		buffer.append(estudiante.getNombre());
		buffer.append("\n");
		
		estudiante = estudiantes.get(1);
		buffer.append(estudiante.getNombre());
		buffer.append("\n");
		
		
		buffer.append(PIE_DE_PAGINA_LISTA_REPORTE + estudiantes.size() + "\n");
		
		
		return buffer.toString();
		
	}


}
