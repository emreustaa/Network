/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta_1;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author biocomitsystems
 */
public class Client {

    public static void main(String[] args) throws IOException {

        String host = "localhost";
        int port = 44444;

        Socket socket = new Socket(host, port);
        Scanner scanner = new Scanner(socket.getInputStream());
        System.out.println("Server Response : " + scanner.nextLine());

    }
}
