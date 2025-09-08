import java.util.*;
class Demo {
    public static void main(String[] args) {
        List<Integer> al=Arrays.asList(1,7,2,4,9,4,6,10,3);
        List<String> s_al=Arrays.asList("Hello","HI","YO");
        Collections.sort(al);
        System.out.print(al);
        Collections.sort(s_al);
        System.out.print(s_al);
        Collections.reverseOrder(al);
        System.out.print(al);
        Collections.reverseOrder(s_al);
        System.out.print(s_al);

    }
}
