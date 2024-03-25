package repository;

import entity.WindowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WindowRepository extends JpaRepository<WindowEntity,String> {
}
