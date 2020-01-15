package demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

	}

	public static void demo() {

		try {
			System.out.println("Hello Word..!!!");
			int i = 1 / 0;
			System.out.println("Execution Completed");
		} catch (Exception e) {
			System.out.println("I'm inside catch block");
			System.out.println("Message is :: " + e.getMessage());
			System.out.println("Cause is :: " + e.getCause());
			e.printStackTrace();

		}

		finally {
			System.out.println("I am inside finally block");
		}

	}
}
