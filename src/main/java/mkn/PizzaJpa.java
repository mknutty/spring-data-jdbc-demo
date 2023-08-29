package mkn;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * This is so Spring will create the table vs fiddling with DDL
 */
@Entity
@Table(name = "pizza")
@Data
@Accessors(chain = true)
public class PizzaJpa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true, name = "Z_NAME")
	private String name;

	private String type;
}
