package pack1;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionListener implements HttpSessionListener,HttpSessionAttributeListener{

	@Override
	public void sessionCreated(HttpSessionEvent hse) {
		System.out.println("Session is inintialized");
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent hse) {
		System.out.println("Session object destroyed");
	}
	@Override
	public void attributeAdded(HttpSessionBindingEvent hsbe) {
		System.out.println("Attribute is added to the session object");
		System.out.println("Attribute name: "+hsbe.getName());
	}
	@Override
	public void attributeRemoved(HttpSessionBindingEvent hsbe) {
		System.out.println("Attribute is removed to the session object");
	}
}
