package JavaInterpreterExample;

class Interpreter_Aufgabe_2 {
	static void interp(Stm s) {
		interpStm(s, null);
	}

	private static Table interpStm(Stm s, Table t) {
		//TODO -----------------------------------
		if (s instanceof CompoundStm) {
			CompoundStm stm = (CompoundStm) s;
			return interpStm(stm.stm2, interpStm(stm.stm1, t));
		} else {
			if(s instanceof AssignStm){
				AssignStm stm = (AssignStm) s;
				IntAndTable it = interpExp(stm.exp, t);
				return new Table(stm.id, it.i, it.t);
			} else {
				PrintStm stm = (PrintStm) s;
				return print(stm.exps, t);
			}
		}
	}
	

	private static Table print(ExpList es, Table t) {
		if (es instanceof PairExpList) {
			return print((PairExpList) es, t);
		} else {
			return print((LastExpList) es, t);
		}
	}

	private static Table print(PairExpList exps, Table t) {
		return print(exps.tail, printIt(exps.head, t, false));
	}

	private static Table print(LastExpList exp, Table t) {
		return printIt(exp.head, t, true);
	}

	private static Table printIt(Exp e, Table t, boolean newLine) {
		IntAndTable it = interpExp(e, t);
		if (newLine)
			System.out.println(it.i);
		else
			System.out.print(it.i + " ");
		return it.t;
	}

	/* 
	 * For simplicity's sake we dispense with exceptions and
	 * assume that there is no division through 0 etc.
	 */
	private static IntAndTable interpExp(Exp e, Table t) {
		if (e instanceof IdExp) {
			IdExp ex = (IdExp) e;
			return new IntAndTable(t.lookup(ex.id), t);
		} else if (e instanceof NumExp) {
			NumExp ex = (NumExp) e;
			return new IntAndTable(ex.num, t);
		} else if (e instanceof EseqExp) {
			EseqExp ex = (EseqExp) e;
			Table t2 = interpStm(ex.stm, t);
			return interpExp(ex.exp, t2);
		} else {
			OpExp ex = (OpExp) e;
			IntAndTable it1 = interpExp(ex.left, t);
			IntAndTable it2 = interpExp(ex.right, it1.t);
			int result = 0;
			switch (ex.oper) {
			case OpExp.Plus:
				result = it1.i + it2.i;
				break;
			case OpExp.Minus:
				result = it1.i - it2.i;
				break;
			case OpExp.Times:
				result = it1.i * it2.i;
				break;
			case OpExp.Div:
				result = it1.i / it2.i;
				break;
			}
			return new IntAndTable(result, it2.t);
		}
	}

	public static void main(String args[]) throws java.io.IOException {
		// Interpretation of the expression
		System.out.println("[SLP]Interpretation des Programms: "); 
		interp(Program.prog);
		
		/*
		 * Very simple approach to decompile the program using
		 * toString(). A better, more advanced approach would be
		 * to use the Visitors Pattern.
		 */
		System.out.println(Program.prog);
	}
}
class Table {
	String id;
	int value;
	Table tail;

	Table(String i, int v, Table t) {
		id = i;
		value = v;
		tail = t;
	}

	int lookup(String key) {
		if (id.equals(key))
			return value;
		return tail.lookup(key);
	}
}

class IntAndTable {
	int i;
	Table t;

	IntAndTable(int ii, Table tt) {
		i = ii;
		t = tt;
	}
}

