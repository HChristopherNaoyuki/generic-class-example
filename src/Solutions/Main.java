package Solutions;

// Importing the 'out' static member from System for easy use of print statements
import static java.lang.System.out;

public class Main
{
    public static void main(String[] args)
    {
        // Creating a GenericClass object with Integer type for both parameters
        GenericClass<Integer, Integer> intObject = new GenericClass<>(1, 12);
        
        // Creating a GenericClass object with Double type for both parameters
        GenericClass<Double, Double> doubleObject = new GenericClass<>(3.14, 2.76);
        
        // Creating a GenericClass object with Character type for both parameters
        GenericClass<Character, Character> charObject = new GenericClass<>('@', '$');
        
        // Creating a GenericClass object with String as the first parameter type and Character as the second parameter type
        GenericClass<String, Character> stringObject = new GenericClass<>("Hello", 'A');
        
        // Output the value of the nth parameter (or some derived value) from each GenericClass object
        out.println(intObject.getValue());
        out.println(doubleObject.getValue());
        out.println(charObject.getValue());
        out.println(stringObject.getValue());
    }
}
