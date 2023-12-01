package ma.enset.accountserviceaxon.query.repositories;

import ma.enset.accountserviceaxon.query.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
}
