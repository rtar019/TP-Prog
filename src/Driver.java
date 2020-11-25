public class Driver {
	
	public static void main (String[] args) {
		
		try {
			Term t0 = new Term(3d, 'x', 2);
			Term t1 = new Term(-2d, 'y', 3);
			Term t2 = new Term(4d, 'x', 2);			
			Term t3 = new Term(8d, ' ', 0);
			Term t4 = new Term(-5d, ' ', 8);
			
			LLPolynomial llPl = new LLPolynomial();
			llPl.addTerm(t0);
			llPl.addTerm(t1);
			llPl.addTerm(t2);
			llPl.addTerm(t3);
			llPl.addTerm(t4);
			System.out.println(llPl.getAllTerms());
			
		} catch (ZeroCoefficientException zce) {
			zce.getMessage();
		}

	}

}
