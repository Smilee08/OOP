package exp5;

public abstract class FruitJuice extends Drink{
private	Integer fquantity;
	
	public FruitJuice() {
		
	}
	
public FruitJuice(Integer fquantity) {
	this.fquantity=fquantity;
		
	}

public Integer getFquantity() {
	return fquantity;
}

public void setFquantity(Integer fquantity) {
	this.fquantity = fquantity;
}

}
