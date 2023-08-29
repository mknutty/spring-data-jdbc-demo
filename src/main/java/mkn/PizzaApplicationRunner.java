package mkn;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PizzaApplicationRunner implements ApplicationRunner {
	private final PizzaRepository repository;
	
	@Override
	public void run(final ApplicationArguments args) throws Exception {
		repository.save(new Pizza().setType("pepperoni").setName("Marks-Pepperoni"));
	    repository.save(new Pizza().setType("supreme").setName("Mark's Supreme"));
	    repository.save(new Pizza().setType("pepperoni").setName("Bob's Pepperoni"));
	    repository.findAll().forEach(System.out::println);
	    
	    repository.findByName("Mark's Supreme").forEach(System.out::println);
	    repository.findByType("pepperoni").forEach(System.out::println);
	    
	    repository.findAllBy().forEach(System.out::println);
	}

}
