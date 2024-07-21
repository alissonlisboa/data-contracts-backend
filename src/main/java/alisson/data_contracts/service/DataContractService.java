package alisson.data_contracts.service;

import alisson.data_contracts.handler.DataContractNotFoundException;
import alisson.data_contracts.model.data_contract.DataContract;
import alisson.data_contracts.model.data_contract.Field;
import alisson.data_contracts.repository.DataContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class DataContractService {

    @Autowired
    DataContractRepository repository;

    public List<UUID> getDataContractIds() {
        return repository.findAll().stream()
                .map(DataContract::getId)
                .toList();
    }

    public DataContract createDataContract(DataContract data) {
        return repository.save(data);
    }

    public DataContract getDataContract(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new DataContractNotFoundException("Data Contract Not Found"));
    };

    public void updateDataContract(UUID id, DataContract newContract) {
        DataContract contract = repository.findById(id)
                .orElseThrow(() -> new DataContractNotFoundException("Data Contract Not Found"));

        contract.setDatasetName(newContract.getDatasetName());

        Set<Field> fieldsToSet = contract.getFields().stream()
                .filter(field -> newContract.getFields().contains(field))
                .collect(Collectors.toSet());

        fieldsToSet.addAll(
                newContract.getFields().stream()
                        .filter(field -> !fieldsToSet.contains(field))
                        .collect(Collectors.toSet())
        );

        contract.setFields(fieldsToSet);

        repository.save(contract);
    }

    public void deleteDataContract(UUID id) {
        repository.deleteById(id);
    }

}
