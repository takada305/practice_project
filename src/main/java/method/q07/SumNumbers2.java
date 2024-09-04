package method.q07;

public class SumNumbers2 {

 public int calculateSum(int num1, double num2) {
     return (int)(num1 + num2);
 }

 public static void main(String[] args) {
     SumNumbers2 sumNumbers = new SumNumbers2();
     int result = sumNumbers.calculateSum(5, 3.3);
     System.out.println("第一引数（整数）：5");
     System.out.println("第二引数（実数）：3.3");
     System.out.println("加算結果：" + result);
 }
}

