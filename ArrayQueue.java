import java.util.Arrays;

public class ArrayQueue<T> implements Queue<T>
{
	private T[] a = (T[]) new Object[10];
	private int head = -1;
	private int tail = -1;
	
	public T dequeue()
	{
		head++; 
		T t = a[head]; 
		a[head] = null; 
		return t;
	}

	public void enqueue(T item)
	{
		if (tail == a.length-1)
			growArr();
		tail++;
		a[tail] = item;
	}
	
	public boolean empty()
	{
		return head == tail;
	}

	private void growArr()
	{
		T[] arr = (T[]) new Object[2 * a.length];
		for (int i = 0; i < a.length; i++)
			arr[i] = a[i];
        a = arr;
    }
}
