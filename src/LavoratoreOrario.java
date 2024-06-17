public class LavoratoreOrario extends Dipendente{

    private int oreLavorate;
    private double salarioOrario;

    public LavoratoreOrario(String nome, String cognome, int oreLavorate, double salarioOrario) {
        super(nome, cognome);
        this.oreLavorate = oreLavorate;
        this.salarioOrario = salarioOrario;
    }

    @Override
    public double getSalario() {
        //double risultato = oreLavorate * salarioOrario;
        return oreLavorate * salarioOrario;
    }
}
