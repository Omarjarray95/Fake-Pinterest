package messages.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import messages.management.entities.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> 
{

}
