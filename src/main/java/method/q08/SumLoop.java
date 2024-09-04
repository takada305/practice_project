package method.q08;

public class SumLoop {

 public int sumLoop(int min, int max) {
     int sum = 0;
     for (int i = min; i <= max; i++) {
         sum += i;
     }
     return sum;
 }

 public static void main(String[] args) {
     SumLoop sumLoop = new SumLoop();
     int result = sumLoop.sumLoop(1, 100);
     System.out.println("最小値：1");
     System.out.println("最大値：100");
     System.out.println("加算結果：" + result);
 }
}

