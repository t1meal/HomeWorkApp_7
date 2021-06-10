package Main;

public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate firstPlate){
        this.hungry = firstPlate.decreaseFood(appetite, name);
    }

    public void infoHungry (){
        if (hungry){
            System.out.println("Кот " + name + " сыт!");
        } else {
            System.out.println("Кот " + name + " голодный!");
        }
    }
}
