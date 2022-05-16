package template;

public abstract class ATemplateProcedure {
	
	public abstract void getProcedurePapers();
	public abstract void getOfficerApprovalProcedure();
	public abstract void identifyDamage();
	public abstract void evaluationHouse();
	public abstract void sendEvaluation();
	
	public void getInsurance() {
		getProcedurePapers();
		getOfficerApprovalProcedure();
		identifyDamage();
		evaluationHouse();
		sendEvaluation();
		//return
	}
	

}
