package exams;

import java.util.Map;

public class RunServer
{
    public static void main(String[] args) {
        Exams exams = new Exams();

        Map<Integer, String> enPS;
        enPS = exams.getExamEnPS();
        for (int i = 0; i < 700; i++) {
            System.out.println(enPS.get(i));
        }
        Map<Integer, String> ruPS;
        ruPS = exams.getExamRuPS();
        for (int i = 0; i < 700; i++) {
            System.out.println(ruPS.get(i));
        }
        Map<Integer, String> enToBe;
        enToBe = exams.getExamEnToBe();
        for (int i = 0; i < 400; i++) {
            System.out.println(enToBe.get(i));
        }
        Map<Integer, String> ruToBe;
        ruToBe = exams.getExamRuToBe();
        for (int i = 0; i < 400; i++) {
            System.out.println(ruToBe.get(i));
        }
    }
}
