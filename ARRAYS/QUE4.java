// This is by Intstream
import java.util.stream.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int n = 10;
        List<Integer> primes = IntStream.range(2, Integer.MAX_VALUE)
                .filter(Main::isPrime)
                .limit(n)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(primes);
    }

    static boolean isPrime(int number) {
        if(number < 2) return false;
        return IntStream.rangeClosed(2, (int)Math.sqrt(number))
                .noneMatch(div -> number % div == 0);
    }
}
// Normal 
public static int[] generatePrimes(int n) {
    int[] primes = new int[n];
    int count = 0;
    int num = 2;
    while (count < n) {
        if (isPrime(num)) {
            primes[count++] = num;
        }
        num++;
    }
    return primes;
}

private static boolean isPrime(int num) {
    if (num < 2) return false;
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) return false;
    }
    return true;
}
public static void main(String[] args) {
    int[] primes = generatePrimes(10);
    System.out.println(Arrays.toString(primes));
}
