package lamdaExpressions4;

interface Lambda{
	abstract public void demo(int x);
}

public class app {
	
	public static void main(String[] args) {
		
		;
		Lambda lamda = (int x)->{
			System.out.println("Metodo Demo, x : " + x);
			System.out.println("Metodo demo novamente");
			int j = 10;
		};
		//Não pode ser acessada graças ao escopo
		//System.out.println(j);
		lamda.demo(10);
	}
		
}
