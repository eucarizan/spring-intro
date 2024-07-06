package common.datetime;

public class DateInterval {

	private final SimpleDate start;

	private final SimpleDate end;

	public DateInterval(SimpleDate start, SimpleDate end) {
		this.start = start;
		this.end = end;
	}

	public SimpleDate getStart() {
		return start;
	}

	public SimpleDate getEnd() {
		return end;
	}
}
