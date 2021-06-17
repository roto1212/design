package com.company.design.singleton;

public class SocketClient {
    private static SocketClient socketClient;

//    한개의 객체만 존재해야 하는 경우 Singleton 패턴으로 디자인한다.
//    public SocketClient() {
    private SocketClient() {
    }

    public static SocketClient getInstance() {
        if (socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connected");

    }
}
