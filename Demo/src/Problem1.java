
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=100;i++){

			if(i%3==0 && i%5==0)
			{
			System.out.println("HiBye");
			}
			else if(i%3==0)
			{
			System.out.println("Hi");
			}
			else if(i%5==0)
			{
			System.out.println("Bye");
			}
			else
			{
			System.out.println(i);
			}
			}
	}
}
