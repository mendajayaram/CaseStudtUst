package sample;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.WebSocket.Builder;
import java.nio.ByteBuffer;
import java.net.http.WebSocket;

public class HttpClientApp { 
	public static void main(String[] args) throws InterruptedException {
	/*HttpClient httpClient = HttpClient.newBuilder().build();
	Builder builder =  httpClient.newWebSocketBuilder();
	URI uri = URI.create("ws://echo.websocket.org");
	WebSocket webSocket = builder.buildAsync(uri, new WebSocketListener()).join();
	//webSocket.sendPing(ByteBuffer.wrap("Ping from me".getBytes()));
	webSocket.sendText("This is java 11 feature",true);
	webSocket.sendText("send text to echo server websocket",false);
	webSocket.sendText("Using java11 http client",true);
	Thread.sleep(1000);
	webSocket.sendClose(WebSocket.NORMAL_CLOSURE,"disConnect").thenRun(()->System.out.println("Disconnect"));*/
		
		HttpClient httpClient=HttpClient.newBuilder().build();
		Builder builder=httpClient.newWebSocketBuilder();
		URI uri=URI.create("ws://echo.websocket.org");
		
		//URI uri=URI.create("ws://localhost:8070/IRCTC/addRoot");
		
		System.out.println("Before");
		WebSocket webSocket=builder.buildAsync(uri, new WebSocketListener()).join();
		System.out.println("After");
		webSocket.sendPing(ByteBuffer.wrap("Ping from me".getBytes()));
		webSocket.sendText("This is java11 websocket", true);
		webSocket.sendText("send text to echo server websocket", false);
		webSocket.sendText("using java11  Http client", true);
		Thread.sleep(1000);
		webSocket.sendClose(WebSocket.NORMAL_CLOSURE, "disconnect").thenRun(()->System.out.println("Disconnected"));

	}	
}
