package Code;

public class Test {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		EssentialPrimeImplicants e = new EssentialPrimeImplicants();
		DoublyLinkedList[] d = new DoublyLinkedList[2];
		d[0]=new DoublyLinkedList();
		d[0].add(0);
		d[0].add(2);
		d[1]=new DoublyLinkedList();
		d[1].add(5);d[1].add(2);
		int[] m = {4,2,6,8,10,5,12,14,15};
		PrimeImplicants p = new PrimeImplicants();
		p.generatePrimeImplicants(m);
		DoublyLinkedList[] coveringPIs = e.coveringPIs(e.coveredMinterms(d), m);
		
	}

}
