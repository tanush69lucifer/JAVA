import java.util.*;
class Demo {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("ArrayList: " + list);
        String[] newArr = list.toArray(new String[0]);
        // agar 10 hota new string m to ?
        // a b c copy n baaki 7 mei null aa jayega 
        System.out.println("Array: " + Arrays.toString(newArr));
        // agar to lower function use kroge yaha to error throw because null m kn krte
    }
}
