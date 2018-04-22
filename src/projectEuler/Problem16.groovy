package projectEuler

class Problem16 {
	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in))

	static void main(String[] args) {

		Integer testCases=Integer.parseInt(br.readLine())
		while(--testCases>=0) {
			println getSumOfPowers(Integer.parseInt(br.readLine()))
		}
	}

	static String getSumOfPowers(Integer power) {

		def sum=0
		def num=2**power
		List digits=num.toString().toCharArray()
		for(char digit:digits) {
			sum=sum+Character.getNumericValue(digit)
		}
		return sum
	}
}
