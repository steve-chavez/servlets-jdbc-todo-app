
import org.eclipse.jetty.server.*;
import org.eclipse.jetty.servlet.*;


public class Main{
    public static void main(String[] args){
        Integer port = 8000;
        Server server = new Server(port);
        ServletContextHandler handler = new ServletContextHandler(server, "/");
        handler.addServlet(ExampleServlet.class, "/exampleServlet");
        try {
            server.start();
            System.out.println(String.format("Server started in %s", port));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
