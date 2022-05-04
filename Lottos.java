package test01;

public class Lottos {
	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];

		int win = 0;
		int lose = 6;
		for (int i = 0; i < lottos.length; i++) {
			if(lottos[i]!=0) {
				for (int j = 0; j < win_nums.length; j++) {
					if(lottos[i]==win_nums[j]) {
						win++;
						lose--;
					}
				}

			} else if(lottos[i]==0) {
				win++;

			}


			if(lose==0) { // 1등
				answer[1]=1;
			}else if(lose==1) { // 2등
				answer[1]=2;
			}else if(lose==2) { // 3등
				answer[1]=3;
			}else if(lose==3) { // 4등
				answer[1]=4;
			}else if(lose==4) { // 5등
				answer[1]=5;
			}else { // 6등
				answer[1]=6;
			}

			if(win==6) { // 1등
				answer[0]=1;
			}else if(win==5) { // 2등
				answer[0]=2;
			}else if(win==4) { // 3등
				answer[0]=3;
			}else if(win==3) { // 4등
				answer[0]=4;
			}else if(win==2) { // 5등
				answer[0]=5;
			}else { // 6등
				answer[0]=6;
			}
		}


		return answer;
	}
	public static void main(String[] args) {
//		int[] a = {44,1,0,0,31,25};
//		int[] b = {31,10,45,1,6,19};
		int[] a = {45, 4, 35, 20, 3, 9};
		int[] b = {20, 9, 3, 45, 4, 35};
//		int[] a = {0, 0, 0, 0, 0, 0};
//		int[] b = {38, 19, 20, 40, 15, 25};
		
		
		System.out.println(Lottos.solution(a, b)[0]);
		System.out.println(Lottos.solution(a, b)[1]);

	}
}

