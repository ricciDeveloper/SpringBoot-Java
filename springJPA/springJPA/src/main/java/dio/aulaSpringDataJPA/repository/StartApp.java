package dio.aulaSpringDataJPA.repository;

import dio.aulaSpringDataJPA.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("joão Victor");
        user.setUsername("Juvito");
        user.setPassword("Caveira121212");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
