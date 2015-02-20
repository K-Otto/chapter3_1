package ac.za.cput.chapter3.Config;

import ac.za.cput.chapter3.ComboApp;
import ac.za.cput.chapter3.Impl.ComboAppImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 2015/02/20.
 */
@Configuration
public class AppConfig {

    @Bean(name="calc")
    public ComboApp getModularCalculator(){
        return new ComboAppImpl();
    }
}

