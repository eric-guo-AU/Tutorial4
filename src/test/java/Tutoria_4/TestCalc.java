package Tutoria_4;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class TestCalc{
	
	@Test
	public void testadd(){
		assertEquals(8, new Calc().add(5,3));
	}
		
	@Test
	public void testsubtract(){
		assertEquals(2, new Calc().subtract(5,3));
	}
}   