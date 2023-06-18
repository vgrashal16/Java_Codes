class nthprime{
	
	public static boolean isPrime(int x) {
		
		for (int i = 1; i<x/2;i++) {
			if(x%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String args[]) {
		int n = 7;
		int count = 0;
		int num = 2	;
		
		
		while (count < n) {
			if (isPrime(num)) {
				count++;
				System.out.println(num+""+isPrime(num));
				if(count == n) {
					System.out.println(num);
				}
			}
			num++;
			System.out.println(num);
			
			
		}
	}
}