package JavaInterpreterExample;

class Interpreter_Aufgabe_1 {
	static int maxargs(Stm s) {
		if (s instanceof CompoundStm) {
			CompoundStm stm = (CompoundStm) s;
			return Math.max(maxargs(stm.stm2), maxargs(stm.stm1));
		} else if (s instanceof AssignStm) {
			AssignStm stm = (AssignStm) s;
			return maxargs(stm.exp);
		} else {
			PrintStm stm = (PrintStm) s;
			return Math.max(length(stm.exps), maxargs(stm.exps));
		}
	}

	private static int length(ExpList es) {
		if (es instanceof PairExpList) {
			PairExpList exps = (PairExpList) es;
			return 1 + length(exps.tail);
		} else {
			return 1;
		}
	}

	private static int maxargs(Exp e) {
		if (e instanceof IdExp) {
			return 0;
		} else if (e instanceof NumExp) {
			return 0;
		} else if (e instanceof EseqExp) {
			EseqExp ex = (EseqExp) e;
			return Math.max(maxargs(ex.stm), maxargs(ex.exp));
		} else {
			OpExp ex = (OpExp) e;
			return Math.max(maxargs(ex.left), maxargs(ex.right));
		}
	}

	private static int maxargs(ExpList es) {
		if(es instanceof PairExpList){
			PairExpList pex = (PairExpList) es;
			return Math.max(maxargs(pex.head), maxargs(pex.tail));
		} else if(es instanceof LastExpList){
			LastExpList lex = (LastExpList) es;
			return maxargs(lex.head);
		} else {
			return 0;
		}
	}

	public static void main(String args[]) throws java.io.IOException {
		//TODO: Output the number of arguments
		System.out.println("[SLP]Anzahl Parameter im print-Statement: "+ 
		maxargs(Program.prog));
	}
}
