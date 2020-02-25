package pj1;
import java.util.NoSuchElementException;


public class LinkedPileOfBooks<T> implements pile<T> {
	
	private class Node<T>
	{
		T data;
		Node next;
		Node(T item){
			data = item;
			next = null;
		}
	}
	private Node top;
	private int n;
	
	public LinkedPileOfBooks()
	{
		top = null;
		n=0;
	}

	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public void clear() {
		while(!isEmpty())
			System.out.println(this.pop());
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new NoSuchElementException("Pile UnderFlow");
		@SuppressWarnings("unchecked")
		T value = (T) top.data;
		top = top.next;
		n--;
		return value;
	}

	@Override
	public void push(T obj) {
		Node oldTop = top;
		@SuppressWarnings("unchecked")
		Node item = new Node(obj);
		top = item;
		top.next = oldTop;
		n++;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T top() {
		// TODO Auto-generated method stub
		return (T) top.data;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return n;
	}

}
