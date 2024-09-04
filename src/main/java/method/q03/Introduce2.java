package method.q03;

//Introduce2.java
public class Introduce2 {

 public void selfIntroduce(String name, int age) {
     System.out.println("私の名前は" + name + "です。" + "年齢は"+ age + "歳です。");
 }

 public static void main(String[] args) {
     Introduce2 introduce = new Introduce2();
     introduce.selfIntroduce("山田", 25);
 }
}
