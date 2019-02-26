package strategy;

public class SignPlus implements Sign {

    public SignPlus() { }

    @Override
    public int action(int a, int b) {
        return a + b;
    }
}