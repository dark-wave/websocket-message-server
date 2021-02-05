package dev.noemontes.websocketmessage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import dev.noemontes.websocketmessage.model.Message;

@Controller
public class ChatController {
	private static final Logger LOG = LoggerFactory.getLogger(ChatController.class);
	
	@MessageMapping("/chat")
	@SendTo("/topic/messages")
	public Message chatWebSocket(@Payload Message message){
		LOG.info(message.toString());
		return message;
	}
}
