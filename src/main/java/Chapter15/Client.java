package Chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public void go()
	{
		try {
			Socket s = new Socket("127.0.0.1",5454);
			InputStreamReader streamreader = new InputStreamReader(s.getInputStream());
			BufferedReader reader = new BufferedReader(streamreader);
			String advise = reader.readLine();
			System.out.println("Advise "+advise);
			reader.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static void main(String[] args)
	{
		Client cl = new Client();
		cl.go();
	}
}

