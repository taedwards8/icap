package primes;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PrimesController {
	
	@RequestMapping("/primes")
	//requests must be a in format like: http://localhost:8080/primes?numberOfPrimes=5
	public List<Integer> getPrimes(@RequestParam(value="numberOfPrimes", defaultValue="4") String numberOfPrimes){
		System.out.println("parameter value: "+numberOfPrimes);
		return new PrimeNumbers(Integer.parseInt(numberOfPrimes)).showPrimes();
	}
}
