package strings;

public class App {

	public static void main(String[] args) {
		String x = "Estudando";
		String y = "Java";
		String z = x.concat(y);

		System.out.println(z);
	
		//O CODIGO ABAIXO NÃO FUNCIONA, PARA QUE DE CERTO, PRECISAMOS ULTILIZAR O .EQUAL
		if(z =="EstudandoJava"){
				System.out.println("A resposta é Estudando Java");
		}else {
			System.out.println("O texto não é Estudando Java");
		}
		
		//ESTE CODIGO, FUNCIONA DE MANEIRA PRECISA
			if(z.equals("EstudandoJava")){
					System.out.println("A resposta é Estudando Java");
			}else {
				System.out.println("O texto não é Estudando Java");
		}
	}

}
