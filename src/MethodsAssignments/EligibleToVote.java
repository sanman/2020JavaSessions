package MethodsAssignments;

public class EligibleToVote {

	public static void main(String[] args) {
		
		EligibleToVote voterAge = new EligibleToVote();
		voterAge.voteEligibility(20);

	}
	
	public  void voteEligibility(int age) {
		if (age >= 18) {
			System.out.println("Person is eligible to vote");
		}
		else {
			System.out.println("Person is not eligible to vote");
		}
	}

}
