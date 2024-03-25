package repository;

import entity.StructureEntitiy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StructureRepository extends JpaRepository<StructureEntitiy,String> {
}
