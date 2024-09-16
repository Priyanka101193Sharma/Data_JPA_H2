package in.priyankait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.priyankait.service.BookService;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j//lombok api annotation
public class Application {

	public static void main(String[] args) {
		log.trace("App is started.." );
		log.debug("start of main method");
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		log.info("ioc container is created" );
		BookService service = context.getBean(BookService.class);
		
		service.saveBook();
		//service.getBook();
		log.debug("end of main(-) method");
		log.trace("App is about to complete..");
	}

}
