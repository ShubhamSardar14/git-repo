/*Q 2 create another class having method like
 
void greater(int ,int)
void greater(int a,int b,int c)
create main in same class and call all methods
*/
package Lab4;

public class Greater {
	
	void greater(int a ,int b) {
	if(a>b)
		System.out.println("greater is "+a);
	else
	System.out.println("greater is "+b);
	}
	void greater(int a,int b,int c) {
		
		if(a>b &&a>c)
			System.out.println("greater is" +a);
		else if(b>c && b>a)
			System.out.println("greater is" +b);
		else
			System.out.println("greater is " +c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greater g=new Greater();
		g.greater(10, 20);
		g.greater(20, 10, 30);

	}

}
