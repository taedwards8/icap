package primes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class GetNPrimes implements Callable<List<Integer>>{
	private final int numberOfPrimes;
	
	public GetNPrimes(int numberOfPrimes){
		this.numberOfPrimes = numberOfPrimes;
	}		
	
//	public int getNumberOfPrimes() {
//		return numberOfPrimes;
//	}
//
//	public void setNumberOfPrimes(int numberOfPrimes) {
//		this.numberOfPrimes = numberOfPrimes;
//	}

	@Override
	public List<Integer> call() {
		List<Integer> primes = new ArrayList<Integer>();
		int status = 1;
		int num = 2;
		
		for ( int i = 2 ; i <=numberOfPrimes+1 ;  ){
			for ( int j = 2 ; j <= Math.sqrt(num) ; j++ ){
	            if ( num%j == 0 ){
	               status = 0;
	               break;
	            }
	         }
	         if ( status != 0 ){
	            primes.add(num);
	            i++;
	         }
	         status = 1;
	         num++;
	      }		
		return primes;
	}
}
