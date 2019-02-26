import org.junit.Test;
import strategy.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GateTestMinus {

    @Test
    public void minusTest(){

        int a=3, b=2;
        int index = ((int)"-".charAt(0))-42;
        SignMinus signMinus = new SignMinus();
        SignError signError = new SignError();
        ArrayList<Sign> signs = new ArrayList<>();
        for (int i=0; i<index; i++){
            signs.add(signError);
        }
        signs.add(index, signMinus);

        Action action = new Action(a, b, signs.get(index));
        int result = action.getResult();

        Action actionDifferent = new Action();
        int resultDifferent = actionDifferent.action(a, b, signs.get(index));

        assertEquals(1, result);
        assertEquals(1, resultDifferent);
    }
}
