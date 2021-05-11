package ro.ase.csie.g1092.dp.chain;

public class ChatMessage {
    String sender;
    String destination;
    String text;
    int priority;

    public ChatMessage(String sender, String destination, String text, int priority) {
        this.sender = sender;
        this.destination = destination;
        this.text = text;
        this.priority = priority;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
