package dao;

public class Articolo {

	 private String codice;
	 private String descrizione;
	 private int quantita;

	public String getDescrizione() { 
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public int getQuantita() {
		return quantita;
	}
	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
}
