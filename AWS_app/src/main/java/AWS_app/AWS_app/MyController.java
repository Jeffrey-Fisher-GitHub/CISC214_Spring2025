package AWS_app.AWS_app;

import com.google.gwt.angular.client.AngularController;
import com.google.gwt.angular.client.NgInject;
import com.google.gwt.angular.client.NgInjected;
import com.google.gwt.angular.client.NgWatch;

import elemental.client.Browser;

/**
 * This is your Controller
 * you can inject services via public declarations annotated by \@NgInjected
 * All public methods are exposed to the view
 * React to the view by watching the viewmodel
 */
@NgInject(name="MyController")
public class MyController extends AngularController<MyScope> {
	
	/** injected service, field must be public */
	@NgInjected
	public SimpleService simple;
	
	/** initialization of scope variables */
	@Override
	protected void initialize(MyScope scope) {
		scope.name("World").result(simple.greet("World"));
	}
	
	/** exposed functions*/
	public void resetName() {
		scope.name("World");
	}
	
	public void toUpper() {
		scope.name(scope.name().toUpperCase());
	}
	
	public void toLower() {
		scope.name(scope.name().toLowerCase());
	}
	
	/** example watch function */
	@NgWatch("name")
	public void watchName(String newName){
		Browser.getWindow().getConsole().log("Name changed to " + newName);
		scope.result(simple.greet(newName));
	}
}
