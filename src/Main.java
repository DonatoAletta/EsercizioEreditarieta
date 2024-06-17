/*
Dato un dipendente, nome, cognome, salario
creare 2 sottoclassi, manager e lavoratoreorario dove manager ha un campo bonus mentre lavoratore ha due campi: ore lavorate e salario ora
 */

public class Main {
    public static void main(String[] args) {

        Dipendente manager = new Manager("Mario", "Rossi", 1200, 800);
        Dipendente lavoratoreOrario = new LavoratoreOrario("Mario","Rossi", 8, 10);

        Dipendente[] dipendenti = new Dipendente[2];

        dipendenti[0] = manager;
        dipendenti[1] = lavoratoreOrario;

        for(int i = 0; i < dipendenti.length; i++){
            System.out.println(dipendenti[i].getCognome() + " " + dipendenti[i].getNome() + " "+ dipendenti[i].getSalario());
        }
    }
}