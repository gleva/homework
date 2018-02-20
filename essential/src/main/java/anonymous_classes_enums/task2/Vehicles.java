package anonymous_classes_enums.task2;

//Создайте перечислительный тип (enum) Vehicles,
//содержащий конструктор, который должен принимать целочисленное значение (стоимость автомобиля),
//содержать метод getColor(), который возвращает строку с цветом автомобиля, и содержать
//перегруженный метод toString(), который должен возвращать строку с названием экземпляра,
//цветом и  стоимостью автомобиля.

enum Vehicles{

    PRICE1(10), PRICE2(20), PRICE3(30);

    int val;

    Vehicles(int val) {
        this.val = val;
    }

    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
       return "Имя: "+this.name() + " цвет: " + getColor() + " скорость: " + val;
    }
}

class Main{
    public static void main(String[] args) {
        Vehicles vehicles1 = Vehicles.PRICE1;
        vehicles1.PRICE1.setColor("blue");
        System.out.println(vehicles1.toString());

        Vehicles vehicles2 = Vehicles.PRICE2;
        Vehicles.PRICE2.setColor("green");
        System.out.println(vehicles2.toString());

        Vehicles vehicles3 = Vehicles.PRICE3;
        Vehicles.PRICE3.setColor("black");
        System.out.println(vehicles3.toString());


    }
}

