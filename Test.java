import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
//        完成评委打分案例
        System.out.println(getAverageScore(6));
    }
    public static double getAverageScore(int number){
//        定义数组以保存评委分数
        int[] scores=new int[number];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+(i+1)+"个选手的分数");
            int score = sc.nextInt();
            scores[i]=score;
        }
        int sum = 0;
        int max=scores[0];
        int min=scores[0];
        for (int score : scores) {
            sum += score;
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }
        }
        int average=(sum-max-min)/(number-2);
        return 1.0*average;
    }
}

