/**
 * 
 */
package miHexagonal;

import miHexagonal.core.driven_ports.BookRepository;
import miHexagonal.core.driver_ports.BookService;
import miHexagonal.core.driver_ports.BookServiceImpl;

/**
 * 
 */
@Configuration
public class SpringBeans {
        @Bean
        BookService bookService(final BookRepository bookRepository) {
            return new BookServiceImpl(bookRepository);
        }

}