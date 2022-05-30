public class Main
{
	public static void main(String[] args) {
	    int a = 0;
	    int b = 1;
	    int n;
	    
	    for(int i = 0; i < 20; i++){
	        System.out.println(a);
	        n = a;
	        a = a + b;
	        b = n;
	    }
	}
}
