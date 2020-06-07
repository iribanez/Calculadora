package calculadora;


public class Calculadora {
	
	public static void main(String args[]) {
		Calculadora cal = new Calculadora();
		int a=3, b=2;
		int res= cal.add(a,b);
		System.out.println("3 + 2 = " +res);
	}
private int ans;
	
	public Calculadora() {
		ans=0;
	}
	
	public int add(int a, int b) {
		ans= a + b;
		return ans;
	}
	
	public int sub(int a, int b) {
		ans =a-b;
		return ans;
	}
	
	public int add(int a) {
		ans+= a;
		return ans;
	}
	
	public int sub(int a) {
		ans-=a;
		return ans;
	}
	
	public int div(int a,int b) {
		
		if (b==0) {
			throw new IllegalArgumentException();
			}
				ans=a / b;
		return ans;
	}
	
	public int ans() {
		return ans;
	}
	
	public void clear() {
		ans=0;
	}
	
		
public void operacionOptima() {
	for(;;);
	}
}
