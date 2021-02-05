package dev.noemontes.websocketmessage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class WebsocketMessagesServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsocketMessagesServerApplication.class, args);
	}
}
