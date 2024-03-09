package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {

    private String topic;

    // Implement object variables - a topic is required

    // Complete the constructor, get/set-methods, and toString method
    // as described in the project text

    // message sent from client to subscribe on a topic
    public SubscribeMsg(String user, String topic) {
        super(MessageType.SUBSCRIBE,user);
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
        return "SubscribeMsg - " +
                getTopic() + " " +
                super.toString();
    }










}

		

