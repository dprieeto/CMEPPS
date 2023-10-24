/**
 * 
 */
package miHexagonal.db_driven_adapter.domain;



import javax.persistence.*;

import miHexagonal.core.domain.Book;

/**
 * 
 */
@Entity

public class BookEntity { 
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	
	@Column(name = "name")
	
	private String name;
	
	
	public BookEntity(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	
	//constructors //getters and setters 
	   
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	public Book toBook(){
		return new Book(this.id, this.name);   
	}

}