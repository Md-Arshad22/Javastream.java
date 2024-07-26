package javaclasses;
import java.util.List;
import java.util.stream.Collectors;
	
	public class streamtask {
	    public static void main(String[] args) {
	        List<String> stringList = List.of("1", "2", "3");      
	        List<Integer> integerList = stringList.stream().map(Integer::parseInt).collect(Collectors.toList());
	        System.out.println("List of integers: " + integerList + stringList);
	    }
	}











