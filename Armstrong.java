class tst{
	void num(int n) {
		int t,c,s=0;
		int k=n;
		while(n>0) {
			t=n%10;
			c=(t*t*t);
			s+=c;
			n=n/10;
	   }
      if(s==k)
    	  System.out.println(k+" is an armstrong number");
      else
    	  System.out.println(k+" is not an armstrong number");
	}
}
public class Armstrong {
	public static void main(String[] args) {
		tst obj=new tst();
		obj.num(407);
		}

}

Output:
407 is an armstrong number