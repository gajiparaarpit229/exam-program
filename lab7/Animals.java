//The Transport interface declares a deliver () method. The abstract
//class Animal is the super class of the Tiger, Camel, Deer and
//Donkey classes. The Transport interface is implemented by the
//Camel and Donkey classes. Write a test program that initialize an
//array of four Animal objects. If the object implements the
//Transport interface, the deliver () method is invoked.

interface Transport {
    void deliver();
}

abstract class Animal {
    // Super class
}

class Tiger extends Animal {
    // Tiger class
}

class Camel extends Animal implements Transport {
    // Camel class implementing Transport interface
    public void deliver() {
        System.out.println("Camel is delivering.");
    }
}

class Deer extends Animal {
    // Deer class
}

class Donkey extends Animal implements Transport {
    // Donkey class implementing Transport interface
    public void deliver() {
        System.out.println("Donkey is delivering.");
    }
}

public class Animals {
    public static void main(String[] args) {
        Animal[] animals = {new Tiger(), new Camel(), new Deer(), new Donkey()};

        for (Animal animal : animals) {
            if (animal instanceof Transport) {
                Transport transportAnimal = (Transport) animal;
                transportAnimal.deliver();
            }
        }
    }
}
