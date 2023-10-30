/**
 *
 */
package miHexagonal.db_driven_adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import miHexagonal.core.domain.Book;
import miHexagonal.core.domain.BookDoesNotExistException;
import miHexagonal.core.driven_ports.BookRepository;
import miHexagonal.db_driven_adapter.domain.BookEntity;
import miHexagonal.db_driven_adapter.jparepository.HAAJpaRepository;

/**
 * @author David Prieto Araujo
 * Un driven adapter (adaptador controlado) implementa una interfaz de puerto controlado ,
 * convirtiendo los métodos independientes de la tecnología del puerto en métodos tecnológicos específicos.
 */
@Component
public class JpaBookrepository implements BookRepository{

	@Autowired //enlaza repositorio y servicio

	private HAAJpaRepository haaJpaRepository;

	    @Override

	public Book findById(Long id) {

	Optional<BookEntity> bookEntityOptional = haaJpaRepository.findById(id);

	BookEntity bookEntity = bookEntityOptional.orElseThrow(BookDoesNotExistException::new);

	return bookEntity.toBook();

	}
}
