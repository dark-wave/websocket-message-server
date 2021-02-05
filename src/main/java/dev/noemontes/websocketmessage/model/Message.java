package dev.noemontes.websocketmessage.model;

public class Message {
	private String from;
	private String content;
	
	/** Default constructor */
	public Message() {}

	/**
	 * Contructor with params
	 * @param from
	 * @param content
	 */
	public Message(String from, String content) {
		super();
		this.from = from;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Message [from=" + from + ", content=" + content + "]";
	}

	/** Getters and setters */
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
