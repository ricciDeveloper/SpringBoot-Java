package dio.aulaSpringDataJPA.repository;

import dio.aulaSpringDataJPA.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
