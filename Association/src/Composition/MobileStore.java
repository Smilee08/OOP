package Composition;

import java.util.List;

public class MobileStore {
	private final List<Mobile> m;

	public MobileStore(List<Mobile> m) {
		this.m = m;
	}

	public List<Mobile> getTotalMobilesInStore() {
		return m;
	}


}
