package se2.hanu_hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se2.hanu_hospital.model.Drug;
import se2.hanu_hospital.repository.DrugRepository;

import java.util.List;

@Service
public class DrugService {
    private final DrugRepository drugRepository;

    @Autowired
    public DrugService(DrugRepository drugRepository) {
        this.drugRepository = drugRepository;
    }

    public List<Drug> getDrug() {
        return drugRepository.findAll();
    }
}
