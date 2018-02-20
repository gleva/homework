package static_nested_classes.task1;
//Создать класс Vehicle с методом print.
// В классе Vehicle, создайте внутренний класс Wheel и Door,
// которые также должны содержать метод print. Создайте экземпляры классов Wheel и Door.

public class Main {
    public static void main(String[] args) {


        Vehicle vehicle= new Vehicle();
        System.out.println("Vehicle method: ");
        vehicle.print();

        Vehicle.Wheel wheel = new Vehicle().getWheel();
        Vehicle.Door door = new Vehicle().getDoor();
        System.out.println("------------------------");
        System.out.println("Wheel method: ");
        wheel.print();
        System.out.println("------------------------");
        System.out.println("Door method: ");
        door.print();

    }
}
