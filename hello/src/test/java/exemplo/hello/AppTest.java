package exemplo.hello;

import static org.junit.Assert.assertTrue; // import da classe Assert, do método AssertTrue (por isso é static)

import org.junit.Test; //import da classe test

/**
 * Unit test for simple App.
 */
public class AppTest 
  
{
   
	@Test
    public void testApp()
    {
        String expected = "Hello, World!";
        String actual = App.getGreeting();
		assertTrue( expected.equals(actual) ); //preciso dizer que o método esta na classe Assert (é a mesma coisa fazer assim: Assert.assertTrue(true))
    }
}
