package array_list;

public class Book_set implements Comparable<Book_set> {
	private Integer id;
	private String name,author,publisher;
	private Integer quanitity;

	public Book_set(Integer id, String name, String author, String publisher, Integer quanitity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quanitity = quanitity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Integer getQuanitity() {
		return quanitity;
	}

	public void setQuanitity(Integer quanitity) {
		this.quanitity = quanitity;
	}

	@Override
	public int compareTo(Book_set o) {
		// TODO Auto-generated method stub

		if(id>o.id){
	        return 1;
	    }else if(id<o.id){
	        return -1;
	    }else{
	    return 0;
	    }

	}





}
