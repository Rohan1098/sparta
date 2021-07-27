
public class Student implements Comparable<Student> {
   int rollNo;
   String name;
   int age;

public Student(int rollNo, String name, int age) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.age = age;
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	if(this.rollNo<o.rollNo)
	return -1;
	else if(this.rollNo>o.rollNo)
		return 1;
	else
		return 0;
		
}
}
