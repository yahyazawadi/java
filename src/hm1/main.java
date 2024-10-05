package hm1;

import library.librarymanager;
import library.Book;
import library.archived_docs;
import library.mag;
import library.members;
import library.videos;
public class main {

	public static void main(String[] args) {
		members member = new members(17,"yahya",966324);
		member.display();
		
		// TODO Auto-generated method stub
		System.out.println("test");
		Book b = new Book("book title",  "author", "2024, 10, 5","summary", "genre"); 
		
		b.displayStatus();
		b.borrowItem();
	
		b.displayStatus();
		b.returnItem();
		b.displayStatus();
		mag m = new mag("mag title",  "author", "2024, 6, 5","mag summary", 12); 
		m.displayStatus();
		videos v = new videos("video title",  "author", "2024, 6, 5","video summary", 12); 
		v.displayStatus();
		archived_docs d = new archived_docs("docs title",  "author", "2024, 6, 5","video summary"); 
		d.displayStatus();
		
		librarymanager libman = new librarymanager();
		libman.addLibraryItem(b);
		libman.addLibraryItem(d);
		libman.addLibraryItem(m);
		libman.addLibraryItem(v);
		
		libman.displayAllItems();
		libman.search("magtitle");
		libman.borrowLibraryItem("mag title");
		libman.returnLibraryItem("mag title");
		
		
	
	}

}
