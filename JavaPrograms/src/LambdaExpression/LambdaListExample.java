package LambdaExpression;

import java.util.*;
import java.util.function.Consumer;

public class LambdaListExample {
    public static void main(String[] args) {
    	
//    	Consumer<String> consumer = name -> System.out.println("Printing : " + name);
//    	consumer.accept("Khatavakar");
        List<String> names = Arrays.asList("Amit", "Vinayaka", "Ravi");

        // Lambda forEach
        names.stream().forEach(name -> System.out.println("Printing : " + name));
    }
}
