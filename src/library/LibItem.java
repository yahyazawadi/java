package library;


public abstract class LibItem {
	private  String title;
	private String author;
	private String publish_date;
	private String summary;
	private boolean isBorrowed = false;
	
	public LibItem(String title,String author,String publish_date, String summary) {
		this.title=title;
		this.author=author;
		this.publish_date=publish_date;
		this.summary=summary;
		
	}
	
	public abstract void borrowItem();
	public abstract void returnItem();
	protected void setisborrowed(boolean value) {
		 this.isBorrowed=value;
	}
	public void displayStatus() {
		System.out.println("Title: "+title+"\nAuther: "+author +"\n" +(isBorrowed ? "Borrowed" : "Available"));
	}
	public String getTitle() {
		return title;
	}
	public boolean getIsBorrowed() {return isBorrowed;}
}
