package primes;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PrimesController {
	private ExecutorService fixedPool;
	
	public PrimesController(){
		fixedPool = Executors.newFixedThreadPool(5);
	}
	
	@RequestMapping("/printPrimes")
	//requests must be a in format like: http://localhost:8080/printPrimes?numberOfPrimes=5
	public List<Integer> getPrimes(@RequestParam(value="numberOfPrimes", defaultValue="4") String numberOfPrimes){
		try {
			return fixedPool.submit(new GetNPrimes(Integer.parseInt(numberOfPrimes))).get();
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList();
		}
	}
	
	@RequestMapping("/isAPrime")
	//requests must be a in format like: http://localhost:8080/isAPrime?number=8
	public Boolean isAPrime(@RequestParam(value="number", defaultValue="2") String number){
		try {
			return fixedPool.submit(new IsAPrime(Integer.parseInt(number))).get();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
