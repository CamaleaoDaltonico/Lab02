/**
 * Representa��o de uma conta em um laborat�rio da UFCG, do curso de ci�ncia da computa��o.
 * O laborat�rio � identificado pelo seu nome e tem um limite m�ximo de armazenamento de dados para cada aluno registrado (2 GB)
 * @author Gabriel Barros
 *
 */
public class ContaLaboratorio {

	private String nome; // Nome do laborat�rio
	private int espacoOcupado; // Espa�o ocupado pelo aluno 
	private int cota; // Espa�o m�ximo que o aluno pode ocupar
	
	/**
	 * Constr�i um laborat�rio a aprtir de seu nome
	 * A cota � padronizada em 2 GB ou aproximadamente 2000 MB
	 * O espa�o consumido sempre come�a em 0
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
	 * Consome dados do armazenamento do laborat�rio 
	 * @param mbytes espa�o consumido
	 */
	public void consomeEspaco(int mbytes) {
		this.espacoOcupado += mbytes;		
	}
	
	/**
	 * Libera dados do armazenamento do laborat�rio 
	 * @param mbytes espa�o liberado
	 */
	public void liberaEspaco(int mbytes) {
		this.espacoOcupado -= mbytes;
	}
	
	/**
	 * Retorna o estado do armazenamento da conta do laborat�rio, informando se o limite foi alcan�ado ou n�o.
	 * @return O estado do armazenamento
	 */
	public boolean atingiuCota() {
		if(espacoOcupado >= cota) {
			return true;
		}
		return false;
	}
	
	/**
	 * Retorna a String que representa a conta do laborat�rio
	 * Seguindo o padr�o NOME ESPA�O OCUPADO/COTA
	 * @return a representa��o em String de uma Conta de Laborat�rio
	 */
	public String toString() {
		return (nome + " " + espacoOcupado + "/" + cota);
	}
}
