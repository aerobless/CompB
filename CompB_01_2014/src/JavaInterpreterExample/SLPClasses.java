package JavaInterpreterExample;
/*
 * Straight-Line Program Interpreter
 * Grammar:
 * Stm = Stm; Stm				// Composition
 * Stm = id := Expr				// AssignStm 
 * Stm = print(ExpList)			// PrintStm
 * Exp = id						// IdExp
 * Exp = num					// NumExp
 * Exp = Exp Binop Exp			// OpExp
 * Exp = (Stm, Stm)				// EseqExp
 * ExpList = Exp, ExpList		// PairExpList
 * ExpList = Exp				// LastExpList
 * Binop = +					// Addition / Plus
 * Binop = .					// Minus
 * Binop = *					// Times
 * Binop = /					// Division
 */
abstract class Stm {}

class CompoundStm extends Stm {
   Stm stm1, stm2;
   CompoundStm(Stm s1, Stm s2) {stm1=s1; stm2=s2;}

	@Override
	public String toString() {
		return stm1 + "," + stm2;
	}
}

class AssignStm extends Stm {
   String id; Exp exp;
   AssignStm(String i, Exp e) {id=i; exp=e;}

	@Override
	public String toString() {
		return id + "=" + exp;
	}
}

class PrintStm extends Stm {
   ExpList exps;
   PrintStm(ExpList e) {exps=e;}

	@Override
	public String toString() {
		return ""+exps;
	} 
}

abstract class Exp {}

//  Exp = id	// IdExp
class IdExp extends Exp {
   String id;
   IdExp(String i) {id=i;}

	@Override
	public String toString() {
		return ""+id;
	}
}

class NumExp extends Exp {
   int num;
   NumExp(int n) {num=n;}

	@Override
	public String toString() {
		return ""+num;
	}
}

class OpExp extends Exp {
   Exp left, right; int oper;
   final static int Plus=1,Minus=2,Times=3,Div=4;
   OpExp(Exp l, int o, Exp r) {left=l; oper=o; right=r;}
   
	@Override
	public String toString() {
		String opVar;
		if(oper == 1){
			opVar = "+";
		} else if(oper == 2){
			opVar = "-";
		} else if(oper == 3) {
			opVar = "*";
		} else {
			opVar = "/";
		}
		return left + opVar+ right;
	}
}

class EseqExp extends Exp {
   Stm stm; Exp exp;
   EseqExp(Stm s, Exp e) {stm=s; exp=e;}

	@Override
	public String toString() {
		return "(" + stm + ", " + exp + ")";
	}
}

abstract class ExpList {}

class PairExpList extends ExpList {
   Exp head; ExpList tail;
   public PairExpList(Exp h, ExpList t) {head=h; tail=t;}
   
	@Override
	public String toString() {
		return head + ", " + tail;
	}
}

class LastExpList extends ExpList {
   Exp head; 
   public LastExpList(Exp h) {head=h;}

	@Override
	public String toString() {
		return ""+head;
	}
}
