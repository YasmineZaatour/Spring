package yasmine.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import yasmine.mysql.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
