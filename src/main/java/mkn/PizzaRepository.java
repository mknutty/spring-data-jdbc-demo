package mkn;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends CrudRepository<Pizza, Long>, PagingAndSortingRepository<Pizza, Long> {
	
	public List<Pizza> findByName(String name);
	public List<Pizza> findByType(String type);
}
