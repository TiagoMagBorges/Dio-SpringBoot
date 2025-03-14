package dio.springboot.SpringDataJPA.repository;

import dio.springboot.SpringDataJPA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
