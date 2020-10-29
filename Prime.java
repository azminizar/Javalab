class num{
	void num(int n) {
        int t=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) 
				 t=1;
			break;
		}
		    if(t==1)
				System.out.println("The number is not prime");
		    else
				System.out.println("The number is prime");
		
	
			
	}
}
public class Prime {
	public static void main(String[] args) {
		num obj= new num();
		obj.num(3);
	}

}

Output:
The number is prime
