package 复习题代码;

public class 程序清单0207 {
	public static void main(String[] args) {
		long totalMilliSeconds = System.currentTimeMillis();
		long hours = totalMilliSeconds / (1000*60*60);
		long remainMinutes = totalMilliSeconds % (1000*60*60)/(1000*60);
		long remainSeconds = totalMilliSeconds % (1000*60*60)%(1000*60)/1000;
		System.out.println(hours+":"+remainMinutes +":"+remainSeconds );
	
	}
}
