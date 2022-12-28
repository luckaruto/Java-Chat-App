package service;

import java.net.URISyntaxException;

import javax.swing.JTextArea;

import io.socket.client.Socket;
import io.socket.client.IO;



public class Service {
	
	
	private  static Service instance;
	private Socket client;
	private JTextArea textArea;
	private final int PORT_NUMBER = 9999;
	private final String  IP="localhost";
	
	public static Service getInstance() {
		if(instance == null) {
			instance = new Service();
		}
		return instance;
	}
	
	private Service() {
		
	}
	
	public void startServer() {
		
		try {
			client = IO.socket("http://" + IP + ":" + PORT_NUMBER);
			client.open();
		} catch (URISyntaxException e) {
			error(e);
		}
	}
	public Socket getClient() {
		return client;
	}
	private void error(Exception e) {
		System.err.println(e);
	}
}
