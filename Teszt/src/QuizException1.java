
public class QuizException1 {

	public static void main(String[] args) {
		
		try {
			foo();
		} catch (Exception e) {
			System.out.println("Exception occured");
			return;
		} finally {
			System.out.println("Finally occured");
		}
	}

	private static void foo() throws Exception {
		throw new Exception("Some exception");
		
	}
	
}


/*
 * A megoldás:
 * 
 * Exception occured
 * Finally occured
 */




