import java.util.List;
import java.util.LinkedList;

public class LLPolynomial implements Polynomial {
	
	private LinkedList<Term> termList;
	
	public LLPolynomial () {
		 termList = new LinkedList<Term>();
	}

	@Override
	public boolean addTerm(Term t) {
		
		boolean flag = false;
		int initialTermCount = getTermCount();
		
		termList.addLast(t);
		
		int currTermCount = getTermCount();
		
		if (currTermCount > initialTermCount) {
			flag = true;
		}
		
		return flag;
	}

	@Override
	public boolean removeTerm(Term t) {
		
		boolean flag = false;
		int initialTermCount = getTermCount();
		
		termList.remove(t);
		
		int currTermCount = getTermCount();
		
		if (currTermCount < initialTermCount) {
			flag = true;
		}
		
		return flag;
	}

	@Override
	public int getTermCount() {
		return termList.size();
	}

	@Override
	public List<Character> getVariables() {
		List<Character> vars = new LinkedList<Character>();
		
		for (Term v : termList) {
			vars.add(v.getVariable());
		}
		
		return vars;
	}

	@Override
	public List<Integer> getExponents() {
		List<Integer> exps = new LinkedList<Integer>();
		
		for (Term v : termList) {
			exps.add(v.getExponent());
		}
		
		return exps;
	}

	@Override
	public List<Term> getTerms(char variable, int exponent) {
		List<Term> terms = new LinkedList<Term>();
		
		for (Term v : termList) {
			if (variable == v.getVariable() && exponent == v.getExponent()) {
				terms.add(v);
			}
		}
		
		return terms;
	}

	@Override
	public List<Term> getAllTerms() {
		List<Term> terms = new LinkedList<Term>();
		
		for (Term v : termList) {
			terms.add(v);
		}
		
		return terms;
	}
	
	@Override
	public String toString() {
		String s = "";
		
		for (Term v : termList) {
			if (v.getCoefficient() < 0) {
				s += v;
			} else {
				s += "+" + v;
			}
			
		}
		
		return s.substring(1);
	}

}
