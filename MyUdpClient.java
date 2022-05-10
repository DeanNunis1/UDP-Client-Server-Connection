import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
*  UDP Client Program
*  Connects to a UDP Server
*  Receives a line of input from the keyboard and sends it to the server until 'Goodbye' is typed
*  Receives a response from the server and displays it.
*  Dean Nunis
*/


class MyUdpClient {
  public static void main(String[] args) throws Exception {

    BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));

    DatagramSocket clientSocket = new DatagramSocket();

    InetAddress ipAddress = InetAddress.getByName("localhost");
    String sentence = "";

    // This loop asks the user to input a sentence until Goodbye is typed
    while (!sentence.equals("Goodbye")) {
      System.out.println("Type a Sentence or type Goodbye to exit: ");
      sentence = inFromUser.readLine();

      byte[] sendData = new byte[1024];
      byte[] receiveData = new byte[1024];

      sendData = sentence.getBytes();
      DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ipAddress, 9876);

      clientSocket.send(sendPacket);

      DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

      clientSocket.receive(receivePacket);

      String modifiedSentence = new String(receivePacket.getData());

      System.out.println("FROM SERVER:" + modifiedSentence);
    }
    clientSocket.close();
  }
}
