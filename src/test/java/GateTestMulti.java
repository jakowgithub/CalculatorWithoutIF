import org.junit.Test;
import strategy.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GateTestMulti {

    @Test
    public void multiTest(){

        int a=3, b=2;
        int index = ((int)"m".charAt(0))-42;
        SignMulti signMulti = new SignMulti();
        SignError signError = new SignError();
        ArrayList<Sign> signs = new ArrayList<>();
        for (int i=0; i<index; i++){
            signs.add(signError);
        }
        signs.add(index, signMulti);

        Action action = new Action(a, b, signs.get(index));
        int result = action.getResult();

        Action actionDifferent = new Action();
        int resultDifferent = actionDifferent.action(a, b, signs.get(index));

        assertEquals(6, result);
        assertEquals(6, resultDifferent);
    }
}
