import java.util.*;

public class LinkedLists {
	public static void main(String[] args) {
		LinkedList<Integer> numbers =  new LinkedList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println("initial  " + numbers);
		numbers.addFirst(0);
		System.out.println("addFirst " + numbers);
		numbers.addLast(50);
		System.out.println("addLast  " + numbers);
		System.out.println("getFirst =>  " + numbers.getFirst());
		System.out.println("getLast =>   " + numbers.getLast());
		numbers.removeFirst();
		System.out.println("removeFirst " + numbers);
		numbers.removeLast();
		System.out.println("removeLast  " + numbers);
	}

}
