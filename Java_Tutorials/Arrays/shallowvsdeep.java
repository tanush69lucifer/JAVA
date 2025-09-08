class Person implements Cloneable {
    String name;
    Person(String name) { this.name = name; }
    public Person clone() { return new Person(this.name); }
}

public class Main {
    public static void main(String[] args) {
        // Original array
        Person[] arr1 = { new Person("Alice"), new Person("Bob") };

        // Shallow copy
        Person[] shallow = arr1.clone();
        shallow[0].name = "Changed";
        System.out.println(arr1[0].name); // shows "Changed" (shallow)

        // Deep copy
        Person[] deep = new Person[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            deep[i] = arr1[i].clone();
        }
        deep[0].name = "DeepChanged";
        System.out.println(arr1[0].name); // remains "Changed" (deep copy independent)
    }
}
