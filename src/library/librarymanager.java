package library;

import java.util.ArrayList;

public class librarymanager {
	private ArrayList <LibItem> items ;
	public librarymanager()
	{
		items = new ArrayList <>();
		
	};
	
	public void addLibraryItem(LibItem item) {
		items.add(item);
		System.out.println("added Library Item" + item.getTitle());
	};
	public void borrowLibraryItem(String title) {
	    for (LibItem item : items) {
	        if (item.getTitle().equalsIgnoreCase(title)) {
	            item.borrowItem();
	            return;
	        }
	    }
	    System.out.println(title + "Item not found.");
	}
	

	public void returnLibraryItem(String title) {
		
		for (LibItem item : items) {
	        if (item.getTitle().equalsIgnoreCase(title)) {
	            item.returnItem();
	            return;
	        }
	    }
	    System.out.println(title + "Item not found.");
	}
	
	public void search(String title) {
		for (LibItem item : items) {
	        if (item.getTitle().equalsIgnoreCase(title)) {
	            item.displayStatus();
	            return;
	        }
	    }
	    System.out.println(title + "Item not found.");
		
	}
	
		public void displayAllItems() {
		    for (LibItem item : items) {
		        item.displayStatus();
		    }
		}
		
		
	}
	


