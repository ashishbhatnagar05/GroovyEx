package projectEuler

import java.io.BufferedReader

class Problem14 {

	static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
	static final LinkedHashMap cache=new LinkedHashMap()
	static final int MAX_SIZE=5000000

	static void main(String[] args) {
		initCache()
		Integer testCases=Integer.parseInt(br.readLine().trim())
		while(--testCases>=0) {
			TreeMap map= new TreeMap()
			long num=Long.parseLong(br.readLine().trim())
			for(int i=1;i<=num;i++) {
				map.put(getCollatzSequenceCount(i),i)
			}
			println map.lastEntry().value
			println cache.size()
		}
	}

	static void initCache() {
		cache.put(1,1)
		int original=0
		for(int i=2;i<MAX_SIZE;) {
			int count=0
			if(cache.containsKey(i)) {
				cache.put(original,count+cache.get(i))
			}
			else {
				original=i
				if(isEven(i)) {
					i=i/2
				}else {
					i=(3*i)+1
				}
				count++
				cache.put(original,count)
			}
		}
	}

	static int getCollatzSequenceCount(long num) {
		int count=0
		int value=num
		while(value!=1) {
			if(cache.containsKey(num)) {
				value=cache.get(num)
			}
			if(isEven(num)) {
				value=num/2
				cache.put(num,value)
			}else {
				value=(3*num)+1
				cache.put(num,value)
			}
			num=value
			count++
		}
		count
	}

	static boolean isEven(long num) {
		if(num%2==0)
			return true
		return false
	}
}

/*
 3
 10
 15
 20
 */