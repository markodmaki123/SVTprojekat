package rs.uns.redditclone.reddit.model.entity;

import lombok.Builder;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="users")
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="user_type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name ="username", nullable = false)
    private String username;
    @Column(name ="password", nullable = false)
    private String password;
    @Column(name ="email", nullable = false)
    private String email;
    @Column(name ="avatar", nullable = true)
    private String avatar;
    @Column(name ="description", nullable = true)
    private String description;
    @Column(name ="displayName", nullable = false)
    private String displayName;
    @Column(name ="registrationDate", nullable = false)
    private LocalDate registrastionDate;
    //to do
    @Column(name ="role", nullable = false)
    @Value("${some.key:0}")
    private Long role;

}
