package randomQuestion.models;

public enum Operation {
    PIUS(1, "+") {
        @Override
        public int cacl(int a, int b) {
            return a + b;
        }
    },
    MINUS(2, "-") {
        @Override
        public int cacl(int a, int b) {
            return a - b;
        }
    },
    TIMES(3, "*") {
        @Override
        public int cacl(int a, int b) {
            return a * b;
        }
    },
    DIVIDE(4, "/") {
        @Override
        public int cacl(int a, int b) {
            if (b == 0) {
                return 0;
            }
            return a / b;
        }
    };

    private int code;
    private String param;

    Operation(int code, String param) {
        this.code = code;
        this.param = param;
    }

    public static Operation getByCode(int code) {
        for (Operation operation : Operation.values()) {
            if (code == operation.getCode()) {
                return operation;
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getParam() {
        return param;
    }

    public abstract int cacl(int a, int b);
}
