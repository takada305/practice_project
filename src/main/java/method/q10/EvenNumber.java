package method.q10;

import java.util.Arrays;

public class EvenNumber {

 public int getEvenNumbers(int[] numbers) {
     int evenCount = 0;
     for (int number : numbers) {
         if (number % 2 == 0) {
             evenCount++;
         }
     }
     return evenCount;
 }

 public static void main(String[] args) {
     int[] numbers = {3, 2, 5, 6, 7, 25, 10, 51, 88, 98};
     EvenNumber evenNumberCounter = new EvenNumber();
     int evenCount = evenNumberCounter.getEvenNumbers(numbers);
     System.out.println(Arrays.toString(numbers) + "には、偶数が" + evenCount + "個あります。");
 }
}

