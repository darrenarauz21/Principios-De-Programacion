/*Calcular e imprimir la suma y resta de los siguientes términos elevados a la potencia en su denominador:
1/2-2/3^2+3/4^3  ...
*/

import java.text.DecimalFormat;
import java.util.Scanner;
public class SumaRestaDeFracciones {
	public static void main (String[] args)
	{
		DecimalFormat formato = new DecimalFormat("##.###");
		Scanner leer=new Scanner(System.in);
		int n=1,d=2,num;
		float div=0;
		
		System.out.print("Ingrese Tamaño de n: ");	
		num = leer.nextInt();
		leer.close();
		
		for(int i=1; i<=num; i++)
		{
			if (i%2==0) 
			{
			//	System.out.print(" - "+n+"/"+d+"^"+n); //se puede imprimir de ambas formas
				System.out.println("    "+n);
				System.out.println(" - "+"———");
				System.out.println("   "+d+"^"+n);
				div=(float) (div-n/Math.pow(d, n));
			}
			
			else
			{
			//	System.out.println(" + "+n+"/"+d+"^"+n); //se puede imprimir de ambas formas
				System.out.println("    "+n);
				System.out.println(" + "+"———");
				System.out.println("   "+d+"^"+n);
				div=(float) (div+n/Math.pow(d, n));
			}
			n++;
		}
		System.out.print("\n\nSolución: ");
		System.out.println(formato.format(div));
	}
}
