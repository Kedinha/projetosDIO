package dio.web_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import dio.web_api.model.Usuario;
import dio.web_api.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
// @RequestMapping("/users") -- para colocar todas URI no mesmo caminho
public class UsuarioController {
  @Autowired
  private UserRepository repository;

  @GetMapping("/users")
  public List<Usuario> getUsers() {
    return repository.findAll();
  }

  @GetMapping("/users/{username}")
  public Usuario getOnne(@PathVariable("username") String username) {
    return repository.findByUsername(username);
  }

  @DeleteMapping("/users/{id}")
  public void deleteUser(@PathVariable("id") Integer id) {
    repository.remove(id);
  }

  @PostMapping("/users")
  public void postUser(@RequestBody Usuario usuario) {
    repository.save(usuario);
  }

}
