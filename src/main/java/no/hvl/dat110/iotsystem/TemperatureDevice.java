package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		// create a client object and use it to
		// - connect to the broker - user "sensor" as the user name
		Client c = new Client("sensor",Common.BROKERHOST,Common.BROKERPORT);
		c.connect();
		// - publish the temperature(s)
		// - disconnect from the broker
		for(int i=0; i < COUNT;i++){
			c.publish(Common.TEMPTOPIC,""+sn.read());
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e){
				throw new RuntimeException(e);
			}
		}
		c.disconnect();
		System.out.println("Temperature device stopping ... ");
	}
}
