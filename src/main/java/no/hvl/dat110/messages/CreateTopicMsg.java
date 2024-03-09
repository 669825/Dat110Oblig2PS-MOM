package no.hvl.dat110.messages;

import no.hvl.dat110.broker.ClientSession;
import no.hvl.dat110.broker.Dispatcher;
import no.hvl.dat110.broker.Storage;
import no.hvl.dat110.client.Client;

public class CreateTopicMsg extends Message {

    private String topic;

    private Message msg;



    // Implement object variables - a topic is required
    // Complete the constructor, get/set-methods, and toString method
    // as described in the project text


    //constructor
    // message sent from client to create topic on the broker
    public CreateTopicMsg(String user, String topic) {

        //call super class constructor(Meessage)
        super(MessageType.CREATETOPIC, user);
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
        return "CreateTopicMsg - "
                + getTopic() + " "
                + super.toString();
    }
}


