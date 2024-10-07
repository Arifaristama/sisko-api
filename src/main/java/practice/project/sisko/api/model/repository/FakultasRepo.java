package practice.project.sisko.api.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practice.project.sisko.api.model.entity.FakultasEntity;

@Repository
public interface FakultasRepo extends JpaRepository <FakultasEntity, String> {

}
