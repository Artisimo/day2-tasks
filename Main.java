import java.lang.*;
import java.util.*;
public class Main {

    static void compare(int a, int b){
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
        System.out.println("Is " + a + " less than " + b + "? - " + isLessThan);
        System.out.println("Is " + a + " less or equal to " + b + "? - " + isLessOrEqual);
        System.out.println("Is " + a + " greater than " + b + "? - " + isGreater);
        System.out.println("Is " + a + " greater or equal to " + b + "? - " + isGreaterOrEqual);
    }

    static boolean areBooleansEqual(boolean b1, boolean b2){
        if(b1 == b2){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

        compare(10,10);

        System.out.println('\n' + "Is b1 and b2 equal? - " + areBooleansEqual(true, false));
    }
}
