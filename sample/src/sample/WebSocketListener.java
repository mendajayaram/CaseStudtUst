package sample;


import java.net.http.WebSocket;
import java.net.http.WebSocket.Listener;
import java.nio.ByteBuffer;
import java.util.concurrent.CompletionStage;

public class WebSocketListener implements Listener{
	

	
	public void onOpen(WebSocket webSocket) {
		System.out.println("Connected");
		Listener.super.onOpen(webSocket);
	}
	public void onError(WebSocket webSocket, Throwable error) {
		System.out.println(":::::::::::::");
		System.out.println("Error Occured "+error.getMessage());
		Listener.super.onError( webSocket, error);
	}
	public CompletionStage<?> onText(WebSocket webSocket, CharSequence data,boolean last) {
		System.out.println("on Text "+data);
		return Listener.super.onText(webSocket, data, last);
	}
	public CompletionStage<?> onPing(WebSocket webSocket, ByteBuffer message) {
		System.out.println("on Text "+message);
		return Listener.super.onPing(webSocket, message);
	}


}
