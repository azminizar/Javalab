class check{
	void num(int n) {
		int s=0,k,t;
		k=n;
		while(n>0) {
			t=n%10;
			s=(s*10)+t;
			n=n/10;
		}
		if(s==k)
			System.out.println(k+" is palindrome");
		else
			System.out.println(k+" is not palyndrome");
	}
}
public class Palindrome {
       public static void main(String[] args) {
    	   check obj=new check();
    	   obj.num(1221);
       }
}

Output:
1221 is palindrome
