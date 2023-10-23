/**
 * 
 */
package miHexagonal.core.driver_ports;

import miHexagonal.core.domain.Book;
import miHexagonal.core.driven_ports.BookRepository;

/**
 * @author David Prieto Araujo
 * Los Driver Ports (puertos controladores) ofrecen la funcionalidad de la aplicación
 * a los controladores del mundo exterior. Por lo tanto, se dice que los puertos 
 * controladores son el límite del caso de uso de la aplicación. Son la API de la aplicación.
 */
public class BookServiceImpl implements BookService{

	private BookRepository bookRepository;
	
	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public Book getBook(Long id) {
		return bookRepository.findById(id);
	}

}
