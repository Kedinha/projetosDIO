
package ked.spring_jpa.model;

// import javax.annotation.processing.Generated;
import jakarta.persistence.*;

@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  private Integer id;
  @Column(length = 50, nullable = false)
  private String name;
  @Column(length = 20, nullable = false)
  private String username;
  @Column(length = 100, nullable = false)
  private String password;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User name(String name) {
    setName(name);
    return this;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User username(String username) {
    setUsername(username);
    return this;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User password(String password) {
    setPassword(password);
    return this;
  }

  @Override
  public String toString() {
    return "User [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password + "]";
  }

}