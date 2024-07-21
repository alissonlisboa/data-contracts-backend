package alisson.data_contracts.controlller;

import alisson.data_contracts.model.data_contract.DataContract;
import alisson.data_contracts.service.DataContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/contracts")
public class DataContractController {

    @Autowired
    private DataContractService service;

    @GetMapping("/")
    public ResponseEntity<List<UUID>> getProducerContracts() {
        return ResponseEntity.ok(service.getDataContractIds());
    }

    @PostMapping("/")
    public ResponseEntity<DataContract> createNewProducerContract(@RequestBody DataContract contract) {
        return ResponseEntity.ok(service.createDataContract(contract));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DataContract> getProducerContract(@PathVariable UUID id) {
        return ResponseEntity.ok(service.getDataContract(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateProducerContract(@PathVariable UUID id, @RequestBody DataContract contract) {
        service.updateDataContract(id, contract);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProducerContract(@PathVariable UUID id) {
        service.deleteDataContract(id);
        return ResponseEntity.ok().build();

    }
}
