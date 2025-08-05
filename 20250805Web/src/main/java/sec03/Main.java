package sec03;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("80일간의 세계일주"));
		bookShelf.appendBook(new Book("BIBLE"));
		bookShelf.appendBook(new Book("신데렐라"));
		bookShelf.appendBook(new Book("장발장"));

		// 이터레이터 생성
		Iterator<Book> it = bookShelf.iterator(); 
		
		// 다음 책이 있는지
		while (it.hasNext()) {
			// 책 가져오기
			Book book = it.next();
			System.out.println(book.getName());
		}
		
		System.out.println();
		
		for (Book book : bookShelf) {
			System.out.println(book.getName());
		}
	}
}
