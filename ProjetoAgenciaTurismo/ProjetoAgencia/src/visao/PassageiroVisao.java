package visao;

import java.util.ArrayList;
import java.util.Scanner;

import dominio.pessoa.Passageiro;
import servico.PassageiroServico;

public class PassageiroVisao extends BaseVisao{
    
    private PassageiroServico serv;

    public PassageiroVisao(){
        this.serv = new PassageiroServico();
    }

    @Override
    public void carregar() {
               padraoMenu menu = new padraoMenu();
        Scanner sc = new Scanner(System.in);
        while  (true) {
            int op = menu.executar(sc);
            switch (op) {
                case 1:
                    this.listar();
                    break;
                case 2:
                    this.exibir();
                    break;
                case 3:
                    this.incluir();
                    break;
                case 4:
                    this.alterar();
                    break;
                case 5:
                    this.excluir();
                    break;
                case 9:
                    return;
                default:
                    break;
            }
        }
    }

    @Override
    protected void listar() {
        System.out.println("------------------------------------");
        System.out.println("------- Listagem Passageiros -------");
        System.out.println("------------------------------------");
        System.out.println("");
        ArrayList<Passageiro> lista = this.serv.navegar();
        for (Passageiro ps : lista) {
            System.out.println("------------------------------------");
            System.out.println("Codigo: " + ps.getCodigo());
            System.out.println("Nome: " + ps.getCodigo());
            System.out.println("Email: " + ps.getEmail());
        }
        System.err.println("------------------------------------");
    }

    @Override
    protected void exibir() {
        System.out.println("Voçê escolheu exibir");
    }

    @Override
    protected void incluir() {
        System.out.println("Voçê escolheu incluir");
    }

    @Override
    protected void alterar() {
        System.out.println("Voçê escolheu alterar");
    }

    @Override
    protected void excluir() {
        System.out.println("Voçê escolheu excluir");
    }
}
