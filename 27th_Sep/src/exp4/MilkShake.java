package exp4;

public abstract class MilkShake extends Drink{
 Integer mquantity;
 
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
