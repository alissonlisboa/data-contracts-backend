package alisson.data_contracts.dto;

import alisson.data_contracts.model.data_contract.Field;

import java.util.Set;

public record DataContractDTO(
        String datasetName,
        Set<Field> fields
) {}
