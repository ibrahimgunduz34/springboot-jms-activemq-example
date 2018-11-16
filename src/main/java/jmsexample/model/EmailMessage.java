package jmsexample.model;

public class EmailMessage {
    private String to;

    private String content;

    public EmailMessage() {

    }

    public EmailMessage(String to, String content) {
        this.to = to;
        this.content = content;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
