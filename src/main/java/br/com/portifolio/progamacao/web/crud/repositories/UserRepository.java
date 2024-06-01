package br.com.portifolio.progamacao.web.crud.repositories;

import br.com.portifolio.progamacao.web.crud.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
