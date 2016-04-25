package icap;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import primes.GetNPrimes;

public class GetNPrimesTest {
	private GetNPrimes getNPrimes;
	
	@Before
	public void setup(){
		getNPrimes = new GetNPrimes(5);
	}
	
	@Test
	public void shouldReturnCorrectListOfPrimes(){
		//given
		List<Integer> targetPrimes = new ArrayList<Integer>();
		targetPrimes.add(2);
		targetPrimes.add(3);
		targetPrimes.add(5);
		targetPrimes.add(7);
		targetPrimes.add(11);
		
		//when
		List<Integer> actualPrimes = getNPrimes.call();
		
		//then
		assertEquals(targetPrimes, actualPrimes);	
	}
}
