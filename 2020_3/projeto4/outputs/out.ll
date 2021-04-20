@glob1 = global float 0x40139999a0000000
@glob2 = global i32 49

define float @return3() {
	ret float 0x4008000000000000
}

define float @operate(i32 %0, i32 %1) {
	%k1 = alloca i32, align 4
	store i32 %0, i32* %k1, align 4
	%k2 = alloca i32, align 4
	store i32 %1, i32* %k2, align 4
	%valor = alloca float, align 4
	%3 = load i32, i32* %k1, align 4
	%4 = fmul float %3, 0x4008000000000000
	%5 = load i32, i32* %k2, align 4
	%6 = fmul float %5, 0x401c000000000000
	%7 = fadd float %4, %6
	%8 = fdiv float %7, 10
	store float %8, float* %valor, align 4
	%9 = load float, float* %valor, align 4
	%10 = fadd float %9, 5
	ret float %10
}

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
	store i32 -24893208, float* %e, align 4
	%f = alloca float, align 4
	store i32 644, float* %f, align 4
	%g = alloca float, align 4
	store float 0x4084900000000000, float* %g, align 4
	%h = alloca float, align 4
	%1 = load float, float* %glob1, align 4
	%2 = fadd float %1, 0x4084900000000000
	store float %2, float* %h, align 4
	%i = alloca float, align 4
	%3 = call float @return3()
	%4 = fadd float %3, 5
	%5 = load float, float* %h, align 4
	%6 = fmul float %4, %5
	store float %6, float* %i, align 4
	%7 = load i32, i32* %glob2, align 4
	%8 = add i32 38070, %7
	ret i32 %8
}
