package AissProyect.GitLabMiner.repositories;

import AissProyect.GitLabMiner.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, String> {
}
