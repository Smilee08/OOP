package exam;

public class Customer {
	private Integer c_id;
	private Integer p_id;
	private Boolean wallet_true;
	private Boolean alternative;
	private Integer wallet_money=10000;
	
	public Customer(Integer c_id, Integer p_id, Boolean wallet_true, Boolean alternative) {
		this.c_id = c_id;
		this.p_id = p_id;
		this.wallet_true = wallet_true;
		this.alternative = alternative;
	}

	public Integer getC_id() {
		return c_id;
	}

	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}

	public Integer getP_id() {
		return p_id;
	}

	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}

	public Boolean getWallet_true() {
		return wallet_true;
	}

	public void setWallet_true(Boolean wallet_true) {
		this.wallet_true = wallet_true;
	}

	public Boolean getAlternative() {
		return alternative;
	}

	public void setAlternative(Boolean alternative) {
		this.alternative = alternative;
	}
	
	public Boolean wallet() {
		return alternative;
		
	}

}
