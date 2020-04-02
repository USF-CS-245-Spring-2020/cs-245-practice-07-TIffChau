
import java.util.Arrays;

public class ArrayStack<T> implements Stack<T>
{
	public T[] array;
	public T[] grow_arr;
	public int size;
	public int position;

	public ArrayStack() {
		array = (T[]) new Object[10];
		position = -1;
		size = array.length;
	}

	public void push(T item) {
		if (position == size-1) {
			growArr();
		}
		position++;
		array[position] = item;
	}

	public T pop() throws Exception {
		if (empty()) {
			throw new Exception();
		}

		return array[position--];
	}

	public T peek() throws Exception {
		if (empty()) {
			throw new Exception();
		}
		return array[position];
	}                                                            

	public boolean empty() {
		if (position == -1) {
			return true;
		}
		return false;
	}

	public void growArr() {
		grow_arr = (T[]) new Object[size*2];
		for (int i=0; i<size; i++) {
			grow_arr[i] = array[i];
		}
		array = grow_arr;
		size = size*2;
	}

}