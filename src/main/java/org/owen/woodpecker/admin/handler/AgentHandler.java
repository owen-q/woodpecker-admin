package org.owen.woodpecker.admin.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * Created by owen_q on 2018. 6. 19..
 */
@Component
public class AgentHandler {
    private Logger logger = LoggerFactory.getLogger(AgentHandler.class);

    public Mono<ServerResponse> helloWorld(ServerRequest serverRequest) {
        return null;
    }
}
