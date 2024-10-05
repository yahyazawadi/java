package library;


public class archived_docs extends LibItem {


	public archived_docs(String title, String author, String publish_date, String summary) {
		super(title, author, publish_date, summary);
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public void borrowItem() {
		// TODO Auto-generated method stub
		if (!getIsBorrowed())
		{
			setisborrowed(true);
		System.out.println("the "+ this.getClass().getName() +getTitle()+" will be borrowed to you");
		}
		
		else 
		{
			System.out.println("the "+ this.getClass().getName()+ getTitle()+" is already borrowed");
		}
	}
	@Override
	public void returnItem() {
		// TODO Auto-generated method stub
		if (getIsBorrowed())
		{
			setisborrowed(false);
		System.out.println("the "+ this.getClass().getName()+getTitle()+" has been returned");
		}
		
		else 
		{
			System.out.println("the "+ this.getClass().getName()+ getTitle()+" is already returned");
		}

	}}
