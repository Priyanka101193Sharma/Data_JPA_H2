package in.priyankait.entity;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Books_Info_Tbl")
public class Book {

	private Double bookPrice;
	private String authorName;
	
	@EmbeddedId
	private BookPk bookpk;
	
	@Override
	public String toString() {
		return "Book [bookPrice=" + bookPrice + ", authorName=" + authorName + ", bookpk=" + bookpk + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(authorName, bookPrice, bookpk);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(authorName, other.authorName) && Objects.equals(bookPrice, other.bookPrice)
				&& Objects.equals(bookpk, other.bookpk);
	}


	public Book() {
		
	}
	

	public Book(Double bookPrice, String authorName, BookPk bookpk) {
		super();
		this.bookPrice = bookPrice;
		this.authorName = authorName;
		this.bookpk = bookpk;
	}


	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public BookPk getBookpk() {
		return bookpk;
	}

	public void setBookpk(BookPk bookpk) {
		this.bookpk = bookpk;
	}

	
	
	
}
