package dio.web_api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.web_api.model.Usuario;

@Repository
public class UserRepository {
  public void save(Usuario usuario) {
    if (usuario.getId() == null) {
      System.out.println("SAVE - Recebendo o usuário na camada de repositório");

    } else {
      System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

    }
    System.out.println(usuario);
  }

  public void update(Usuario usuario) {
    System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
    System.out.println(usuario);
  }

  public void remove(Integer id) {
    System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
    System.out.println(id);
  }

  public List<Usuario> listAll() {
    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("kedma", "password"));
    usuarios.add(new Usuario("meg", "masterpassword"));
    return usuarios;
  }

  public Usuario findById(Integer id) {
    System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
    return new Usuario("kedma", "password");
  }

  public List<Usuario> findAll() {
    System.out.println("LIST - Listando os usuarios do sistema");
    List<Usuario> usuarios = new ArrayList<>();
    usuarios.add(new Usuario("kedma", "password"));
    usuarios.add(new Usuario("mmeg", "masterpassword"));
    return usuarios;
  }

  public Usuario findByUsername(String username) {
    System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário", username));
    return new Usuario("kedma", "password");

  }

}
