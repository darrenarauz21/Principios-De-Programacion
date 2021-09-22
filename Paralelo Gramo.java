//ParaleloGramo
public class ParaleloGramo {
	public static void main (String[] args)
	{
		for(int i=0;i<6;i++) 
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<10;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
