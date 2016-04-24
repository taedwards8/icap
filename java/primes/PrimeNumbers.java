package primes;
import java.util.ArrayList;
import java.util.List;


public class PrimeNumbers {
	int numberOfPrimes;
	
	public PrimeNumbers(int numberOfPrimes){
		this.numberOfPrimes = numberOfPrimes;
	}		
	
	public int getNumberOfPrimes() {
		return numberOfPrimes;
	}

	public void setNumberOfPrimes(int numberOfPrimes) {
		this.numberOfPrimes = numberOfPrimes;
	}

	public List<Integer> showPrimes(){
		List<Integer> primes = new ArrayList<Integer>();
		
		for(int i = 1; i<=numberOfPrimes; i++){
			primes.add(i);
		}
		System.out.println("primes: " +primes);
		return primes;
	}

	@Override
	public String toString() {
		return "PrimeNumbers [numberOfPrimes=" + numberOfPrimes + "]";
	}		
}
