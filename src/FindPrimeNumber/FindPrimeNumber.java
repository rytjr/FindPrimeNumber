package FindPrimeNumber;

import java.util.*;
import java.io.*;

/*M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.*/
// 에라토스테네스의 체(Sieve of Eratosthenes)라는 소수를 구하는 알고리즘을 사용하여 시간초과를 피할 수 있었다.
 
public class FindPrimeNumber {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		boolean[] prime = new boolean[b + 1];
		
		for(int d = 2; d <= b; d++) {
			prime[d] = true;
		}
		
		for(int i = 2; i*i <= b; i++) {
			if(prime[i]) {
				for(int j = i*i; j <= b; j+= i) {
					prime[j] = false;
				}
			}
		}
		
		//2부터 시쟉했기 때문에 번위에 벗어나는 것은 false로 
		for(int i = 1; i <a; i++) {
			prime[i] = false;
		}
		
		for (int i = 2; i <= b; i++) {
            if (prime[i]) {
                System.out.println(i + " ");
            }
        }
	}

}
