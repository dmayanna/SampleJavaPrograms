package Chapter15;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	String [] adviseList = { "take a crap", "awesome ", "you are a bull crap", "fuck the shit"};
	public void go()
	{
		try {
			ServerSocket socket = new ServerSocket(5454);
			while(true)
			{
				Socket sock = socket.accept();
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advise = getAdvise();
				writer.write(advise);
				writer.close();
				System.out.println(advise);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private String getAdvise()
	{
		int random = (int) (Math.random()*adviseList.length);
		
		return adviseList[random];
		
	}
	public static void main(String[] args)
	{
		Server se = new Server();
		se.go();
	}
}
