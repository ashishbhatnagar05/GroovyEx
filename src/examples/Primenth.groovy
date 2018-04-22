package examples

class Solution{

	static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
		Integer userInput = Integer.parseInt(br.readLine())
		List ths=[]
		for(int i=0;i<userInput;i++) {
			ths << sieveOfEratosthenes(Integer.parseInt(br.readLine())+1)
		}
		ths.collect(){ println it }
	}


	static long sieveOfEratosthenes(int n) {

		boolean[] prime = new boolean[n+1]
		for(long i=0;i<n;i++)
			prime[i] = true

		for(long p = 2; p*p <=n; p++) {
			// If prime[p] is not changed, then it is a prime
			if(prime[p] == true)
			{
				// Update all multiples of p
				for(long i = p*2; i <= n; i += p)
					prime[i] = false;
			}
		}
		long sum=0
		for(long i = 2; i <= n; i++)
		{
			if(prime[i] == true)
				sum =sum+i
		}
		return sum
	}

	static long getThPrime(Integer th) {

		int count=0;
		long result=1
		while(count!=th) {
			result++
			if(isPrime(result)) {
				count++
			}
		}
		return result
	}

	static boolean isPrime(long num) {

		if(num==0||num==1) {
			return false
		}
		for(long i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0)
				return false
		}
		return true
	}

	//	static long nextPrime(Integer num) {
	//
	//		Integer count=0
	//		long result = 1
	//		while(count!=num) {
	//			result = BigInteger.valueOf(result).nextProbablePrime().longValue()
	//			count++
	//		}
	//		result
	//	}
}