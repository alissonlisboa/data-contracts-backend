package alisson.data_contracts.service;

import alisson.data_contracts.handler.DataContractNotFoundException;
import alisson.data_contracts.handler.DataUsageAgreementNotFoundException;
import alisson.data_contracts.model.data_contract.DataContract;
import alisson.data_contracts.model.data_contract.Field;
import alisson.data_contracts.model.data_usage_agreement.DataUsageAgreement;
import alisson.data_contracts.repository.DataUsageAgreementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class DataUsageAgreementService {

    @Autowired
    DataUsageAgreementRepository repository;

    public List<UUID> getDataUsageAgreementIds() {
        return repository.findAll().stream()
                .map(DataUsageAgreement::getId)
                .toList();
    }

    public DataUsageAgreement createDataUsageAgreement(DataUsageAgreement data) {
        return repository.save(data);
    }

    public DataUsageAgreement getDataUsageAgreement(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new DataUsageAgreementNotFoundException("Data Usage Agreement Not Found"));
    }

    public void updateDataUsageAgreement(UUID id, DataUsageAgreement newAgreement) {
        DataUsageAgreement agreement = repository.findById(id)
                .orElseThrow(() -> new DataUsageAgreementNotFoundException("Data Usage Agreement Not Found"));

        agreement.setFields(newAgreement.getFields());

        repository.save(agreement);
    }

    public void deleteDataUsageAgreement(UUID id) {
        repository.deleteById(id);
    }
}
