// Kenneth Smith Module 1 5-31-24

public class math_equation {
    public static void main(String[] args) {
        // Calculate the first expression with a floating-point
        double result1 = 4 * (1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0);

        // Calculate the second expression with a integer 
        double result2 = 4 * (1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13);

        // Display the results
        System.out.println("Result of the first expression: " + result1);
        System.out.println("Result of the second expression: " + result2);
    }

}

// The difference between the two methods is the type of division being used. 
// The first method uses a floating point division which includes the decimal. 
// The second method uses integer division which does not include the decimal during the divison.
// The first method will provide a more accurate answer than the second method. 
// The first method would be more more accurate which would make it the best method. 
