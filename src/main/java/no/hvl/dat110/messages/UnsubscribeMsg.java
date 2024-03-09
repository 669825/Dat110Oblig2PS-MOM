package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

    private String topic;

	// message sent from client to unsubscribe on a topic
    // Implement object variables - a topic is required
    // Complete the constructor, get/set-methods, and toString method
    // as described in the project text

    public UnsubscribeMsg(String user, String topic) {
        super(MessageType.UNSUBSCRIBE,user);
        this.topic = topic;

    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "UnsubscribeMsg - " +
                getTopic() + " " +
                super.toString();
    }
}
