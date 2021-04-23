define i32 @main() {
	%a = alloca i32, align 4
	store i32 8, i32* %a, align 4
	%b = alloca i32, align 4
	store i32 2, i32* %b, align 4
	call void @splash(i32 8)
	%k1 = alloca float, align 4
	store float 0x4079000000000000, float* %k1, align 4
	%k2 = alloca float, align 4
	store float 0x4072c00000000000, float* %k2, align 4
	%k = alloca float, align 4
	%1 = call float @ResDiv(float 0x4079000000000000, float 0x4072c00000000000)
	store float %1, float* %k, align 4
	%c = alloca i32, align 4
	store i32 4, i32* %c, align 4
	%2 = load i32, i32* %c, align 4
	%3 = sdiv i32 %2, 4
	store i32 %3, i32* %c, align 4
	%4 = call i32 @square(i32 2)
	ret i32 %4
}

