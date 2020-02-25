package pj1;
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayPile books = new ArrayPile();
		System.out.println("The size of empty pile is "+books.size());
		System.out.println("\nStart adding books into the pile ...");
		books.push("Book 1");
		books.push("Book 2");
		books.push("Book 3");
		books.pop();
		books.push("Book 4");
		books.push("Book 5");
		System.out.println("The Peek is "+ books.top());
		System.out.println("The size is "+books.size());
		System.out.println("Pile Of Books: ");
		books.clear();
		LinkedPileOfBooks pile = new LinkedPileOfBooks();
		books.push("Book 1");
		books.push("Book 2");
		books.push("Book 3");
		books.pop();
		books.push("Book 4");
		books.push("Book 5");
		System.out.println("The Peek is "+ books.top());
		System.out.println("The size is "+books.size());
		System.out.println("Pile Of Books: ");
		books.clear();
	}

}
