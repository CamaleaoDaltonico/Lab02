
public class Main {

	public static void main(String[] args) {
		ContaCantina a = new ContaCantina("nome");
		a.cadastrarLanche(1, 200, "1");
		a.cadastrarLanche(1, 200, "2");
		a.cadastrarLanche(1, 200, "3");
		a.cadastrarLanche(1, 200, "4");
		a.cadastrarLanche(1, 200, "5");
		a.cadastrarLanche(1, 200, "6");
		System.out.println(a.listarDetalhes());
	
	}
}
