

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /*
     This program calculate yield rental
     Inside the Main class, we create a private method called func,
     which takes two integer parameters: monthRent and originalPrice
     Inside the func method, we calculate the annual rental value by multiplying the monthly value by 12 and
     storing it in the variable annualRent.
     Next, we calculate the annual rental yield by dividing
     the annual rental value by the original property price, multiplying by 100,
      and storing it in the variable result.
     We return the result of the calculation as a floating-point value.
     In the main function, we call the func method with the monthRent and
      originalPrice values set to 1300 and 250000, respectively.
     We store the result of the func method call in the variable result.
     Finally, we print the value of the result variable to the standard output using the System.out.println() method.
    */
    private static float func(int monthRent, int originalPrice) {
        int annualRent = monthRent * 12;
        return ((float)annualRent / originalPrice) * 100;
    }

    public static void main(String[] args) {
        float result1 = func(1300, 250000);
        System.out.println(result1);
    }

}