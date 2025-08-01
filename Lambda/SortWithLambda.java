import java.util.*;

public class SortWithLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ravi", "Amit", "John", "Priya");
        // Ascending sort using lambda
        Collections.sort(names, (a, b) -> a.compareTo(b));
        // Descending sort using lambda
        Collections.sort(names, (a, b) -> b.compareTo(a));
        names.forEach(System.out::println); // prints in descending order
    }
}
