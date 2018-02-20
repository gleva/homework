package exceptions.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Scanner;
//Требуется: Описать класс с именем Price, содержащую следующие поля:
// название товара;
// название магазина, в котором продается товар;
// стоимость товара в гривнах.
//Написать программу, выполняющую следующие действия:
// ввод с клавиатуры данных в массив, состоящий из двух элементов типа Price (записи должны
//быть упорядочены в алфавитном порядке по названиям магазинов);
// вывод на экран информации о товарах, продающихся в магазине, название которого введено с
//клавиатуры (если такого магазина нет, вывести исключение).

public class Main{
    public static void main(String[] args) {
        ArrayList<Price> prices = new ArrayList<>();
        Exception myEx = new Exception("Not find magazine in list!");

        Comparator <Price> comparator = new Comparator<Price>(){
            @Override
            public int compare(Price o1, Price o2) {
                return o1.getMagazine().compareTo(o2.getMagazine());
            }
        };


        Scanner sc = new Scanner(System.in);
        String good;
        String magazine;
        int price;
        for (int i = 0; i <2 ; i++) {
            System.out.println("Fill magazine = ");
            magazine = sc.next();

            System.out.println("Fill good = ");
            good = sc.next();

            System.out.println("Fill price = ");
            price = sc.nextInt();


            prices.add(new Price(good,magazine,price));

        }

        prices.sort(comparator);

        System.out.println("Fill your shop: ");
        Scanner in  = new Scanner(System.in);
        String newShop = in.next();

        ListIterator <Price> iterator = prices.listIterator();
        while(iterator.hasNext()){
           Price tmp=iterator.next();
           try {
               if (tmp.getMagazine().equals(newShop)) {
                   System.out.println("Magazine: " + tmp.getMagazine() + " Good: " + tmp.getName() + " Price: " + tmp.getPrice());
               } else if (tmp.getMagazine()!=newShop) {
                   throw myEx;
               }
           }
           catch(Exception e){
                   System.out.println(e.getMessage());
               }
        }
    }
}
