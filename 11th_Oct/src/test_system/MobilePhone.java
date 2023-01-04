package test_system;

public abstract class MobilePhone {
private Integer no_of_sims;

	public Integer getNo_of_sims() {
	return no_of_sims;
}

public void setNo_of_sims(Integer no_of_sims) {
	this.no_of_sims = no_of_sims;
}

	public MobilePhone() {
		//System.out.println(".....Mobile phone......");
	}
	
	void chat() {
		System.out.println("...Chat is on...");
	}
	
	public abstract void makeACall();
}
