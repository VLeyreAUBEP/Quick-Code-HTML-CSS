package staticMembers.counter;

public class Counter {
	private static int count = 0;
	
	public Counter() {
		++Counter.count;
	}

	public int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		Counter count1 = new Counter();
		System.out.println("Pour count1, le compteur est à " + count1.getCount());
		
		Counter count2 = new Counter();
		System.out.println("Pour count2, le compteur est à " + count2.getCount());
		
		Counter count3 = new Counter();
		System.out.println("Pour count3, le compteur est à " + count3.getCount());
	}
}
