package home.edu.demo.service;

import home.edu.demo.model.User;
import home.edu.demo.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void save(User user){
        userRepo.save(user);
    }

    public List<User> findAll(){
        return userRepo.findAll();
    }

    public void deleteUserById(Long id){
        userRepo.deleteById(id);
    }

    public List<User> fff(String address, String fName){
        return userRepo.findAllByAddressAndFirstName(address, fName);
    }
}
