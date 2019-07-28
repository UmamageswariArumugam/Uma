
public class exception {

	public static void main(String[] args) {
		System.out.println("Pro-Start");
		
		try{
			System.out.println("Pro-Business validation"+10/0
					);
			}
		catch(ArithmeticException e)
		{
			System.out.println("Your programming logic is worng");
		}
		
		finally {
			System.out.println("Finally Code ");
		}
	System.out.println("Pro-End");
		
	

	}

}
