package randomQuestion.services;

import randomQuestion.models.RandomData;
import utils.MyConsole;

public class QuestionService {
    private MyConsole myConsole = new MyConsole();

    public void genQuestion(int maxCount, int maxData) {
        String[] questions = new String[maxCount];
        RandomData randomData = new RandomData();
        int cnt = 0;
        int correct = 0;
        myConsole.println("*****  考试开始  *****");
        while (cnt < maxCount) {
            randomData.genSimpleRandomData(maxData);
            myConsole.println(randomData.question());
            myConsole.println("请输入答案");
            int answer = myConsole.readInt(-999);
            if (randomData.result() == answer) {
                correct++;
            }
            questions[cnt] = randomData.question() + randomData.result();
            cnt++;
        }
        myConsole.println("考试结束，本次得分为:" + correct * 100 / maxCount);
        myConsole.println("试卷答案为:");
        for (String question : questions) {
            myConsole.println(question);
        }
    }

}
