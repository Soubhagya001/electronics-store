package pack1;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
//import javax.servlet.annotation.WebListener;

//@WebListener
public class RequestListener implements ServletRequestListener, ServletRequestAttributeListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Request object Initialized");
    }
    
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Request object is destroyed");
    }
    
    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("Attribute is added to the servletRequest Object ");
        System.out.println("Attribute name: " + srae.getName());
        System.out.println("Attribute value: " + srae.getValue());
    }
    
    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("Attribute removed from the servletRequest Object");
        System.out.println("Attribute name: " + srae.getName());
        System.out.println("Attribute value: " + srae.getValue());
    }
    
    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("Attribute replaced in the servletRequest Object");
        System.out.println("Attribute name: " + srae.getName());
        System.out.println("Old value: " + srae.getValue());
        // New value would need to be retrieved from the request
    }
}