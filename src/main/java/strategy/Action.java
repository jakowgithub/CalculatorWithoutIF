package strategy;

public class Action <T extends Sign> {

    private T signClass;
    private int result;

    public Action() {}

    public Action (int a, int b, T t) {
        this.signClass =  t;
        result = signClass.action(a, b);
    }

    public   <T extends Sign> int action (int a, int b, T t) {

        return t.action(a, b);
    }

    public int getResult() { return result; }

}
