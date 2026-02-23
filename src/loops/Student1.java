package loops;

public class Student1 {
	
	public void results(int marks) {
		
		
	if(marks>60) {
		System.out.println("student pass");
		
	}else{ 
		System.out.println("Student fail");
		
	}
	
	}
	
	public static void main(String[] args) {
		
		Student s=new Student();
		
		s.result(70);
	}

}
