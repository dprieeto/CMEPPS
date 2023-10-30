/**
 *
 */
package miHexagonal.core.driven_ports;

import miHexagonal.core.domain.Book;

/**
 * @author David Prieto Araujo
 * Interfaz que necesita la aplicacion para implementar la logica empresarial.
 * Los driven ports son la SPI (Interfaz de proveedor de servicios) requerida por la aplicación.
 */
public interface BookRepository {

	public Book findById(Long id);
}
