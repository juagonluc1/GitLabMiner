package AissProyect.GitLabMiner.controller;

import AissProyect.GitLabMiner.model.Issue;
import AissProyect.GitLabMiner.repositories.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/issues")
public class IssueController {
    @Autowired
    IssueRepository issueRepository;

    // GET
    @GetMapping
    public List<Issue> findAll(){
        return issueRepository.findAll();
    }

    @GetMapping("/{id}")
    public Issue findOneById(@PathVariable String id){
        Optional<Issue> issue = issueRepository.findById(id);
        return issue.get();
    }

    @GetMapping("/{state}")
    public Issue findOneByState(@PathVariable String state){
        Optional<Issue> issue = issueRepository.findBy(state, );
        // Hacer stream con filter por state
        return issue.get();
    }
}
