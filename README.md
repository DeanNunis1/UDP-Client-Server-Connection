# UDP Client-Server Connection

This project contains a simple implementation of a UDP (User Datagram Protocol) client-server connection. The client sends a sentence to the server, the server transforms this sentence to uppercase, and sends it back to the client. This process is looped until 'Goodbye' is typed in the `MyUdpClient.java` client. The project consists of three main components: `MyUdpClient.java`, `UdpClient.java`, and `UdpServer.java`.

## Installation

Clone the repository to your local machine:

```bash
git clone https://github.com/<your_username>/UDP-Client-Server_Connection.git
cd UDP-Client-Server_Connection
```

Replace `<your_username>` with your GitHub username.

## Usage

First, compile the Java files using the `javac` command:

```bash
javac MyUdpClient.java UdpClient.java UdpServer.java
```

Then, start the server:

```bash
java UdpServer
```

Now, you can start the client:

```bash
java MyUdpClient
```
or
```bash
java UdpClient
```

For `MyUdpClient.java`, type a sentence or type 'Goodbye' to exit. The server will respond with the capitalized sentence.

For `UdpClient.java`, type a sentence to receive a capitalized version from the server.

## Structure

- `MyUdpClient.java`: This client sends sentences to the server in a loop until 'Goodbye' is typed.
- `UdpClient.java`: This client sends one sentence to the server and receives a capitalized version of it.
- `UdpServer.java`: This server receives a sentence from a client, capitalizes it, and sends it back to the client.

## Built With

* Java

