package rs.uns.redditclone.reddit.service;

import rs.uns.redditclone.reddit.model.dto.UserDto;
import rs.uns.redditclone.reddit.model.entity.User;

import java.util.List;

public interface UserService {
    User create(UserDto user);
    List<User> findAll();
    User get(Long id);
    User findByUsername(String username);
    User update(User user);
    Boolean delete(Long id);
}
