package »ù´¡ÖªÊ¶;

import java.util.ArrayList;

public class Exercise1903 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(2);
		ArrayList<Integer> list1 = removeDuplicates(list);
		for(Integer i:list1) {
			System.out.print(i);
		}
	}
	
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){ 
		ArrayList<E> list1 = new ArrayList<E>();
		for(E item:list) {
			if(!list1.contains(item))
			{
				list1.add(item);
			}
		}
		return list1;
	}
}
