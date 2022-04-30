package spring.phone;

public class Phone {

	private Ring ring;

	public void ringing() {
		ring.ring();
	}

	public Ring getRing() {
		return ring;
	}

	public void setRing(Ring ring) {
		this.ring = ring;
	}
	
	
}
