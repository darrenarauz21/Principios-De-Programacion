#include <iostream>
using namespace std;
main()
{	
	int n,na,cif=0;
	char sel;
	cout<<"\t3n+1"<<endl;
	cout<<endl;		
	cout<<"Ingrese valor de n: "; cin>>n;
	cout<<endl;
	na=n;
	while(na!=0){//contador de cifras para evitar desbordamiento
		na=na/10;
		cif++;
	}
	if(n>0 && cif<9)//si el numero de cifras es menor a 9, se realiza la operación.
	{
		while(n!=1)
		{
			if(n %2==0)
				n=n/2;
			else
				n=n*3+1;
				cout<<n<<" "<<endl;
		}
	}
	cout<<"\n"<<endl;
	cout<<"Desea volver a intentar? (n/s): "; cin>>sel;
	if (sel=='s')
	{
		system("cls");
		return main();
	}
	
return 0;
}
