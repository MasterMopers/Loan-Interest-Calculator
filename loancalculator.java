import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //part 1: Getting inputs and defining variables
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What is your Principle Amount?");
        float principle = Integer.parseInt(myObj.nextLine());  // Read user input
        //System.out.println("Your principle amount is: " + principle); // Output user input

        Scanner myObj2 = new Scanner(System.in);
        System.out.println("How many years do you need to pay your loan in?");
        float years = Integer.parseInt(myObj2.nextLine());
        //System.out.println("The amount of years you need to pay your loan in is: " + years);

        Scanner myObj3 = new Scanner(System.in);
        System.out.println("What is your interest rate?");
        float rate = Integer.parseInt(myObj3.nextLine());
        //System.out.println("Your interest rate is: " + rate);

        //part 2: making calculations with the variables gained in part 1
        float k = rate/12;
        //System.out.println(k);
        float n = years * 12;
        float c = (float) Math.pow((1 + k),n);
        //System.out.println(c);
        float a = ((principle * k * c)/(c - 1));
        System.out.println(a);


    }
}

