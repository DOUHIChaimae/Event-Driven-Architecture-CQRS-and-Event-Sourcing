package ma.enset.accountserviceaxon.query.repositories;

import ma.enset.accountserviceaxon.query.entities.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation, String> {
}
