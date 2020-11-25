public class ZeroCoefficientException extends IllegalArgumentException {
	
	private final String ERR_MSG = "Terms with a zero coefficient are invalid";
	
	public ZeroCoefficientException () {
		super();
	}
	
	@Override
	public String getMessage () {
		return ERR_MSG;
	}

}
