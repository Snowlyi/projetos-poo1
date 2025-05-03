package fakedb;

import java.time.LocalDate;

import dominio.pessoa.Passageiro;

public class PassageiroFakeDB extends BaseFakeDB<Passageiro> {

    @Override
    protected void preencherDados() {
        this.instancia.add(new Passageiro(1, LocalDate.now(), null, "Lucas", "123456", "lucasteste@gmail.com", "321", "741"));
        this.instancia.add(new Passageiro(2, LocalDate.now(), null, "Carlos", "123456", "lucasteste@gmail.com", "321", "741"));
        this.instancia.add(new Passageiro(3, LocalDate.now(), null, "João", "123456", "lucasteste@gmail.com", "321", "741"));
        this.instancia.add(new Passageiro(4, LocalDate.now(), null, "Marcos", "123456", "lucasteste@gmail.com", "321", "741"));
        this.instancia.add(new Passageiro(5, LocalDate.now(), null, "Janaína", "123456", "lucasteste@gmail.com", "321", "741"));
        this.instancia.add(new Passageiro(6, LocalDate.now(), null, "Júlia", "123456", "lucasteste@gmail.com", "321", "741"));
    }
        public PassageiroFakeDB(){
            super();
        }    
}
