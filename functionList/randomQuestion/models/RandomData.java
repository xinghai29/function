package randomQuestion.models;

import java.util.Random;

public class RandomData {
    private static final int max = 20;
    private int a;
    private int b;
    private int c;

    private Random random = new Random();

    public void genRandomData() {
        c = random.nextInt(4);
        a = random.nextInt(max);
        b = random.nextInt(max);
    }

    public String question() {
        Operation operation = Operation.getByCode(c);
        if (operation == null) {
            return null;
        }
        return a + operation.getParam() + b;
    }

    public int result() {
        Operation operation = Operation.getByCode(c);
        if (operation == null) {
            return 0;
        }
        return operation.cacl(a, b);
    }
}
