package 基础知识;
/*八皇后
 * 
 * 
 */
class Point{
	Point() {
		x=-1;
		y=-1;
	}
	public Point(int x,int y) {
		this.x =x;
		this.y=y;
	}
	int x;
	int y;
}

public class Exercise0722 {
	
	public static void main(String[] args) {
		char[][] array = new char[8][8];
		Point[] pointArray = new Point[8];
		for(int i=0;i<pointArray.length;i++) {
			pointArray[i] = new Point();
		}
		initPointArray(pointArray);
		initArray(array, pointArray);
		showPattern(array);
 	}
	
	
	public static void initPointArray(Point[] pointArray) {
		pointArray[0].x = (int)(Math.random()*pointArray.length);
		pointArray[0].y = (int)(Math.random()*pointArray.length);
		for(int i=1;i<pointArray.length;) {
			//boolean flag = true;
			int j=0;
			int x = (int)(Math.random()*pointArray.length);
			int y = (int)(Math.random()*pointArray.length);
			for(;j<i;j++) {
				if(x!=pointArray[j].x && y!=pointArray[j].y ) {
					continue;
				}
				else {
				//	flag =false;
					break;
				}
			}
			if(j == i) {
				pointArray[i].x = x;
				pointArray[i].y = y;
				i++;
			}
		}
	}
	
	public static void initArray(char[][] array,Point[] pointArray) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				array[i][j]=' ';
			}
		}
		for(Point i:pointArray) {
			array[i.x][i.y]='Q';
		}
	}
	
	public static void showPattern(char[][] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.printf("|%c",array[i][j]);
			}
			System.out.println('|');
		}
	}
	
}


