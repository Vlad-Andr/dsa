package home.edu.demo.controller;

import home.edu.demo.model.User;
import home.edu.demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> all = userService.findAll();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(all);
    }

    @PostMapping
    public ResponseEntity<User> saveNewUser(@RequestBody User user){
        userService.save(user);
        return ResponseEntity
                .status(HttpStatus.OK)
                .build();
    }

}
