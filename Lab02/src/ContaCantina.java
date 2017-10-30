
public class ContaCantina {
	private String nome;
	private int debito;
	private int itensConsumidos;
	private String[] detalhes;
	
	public ContaCantina(String nome){
		this.nome = nome;
		this.debito = 0;
		this.itensConsumidos = 0;
		this.detalhes = new String[5];
	}
	
	public void cadastrarLanche(int quantidade, int valor){
		this.debito += valor;
		this.itensConsumidos += quantidade;
	}
	
	public void cadastrarLanche(int quantidade, int valor, String detalhes){
		this.debito += valor;
		this.itensConsumidos += quantidade;
		for(int i = this.detalhes.length - 1; i > 0; i--){
			this.detalhes[i] = this.detalhes[i - 1];
		}
		this.detalhes[0] = detalhes;
	}
	
	public String listarDetalhes() {
		String detalhes = "";
		for(int i = 0; i < this.detalhes.length; i++){
			detalhes += this.detalhes[i] + ";";
		}
		return detalhes;
	}
	
	public void pagarConta(int valor){
		this.debito -= valor;
	}
	
	public String toString(){
		return (nome + " " + itensConsumidos + " " + debito);
	}
	
}
