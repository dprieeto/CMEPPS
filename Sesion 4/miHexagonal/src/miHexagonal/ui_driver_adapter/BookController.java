/**
 * 
 */
package miHexagonal.ui_driver_adapter;

import miHexagonal.core.domain.BookDoesNotExistException;
import miHexagonal.core.driver_ports.BookService;

/**
 * @author David Prieto Araujo
 * Un adaptador de controlador utiliza una interfaz de puerto de controlador , 
 * convirtiendo una solicitud de tecnología específica en una solicitud independiente de tecnología para un puerto de controlador.
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/books")
    public ResponseEntity getBook(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(bookService.getBook(id));
        } catch (BookDoesNotExistException e){
            return ResponseEntity.ok("We don't have this book!");
        } catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }
}
