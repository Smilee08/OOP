package Composition;

public class Mobile {
	private String name,ram,rom;

	public Mobile(String name, String ram, String rom) {
		super();
		this.setName(name);
		this.setRam(ram);
		this.setRom(rom);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getRom() {
		return rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

}
