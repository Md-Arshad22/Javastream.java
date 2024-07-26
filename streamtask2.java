package javaclasses;
import java.util.Arrays;
import java.util.List;

public class streamtask2 {
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int EvenNumbers = numbers.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
        int OddNumbers = numbers.stream().filter(num -> num % 2 != 0).mapToInt(Integer::intValue).sum();
		        System.out.println("Sum of even numbers: " + EvenNumbers);
		        System.out.println("Sum of odd numbers: " + OddNumbers);
		    }
	}
