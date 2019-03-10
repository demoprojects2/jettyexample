//package com.jetty.jettyexample;
//
//import org.eclipse.jetty.server.Handler;
//import org.eclipse.jetty.server.Server;
//import org.eclipse.jetty.server.handler.DefaultHandler;
//import org.eclipse.jetty.server.handler.HandlerCollection;
//import org.eclipse.jetty.server.handler.HandlerList;
//import org.eclipse.jetty.server.handler.ResourceHandler;
//import org.eclipse.jetty.servlet.ServletContextHandler;
//import org.eclipse.jetty.servlet.ServletHolder;
//import org.eclipse.jetty.webapp.WebAppContext;
//
//import java.io.File;
//import java.lang.management.ManagementFactory;
//
//public class JettyExample2 {
//    public static void main(String[] args) throws Exception {
//
////        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
////        context.setContextPath("/");
////
////        Server jettyServer = new Server(8080);
////        jettyServer.setHandler(context);
////
////        ServletHolder jerseyServlet = context.addServlet(
////                org.glassfish.jersey.servlet.ServletContainer.class, "/*");
////        jerseyServlet.setInitOrder(0);
////
////        // Tells the Jersey Servlet which REST service/class to load.
////        jerseyServlet.setInitParameter(
////                "jersey.config.server.provider.classnames",
////                EntryPoint.class.getCanonicalName());
////
////        try {
////            jettyServer.start();
////            jettyServer.join();
////        } finally {
////            jettyServer.destroy();
////        }
//
//
//
//
//
//
////        Server server = new Server(8080);
////
////        String rootPath = JettyExample2.class.getClassLoader().getResource(".").toString();
////        WebAppContext webapp = new WebAppContext(rootPath + "", "");
////        server.setHandler(webapp);
////
////        server.start();
////        server.join();
//
//
//
//
////        Server server = new Server(8080);
////
////        WebAppContext ctx = new WebAppContext();
////        ctx.setContextPath("/");
////        ctx.setWar("src/main/webapp/");
////        HandlerCollection hc = new HandlerCollection();
////        hc.setHandlers(new Handler[] {ctx});
////
////        server.setHandler(hc);
////        server.setStopAtShutdown(true);
////        server.start();
////
////        server.join();
//
//
//
//
//
//
////        // Create a basic Jetty server object that will listen on port 8080.  Note that if you set this to port 0
////        // then a randomly available port will be assigned that you can either look in the logs for the port,
////        // or programmatically obtain it for use in test cases.
////        Server server = new Server(8080);
////
////        // Create the ResourceHandler. It is the object that will actually handle the request for a given file. It is
////        // a Jetty Handler object so it is suitable for chaining with other handlers as you will see in other examples.
////        ResourceHandler resource_handler = new ResourceHandler();
////
////        // Configure the ResourceHandler. Setting the resource base indicates where the files should be served out of.
////        // In this example it is the current directory but it can be configured to anything that the jvm has access to.
////        resource_handler.setDirectoriesListed(true);
////        resource_handler.setWelcomeFiles(new String[]{ "index.html" });
////        resource_handler.setResourceBase(".");
////
////        // Add the ResourceHandler to the server.
////        HandlerList handlers = new HandlerList();
////        handlers.setHandlers(new Handler[] { resource_handler, new DefaultHandler() });
////        server.setHandler(handlers);
////
////        // Start things up! By using the server.join() the server thread will join with the current thread.
////        // See "http://docs.oracle.com/javase/1.5.0/docs/api/java/lang/Thread.html#join()" for more details.
////        server.start();
////        server.join();
//
//
//
//
//
//
//
//
//
//
////        // Create a basic jetty server object that will listen on port 8080.
////        // Note that if you set this to port 0 then a randomly available port
////        // will be assigned that you can either look in the logs for the port,
////        // or programmatically obtain it for use in test cases.
////        Server server = new Server(8080);
////
////        // The WebAppContext is the entity that controls the environment in
////        // which a web application lives and breathes. In this example the
////        // context path is being set to "/" so it is suitable for serving root
////        // context requests and then we see it setting the location of the war.
////        // A whole host of other configurations are available, ranging from
////        // configuring to support annotation scanning in the webapp (through
////        // PlusConfiguration) to choosing where the webapp will unpack itself.
////        WebAppContext webapp = new WebAppContext();
////        webapp.setContextPath("/");
////        File warFile = new File(
////                "target/jetty-example-1.0-SNAPSHOT.war");
////        webapp.setWar(warFile.getAbsolutePath());
////
////        // A WebAppContext is a ContextHandler as well so it needs to be set to
////        // the server so it is aware of where to send the appropriate requests.
////        server.setHandler(webapp);
////
////        // Start things up!
////        server.start();
////
////        server.dumpStdErr();
////
////        // The use of server.join() the will make the current thread join and
////        // wait until the server is done executing.
////        // See http://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html#join()
////        server.join();
//    }
//}
