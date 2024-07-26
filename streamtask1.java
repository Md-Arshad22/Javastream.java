package javaclasses;
import java.util.Comparator;
import java.util.List;

public class streamtask1 {

	public static void main(String[] args) {
		
List<Integer> numbers = List.of(10, 5, 20, 15, 25, 30);
        
        int secondSmallest = numbers.stream().sorted().distinct().skip(1).findFirst()
                                    .orElseThrow(() -> new IllegalArgumentException("List is too small"));
        int secondLargest = numbers.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst()
                                   .orElseThrow(() -> new IllegalArgumentException("List is too small"));

        System.out.println("Second smallest element: " + secondSmallest);
        System.out.println("Second largest element: " + secondLargest);
		
	}
}
