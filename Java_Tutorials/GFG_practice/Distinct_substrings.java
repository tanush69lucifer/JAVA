import java.util.*;
public class DistinctSubstrings {
    public static void main(String[] args) {
        String s = "abc";
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                set.add(s.substring(i,j));
            }
        }
        System.out.println("Distinct substrings: " + set.size());
    }
}
