package rs.uns.redditclone.reddit.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import rs.uns.redditclone.reddit.model.dto.UserDto;
import rs.uns.redditclone.reddit.model.entity.User;
import rs.uns.redditclone.reddit.repository.UserRepo;
import rs.uns.redditclone.reddit.service.UserService;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepository;

    @Override
    public User create(UserDto userDTO) {

        Optional<User> user = userRepository.findFirstByUsername(userDTO.getUsername());

        if(user.isPresent()){
            return null;
        }

        User newUser = new User();
        newUser.setUsername(userDTO.getUsername());
        newUser.setPassword(userDTO.getPassword());
        newUser.setEmail(userDTO.getEmail());
        newUser.setAvatar(userDTO.getAvatar());
        newUser.setDescription(userDTO.getDescription());
        newUser.setDisplayName(userDTO.getDisplayName());
        newUser.setRegistrastionDate(userDTO.getRegistrastionDate());
        newUser = userRepository.save(newUser);

        return newUser;
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public User get(Long id) {
        Optional<User> user = userRepository.findFirstById(id);
        return user.orElse(null);
    }

    @Override
    public User findByUsername(String username) {
        Optional<User> user = userRepository.findFirstByUsername(username);
        return user.orElse(null);
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }
}
