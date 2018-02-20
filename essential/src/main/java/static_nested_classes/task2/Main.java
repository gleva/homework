package static_nested_classes.task2;
//Создать класс Distance с полем distance типа double и методом print.
// В классе Distance, создайте статический класс Converter с методами,
// которые будут конвертировать расстояние в разные единицы измерения
// (к примеру, из метров в километры, из километров в мили, и так далее).

public class Main {
    public static void main(String[] args) {
        Distance.Converter distance = new Distance.Converter();
        System.out.println("Мили " + distance.getKmToMile(10));
        System.out.println("Километры " + distance.getMetrToKm(112));
    }
}
