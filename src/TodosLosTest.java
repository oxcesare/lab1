public class TodosLosTest {

	public static junit.framework.TestSuite suite(){
		
		junit.framework.TestSuite suite = new junit.framework.TestSuite();
		suite.addTestSuite(EstudianteTest.class);
		suite.addTestSuite(SesionCursotest.class);
		
		return suite;
		
	}
	

}
