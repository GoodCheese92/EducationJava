package work;

import java.util.Random;

public class Work {
	Random rnd = new Random();
	String[] problem;
	private String pb;
	private String rndPb = "";
	private String answer;
	
	public String getPb() {
		return pb;
	}

	public Work(String[] problem) {
		this.problem = problem;
	} // end of constructor

	public String rndProblem() {
		pb = problem[rnd.nextInt(problem.length)];
		for (int i = 0; i < pb.length(); i++) {
			rndPb += '¡Ù';
		}

		return rndPb;
	} // end of rndProblem()

	public String answer(String input_answer) {
		for (int i = 0; i < pb.length(); i++) {
			if (pb.charAt(i) == input_answer.charAt(0)) {
				answer = rndPb.replace(rndPb.charAt(i), input_answer.charAt(0));
			}
		} // for

		return answer;
	} // end of answer()

} // end of class
