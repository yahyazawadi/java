package library;


public class Book extends LibItem {
	private String genre;
	public Book(String title, String author, String publish_date, String summary, String genre) {
		super(title, author, publish_date, summary);
		this.genre=genre;
	}
	@Override
	public void borrowItem() {
		// TODO Auto-generated method stub
		if (!getIsBorrowed())
		{
			setisborrowed(true);
		System.out.println("the "+ this.getClass().getName()+getTitle()+" will be borrowed to you");
		}
		
		else 
		{
			System.out.println("the "+ this.getClass().getName()+getTitle()+" is already borrowed");
		}
	}
	@Override
	public void returnItem() {
		// TODO Auto-generated method stub
		if (getIsBorrowed())
		{
			setisborrowed(false);
		System.out.println("the " +getTitle()+" has been returned");
		}
		
		else 
		{
			System.out.println("the "+  getTitle()+" is already returned");
		}
		
	}
	
	
	
	
	
	
	
	}
	

	

	

