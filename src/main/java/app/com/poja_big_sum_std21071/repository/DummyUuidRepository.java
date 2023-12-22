package app.com.poja_big_sum_std21071.repository;

import app.com.poja_big_sum_std21071.PojaGenerated;
import app.com.poja_big_sum_std21071.repository.model.DummyUuid;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@PojaGenerated
@Repository
public interface DummyUuidRepository extends JpaRepository<DummyUuid, String> {

  @Override
  Optional<DummyUuid> findById(String id);
}
