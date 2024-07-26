package javaclasses;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class stream1 {
public static void main(String[] args) {
	
	            //REDUCE METHOD INTEGER IN STREAM
	// List<Integer> list = Arrays.asList(1,2,3,4,5);
	// int sum = list.stream().reduce(0,Integer::sum);
	// System.out.println("Sum is : " + sum);
	
	            //MIN AND MAX
	// List<Integer> list1 = Arrays.asList(1,2,3,4,5);
	// int max = list1.stream().reduce(Integer::max).get();
	// System.out.println("Max is : " + max);
	
	// List<Integer> list2 = Arrays.asList(1,2,3,4,5);
	// int min = list2.stream().reduce(Integer::min).get();
	// System.out.println("Min is : " + min);
	
	            //ADDITION IN LIST
	// List<Integer> list3 = Arrays.asList(5,5,5);
	// int mul = list3.stream().reduce(2, (a,b) -> a*b);
	// System.out.println("value is :"+mul);
	
	            //SUBTRACTION IN LIST
	List<Integer> list4 = Arrays.asList(5,5,5);
	int min1 = list4.stream().reduce(5, (a,b) -> a-b);
	System.out.println("value is :"+ min1);
	

//	        List<Integer> list5 = Arrays.asList(1,2,3,4,5);
//	        int start = 1; // Start index (inclusive)
//	        int end = 5;   // End index (exclusive)
	
	        // Get sublist and perform subtraction using Java streams
	
//	        int result = list5.subList(start, end).stream().reduce(0, (a, b) -> b- a);
//	        System.out.println("Subtraction result from index " + start + " to " + end + ": " + result);
	}
}














