package iterator;

import java.util.Iterator;

public class Client {
	public static void main(String [] args) {
		Account account = new Account();
		account.addDeposit(100);
		account.addDeposit(200);
		account.addDeposit(50);
		
		// Hacker
		Iterator<Money> deposits = account.getIterator();	// mutable object! returned by reference

		while(deposits.hasNext()) {
			deposits.next().print();
		}
	}
}
