import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HelloGitTest extends junit.framework.TestCase {

	@BeforeEach
	protected void setUp() throws Exception {
		
	}

	@Test
	void testHelloGitPrintingOnScreen() {
		assertTrue(HelloGit.print().equals("Hello Git!\n"));
	}

}
