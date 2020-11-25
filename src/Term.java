public class Term {

	private double coefficient;
	private char variable;
	private int exponent;
	
	public Term (double coefficient, char variable, int exponent) {
		
		if(coefficient == 0d)
			throw new ZeroCoefficientException();
		this.coefficient = coefficient;
		
		this.variable = variable;
		this.exponent = exponent;
	}
	
	public double getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}

	public char getVariable() {
		return variable;
	}

	public void setVariable(char variable) {
		this.variable = variable;
	}

	public int getExponent() {
		return exponent;
	}

	public void setExponent(int exponent) {
		this.exponent = exponent;
	}
	
	@Override
	public String toString () {
		String s = "";
		String checkExp = "";
		char c = (this.variable != ' ') ? this.variable : ' ';
		
		checkExp += (this.exponent == 0 || this.exponent == 1) ? "" : "^" + this.exponent;
		
		s += "" + this.coefficient + c + checkExp;
		return s.replaceAll("\\s+","");
	}
	
}
