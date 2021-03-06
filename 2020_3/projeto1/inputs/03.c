
int main () {
	int quantas_trincas = 33, valor1 = 821;
	float tk[3] = { -1.0, 0.0, 1.0 };
	printf("scalar{%d, %d} = %d\n", quantas_trincas, valor1 - tk[0], scalar(quantas_trincas, valor1));
	return 0;
}
