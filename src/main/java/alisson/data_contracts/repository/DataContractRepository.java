package alisson.data_contracts.repository;

import alisson.data_contracts.model.data_contract.DataContract;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DataContractRepository extends JpaRepository<DataContract, UUID> {
}
