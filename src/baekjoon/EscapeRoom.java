package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 길이가 N인 수열과 그 옆에 떨어진 메모지.
 * 1. 눈 앞에 보이는 수열을 모두 외운 후 벽에 있는 버튼을 누른다.
 * 2. 모니터를 통해 M개의 숫자를 하나씩 보여주면, 그 숫자가 수열에 있는지 없는지 바로 대답한다.
 * 3. 한 번이라도 실패하면 탈출할 수 없다.
 */
public class EscapeRoom {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		//N을 입력받고 그만큼의 수를 배열에 저장한다.
		int N = Integer.parseInt(br.readLine());

		// 배열 선언 및 저장
		//int[] suyul = new int[N];
		String[] input = br.readLine().split(" ");

		int[] suyul = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

		//이진탐색을 위해 suyul을 정렬.
		Arrays.sort(suyul);

		int M = Integer.parseInt(br.readLine());
		//크기가 M인 정수형 배열 monitorArr에 숫자 입력받기.
		String[] monitor = br.readLine().split(" ");// 공백을 기준으로 입력을 나눈다.
		int[] monitorArr = Arrays.stream(monitor).mapToInt(Integer::parseInt).toArray();

		//이진탐색 suyul에 있는 수가 monitorArr에 존재하면 1, nor 0
		for (int num : monitorArr) {
			if (Arrays.binarySearch(suyul, num) >= 0) {
				sb.append(1).append("\n");
			} else {
				sb.append(0).append("\n");
			}
		}
		System.out.println(sb);
	}
}
