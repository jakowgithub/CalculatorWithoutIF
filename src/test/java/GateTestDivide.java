import org.junit.Test;
import strategy.Action;
import strategy.Sign;
import strategy.SignError;
import strategy.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GateTestDivide {
    @Test
    public void divideTest(){

        int a=6, b=2;
        int index = ((int)"/".charAt(0))-42;
        SignDivide signDivide = new SignDivide();
        SignError signError = new SignError();
        ArrayList<Sign> signs = new ArrayList<>();
        for (int i=0; i<index; i++){
            signs.add(signError);
        }
        signs.add(index, signDivide);

        Action action = new Action(a, b, signs.get(index));
        int result = action.getResult();

        Action actionDifferent = new Action();
        int resultDifferent = actionDifferent.action(a, b, signs.get(index));

        assertEquals(3, result);
        assertEquals(3, resultDifferent);
    }
}
