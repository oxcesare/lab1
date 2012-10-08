public class SessionCurso {
	private String departamento;
	private String numero;

	private java.util.ArrayList<Estudiante> estudiantes = new java.util.ArrayList<Estudiante>();
	
	SessionCurso(String departamento, String numero){
		this.departamento= departamento;
		this.numero = numero;
		
				
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
	


}
