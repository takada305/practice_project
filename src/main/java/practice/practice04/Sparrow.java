package practice.practice04;

public class Sparrow extends Animal {
    private boolean canFly;
   
    public Sparrow(String name, int age, boolean canFly) {
        super(name, age); 
        this.canFly = canFly;
    }
    
    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public void showInfo() {
        super.showInfo(); 
        System.out.println((canFly ? "飛べます" : "飛べません"));
    }

    
    @Override
    public void cry() {
        System.out.println("鳴き声：チュンチュン");
    }
}
