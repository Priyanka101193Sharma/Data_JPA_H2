package in.priyankait.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.priyankait.entity.Book;
import in.priyankait.entity.BookPk;

public interface BookRepo extends JpaRepository<Book, BookPk>{

}
