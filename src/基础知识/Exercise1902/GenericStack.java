package »ù´¡ÖªÊ¶.Exercise1902;

import java.util.ArrayList;

public  class GenericStack<E> extends ArrayList<E>{
	public boolean isEmpty() {
	      return super.isEmpty();
	    }

	    public int getSize() {
	      return size();
	    }

	    public Object peek() {
	      return get(getSize() - 1);
	    }

	    public Object pop() {
	      Object o = get(getSize() - 1);
	      remove(getSize() - 1);
	      return o;
	    }

	    public Object push(E o) {
	      add(o);
	      return o;
	    }

	    public int search(Object o) {
	      return indexOf(o);
	    }

	    @Override
	    public String toString() {
	      return "stack: " + toString();
	    }
}
