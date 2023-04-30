package AissProyect.GitLabMiner.controller;

import AissProyect.GitLabMiner.model.Project;
import AissProyect.GitLabMiner.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {
    @Autowired
    ProjectRepository projectRepository;

    //GET
    public List<Project> findAll(){
        return projectRepository.findAll();
    }

    public Project findOne(@PathVariable String id){
        Optional<Project> project = projectRepository.findById(id);
        return project.get();
    }


}
