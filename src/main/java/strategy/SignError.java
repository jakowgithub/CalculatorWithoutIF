package strategy;

public class SignError implements Sign {

    @Override
    public int action(int a, int b) {
        System.out.println("Second argument is't the arithmetic sign: + - * /, result wrong");
        return 0;
    }
}
