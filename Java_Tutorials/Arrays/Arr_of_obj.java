class Dog {
    String name;
    Dog(String name) { this.name = name; }
}

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = {
            new Dog("Buddy"),
            new Dog("Charlie"),
            new Dog("Max"),
            new Dog("Rocky"),
            new Dog("Jack")
        };
        for (Dog d : dogs) {
            System.out.println(d.name);
        }
    }
}
