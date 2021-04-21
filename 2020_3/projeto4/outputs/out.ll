
define i32 @half(i32 %0) {
	%x = alloca i32, align 4
	store i32 %0, i32* %x, align 4
	%2 = load i32, i32* %x, align 4
	%3 = sdiv i32 %2, 2
	ret i32 %3
}

define i32 @scalar(i32 %0, i32 %1) {
	%a = alloca i32, align 4
	store i32 %0, i32* %a, align 4
	%b = alloca i32, align 4
	store i32 %1, i32* %b, align 4
	%3 = load i32, i32* %b, align 4
	%4 = sub i32 0, %3
	%5 = load i32, i32* %a, align 4
	store i32 %5, i32* %a, align 4
	%6 = load i32, i32* %b, align 4
	%7 = add %6, 1
	store i32 %7, i32* %b, align 4
	%8 = load i32, i32* %a, align 4
	%9 = mul i32 %8, %8
	%10 = add i32 %9, %3
	%11 = sub i32 %3, %8
	%12 = mul i32 %11, %3
	%13 = add i32 %10, %12
	%14 = call i32 @half(i32 %13)
	%15 = add i32 %14, 3
	%16 = sdiv i32 %15, 2
	ret i32 %16
}

define float @fscalar(float %0, float %1) {
	%a = alloca float, align 4
	store float %0, float* %a, align 4
	%b = alloca float, align 4
	store float %1, float* %b, align 4
	%result = alloca float, align 4
	%3 = fadd float %8, %3
	%4 = fsub float %8, %3
	%5 = fdiv float %3, %4
	%6 = fmul float %8, %3
	%7 = fmul float %5, %6
	%8 = fdiv float %8, %3
	%9 = fdiv float %7, %8
	store float %9, float* %result, align 4
	%10 = load float, float* %result, align 4
	ret float %10
}

define i32 @main() {
	%quantas_trincas = alloca i32, align 4
	store i32 33, i32* %quantas_trincas, align 4
	%valor1 = alloca i32, align 4
	store i32 821, i32* %valor1, align 4
	%tk2 = alloca i32, align 4
	store i32 1, i32* %tk2, align 4
	%tk0 = alloca i32, align 4
	store i32 -1, i32* %tk0, align 4
	%1 = call i32 @scalar(i32 32, i32 821)
	%2 = sub i32 %1, -1
	%3 = load i32, i32* %valor1, align 4
	ret i32 %3
}
