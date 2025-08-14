package LambdaExpression;

@FunctionalInterface
interface Calculator{
	
//	void switchOn();
	
//	void switchOn(String x);
	
	String switchOn(String x, String y);
	
}

public class CalculatorImpl {
	
	public static void main(String[] args) {
		//parameter   expression   Body
//		Calculator calculator = () -> System.out.println("Hi Team");
//		calculator.switchOn();
		
//		Calculator calculator = x -> System.out.println("Hi " + x);
//		calculator.switchOn("Vinayaka");
		
		Calculator calculator = (x,y) ->  "Hi " + x +" "+y ;
		System.out.println(calculator.switchOn("Vinayaka", "Khatavakar"));
		
		
	}
	

}
