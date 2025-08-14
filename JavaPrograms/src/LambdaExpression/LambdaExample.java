package LambdaExpression;

public class LambdaExample {
	public static void main(String[] args) {
        // Lambda expression implementation
        MyFunction greet = (firstName,lastName) -> {System.out.println("Hello, " + firstName + " "+lastName+"!");};
        
        greet.sayHello("Vinayaka","Khatavakar"); // Output: Hello, Vinayaka!
    }
}
