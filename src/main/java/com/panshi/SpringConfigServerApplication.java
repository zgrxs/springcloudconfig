package com.panshi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigServerApplication {

    public static void main(String[] args) {
		new SpringApplicationBuilder(SpringConfigServerApplication.class).web(true).run(args);

    }
}