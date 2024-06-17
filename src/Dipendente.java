public class Dipendente {

    private String nome;
    private String cognome;
    private double salario;

    public Dipendente(String nome, String cognome, double salario) {
        this.nome = nome;
        this.cognome = cognome;
        this.salario = salario;
    }

    public Dipendente(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
