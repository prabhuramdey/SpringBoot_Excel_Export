package in.prd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="book")
public class Book {

	@Id
	private Integer book_id;
	private String book_name;
	private String book_price;
}
