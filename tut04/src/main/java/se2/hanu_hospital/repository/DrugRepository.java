package se2.hanu_hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se2.hanu_hospital.model.Drug;

@Repository
public interface DrugRepository extends JpaRepository<Drug, Integer> {

}
