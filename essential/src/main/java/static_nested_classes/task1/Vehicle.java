package static_nested_classes.task1;

public class Vehicle {
    private Wheel wheel = new Wheel();
    private Door door = new Door();

    public void print() {
        wheel.print();
        door.print();
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }


    public class Wheel {
        public void print() {
            System.out.println("Wheel method");
        }
    }

    public class Door {
        public void print() {
            System.out.println("Door method");
        }
    }
}
