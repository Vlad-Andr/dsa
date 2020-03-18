package home.edu.demo.repository;

import home.edu.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {

    List<User> findAllByAddressAndFirstName(String address, String fName);

}
