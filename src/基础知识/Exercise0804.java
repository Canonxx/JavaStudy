package »ù´¡ÖªÊ¶;



public class Exercise0804 {
	public static void main(String[] args) {
		double[][] workHours = {
			      {2, 4, 3, 4, 5, 8, 8},
			      {7, 3, 4, 3, 3, 4, 4},
			      {3, 3, 4, 3, 3, 2, 2},
			      {9, 3, 4, 7, 3, 4, 1},
			      {3, 5, 4, 3, 6, 3, 8},
			      {3, 4, 4, 6, 3, 4, 4},
			      {3, 7, 4, 8, 3, 8, 4},
			      {6, 3, 5, 9, 2, 7, 9}};
		double[] weeklyHours = new double[workHours.length];
		int[] index = new int[weeklyHours.length];
 		initWeeklyHours(weeklyHours, workHours);
 		sort(weeklyHours, index);
 		showResult(index, weeklyHours);

	}
	
	public static void initWeeklyHours(double[] weeklyHours,double[][] workHours) {
		for(int i=0;i<weeklyHours.length;i++) {
			for(int j=0;j<workHours[i].length;j++) {
				weeklyHours[i]+=workHours[i][j];
			}
		}
	}
	
	public static void sort(double[] weeklyHours,int[] index) {
		for(int i=0;i<index.length;i++) {
			index[i] = i;
		}
		for(int i=0;i<weeklyHours.length-1;i++) {
			for(int j=i+1;j<weeklyHours.length;j++) {
				if(weeklyHours[j]>weeklyHours[i]) {
					double temp = weeklyHours[j];
					weeklyHours[j] = weeklyHours[i];
					weeklyHours[i] = temp;
					int temp1 = index[j];
					index[j] = index[i];
					index[i] = temp1;
				}
			}
		}
		
	}
	
	public static void showResult(int[] index,double[] workHours) {
		for(int i=0;i<index.length;i++) {
			System.out.println("Employee"+index[i]+" weeklyHours: "+workHours[i]);
		}
	}
}
