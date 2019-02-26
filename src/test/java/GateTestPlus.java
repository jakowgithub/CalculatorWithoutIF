import org.junit.Test;
import strategy.Action;
import strategy.Sign;
import strategy.SignError;
import strategy.SignPlus;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GateTestPlus  {

@Test
public void plusTest(){

    int a=3, b=2;
    int index = ((int)"+".charAt(0))-42;
    SignPlus signPlus = new SignPlus();
    SignError signError = new SignError();
    ArrayList <Sign> signs = new ArrayList<>();
    for (int i=0; i<index; i++){
        signs.add(signError);
    }
    signs.add(index, signPlus);

    Action action = new Action(a, b, signs.get(index));
    int result = action.getResult();

    Action actionDifferent = new Action();
    int resultDifferent = actionDifferent.action(a, b, signs.get(index));

   assertEquals(5, result);
   assertEquals(5, resultDifferent);
}

}
