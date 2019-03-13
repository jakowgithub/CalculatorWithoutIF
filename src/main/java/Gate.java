import strategy.*;

import java.util.ArrayList;
import java.util.List;

public class Gate {

    private static int a, b, error;
    private static String sign ="m";
    private static List<Sign> signs = new ArrayList<>();
    private static List<String> consolText = new ArrayList<>();

    public Gate() {}

    public static void main(String[] args) {

        consolText.add(0,"Second argument is't the arithmetic sign: + - m /, result wrong ");

        // get first argument
        try { a =Integer.parseInt(args[0].trim());
        } catch (NumberFormatException nfe) {
            System.out.println("First argument is't the integer number, result wrong ");
            error=300;
            for (int i=1; i<error; i++){ consolText.add("empty"); }
            consolText.add(error,"First argument is't the integer number, result wrong");
        } catch (IndexOutOfBoundsException iobe) {
            System.out.println("First argument is absent ");
        }
        // get second argument
        try {  sign = args[1].trim();
        } catch (IndexOutOfBoundsException iobe) {
            System.out.println("Sign is absent ");
        }
        // get third argument
        try { b = Integer.parseInt(args[2].trim());
        } catch (NumberFormatException nfe) {
            System.out.println("Third argument is't the integer number, result wrong ");
            error=300;
            for (int i=1; i<error; i++){ consolText.add("empty"); }
            consolText.add(error,"Third argument is't the integer number, result wrong");
        }catch (IndexOutOfBoundsException iobe) {
            System.out.println("Third argument is absent ");
        }


        //Depending the sign  get the required class INDEX in the ArrayList
        int index = ((int)sign.charAt(0))-42+error;

        //fill the ArrayList with the required classes (*,+,-,/,error)
        SignMulti signMulti = new SignMulti();
        signs.add(0,signMulti);

        SignPlus signPlus = new SignPlus();
        signs.add(1,signPlus);

        SignError signError = new SignError();
        signs.add(2,signError);

        SignMinus signMinus = new SignMinus();
        signs.add(3,signMinus);

        signs.add(4,signError);

        SignDivide signDivide = new SignDivide();
        signs.add(5,signDivide);

        //for litera < m >, because in the command line < * > need shield
        for (int k = 6; k < 67; k++){
            signs.add(signError);
        }
        signs.add(67,signMulti);

        //result with constructor Action (int a, int b, Class <T> t)
        try {
           Action action = new Action(a, b, signs.get(index));
            System.out.println("Result=" + action.getResult());
        } catch (IndexOutOfBoundsException iobe) {
            System.out.println(consolText.get(error));
        }
        catch (ArithmeticException ae) { System.out.println("can`t divide by ZERO ");
        }
        //result with constructor Action () and method action (int, int, Class <T> t)
        Action actionDifferent = new Action();
        try {
            System.out.println("Result with different method=" + actionDifferent.action(a, b, signs.get(index)));
        } catch (IndexOutOfBoundsException iobe) {
            System.out.println(consolText.get(error));
        }
          catch (ArithmeticException ae) {
            System.out.println("can`t divide by ZERO ");
        }

    }
}
