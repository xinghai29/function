package randomQuestion.main;


import randomQuestion.services.QuestionService;
import utils.MyConsole;

public class Test {
    public static void main(String[] args) {
        MyConsole myConsole = new MyConsole();
        QuestionService questionService = new QuestionService();
        int maxCount = 3;
        int maxData = 20;
        while (true) {
            questionService.genQuestion(maxCount, maxData);
            while (true) {
                myConsole.println("你是否继续,继续请输入Y,退出请输入N");
                String readString = myConsole.readString(null);
                if ("y".equals(readString.trim().toLowerCase())) {
                    break;
                } else if ("n".equals(readString.trim().toLowerCase())) {
                    return;
                } else {
                    continue;
                }
            }
        }

    }
}
