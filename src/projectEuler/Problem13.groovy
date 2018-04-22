package projectEuler
//https://www.hackerrank.com/contests/projecteuler/challenges/euler013
class Problem13 {

	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in))

	static void main(String[] args) {
		
		Integer testCases=Integer.parseInt(br.readLine())
		BigInteger sum=0
		while(--testCases>=0) {
			sum = getSum(sum)
		}
		println sum.toString().substring(0,10)
	}

	static BigInteger getSum(BigInteger sum) {
		
		def num=new BigInteger(br.readLine())
		sum+=num
		return sum
	}

}
