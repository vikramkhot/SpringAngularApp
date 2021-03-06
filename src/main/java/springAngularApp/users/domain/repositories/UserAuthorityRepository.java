package springAngularApp.users.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springAngularApp.users.domain.entities.UserAuthority;

import java.util.List;

@Repository
public interface UserAuthorityRepository extends JpaRepository<UserAuthority, String> {

    List<UserAuthority> findByOrderByNameAsc();

}
