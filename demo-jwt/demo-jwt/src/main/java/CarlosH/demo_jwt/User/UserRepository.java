
package CarlosH.demo_jwt.User;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
public class UserRepository extends JpaRepository<User,Integer> {
     Optional<User> findByUsername(String username); 

}
