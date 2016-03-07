import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ CadastroFaceTest.class, FacebookLoginTest.class,
		 GoogleSearchTestJunit.class,
		ValidarLoginTest.class })
public class AllTests {

}
