void test()
{
	
}
int main () {
	// Test: array erros
	// Should Not Pass
	int a[3] = { -1.0, "0.0", 1 };
	float b[3] = { -1, 0, 1 };

	a[0] = test();
	a[1] = "b";

	int c = 0.0;
	int d = "a";
	float e = "b";
	int f = test();

	return 0;
}