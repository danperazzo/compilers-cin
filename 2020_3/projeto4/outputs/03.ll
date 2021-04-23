define float @fscalar(float %0, float %1) {
%a = alloca float, align 4
store float %0, float* %a, align 4
%b = alloca float, align 4
store float %1, float* %b, align 4
%result = alloca float, align 4
%3 = load float, float* %a, align 4
%4 = load float, float* %b, align 4
%5 = fadd float %3, %4
%6 = fsub float %3, %4
%7 = fdiv float %5, %6
%8 = fmul float %3, %4
%9 = fmul float %7, %8
%10 = fdiv float %3, %4
%11 = fdiv float %9, %10
store float %11, float* %result, align 4
%12 = load float, float* %result, align 4
ret float %12
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
store i32 %2, i32* %valor1, align 4
%3 = load i32, i32* %valor1, align 4
ret i32 %3
}

