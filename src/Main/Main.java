package Main;

public class Main {

    public static void main(String[] args) {

        Cat [] manyCat = new Cat[3];
        {
                manyCat [0] = new Cat("Рыжик", 70);
                manyCat [1] = new Cat("Барсик", 35);
                manyCat [2] = new Cat("Тиша", 25);
        }

        Plate firstPlate = new Plate(100);

        firstPlate.infoPlate();
        System.out.println();

        manyCat[0].eat(firstPlate);
        manyCat[1].eat(firstPlate);
        manyCat[2].eat(firstPlate);
        System.out.println();

        manyCat[0].infoHungry();
        manyCat[1].infoHungry();
        manyCat[2].infoHungry();
        System.out.println();

        firstPlate.infoPlate();
        System.out.println();

        firstPlate.addFood(50);

        firstPlate.infoPlate();

    }
}
