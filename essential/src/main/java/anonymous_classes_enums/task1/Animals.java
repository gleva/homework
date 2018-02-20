package anonymous_classes_enums.task1;

//Создайте перечислительный тип (enum) Animals, содержащий конструктор,
// который должен принимать целочисленное значение (возраст животного),
// и содержать перегруженный метод toString(), который должен возвращать
// название экземпляра и возраст животного.

enum Animals{
    CAT(2), DOG(10), MONKEY(9), ZEBRA(5);

    int year;

    Animals(int year){
        this.year = year;
    }

    @Override
    public String toString() {
        return "Имя животного: " + this.name() + " возраст: " + year;
    }
}

class Main{
    public static void main(String[] args) {
        Animals a1 =Animals.CAT;
        Animals a2 =Animals.DOG;
        Animals a3 =Animals.MONKEY;
        Animals a4 =Animals.ZEBRA;

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(a4.toString());
    }
}
