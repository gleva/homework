package exceptions.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

//Описать класс с именем Worker, содержащую следующие поля:
// фамилия и инициалы работника;
// название занимаемой должности;
// год поступления на работу.
//Написать программу, выполняющую следующие действия:
// ввод с клавиатуры данных в массив, состоящий из пяти элементов типа Worker (записи должны
//быть упорядочены по алфавиту);
// если значение года введено не в соответствующем формате выдает исключение.
// вывод на экран фамилии работника, стаж работы которого превышает введенное значение.

public class Main{
    public static void main(String[] args) {
        Exception myException = new Exception("Invalid date!");
        List<Worker> workers = new ArrayList<Worker>();
        Scanner sc = new Scanner(System.in);
        String name;
        String post;
        int year;

        for (int i = 0; i <5 ; i++) {

            System.out.println("Fill FIO = ");
            name = sc.next();

            System.out.println("Fill post = ");
            post = sc.next();

            System.out.println("Fill year = ");
                try{
                     year = sc.nextInt();
                    if((1967 > year) || (year > 2017)){
                        throw myException;
                    }

                 workers.add(new Worker(name,post,year));

                }
                catch(Exception e){
                    System.out.println("Invalid date!!!");

                }

        }

        System.out.println("Work experience = ");
        Scanner in = new Scanner(System.in);
        int exp = in.nextInt();

        ListIterator <Worker> listIterator = workers.listIterator();
        System.out.println("Employees with work experience:");
        while (listIterator.hasNext()) {
            Worker it= listIterator.next();
            if((2017 - it.getYear())> exp)
            System.out.println(it.getName());
        }

    }

}
