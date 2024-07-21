package alisson.data_contracts.controlller;

import alisson.data_contracts.model.data_contract.DataContract;
import alisson.data_contracts.service.DataUsageAgreementService;
import alisson.data_contracts.model.data_usage_agreement.DataUsageAgreement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/agreements")
public class DataUsageAgreementController {

    @Autowired
    private DataUsageAgreementService service;

    @GetMapping("/")
    public ResponseEntity<List<UUID>> getProducerContracts() {
        return ResponseEntity.ok(service.getDataUsageAgreementIds());
    }

    @PostMapping("/")
    public ResponseEntity<DataUsageAgreement> createNewProducerContract(@RequestBody DataUsageAgreement contract) {
        return ResponseEntity.ok(service.createDataUsageAgreement(contract));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DataUsageAgreement> getProducerContract(@PathVariable UUID id) {
        return ResponseEntity.ok(service.getDataUsageAgreement(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateProducerContract(@PathVariable UUID id, @RequestBody DataUsageAgreement contract) {
        service.updateDataUsageAgreement(id, contract);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProducerContract(@PathVariable UUID id) {
        service.deleteDataUsageAgreement(id);
        return ResponseEntity.ok().build();

    }
}
