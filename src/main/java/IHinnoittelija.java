

public interface IHinnoittelija {
	public abstract float getAlennusProsentti(Asiakas asiakas, Tuote tuote);
	public void setAlennusProsentti(Asiakas asiakas, float tuote);

	public void aloita();

	public void lopeta();
}
