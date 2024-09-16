package in.priyankait.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class BookPk {
	private Integer bookId;
	private String bookName;
	
	public BookPk() {
		
	}

	public BookPk(Integer bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	

}
