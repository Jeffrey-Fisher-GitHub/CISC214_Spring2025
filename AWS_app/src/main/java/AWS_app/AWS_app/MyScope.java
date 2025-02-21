package AWS_app.AWS_app;

import com.google.gwt.angular.client.Scope;

/**
 * This is your Scope, a shared memory between a controller and the view
 * a.k.a. ViewModel
 * Declare further properties as bean-patterns
 * 
 */
public interface MyScope extends Scope<MyScope> {
	String name();
	MyScope name(String name);
	
	String result();
	MyScope result(String result);
}
