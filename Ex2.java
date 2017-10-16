import java.util.*;

public class Ex2 {


    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter some numbers in, make sure you have put spaces between two different numbers");
        String userNumberInput = scanner.nextLine();
        String[] userNumbers = userNumberInput.split(" ");
        int[] numbersArray = new int[userNumbers.length];
        for(int i = 0; i<numbersArray.length; i++)
        {
            numbersArray[i] = Integer.parseInt(userNumbers[i]);
        }
        System.out.println("The numbers have been stored in an array");
        System.out.println("Enter a number: ");
        int lessThanThis = scn.nextInt();
        int amountLess = isLessThan(numbersArray, lessThanThis);
        System.out.println("In this array, there are/is "+amountLess+" number(s) below "+lessThanThis+".");

    }
    public static int isLessThan(int[] numbersArray, int be_lower){

        int numbers_below_input = 0;
        for(int i = 0; i < numbersArray.length; i++)
        {
            if(numbersArray[i] < be_lower) {
                numbers_below_input++;
            }
        }
        return numbers_below_input;
    }

}

