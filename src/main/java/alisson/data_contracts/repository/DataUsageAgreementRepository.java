package alisson.data_contracts.repository;

import alisson.data_contracts.model.data_usage_agreement.DataUsageAgreement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DataUsageAgreementRepository extends JpaRepository<DataUsageAgreement, UUID> {
}
