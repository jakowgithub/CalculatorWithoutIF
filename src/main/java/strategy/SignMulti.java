package strategy;

public class SignMulti implements Sign {

    public SignMulti() { }

    @Override
    public int action(int a, int b) {
        return a * b;
    }
}
