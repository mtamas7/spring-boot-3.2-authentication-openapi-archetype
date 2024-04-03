package ${groupId};

import com.divide.by.zero.security.annotation.EnableSecurityModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@EnableSecurityModule
public class ${artifactIdCamelCase}Application {

    public static void main(String[] args) {
        SpringApplication.run(${artifactIdCamelCase}Application.class, args);
    }

}
