package library;

public class members {
private int age;
private String name;
private int id;
public members(int age,String name,int id)
{
this.age=age; this.name=name; this.id=id;
}
public void setage(int age) {this.age=age;}
public void setid(int id) {this.id=id;}
public void setage(String name) {this.name=name;}
public int ageget() {return age;}
public int idget() {return id;}
public String nameget() {return name;}
public void display() {
	System.out.println("name: "+ name+"\nage: " + age+"\nid: " + id);
}
}