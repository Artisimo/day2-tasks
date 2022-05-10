import java.lang.*;
import java.util.*;
public class Main {

    static void compare(){

        System.out.println("Enter value a: ");
        int a = getUserInputInt();
        System.out.println("Enter value b: ");
        int b = getUserInputInt();

        boolean isEqual = false;
        boolean isLessThan = false;
        boolean isLessOrEqual = false;
        boolean isGreater = false;
        boolean isGreaterOrEqual = false;

        if(a == b){
            isEqual = true;
        }

        if(a < b){
            isLessThan = true;
        }

        if(a <= b){
            isLessOrEqual = true;
        }

        if(a > b){
            isGreater = true;
        }

        if(a >= b){
            isGreaterOrEqual = true;
        }

        System.out.println("Is " + a + " equal to " + b + "? - " + isEqual);
        System.out.println("Is " + a + " less than " + b + "? - " +  isLessThan);
        System.out.println("Is " + a + " less or equal to " + b + "? - " + isLessOrEqual);
        System.out.println("Is " + a + " greater than " + b + "? - " + isGreater);
        System.out.println("Is " + a + " greater or equal to " + b + "? - " + isGreaterOrEqual);
        System.out.println('\n');
    }

    static void areBooleansEqual(){
        System.out.println("Enter b1: ");
        boolean b1 = getUserInputBool();
        System.out.println("Enter b2: ");
        boolean b2 = getUserInputBool();

        boolean result;
        result = b1 == b2;
        System.out.println("Is "+  b1 + " and " + b2 + " equal? - " + result);
        System.out.println('\n');
    }

    static void isNumberEven(){
        System.out.println("Enter int: ");
        int n = getUserInputInt();
        boolean result;
        result = n % 2 == 0;
        System.out.println("Is " + n + " even? - " + result);
        System.out.println('\n');
    }

    static void isNumberOdd(){
        System.out.println("Enter int: ");
        int n = getUserInputInt();
        boolean result;
        result = n % 2 != 0;

        System.out.println("Is " + n + " odd? - " + result);
        System.out.println('\n');
    }

    static void printOppositeBoolean(){
        System.out.println("Enter boolean: ");
        boolean b = getUserInputBool();
        boolean result = !b;
        System.out.println("Opposite of " + b + " is " + result);
        System.out.println('\n');
    }

    static void returnTrueOnCondition(){
        System.out.println("Enter value a: ");
        int a = getUserInputInt();
        System.out.println("Enter value b: ");
        int b = getUserInputInt();
        boolean result;
        if(a == b){
            result =  true;
        }else if(a < 0 && b > 0){
            result =  true;
        }else if(a > 100 && b > 100){
            result = true;
        }else{
            result =  false;
        }
        System.out.println(result);
        System.out.println('\n');
    }

    static int getUserInputInt(){

        Scanner myInput = new Scanner( System.in );
        while (!myInput.hasNextInt()) {
            System.out.println("That's not a number!");
            myInput.next();
        }
        return myInput.nextInt();
    }

    static boolean getUserInputBool(){
        Scanner myInput = new Scanner( System.in );
        while (!myInput.hasNextBoolean()) {
            System.out.println("That's not a boolean!");
            myInput.next();
        }
        return myInput.nextBoolean();
    }
    public static void main(String[] args) {

        compare();

        areBooleansEqual();

        isNumberEven();

        isNumberOdd();

        printOppositeBoolean();

        returnTrueOnCondition();
    }
}
