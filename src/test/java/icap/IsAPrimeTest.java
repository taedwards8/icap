package icap;

import static org.junit.Assert.*;

import org.junit.Test;

import primes.IsAPrime;

public class IsAPrimeTest {
	private IsAPrime isAPrime;
	
	@Test
	public void oneIsNotPrime(){
		//given
		isAPrime = new IsAPrime(1);
		
		//when
		boolean result = isAPrime.call();
		
		//then
		assertFalse(result);
	}
	
	@Test
	public void twoIsPrime(){
		//given
		isAPrime = new IsAPrime(2);
		
		//when
		boolean result = isAPrime.call();
		
		//then
		assertTrue(result);
	}
	
	@Test
	public void threeIsPrime(){
		//given
		isAPrime = new IsAPrime(3);
		
		//when
		boolean result = isAPrime.call();
		
		//then
		assertTrue(result);
	}
	
	@Test
	public void thirteenIsPrime(){
		//given
		isAPrime = new IsAPrime(13);
		
		//when
		boolean result = isAPrime.call();
		
		//then
		assertTrue(result);
	}
	
	@Test
	public void fourteenIsPrime(){
		//given
		isAPrime = new IsAPrime(14);
		
		//when
		boolean result = isAPrime.call();
		
		//then
		assertFalse(result);
	}
}
