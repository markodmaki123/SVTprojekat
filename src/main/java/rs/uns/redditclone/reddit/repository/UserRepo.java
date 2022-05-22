package rs.uns.redditclone.reddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.uns.redditclone.reddit.model.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
}
