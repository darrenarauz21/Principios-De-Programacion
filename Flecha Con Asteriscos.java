//imprimir flecha con asteriscos

public class Flecha {
	public static void main (String[] args)
	{
		int i,a;
		for(i=0;i<6;i++)
		{
			for (int j=0; j<5-i; j++)
			{
				System.out.print(" ");
		    }            
		
			for(a=0;a<(i*2)-1;a++)
			{
				
				System.out.print("*");
			}
			System.out.println();
			}
		for(i=0;i<5;i++)
		{
		        for (int j=0; j<3; j++) 
		        	{
		        		System.out.print(" ");
		            }
        		for(int k=0; k<3; k++)
        		{
        			System.out.print("*");
        		}
		        System.out.println();
		}
	}

}
