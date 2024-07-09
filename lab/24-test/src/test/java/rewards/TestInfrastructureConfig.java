package rewards;

import config.RewardsConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        TestInfrastructureLocalConfig.class,
        TestInfrastructureJndiConfig.class,
        RewardsConfig.class
})
public class TestInfrastructureConfig {

    @Bean
    public static LoggingBeanPostProcessor loggingBean() {
        return new LoggingBeanPostProcessor();
    }
}
