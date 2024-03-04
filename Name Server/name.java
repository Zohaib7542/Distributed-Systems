import java.net.*;
import java.io.*;

public class DNS {

    public static void main(String[] args) {
        int choice;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true) {
                System.out.println("\nMenu: \n1. DNS\n2. Reverse DNS\n3. Exit\n");
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(in.readLine());

                switch (choice) {
                    case 1:
                        System.out.print("Enter Host Name: ");
                        String hostname = in.readLine();
                        InetAddress address = InetAddress.getByName(hostname);
                        System.out.println("Host Name: " + address.getHostName());
                        System.out.println("IP: " + address.getHostAddress());
                        break;
                    case 2:
                        System.out.print("Enter IP Address: ");
                        String ipAddress = in.readLine();
                        InetAddress ia = InetAddress.getByName(ipAddress);
                        System.out.println("IP: " + ipAddress);
                        System.out.println("Host Name: " + ia.getHostName());
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
