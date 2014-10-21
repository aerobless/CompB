package hello;


public class MyTestVisitor<T> extends HelloBaseVisitor<T> {
	public T visitStatements(HelloParser.RContext ctx) {
		System.out.println("Addition");
		return visitChildren(ctx);
	}
}
