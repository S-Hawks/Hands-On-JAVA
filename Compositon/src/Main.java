public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Ceiling ceiling = new Ceiling(22, 55);
        Lamp lamp = new Lamp("Classic", false, 75 );

        Bedroom bedRoom = new Bedroom("Faiaz", wall1,wall2, wall3, wall4,ceiling, bed, lamp);

        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();


    }


}
