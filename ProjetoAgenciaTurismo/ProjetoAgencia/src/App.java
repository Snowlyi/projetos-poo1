import java.time.LocalDate;

import dominio.pessoa.Passageiro;

public class App {
    public static void main(String[] args) throws Exception {
        Passageiro p1 = new Passageiro(1, LocalDate.now(), null, "Carlos", "90028922", "carlosfoda@gmail.com", "123.654.987-01", "321654987"); System.out.println(p1.toString());
    }
}
