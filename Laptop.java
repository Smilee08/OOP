package laptopdb;

public class Laptop {
	private String brand;
	private String model;
	private Integer selling_price;
	private Integer screen_size;
	private String storage_capacity;
	private String storage_type;
	private String os;
	
	public Laptop()
	{
		
	}
	
	public Laptop(String brand, String model, Integer selling_price, Integer screen_size, String storage_capacity,
			String storage_type, String os) {
		super();
		this.brand = brand;
		this.model = model;
		this.selling_price = selling_price;
		this.screen_size = screen_size;
		this.storage_capacity = storage_capacity;
		this.storage_type = storage_type;
		this.os = os;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getSelling_price() {
		return selling_price;
	}

	public void setSelling_price(Integer selling_price) {
		this.selling_price = selling_price;
	}

	public Integer getScreen_size() {
		return screen_size;
	}

	public void setScreen_size(Integer screen_size) {
		this.screen_size = screen_size;
	}

	public String getStorage_capacity() {
		return storage_capacity;
	}

	public void setStorage_capacity(String storage_capacity) {
		this.storage_capacity = storage_capacity;
	}

	public String getStorage_type() {
		return storage_type;
	}

	public void setStorage_type(String storage_type) {
		this.storage_type = storage_type;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}
	
	
}
