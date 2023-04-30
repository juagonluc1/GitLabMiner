package AissProyect.GitLabMiner.controller;

import AissProyect.GitLabMiner.model.Comment;
import AissProyect.GitLabMiner.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public class CommentController {
    @Autowired
    CommentRepository commentRepository;

    //GET

    @GetMapping
    public List<Comment> findAll(){
        return commentRepository.findAll();
    }

    public Comment findOne(@PathVariable String id){
        Optional<Comment> comment = commentRepository.findById(id);
        return comment.get();
    }
}
