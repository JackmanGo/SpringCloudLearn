package App;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by wang on 17-3-11.
 */
@EnableEurekaServer
@SpringBootApplication
public class Main {
        public static void main(String[] args) {
            new SpringApplicationBuilder(Main.class).web(true).run(args);
        }
}
