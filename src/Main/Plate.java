package Main;

public class Plate {
    private int food;

    Plate(int intFood){
        food = intFood;
    }

    public void infoPlate (){
        System.out.println("В тарелке: " + food + " единиц еды.");
    }

    public boolean decreaseFood(int app, String name){
        if (food >= app){
            food -= app;
            System.out.println("Кот " + name + " сьел из тарелки " + app + " единиц еды.");
            return true;
        } else {
            System.out.println("В тарелке нет столько еды! Кот " + name  + " не поел!");
            return false;
        }
    }
    public void addFood (int f){
        food += f;
        System.out.println("В тарелку добавили " + f + " единиц еды!");
    }
}
