/**
 *
 */
package miHexagonal.core.driver_ports;

import miHexagonal.core.domain.Book;

/**
 * @author David Prieto Araujo
 *
 */
public interface BookService {

	public Book getBook(Long id);
}
