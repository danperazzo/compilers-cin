
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
	%6 = mul i32 %5, %4
	store i32 %6, i32* %a, align 4
	%7 = load i32, i32* %b, align 4
	%8 = add %7, 1
	store i32 %8, i32* %b, align 4
	%9 = load i32, i32* %a, align 4
	%10 = mul i32 %9, %9
	%11 = add i32 %10, %3
	%12 = sub i32 %3, %9
	%13 = mul i32 %12, %3
	%14 = add i32 %11, %13
	%15 = call i32 @half(i32 %14)
	%16 = add i32 %15, 3
	%17 = sdiv i32 %16, 2
	ret i32 %17
}

define float @fscalar(float %0, float %1) {
	%a = alloca float, align 4
	store float %0, float* %a, align 4
	%b = alloca float, align 4
	store float %1, float* %b, align 4
	%result = alloca float, align 4
	%3 = fadd float %9, %3
	%4 = fsub float %9, %3
	%5 = fdiv float %3, %4
	%6 = fmul float %9, %3
	%7 = fmul float %5, %6
	%8 = fdiv float %9, %3
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
