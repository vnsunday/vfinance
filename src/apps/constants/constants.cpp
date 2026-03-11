#include <stdio.h>

// Gross, NET, T, I
double az_constant25[13][4] = {
	{ 0.0, 0.0, 0.0, 0.0 }, 
	{  6.92, 5.64, 0.77, 0.51 },
	{ 26.21, 18.40, 7.30, 0.51 }, // 02
	{  6.92, 5.64, 0.77, 0.51 }, 
	{  6.92, 5.64, 0.77, 0.51 }, 
	{  6.92, 5.64, 0.77, 0.51 }, // 05
	{  6.92, 5.64, 0.77, 0.51 }, 
	{  6.92, 5.64, 0.77, 0.51 }, 
	{  6.92, 5.64, 0.77, 0.51 }, 
	{ 18.79, 13.58, 4.70, 0.51  }, 
	{ 34.09, 23.52, 10.06, 0.51 }, 
	{ 0, 0, 0, 0 },
	{ 0, 0, 0, 0 }
};

int main(int argc, char const *argv[])
{
	int iT = 2;
	int iG = 0;

	double dT = 0.0;
	double dG = 0.0;
	for (int i=1; i<=12; i++ ) {
		dT += az_constant25[i][iT];
		dG += az_constant25[i][iG];
	}

	printf("Sum=%0.2f\r\n", dT);
	printf("SumG=%0.2f\r\n", dG);
	return 0;
}