package pj1;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayPile <T> implements pile<T>{
	private T[] list;
	private int n;
	
	public ArrayPile()
	{
		n = 0;
		@SuppressWarnings("unchecked")
		T[] tempList = (T[])new Object[2];
		list = tempList;
	}

	@Override
	public boolean isEmpty() {
		return n == 0;
	}

	@Override
	public boolean isFull() {
		return n == list.length;
	}

	@Override
	public void clear() {
		while(!isEmpty())
			System.out.println(this.pop());
	}

	@Override
	public T pop() {
		if(isEmpty())
			throw new NoSuchElementException("Pile underflow");
		T item = list[--n];
		list[n] = null;
		if(n>0 && n == list.length/4)
			resize(list.length/2);
		return item;
	}

	private void resize(int i) {
		T[] tempList = Arrays.copyOf(list, i);
		list = tempList;
	}

	@Override
	public void push(T obj) {
		if(isFull())
			resize(list.length*2);
		list[n++] = obj; 
	}

	@Override
	public T top() {
		if(isEmpty())
			throw new NoSuchElementException("Pile underflow");
		return list[n-1];
	}

	@Override
	public int size() {
		return n;
	}
}
