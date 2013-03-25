public class C4Collection{
  public static void main(String args[]){
	LinkedList<Integer> ll = new LinkedList<Integer>();
	ll.add(-8);
	ll.add(20);
	ll.add(-20);
	ll.add(8);
	Comparator<Integer> r = Collections.reverseOrder();
	Collections.sort(ll,r);
	System.out.print("Список отсортирован в обратном порядке:");
	display(ll);
	Collections.shuffle(ll);
	System.out.println();
	//Отобразить перемешанный список.
	System.out.print("Список перемешан: ");
    display(ll);
	System.out.println();
	System.out.println("Минимум: "+Collections.min(ll));
	System.out.println("Максимум "+Collections.max(ll));
	}
	public static void display(LinkedList<Integer> tt){
		for(int i:tt)
			System.out.print(i+" ");
		
	}
}
