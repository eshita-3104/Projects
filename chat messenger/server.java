import java.net.*;
import java.io.*;

public class server {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Server Application is running");
        ServerSocket sobj = new ServerSocket(2100, 0, null);
        System.out.println("Server is running at port number 2100");

        Socket s = sobj.accept();
        System.out.println("Server and client connection is successfull");

        PrintStream ps = new PrintStream(s.getOutputStream());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(".chat messenger started.");
        String str1, str2;
        while((str1=br1.readLine())!=null)
        {
            System.out.println("Client says:"+str1);
            System.out.println("Enter message for client:");
            str2 = br2.readLine();
            ps.println(str2);
        }

        System.out.println("Thank you for using chat messenger! Toodles!!!:):)");
    }
}

