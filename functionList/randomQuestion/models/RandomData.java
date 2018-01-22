package randomQuestion.models;

import java.util.Random;

public class RandomData {
    private int a;
    private int b;
    private int c;

    private Random random = new Random();

    public void genRandomData(int max) {
        a = random.nextInt(max);
        b = random.nextInt(max);
        c = random.nextInt(Operation.values().length) + 1;  // 随机1~4 对应四种运算符号
    }

    public void genSimpleRandomData(int max) {
        c = random.nextInt(Operation.values().length) + 1;
        switch (c) {
            case 1:
                a = random.nextInt(max);
                b = random.nextInt(max);
                break;
            case 2:
                a = random.nextInt(max);
                b = random.nextInt(a);
                break;
            case 3:
                a = random.nextInt(10);
                b = random.nextInt(10);
                break;
            case 4:
                b = random.nextInt(10) + 1;
                a = random.nextInt(10) * b;
                break;
            default:
                a = random.nextInt(max);
                b = random.nextInt(max);
        }

    }

    public String question() {
        Operation operation = Operation.getByCode(c);
        if (operation == null) {
            return null;
        }
        return a + operation.getParam() + b + " = ";
    }

    public int result() {
        Operation operation = Operation.getByCode(c);
        if (operation == null) {
            return 0;
        }
        return operation.cacl(a, b);
    }
}
