/*Calcular e imprimir la sumatoria de la siguiente progresión aritmética: 
1/2+2/3+3/4+4/5 ...
*/
public class FracionesConCrecimiento {
	public static void main (String[] args) 
	{
	int n=1,d=2,t=50;
	float suma=0,div=0;
	while (n<t && d<=t) 
	{
		System.out.println(" + "+n+"/"+d);
		div=suma+(float)n/d;
		suma=div;
		d++;
		n++;
	}
	System.out.println("Solución: "+suma);
}
}
