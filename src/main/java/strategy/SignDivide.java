package strategy;

public class SignDivide implements Sign  {

    public SignDivide() { }

    @Override
    public int action(int a, int b) {
        return a / b;
    }
}
