package org.owen.woodpecker.admin;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;
import org.owen.woodpecker.admin.handler.AgentHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.function.server.*;

/**
 * Created by owen_q on 2018. 6. 19..
 */
@Configuration
@EnableWebFlux
public class WebConfig implements WebFluxConfigurer {
    private Logger logger = LoggerFactory.getLogger(WebConfig.class);

    @Bean
    public RouterFunction<ServerResponse> routes(AgentHandler agentHandler) {
        return RouterFunctions.route(RequestPredicates.GET("/agent"), agentHandler::helloWorld);
    }
}


