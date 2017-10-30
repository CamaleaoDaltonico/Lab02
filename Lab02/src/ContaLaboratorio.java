/**
 * Representação de uma conta em um laboratório da UFCG, do curso de ciência da computação.
 * O laboratório é identificado pelo seu nome e tem um limite máximo de armazenamento de dados para cada aluno registrado (2 GB)
 * @author Gabriel Barros
 *
 */
public class ContaLaboratorio {

	private String nome; // Nome do laboratório
	private int espacoOcupado; // Espaço ocupado pelo aluno 
	private int cota; // Espaço máximo que o aluno pode ocupar
	
	/**
	 * Constrói um laboratório a aprtir de seu nome
	 * A cota é padronizada em 2 GB ou aproximadamente 2000 MB
	 * O espaço consumido sempre começa em 0
	 * @param nome
	 */
	public ContaLaboratorio(String nome){
		 this.nome = nome;
		 this.cota = 2000;
		 this.espacoOcupado = 0;
	}
	
	public ContaLaboratorio(String nome, int cota){
		 this.nome = nome;
		 this.cota = cota;
		 this.espacoOcupado = 0;
	}
	
	/**
	 * Consome dados do armazenamento do laboratório 
	 * @param mbytes espaço consumido
	 */
	public void consomeEspaco(int mbytes) {
		this.espacoOcupado += mbytes;		
	}
	
	/**
	 * Libera dados do armazenamento do laboratório 
	 * @param mbytes espaço liberado
	 */
	public void liberaEspaco(int mbytes) {
		this.espacoOcupado -= mbytes;
	}
	
	/**
	 * Retorna o estado do armazenamento da conta do laboratório, informando se o limite foi alcançado ou não.
	 * @return O estado do armazenamento
	 */
	public boolean atingiuCota() {
		if(espacoOcupado >= cota) {
			return true;
		}
		return false;
	}
	
	/**
	 * Retorna a String que representa a conta do laboratório
	 * Seguindo o padrão NOME ESPAÇO OCUPADO/COTA
	 * @return a representação em String de uma Conta de Laboratório
	 */
	public String toString() {
		return (nome + " " + espacoOcupado + "/" + cota);
	}
}
