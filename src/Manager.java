public class Manager extends Dipendente{

    private double bonus;

    public Manager(String nome, String cognome, double salario, double bonus) {
        super(nome, cognome, salario);
        this.bonus = bonus;
    }

    @Override
    public double getSalario() {
       //double risultato = bonus + getSalario();
        return bonus + super.getSalario();
    }

}
