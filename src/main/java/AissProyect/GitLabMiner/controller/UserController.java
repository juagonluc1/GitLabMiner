package AissProyect.GitLabMiner.controller;

import AissProyect.GitLabMiner.model.User;
import AissProyect.GitLabMiner.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    UserRepository userRepository;

    //GET
    @GetMapping
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User findOne(@PathVariable String id){
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }
}
