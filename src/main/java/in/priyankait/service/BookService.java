package in.priyankait.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.priyankait.entity.Book;
import in.priyankait.entity.BookPk;
import in.priyankait.repo.BookRepo;

@Service
public class BookService {
	
	private static Logger logger = LoggerFactory.getLogger(BookService.class);
	
	@Autowired
	private BookRepo repo;
	
	public void saveBook() {
		logger.debug("start of import details...");
		BookPk pk = new BookPk(102,"Java");
		Book entity = new Book(1000.00,"James",pk);
		repo.save(entity);
		System.out.println("Record Saved......");
		logger.info("end of import ...");
	}
	
	public void getBook() {
		BookPk pk = new BookPk(101,"Java");
		Optional<Book> findById =repo.findById(pk);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}
	}

}
