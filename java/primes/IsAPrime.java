package primes;

import java.util.concurrent.Callable;

public class IsAPrime implements Callable<Boolean>{
	private final int n;
	
	public IsAPrime(int n){
		this.n = n;
	}

	@Override
	public Boolean call() {
	    if (n%2==0){
	    	return false;
	    }

	    for(int i=3; i*i<=n; i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
