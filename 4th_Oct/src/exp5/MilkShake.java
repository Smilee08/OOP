package exp5;

public abstract class MilkShake extends Drink{
private Integer mquantity;
 
	public MilkShake() {
		
	}
public MilkShake(Integer mquantity) {
		this.mquantity=mquantity;
	}
public Integer getMquantity() {
	return mquantity;
}
public void setMquantity(Integer mquantity) {
	this.mquantity = mquantity;
}

}
