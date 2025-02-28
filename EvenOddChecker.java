import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput){
            System.out.print("Enter an Integer: ");
            if (input.hasNextInt()){
                number = input.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid Input. Please enter a valid Integer");
                input.next();
            }
        }
        
        checkEvenOrOdd(number);

    }
    public static void checkEvenOrOdd(int number){

        if (number % 2 == 0) {
            System.out.println(number  + " is an Even number.");
        } else {
            System.out.println(number  + " is an Odd number.");
        }
    }

}