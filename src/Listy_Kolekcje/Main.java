package Listy_Kolekcje;

import java.text.DateFormat;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        int[] ints = new int[]{1,2,3,4,5,6,7,8,9};


        Integer [] integers = new Integer[10];
        for (int i = 0; i <10 ; i++) {
         integers[i] = new Integer(i);
        }
        for (Integer i : integers) {
//            System.out.println(i);
        }
        List list1 = Arrays.asList(ints);

        List list2 = Arrays.asList(integers);



        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println(lista);

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.addAll(lista);
        System.out.println(lista2);

        Collections.reverse(lista2);
        System.out.println(lista2);
        ArrayList<Integer>lista3 = new ArrayList<>();
        lista3.addAll(lista2);
        System.out.println(lista3);

        TreeSet<String> zbior = new TreeSet<>();
        zbior.add("Kowalski");
        zbior.add("Nowak");
        zbior.add("Adamiec");
        zbior.add("Wolek");
        zbior.add("Zazor");

        System.out.println(zbior);

        HashSet<Integer> zbior1 = new HashSet<>();
        zbior1.add(1);
        zbior1.add(2);
        zbior1.add(3);
        HashSet<Integer> zbior2 = new HashSet<>();
        zbior2.add(3);
        zbior2.add(4);
        zbior2.add(4);
        System.out.println(zbior2);
        HashSet<Integer> zbior3 = new HashSet<>();

        System.out.println(zbior1);
        System.out.println(zbior2);






    }
}