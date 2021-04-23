define i32 @main() {
	%a = alloca i32, align 4
	store i32 14, i32* %a, align 4
	%b = alloca i32, align 4
	store i32 46, i32* %b, align 4
	%c = alloca i32, align 4
	store i32 -644, i32* %c, align 4
	%d = alloca i32, align 4
	store i32 -38654, i32* %d, align 4
	%e = alloca float, align 4
	store float 0xc177bd7180000000, float* %e, align 4
	%f = alloca float, align 4
	store float 0x4084202220000000, float* %f, align 4
	%g = alloca float, align 4
	store float 0x4084902220000000, float* %g, align 4
	%h = alloca float, align 4
	%1 = load float, float* @glob1, align 4
	%2 = fadd float 0x4084902220000000, %1
	store float %2, float* %h, align 4
	%i = alloca float, align 4
	%3 = call float @return3()
	%4 = fadd float %3, 5.0
	%5 = load float, float* %h, align 4
	%6 = fmul float %4, %5
	store float %6, float* %i, align 4
	%7 = load i32, i32* @glob2, align 4
	%8 = add i32 38070, %7
	ret i32 %8
}
