package icap;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import primes.PrimesController;

public class PrimesControllerTest {
	private PrimesController primesController = new PrimesController();		
	
	@Test
	public void shouldReturnEmptyListForInvalidGetPrimesEntry(){
		//when		
		List<Integer> result = primesController.getPrimes("foo");
		
		//then
		assertTrue(result.isEmpty());
	}
	
	@Test
	public void shouldReturnListForValidGetPrimesEntry(){
		//when		
		List<Integer> result = primesController.getPrimes("14");
		
		//then
		assertFalse(result.isEmpty());
	}
	
	@Test
	public void shouldReturnFalseForInvalidIsAPrimeEntry(){
		//when
		Boolean result = primesController.isAPrime("bar");
		
		//then
		assertFalse(result);
	}
}
