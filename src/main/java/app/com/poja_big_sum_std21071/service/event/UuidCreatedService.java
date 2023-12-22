package app.com.poja_big_sum_std21071.service.event;

import app.com.poja_big_sum_std21071.PojaGenerated;
import app.com.poja_big_sum_std21071.endpoint.event.gen.UuidCreated;
import app.com.poja_big_sum_std21071.repository.DummyUuidRepository;
import app.com.poja_big_sum_std21071.repository.model.DummyUuid;
import java.util.function.Consumer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@PojaGenerated
@Service
@AllArgsConstructor
@Slf4j
public class UuidCreatedService implements Consumer<UuidCreated> {

  private final DummyUuidRepository dummyUuidRepository;

  @Override
  public void accept(UuidCreated uuidCreated) {
    var dummyUuid = new DummyUuid();
    dummyUuid.setId(uuidCreated.getUuid());
    dummyUuidRepository.save(dummyUuid);
  }
}
