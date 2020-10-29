class odd{
	void num(int n) {
		if(n%2==0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
	}
}
public class OddorEven {
	public static void main(String[] args) {
		
		odd obj=new odd();
		obj.num(6);
	
		
	}

}

Output:
The number is even
