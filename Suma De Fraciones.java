/*Calcular e imprimir la sumatoria de la siguiente progresión aritmética: 
1+1/2+1/3+1/4 ...*/
public class SumaDeFraciones {
		public static void main (String[] args) 
			{
			int n=1,d=2,t=50; //n es el numerador y d el denominador, t indica el tamaño de la suma
			float div=0,total=0;
			System.out.print(" "+n);
			while (d<=t) 
			{
				System.out.println(" + "+n+"/"+d);
				div=div+(float)n/d;
				d++;
			}
			total=div+n;
			System.out.println("Solución: "+total);
		}
}
