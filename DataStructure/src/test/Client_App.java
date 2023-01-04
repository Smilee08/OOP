package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import array_list.Book;

public class Client_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List interface(ArrayList, LinkedList,Vector,Stack)
		List<Book> list=new ArrayList<Book>();
		Book b1=new Book(101,"Hi byee","Smile","seema",8);
		list.add(b1);

		for(Book b:list) {
			System.out.println(b.getId()+" "+b.getName()+" "+b.getAuthor()+" "+b.getPublisher()+" "+b.getQuanitity());
		}

		 List<Book> LL=new LinkedList<Book>();//doubly linked list
		    //Creating Books
		    Book b2=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		    //Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		    //Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
		    //Adding Books to list
		    LL.add(b2);
		    //list.add(b2);
		    //list.add(b3);
		    //Traversing list
		    for(Book b:list){
		    System.out.println(b.getId()+" "+b.getName()+" "+b.getAuthor()+" "+b.getPublisher()+" "+b.getQuanitity());
		    }
//hashset stores unique values only
		    HashSet<Book> set=new HashSet<Book>();
		    //Creating Books
		    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
		    //Adding Books to HashSet
		    set.add(b3);
		    //Traversing HashSet
		    for(Book b:set){
		    System.out.println(b.getId()+" "+b.getName()+" "+b.getAuthor()+" "+b.getPublisher()+" "+b.getQuanitity());
		    }

		    LinkedHashSet<Book> hs=new LinkedHashSet<Book>();
		    //Creating Books
		    //Adding Books to hash table
		    hs.add(b1);
		    hs.add(b2);
		    hs.add(b3);
		    //Traversing hash table
		    for(Book b:hs){
		    System.out.println(b.getId()+" "+b.getName()+" "+b.getAuthor()+" "+b.getPublisher()+" "+b.getQuanitity());
		    }

		    //Creating map of Books
		    Map<Integer,Book> map=new HashMap<Integer,Book>();

		    //Adding Books to map
		    map.put(1,b1);
		    map.put(2,b2);
		    map.put(3,b3);

		    //Traversing map
		    for(Map.Entry<Integer, Book> entry:map.entrySet()){
		        int key=entry.getKey();
		        Book b=entry.getValue();
		        System.out.println(key+" Details:");
		        System.out.println(b.getId()+" "+b.getName()+" "+b.getAuthor()+" "+b.getPublisher()+" "+b.getQuanitity());
		    }
System.out.println("\nLinked list map");
		    Map<Integer,Book> m=new LinkedHashMap<Integer,Book>();

		    //Adding Books to map
		    m.put(2,b2);
		    m.put(1,b1);
		    m.put(3,b3);

		    //Traversing map
		    for(Map.Entry<Integer, Book> entry:m.entrySet()){
		        int key=entry.getKey();
		        Book b=entry.getValue();
		        System.out.println(key+" Details:");
		        System.out.println(b.getId()+" "+b.getName()+" "+b.getAuthor()+" "+b.getPublisher()+" "+b.getQuanitity());
		    }

	}

}
