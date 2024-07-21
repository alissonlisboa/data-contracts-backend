package alisson.data_contracts.model.data_contract;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Table(name = "data_contract")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DataContract {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String datasetName;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER
    )
    private Set<Field> fields;

    public void addField(Field field) {
        fields.add(field);
    }

    public void removeField(Field field) {
        fields.remove(field);
    }
}
