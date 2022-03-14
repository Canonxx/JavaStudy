package 基础知识;

import java.util.Scanner;

/*提示用户输入学生个数，学生姓名和成绩，然后按照成绩的降序打印学生的姓名
 * 
 * 
 */
public class Exercise0717 {
	public static void main(String[] args) {
		System.out.println("Enter the number of students:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("Enter the name and score:");
		String[] students = new String[n];
		int[] grades = new int[n];
		for(int i=0;i<students.length;i++) {
			students[i] = input.next();
		}
		for(int i=0;i<grades.length;i++) {
			grades[i] = input.nextInt();
		}
		printName(grades, students);
 		input.close();
	}
	
	public static void printName(int[] grades,String[] students) {
		for(int i=0;i<grades.length-1;i++) {
			//int max = grades[i];
			int temp;
			String tempString;
			for(int j=i+1;j<grades.length;j++) {
				if(grades[i]<grades[j]) {
					temp = grades[j];
					grades[j] = grades[i];
					grades[i] = temp;
					tempString = students[j];
					students[j] = students[i];
					students[i] = tempString;
				}
			}
			
		}
		for(int i=0;i<grades.length;i++) {
			System.out.println(students[i]+" "+grades[i]);
		}
	}
}
