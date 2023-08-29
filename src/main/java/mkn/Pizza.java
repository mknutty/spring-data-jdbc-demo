package mkn;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Pizza {
	@Id
    private long id;
	
	@Column("Z_NAME")
	private String name;
	
	private String type;
}
