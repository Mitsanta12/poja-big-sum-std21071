package app.com.poja_big_sum_std21071.conf;

import app.com.poja_big_sum_std21071.PojaGenerated;
import org.springframework.test.context.DynamicPropertyRegistry;

@PojaGenerated
public class SqliteConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("driverClassName", () -> "org.sqlite.JDBC");
    registry.add(
        "spring.jpa.database-platform",
        () -> "app.com.poja_big_sum_std21071.repository.conf.SqliteDialect");
    registry.add("spring.datasource.url", () -> "jdbc:sqlite:/tmp/sqlite-data:db?cache=shared");
    registry.add("spring.datasource.username", () -> "sa");
    registry.add("spring.datasource.password", () -> "sa");
  }
}
