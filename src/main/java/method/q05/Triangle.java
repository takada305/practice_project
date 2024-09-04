package method.q05;

public class Triangle {

 public int getTriangleArea(int base, int height) {
     return (base * height) / 2;
 }

 public static void main(String[] args) {
     Triangle triangle = new Triangle();
     int area = triangle.getTriangleArea(8, 5);
     System.out.println("底辺：8");
     System.out.println("高さ：5");
     System.out.println("三角形の面積：" + area);
 }
}

