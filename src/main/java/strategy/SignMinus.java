package strategy;

public class SignMinus implements Sign {

    public SignMinus() { }

    @Override
    public int action(int a, int b) {
        return a - b;
    }
}
