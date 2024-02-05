//Topics covered are encapsulation, getters and setters.

public class Main {
    public static void main(String[] args)
    {
        Car car = new Car();
        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setColor("Blue");
        car.setDoors(2);
        car.setConvertible(true);
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        System.out.println("color = " + car.getColor());

        Car tata = new Car();
        tata.setMake("TATA");
        tata.setModel("Nexon");
        tata.setColor("Blue");
        tata.setDoors(4);
        tata.setConvertible(true);

    }
}

