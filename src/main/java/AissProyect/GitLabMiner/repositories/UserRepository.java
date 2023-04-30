package AissProyect.GitLabMiner.repositories;

import AissProyect.GitLabMiner.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
