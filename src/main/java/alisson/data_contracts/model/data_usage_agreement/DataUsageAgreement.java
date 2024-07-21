package alisson.data_contracts.model.data_usage_agreement;

import alisson.data_contracts.model.data_contract.Field;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Table(name = "data_usage_agreement")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DataUsageAgreement {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private UUID dataContractId;

    private String consumerName;

    private Set<String> fields;

    public void addField(String field) {
        fields.add(field);
    }

    public void removeField(String field) {
        fields.remove(field);
    }


}
