package sptech.projeto02;

public class Pais {
    private String nome;
    private int medalhaOuro;
    private int medalhaPrata;
    private int medalhaBronze;

    public Pais() {
    }

    public Pais(String nome, int medalhaOuro, int medalhaPrata, int medalhaBronze) {
        this.nome = nome;
        this.medalhaOuro = medalhaOuro;
        this.medalhaPrata = medalhaPrata;
        this.medalhaBronze = medalhaBronze;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMedalhaOuro() {
        return medalhaOuro;
    }

    public void setMedalhaOuro(Integer medalhaOuro) {
        this.medalhaOuro = medalhaOuro;
    }

    public Integer getMedalhaPrata() {
        return medalhaPrata;
    }

    public void setMedalhaPrata(Integer medalhaPrata) {
        this.medalhaPrata = medalhaPrata;
    }

    public Integer getMedalhaBronze() {
        return medalhaBronze;
    }

    public void setMedalhaBronze(Integer medalhaBronze) {
        this.medalhaBronze = medalhaBronze;
    }

    public int getTotalMedalhas(){
        return (this.medalhaBronze + this.medalhaPrata + this.medalhaOuro);
    }
}
