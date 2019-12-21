package javaapplication1;
public class Cheese extends Food {

    public Cheese(){
        super("Сыр");
    }

    public void consume() {
        System.out.println(this+ " съеден"+ "   Калорийность: " + this.calculateCalories());
    }

    @Override
    public int calculateCalories() {
        return 35;
    }
}
