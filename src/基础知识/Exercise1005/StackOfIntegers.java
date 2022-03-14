package »ù´¡ÖªÊ¶.Exercise1005;

public class StackOfIntegers {
	private int[] elements;
	private int size;
	public StackOfIntegers() {
		// TODO Auto-generated constructor stub
		elements = new int[16];
	}
	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}
	public boolean empty() {
		return	(size==0);
	}
	public int peek() {
		
		return	size!=0?elements[size-1]:-1;
	}
	public void push(int value) {
		elements[size++]=value;
		
	}
	public int pop() {
		return	elements[(size--)-1];
	}
	public int getSize() {
		return size;
	}
}
