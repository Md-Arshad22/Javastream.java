package javaclasses;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
public class Streamcls {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("mani","manisha","muskan","lehar","lovely");
	
		            //FILTERING NAMES STARTING WITH M
		// List<String> filterNames = list.stream().filter(s->s.startsWith("m")).collect(Collectors.toList());
		// System.out.println(filterNames);
	
		            // TEXT CHANGE IN UPPERCASE
		// List<String> uppercase = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		// System.out.println("Name is : " +uppercase);
		
		            // TEXT CHANGE IN  LOWERCASE
		// List<String> lowercase = list.stream().map(String::toLowerCase).collect(Collectors.toList());
		// System.out.println("Name is : " +lowercase);
		
		            // SORTING NAMES
		// List<String> sortNames = list.stream().sorted().collect(Collectors.toList());
		// System.out.println("Sorted Name is : " + sortNames);
		
		            // SORTING NAMES IN REVERSE ORDER
		// List<String> sortNamesReverse = list.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		// System.out.println("Sorted Name in reverse order is : " + sortNamesReverse);
		
		            // FILTERING NAMES STARTING WITH M AND SORTING IN REVERSE ORDER
		// List<String> filterNamesReverse = list.stream().filter(s->s.startsWith("m")).sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		// System.out.println("Filtered Name in reverse order is : " + filterNamesReverse);

		            //COUNTING LENGTH 
		List<Entry<Integer, List<String>>> Map =list.stream().collect(Collectors.groupingBy(String::length)).entrySet().stream().collect(Collectors.toList());
		System.out.println("Map is : " +Map);
		
	}

}

