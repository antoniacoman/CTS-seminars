package template;

public class InsuranceProcedure extends ATemplateProcedure{

	@Override
	public void getProcedurePapers() {
		System.out.println("Getting the papers");
	}

	@Override
	public void getOfficerApprovalProcedure() {
		System.out.println("Getting the approval");
		
	}

	@Override
	public void identifyDamage() {
		System.out.println("Identify the damage");		
	}

	@Override
	public void evaluationHouse() {
		System.out.println("Evaluation of the house");		
	}

	@Override
	public void sendEvaluation() {
		System.out.println("Sending the evaluation");		
	}

}
