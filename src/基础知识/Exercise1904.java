package »ù´¡ÖªÊ¶;

public class Exercise1904 {
	public static void main(String[] args) {
		int m = linearSearch(new Integer[] {1,2,3,4}, 2);
		int n = linearSearch(new Integer[] {1,2,3,4}, 5);
		System.out.println(m);
		System.out.println(n);
		System.out.println(max(new Integer[] {2,1,3}));
		System.out.println(max(new Double[][] {{2.0,1.0,3.0},{3.5,4.6,7.0}}));
		System.out.println(binarySearch(new Integer[] {1,2,3,4,5,7}, 1));
	}
	
	public static <T extends Comparable<T>> int linearSearch(T[] list,T key) {
		for (int i = 0; i < list.length; i++) {
			if(list[i].compareTo(key)==1) {
				return i;
			}
		}
		return -1;
	}
	
	public static <E extends Comparable<E>> E max(E[] list) {
		E maxElem = list[0];
		for(int i=1;i<list.length;i++) {
			if(list[i].compareTo(maxElem)==1)
				maxElem = list[i];
		}
		return maxElem;
	}
	
	public static <T extends Comparable<T>> T max(T[][] list) {
		T maxElem = list[0][0];
		for(int i = 0;i<list.length;i++) {
			for(int j=0;j<list[0].length;j++) {
				if(list[i][j].compareTo(maxElem)==1)
					maxElem = list[i][j];
			}
		}
		return maxElem;
	}
	
	public static <T extends Comparable<T>> int binarySearch(T[] list,T key) {
		int first = 0;
		int last = list.length-1;
		int mid = (first+last)/2;
		while(first<=last) {
			if(list[mid].compareTo(key)==1) {
				last = mid-1;
				mid = (first+last)/2;
			}
			else if(list[mid].compareTo(key)==0) {
				return mid;
			}
			else {
				first = mid+1;
				mid = (first+last)/2;
			}
		}
		return -1;
	}
}
