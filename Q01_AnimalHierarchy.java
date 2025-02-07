import java.util.Scanner;

class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps");
    }
}

public class Q01_AnimalHierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Dog's name: ");
        String dogName = sc.nextLine();
        System.out.print("Enter Dog's age: ");
        int dogAge = sc.nextInt();
        sc.nextLine();
        Animal dog = new Dog(dogName, dogAge);

        System.out.print("Enter Cat's name: ");
        String catName = sc.nextLine();
        System.out.print("Enter Cat's age: ");
        int catAge = sc.nextInt();
        sc.nextLine();
        Animal cat = new Cat(catName, catAge);

        System.out.print("Enter Bird's name: ");
        String birdName = sc.nextLine();
        System.out.print("Enter Bird's age: ");
        int birdAge = sc.nextInt();
        Animal bird = new Bird(birdName, birdAge);

        System.out.println("\nAnimal Sounds:");
        dog.displayInfo();
        dog.makeSound();

        cat.displayInfo();
        cat.makeSound();

        bird.displayInfo();
        bird.makeSound();

        sc.close();
    }
}
