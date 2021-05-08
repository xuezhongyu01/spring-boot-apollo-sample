package net.ameizi;


import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableApolloConfig
public class AplloConfigSample {

    @Bean
    public JavaConfigSample javaConfigSample(){
        return new JavaConfigSample();
    }

    @Bean
    public ConfigurationPropertiesSample configurationPropertiesSample() {
        return new ConfigurationPropertiesSample();
    }

}
