package 视频练习;
/*创建一个数组
 * 
 * 
 */
public class 回形数 {
	public static void main(String[] args) {
		showPattern(5);
	}
	
	public static void showPattern(int number) {
		int[][] array1=new int[number][number];
		int count = 0;
		int minX=0;
		int maxX=number-1;
		int minY=0;
		int maxY=number -1;
		while(count<number*number) {
			for(int m=minX;m<=maxX;m++) {
				array1[minY][m]=++count;
			}
			minY++;
			for(int m=minY;m<=maxY;m++) {
				array1[m][maxX]=++count;
			}
			maxX--;
			for(int m=maxX;m>=minX;m--) {
				array1[maxY][m] = ++count;
			}
			maxY--;
			for(int m=maxY;m>=minY;m--) {
				array1[m][minX]=++count;
			}
			minX++;
		}
		
		for(int i=0;i<number;i++) {
			for(int j=0;j<number;j++) {
				System.out.printf("%-4d",array1[i][j]);
			}
			System.out.println('\n');
		}
	}
}
