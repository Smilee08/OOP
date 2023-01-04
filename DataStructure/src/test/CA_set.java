package test;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

import array_list.Book_set;

public class CA_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ascending order
		 Set<Book_set> s=new TreeSet<Book_set>();
		    Book_set b3=new Book_set(103,"Operating System","Galvin","Wiley",6);
		    Book_set b1=new Book_set(121,"Let us C","Yashwant Kanetkar","BPB",8);
		    Book_set b2=new Book_set(233,"Operating System","Galvin","Wiley",6);
		    //Creating Books
		    s.add(b3);
		    s.add(b1);
		    s.add(b2);
		    //Traversing TreeSet
		    for(Book_set b:s){
		    	 System.out.println(b.getId()+" "+b.getName()+" "+b.getAuthor()+" "+b.getPublisher()+" "+b.getQuanitity());
		    }

		    Queue<Book_set> queue=new PriorityQueue<Book_set>();

		    //Adding Books to the queue
		    queue.add(b1);
		    queue.add(b2);
		    queue.add(b3);
		    System.out.println("\nTraversing the queue elements:");
		    //Traversing queue elements
		    for(Book_set b:queue){
		    	 System.out.println(b.getId()+" "+b.getName()+" "+b.getAuthor()+" "+b.getPublisher()+" "+b.getQuanitity());
		    }
		    queue.remove();
		    System.out.println("After removing one book record:");
		    for(Book_set b:queue){
		    	 System.out.println(b.getId()+" "+b.getName()+" "+b.getAuthor()+" "+b.getPublisher()+" "+b.getQuanitity());
		        }
	}

}
