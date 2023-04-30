package AissProyect.GitLabMiner.controller;

import AissProyect.GitLabMiner.model.Commit;
import AissProyect.GitLabMiner.repositories.CommitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/commits")
public class CommitController {
    @Autowired
    CommitRepository commitRepository;

    //GET
    @GetMapping
    public List<Commit> findAll(){
        return commitRepository.findAll();
    }

    @GetMapping("/{id}")
    public Commit findOne(@PathVariable String id){
        Optional<Commit> commit = commitRepository.findById(id);
        return commit.get();
    }
}
