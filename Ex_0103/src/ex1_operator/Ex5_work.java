package ex1_operator;

public class Ex5_work {
	public static void main(String[] args) {
		/*
		 결과)
		 하루 생산량 : 17개
		 시간 당 평균 : 0.7xxxx개
		 
		 과수원이 있다.
		 배, 사과, 오렌지를 키우고 있는데, 하루생산량은 각각
		 5, 7, 5개다.
		 
		 1) 과수원에서 하루에 생산되는 과일의 총 갯수를 출력
		 2) 한 시간에 몇 개의 과일이 생산되는지 출력
		 
		 ## 단, 과일의 갯수를 저장할 변수는 int 타입으로,
		 시간당 생산 수를 출력할 변수를 float 타입으로 만들 것.
		 
		 ## 같은 결과가 나오는 코드지만, 최소 두 가지 이상의 방법을 사용해 볼 것.
		 */
		
		int pear = 5;
		int apple = 7;
		int orange = 5;
		
		System.out.println("-------방법 1-------");
		int total = pear + apple + orange;
		System.out.println("총 하루 생산량 : " + total);
		float hour_output = (float)total/24f;
		System.out.println("시간 당 과일생산량 : " + hour_output);
		
		System.out.println("-------방법 2-------");
		System.out.println("총 하루 생산량 : " + (pear + apple + orange));
		System.out.println("시간 당 과일생산량 : " + (float)total/24f);
		
		
		
	
		
		
		
	} // main
} // class end
