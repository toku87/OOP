package Queue;


import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;

public class QueueSimulator {

    public static void main(String[] args) {
        ArrayDeque<Person> queue = new ArrayDeque<>();
        queue.add(new Person("Mariola", "piwo, wino, cola") );
        queue.add(new Person("Andrzej", "papierosy"));
        queue.add(new Person("Kuba","materac" ));
        queue.add(new Person("Brygida", "godność osobista"));

        //zaczynamy obsluge kolejki

        while (!queue.isEmpty()){
            Person currentClient = queue.removeFirst();
            System.out.println(currentClient.getName());
            System.out.println(currentClient.unpackShopping());
        }
        System.out.println("Obsluzylismy klientow");

    }
}
