H, M = map(int, input().split())

if 23>= H >= 0 and 59 >= M >= 45 :
    print(H, M-45)
elif 23>= H >0 and 45 > M >= 0 :
    print(H-1, abs(M+15))
elif H == 0 and 45 > M >= 0 :
    print(23, abs(M+15))