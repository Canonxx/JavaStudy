package 复习题代码;


//先创建5个集合
public class 程序清单0403 {
	public static void main(String[] args) {
		String s1 = "1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31";
		String s2 = "2 3 6 7 10 11 14 15 18 19 22 23 26 27 30 31";
		String s3 = "4 5 6 7 12 13 14 15 20 21 22 23 28 29 30 31";
		String s4 = "8 9 10 11 12 13 14 15 24 25 26 27 28 29 30 31";
		String s5 = "16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31";
		int day = (int)(Math.random()*31+1);
		System.out.println(day);
		String strDay = day +"";
		int count = 0;
		if(s1.contains(strDay)) {
			count+=Integer.parseInt(s1.substring(0,1));
		}
		if(s2.contains(strDay)) {
			count+=Integer.parseInt(s2.substring(0,1));
		}
		if(s3.contains(strDay)) {
			count+=Integer.parseInt(s3.substring(0,1));
		}
		if(s4.contains(strDay)) {
			count+=Integer.parseInt(s4.substring(0,1));
		}
		if(s5.contains(strDay)) {
			count+=Integer.parseInt(s5.substring(0,2));
		}
		System.out.println("生日在一个月的第"+count +"天");
	}
}
