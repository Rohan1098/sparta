import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]= {"Mumbai","Chennai","Bangalore","Delhi"};
		List<String> cities=Arrays.asList(names);
		Collections.sort(cities);
		System.out.println(cities);
		List<Student> students=new ArrayList<>();
		students.add(new Student(1, "John", 22));
		students.add(new Student(3, "Rohn", 18));
		students.add(new Student(4, "Eohn", 21));
		students.add(new Student(2, "Uohn", 17));
		students.add(new Student(5, "Aohn", 12));
		Collections.sort(students,(s1,s2)->{
			return s1.name.compareTo(s2.name);
		}
		);
		
		
		
		System.out.println(students);
	}

}
