import java.util.ArrayList;

public class Aluno {
	private String nome;
	private ArrayList<ContaLaboratorio> contasLaboratorio;
	private ArrayList<ContaCantina> contasCantina;
	private ArrayList<Disciplina> disciplinas;
	private Saude saude;
	
	public Aluno(String nome) {
		this.nome = nome;
		this.contasLaboratorio = new ArrayList<ContaLaboratorio>();
		this.contasCantina = new ArrayList<ContaCantina>();
		this.disciplinas = new ArrayList<Disciplina>();
		this.saude = new Saude();
	}
	
	public void cadastrarLaboratorio(String nome) {
		ContaLaboratorio lab = new ContaLaboratorio(nome);
		this.contasLaboratorio.add(lab);
	}

	public void cadastrarLaboratorio(String nome, int cota) {
		ContaLaboratorio lab = new ContaLaboratorio(nome, cota);
		this.contasLaboratorio.add(lab);
	}
	
	public void consomeEspaco(String nomeLab, int mbytes) {
			
	}
	
	
	
}
