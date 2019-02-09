package com.jandarbar.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.jandarbar.ws.utils.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})
public class JdWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdWsApplication.class, args);
	}
}
