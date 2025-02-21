package AWS_app.AWS_app;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.google.gwtmockito.GwtMockitoTestRunner;
import com.google.gwt.angular.client.AngularModule;

@RunWith(GwtMockitoTestRunner.class)
public class MyAppTest {

	private MyApp fixture;

	@Before
	public void setUp() throws Exception {
		fixture=new MyApp();
	}

	@Test
	public void testMain() throws Exception {
		// needs GWTMockito as test-time dep
		AngularModule[] res = fixture.main();
		assertNotNull(res);
	}

}
