package method.q09;

public class Even {

 public boolean checkEven(int number) {
     return number % 2 == 0;
 }

 public static void main(String[] args) {
     Even evenChecker = new Even();
     int number1 = 10;
     int number2 = 5;
     if (evenChecker.checkEven(number1)) {
         System.out.println(number1 + "は偶数です。");
     } else {
         System.out.println(number1 + "は奇数です。");
     }

     if (evenChecker.checkEven(number2)) {
         System.out.println(number2 + "は偶数です。");
     } else {
         System.out.println(number2 + "は奇数です。");
     }
 }
}

