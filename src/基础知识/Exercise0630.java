package 基础知识;
/*游戏
 * 双骰儿赌博
 * 1.随机产生两个点
 * 
 */
public class Exercise0630 {
	public static void main(String[] args) {
		int a = (int)(Math.random()*6+1);
		int b = (int)(Math.random()*6+1);
		int c=a+b;
		if(a+b==2||a+b==3||a+b==12) {
			System.out.printf("You rolled %d+%d=%d\nYou lose",a,b,c);
		}
		if(a+b==7||a+b==11) {
			System.out.printf("You rolled %d+%d=%d\nYou win",a,b,c);
		}
		if(c==4||c==5||c==6||c==8||c==9||c==10) {
			int point = a+b;
			System.out.printf("The point is %d\n",point);
			while(true) {
				b = (int)(Math.random()*6+1);	
				a = (int)(Math.random()*6+1);
				c=a+b;
				if(a+b==point) {
					System.out.printf("You rolled %d+%d=%d\nYou win",a,b,c);
					break;
				}
				if(a+b==7) {
					System.out.printf("You rolled %d+%d=%d\nYou lose",a,b,c);
					break;
				}
			}
		}
	}
}
