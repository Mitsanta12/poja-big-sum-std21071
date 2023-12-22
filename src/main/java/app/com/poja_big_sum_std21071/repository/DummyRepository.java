package app.com.poja_big_sum_std21071.repository;

import app.com.poja_big_sum_std21071.PojaGenerated;
import app.com.poja_big_sum_std21071.repository.model.Dummy;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@PojaGenerated
@Repository
public interface DummyRepository extends JpaRepository<Dummy, String> {

  @Override
  List<Dummy> findAll();
}
