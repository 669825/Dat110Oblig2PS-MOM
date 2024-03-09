package no.hvl.dat110.iotsystem;

import no.hvl.dat110.broker.Storage;
import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.*;
import no.hvl.dat110.common.TODO;

import java.security.Provider;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {

		System.out.println("Display starting ...");

		// create a client object and use it to
		// - connect to the broker - use "display" as the username
		Client c = new Client("display", Common.BROKERHOST, Common.BROKERPORT);
		c.connect();
		// - create the temperature topic on the broker
		c.createTopic(Common.TEMPTOPIC);
		// - subscribe to the topic
		c.subscribe(Common.TEMPTOPIC);
		// - receive messages on the topic
		for (int i = 0; i < COUNT; i++) {
			PublishMsg msg = (PublishMsg) c.receive();
			System.out.println("Temp: " + msg.getMessage());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
		// - unsubscribe from the topic
		c.unsubscribe(Common.TEMPTOPIC);
		// - disconnect from the broker
		c.disconnect();

		System.out.println("Display stopping ... ");

	}
	}

