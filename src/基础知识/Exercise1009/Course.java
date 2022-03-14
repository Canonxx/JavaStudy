package »ù´¡ÖªÊ¶.Exercise1009;

public class Course {
	private String courseName;
	private String[] students=new String[4];
	private int numberOfStudents;
	public Course(String courseName) {
		// TODO Auto-generated constructor stub
		this.courseName=courseName;
	}
	public String getCourseName() {
		
		return this.courseName;
	}
	public void addStudent(String student) {
		if (students.length>numberOfStudents) {
			students[numberOfStudents++]=student;
		}else {
			String[] temp = new String[students.length*2];
			System.arraycopy(students, 0, temp, 0, numberOfStudents);
			students = temp;
			students[numberOfStudents++]=student;
		}
		
	}
	public void dropStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if(students[i].equals(student)) {
				for (int j = i; j < numberOfStudents-1; j++) {
					students[j]=students[j+1];
				}
				numberOfStudents--;
				break;
			}
		}
	}
	public String[] getStudents() {
		return students;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public void clear() {
		for (int i = 0; i < numberOfStudents; i++) {
			students[i]=null;
		}
	}
}
