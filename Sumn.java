class number{
	void num(int n){
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Sum="+sum);
	}
}
public class Sumn {
    public static void main(String[] args) {
    	number obj=new number();
    	obj.num(10);
    	
    }
}
 
Output:
Sum=55