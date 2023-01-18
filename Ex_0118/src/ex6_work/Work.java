package ex6_work;

import java.util.Random;

public class Work {
	Random rnd = new Random();
	
	// 배열 안의 랜덤 문제 선택
	public String getSelect(String[] strArr) {
		String question = strArr[rnd.nextInt(strArr.length)];
		return question;
	}

	// 선택한 문자열 랜덤 섞기
	public String getRandom(String question) {
		String[] res = question.split("");
		String quest = "";
		
		for (int i = 0; i < res.length; i++) {
			int random_index = rnd.nextInt(res.length-i)+i;
			String tmp = res[i];
			res[i] = res[random_index];
			res[random_index] = tmp;
			quest += res[i];
		} // for
		
		return quest;
	} // end of getRandom()

	public boolean getResult(String random_quest,String answer) {
		if(random_quest.equalsIgnoreCase(answer)) {
			return true;
		}else {
			return false;
		}
		
	}

} // end of class
