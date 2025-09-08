import java.util.*;
class Demo {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Tanush");
        name.add("Lucinda");
        name.add("James");
        name.add("Aarna");
        name.add("Saanvi");
        name.set(2,"Peter");
        for (String s:name){
            System.out.println(s);
        }
    }
}
