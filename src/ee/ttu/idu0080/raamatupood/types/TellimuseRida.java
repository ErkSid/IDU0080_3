package ee.ttu.idu0080.raamatupood.types;

import java.io.Serializable;

public class TellimuseRida implements Serializable {

	private Toode toode;
	private Long kogus;

	public TellimuseRida(Toode toode, long kogus) {
		this.toode = toode;
		this.kogus = kogus;
	}

	public Toode getToode() {
		return toode;
	}

	public void setToode(Toode toode) {
		this.toode = toode;
	}

	public Long getKogus() {
		return kogus;
	}

	public void setKogus(Long kogus) {
		this.kogus = kogus;
	}

	public String toString() {
		return "Toode:" + toode + " Kogus:" + kogus;
	}
}
