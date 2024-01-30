#include <stdio.h>
//least_common_multiple
void LCM(gcv,x,y) {
	//GCD로 둘을 나눈 값들과의 곱은 최소공배수
	printf("%d\n", (x / gcv) * (y / gcv) * gcv);
	
}
//great_common_divisor
int GCdivisor(int x, int y) {
	int rest=1;

	while (1) {
		if (rest == 0) {
			return x;
			break;
		}
		//rest의 y의 공약수는 x와 y의 공약수와 같다 
		rest = x % y;
		x = y;
		y = rest;
	}



}


int main(void) {

	//테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)
	int T;
	//printf("두 정수 입력(띄어쓰기) :");
	scanf("%d", &T);

	//입력을 받아낼 array
	int arr[1000][2];



	

	//최솟값배열
	int least_common_multiple[1000];


	int gcv[1000];

	//입력
	for (int i = 0; i < T; i++) {

		//printf("두 정수 입력(띄어쓰기) :");
		scanf("%d %d", &arr[i][0], &arr[i][1]);
		gcv[i] = GCdivisor(arr[i][0], arr[i][1]);
	}

		//printf("%d %d\n", arr[i][0], arr[i][1]);
		//1이 있는 경우
		/*if (arr[i][0] == 1) {
			least_common_multiple[i] = arr[i][1];

		}
		else if (arr[i][1] == 1) {
			least_common_multiple[i] = arr[i][0];
		}

		else if (arr[i][0] > arr[i][1]) {
			max = arr[i][0];
			min = arr[i][1];
			
		}
		else {
			max = arr[i][1];
			min = arr[i][0];
			
		
		}
		maxMin(max, min, T);*/
		
		for (int i = 0; i < T; i++) {
			LCM(gcv[i], arr[i][0], arr[i][1]);
		}



		return 0;
}