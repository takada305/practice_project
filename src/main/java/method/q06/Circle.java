package method.q06;

public class Circle {

 public double getCircleArea(double radius) {
     return 3.14 * radius * radius;
 }

 public static void main(String[] args) {
     Circle circle = new Circle();
     double area = circle.getCircleArea(5.0);
     System.out.println("半径：5.0");
     System.out.println("円の面積：" + area);
 }
}

