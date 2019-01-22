package br.com.somoseducacao.portal.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.somoseducacao.portal.DB.User;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

}


