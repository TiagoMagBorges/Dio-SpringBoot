package dio.springboot.SpringDataJPA;

import dio.springboot.SpringDataJPA.model.User;
import dio.springboot.SpringDataJPA.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();

        user.setName("Gleyson");
        user.setUsername("gleyson");
        user.setPassword("dio123");

        userRepository.save(user);

        for(User u : userRepository.findAll()) System.out.println(u);
    }
}
