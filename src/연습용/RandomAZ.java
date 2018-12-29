package 연습용;

import java.util.Random;
import java.util.Scanner;
// 정수 두 개를 입력 받아서 그 사이에 있는 난수 10개를 출력
// 중복 제거도 재미 삼아 해볼 것
public class RandomAZ {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.print("정수 입력 1 : ");
		int a = sc.nextInt();
		System.out.print("정수 입력 2 : ");
		int z = sc.nextInt();
		int max = a;
		int min = z;
		
		if (a < z){
			max = z;
			min = a;
		}
		
		int[] rnum = new int[10];
		for(int i  = 0; i < 10; i++) {
			rnum[i] = r.nextInt(max-min+1)+min;
		}
		
		for(int j = 0; j < rnum.length; j++) {
			System.out.print(rnum[j]+" ");
		}
		

	}

}
