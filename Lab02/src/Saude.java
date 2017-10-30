
public class Saude {
	private int saudeFisica;
	private int saudeMental;
	private String emoji;
	
	
	public Saude() {
		this.saudeFisica = 1;
		this.saudeMental = 1;
		this.emoji = null;
	}
	
	public void definirEmoji(String emoji) {
		this.emoji = emoji;
	}
	
	public void definirSaudeFisica(String valor){
		switch(valor.toLowerCase()) {
			case "boa":
				this.saudeFisica = 1;
				break;
			case "fraca":
				this.saudeFisica = 0;
				break;
		}
		this.emoji = null;
	}
	
	public void definirSaudeMental(String valor){
		switch(valor.toLowerCase()) {
			case "boa":
				this.saudeMental = 1;
				break;
			case "fraca":
				this.saudeMental = 0;
				break;
			}
		this.emoji = null;
		
	}
	
	public String geral() {
		int geral = this.saudeFisica + this.saudeMental;
		String estado = ""; 
		switch(geral) {
		
			case 2:
				estado = "boa";
			case 1:
				estado = "ok";
			case 0:
				estado = "fraca";
		}
		if (emoji != null) {
			estado += " " + this.emoji;
		}
		return estado;
		
	}
}
