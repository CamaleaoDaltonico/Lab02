
public class Disciplina {

	private String nome;
	private int horasEstudadas;
	private float[] notas;
	private int[] pesos;
	private float media;
	
	
	public Disciplina(String nome) {
		this.nome = nome;
		this.horasEstudadas = 0;
		this.notas = new float[4];
		this.pesos = null;
	}
	
	public Disciplina(String nome, int notas) {
		this.nome = nome;
		this.horasEstudadas = 0;
		this.notas = new float[notas];
		this.pesos = null;
	}
	
	public Disciplina(String nome, int notas, int[] pesos) {
		this.nome = nome;
		this.horasEstudadas = 0;
		this.notas = new float[notas];
		this.pesos = pesos;
	}
	public void cadastrarHoras(int horas) {
		this.horasEstudadas += horas;
	}
	
	public void cadastrarNota(int nota, float valor) {
		this.notas[nota - 1] = valor;
	}
	
	public void media() {
		float soma = 0;
		if(pesos == null) {
			for(int i = 0; i < this.notas.length; i++) {
				soma += notas[i];
			}
			this.media = soma / notas.length; 
		}else{
			int peso= 0;
			for(int i = 0; i < pesos.length; i++) {
				soma += this.pesos[i];
			}
			for(int i = 0; i < this.notas.length; i++) {
				soma += notas[i] * pesos[i];
			}
			this.media = soma / peso; 
			
		
		}
	}
	
	public boolean aprovado() {
		if(this.media >= 7.0) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		media();
		String notas="[";
		for(int i = 0; i < this.notas.length; i++) {
			notas += this.notas[i];
			if(i < this.notas.length - 1) {
				notas += ", ";
			}else {
				notas += "]";
			}
		}
		return (nome + " " + horasEstudadas + " " + media + " " + notas);
	}
	
}
