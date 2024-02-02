import sys
from sys import getfilesystemencodeerrors

#몇개
N = int(sys.stdin.readline())

#명령 프롬프트 받을 리스트(코테라서 미리 값을 넣음)
prom_list = ['0' for _ in range(N)]


#파일이름 입력받음
for i in range(N):
    prom_list[i] =sys.stdin.readline()

#받아줄 문자열
strng = ''

for i in range(len(prom_list[0])):
    #문자열이 리스트로 있는 리스트에서 요소 하나하나 가져와서 집합을 만듦
    #set은 겹치지 않으므로 만약 prom_list[0][i]==prom_list[1][i]==prom_list[2][i]라면 반드시 1이고 아니면 1보다 크다
    chars = set(prom_list[j][i] for j in range(N))

    if len(chars) == 1:
        strng += chars.pop()#리턴하고 없애기
    else:
        strng += '?'

# 결과 출력
print(strng)
