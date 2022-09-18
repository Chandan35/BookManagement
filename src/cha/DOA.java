package cha;

import java.util.Iterator;
import java.util.Scanner;

public class DOA {
     Data d = new Data();
	Scanner sc = new Scanner(System.in);
	public void DisplayAllBook() {
		Iterator<Book> itr = d.data.iterator();
		while (itr.hasNext()) {
			 System.out.println(itr.next()); 
			
		}
	}
	
	public void searchById() {
		System.out.println("Enter the ID");
		int x = sc.nextInt();
		Iterator<Book> itr = d.data.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			if(b.getBookId()==x)
			 System.out.println(b); 
			
		}
		
	}
	
	
	
	public void insert(Book o) {
		boolean a = d.data.add(o);
		if(a==true) {
		System.out.println("  Aded succeesfully......");
		}
		else {
			System.out.println("Please try again");
		}
	}
	
	
	public void deleteById() {
		System.out.println("Enter   ID");
		int x = sc.nextInt();
		Iterator<Book> itr = d.data.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			if(b.getBookId()==x)
				itr.remove();
			 System.out.println("removed"); 
			break;
		}
	}
	
	public void update() {
		
		System.out.println("Enter  ID");
		int x = sc.nextInt();
		Iterator<Book> itr = d.data.iterator();
       while(itr.hasNext()) {
       	Book bid=itr.next();
           if(((bid).getBookId())==x) {
           	System.out.println(bid); 
       		System.out.println("Enter Price ");
       		Double uP = sc.nextDouble();
       		bid.setPrice(uP);
				d.data.add(bid);
				System.out.println("Price Updated.......");
	}
}
}
}
