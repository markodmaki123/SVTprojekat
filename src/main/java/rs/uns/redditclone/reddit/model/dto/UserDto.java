package rs.uns.redditclone.reddit.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rs.uns.redditclone.reddit.model.entity.User;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Getter
@Setter
@NoArgsConstructor
public class UserDto implements Serializable {
    private Long id;
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String email;
    private String avatar;
    private String description;
    @NotBlank
    private String displayName;
    private LocalDate registrastionDate;


    public UserDto(User createdUser) {
        this.id = createdUser.getId();
        this.username = createdUser.getUsername();
        this.password = createdUser.getPassword();
        this.email = createdUser.getEmail();
        this.avatar = createdUser.getAvatar();
        this.description = createdUser.getDescription();
        this.displayName = createdUser.getDisplayName();
        this.registrastionDate = createdUser.getRegistrastionDate();
    }
}
