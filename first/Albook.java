package first;
import java.util.*;
class Book {
	String name,author,publisher;
	int id,quantity;
Book(int id,String name,String author,String publisher,int quantity){
	
	this.id=id;
	this.name=name;
	this.author=author;
	this.publisher=publisher;
	this.quantity=quantity;
}
}

class Albook{
	public static void main(String[] args) {
	List<Book> list=new ArrayList<>();
	Book b1=new Book(1,"quantum physics","me","the physists",4);
	Book b2=new Book(2,"quantum mechanics","i","the physists",7);
	Book b3=new Book(3,"quantum theory","myself","the physists",2);
	list.add(b1);
	list.add(b2);
	list.add(b3);
	for(Book b:list){
		System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	}

	}

}
