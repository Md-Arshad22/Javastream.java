package javaclasses;
import java.util.Arrays;
import java.util.List;

public class Ques4 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sum = list.stream().reduce(0, Integer::sum);
		System.out.println("Sum is : " + sum);
	}
}

