package repositorio;

import dominio.pessoa.juridica.AgenteDeTurismo;
import fakedb.AgenteDeTurismoFakeDB;

public class AgenteDeTurismoRepositorio extends BaseRepositorio<AgenteDeTurismo>{
    
    private AgenteDeTurismoFakeDB fakeDB;

    public AgenteDeTurismoRepositorio(){
        this.fakeDB = new AgenteDeTurismoFakeDB();
        this.baseDeDados = this.fakeDB;

    }

    @Override
    public AgenteDeTurismo create(AgenteDeTurismo instancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public AgenteDeTurismo read(Long codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public AgenteDeTurismo update(AgenteDeTurismo instancia) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public AgenteDeTurismo delete(Long codigo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
}
