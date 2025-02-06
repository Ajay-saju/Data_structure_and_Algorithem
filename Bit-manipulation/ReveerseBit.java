class ReverseBit {
    public static void main(String[] args) {
        // long res = 0;
        long a = 8;
        long ans = 0;
		
		for(int i = 0; i<= 32 ; i++){
			
			long bit = (a >> i)&1;
			ans = ans|(bit << (31-i));
		}
		System.out.println(ans);
        // System.out.println(1&1);
        
    }
}