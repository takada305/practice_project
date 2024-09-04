package method.q04;

public class SumNumbers {

 public int calculateSum(int num1, int num2) {
     return num1 + num2;
 }

 public static void main(String[] args) {
     SumNumbers sumNumbers = new SumNumbers();
     int result = sumNumbers.calculateSum(3, 2);
     System.out.println("第一引数：3");
     System.out.println("第二引数：2");
     System.out.println("加算結果：" + result);
 }
}


