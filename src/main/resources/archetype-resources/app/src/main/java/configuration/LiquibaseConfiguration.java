package ${groupId}.configuration;

import liquibase.integration.spring.SpringLiquibase;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@AllArgsConstructor
public class LiquibaseConfiguration {

    private final DataSource dataSource;

    @Bean
    public SpringLiquibase main() {
        final SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog("classpath:db/liquibase/changelog-master.xml");
        liquibase.setDataSource(dataSource);
        return liquibase;
    }
}
