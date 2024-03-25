package repository;

import entity.WallEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WallRepository extends JpaRepository<WallEntity,String> {

}
