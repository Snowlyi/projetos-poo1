package dominio.Questao04;

import dominio.BaseQuestoes;

public class Questao04 extends BaseQuestoes{
    Long alunos, alunas;

    public Long getAlunos() {
        return alunos;
    }

    public void setAlunos(Long alunos) {
        this.alunos = alunos;
    }

    public Long getAlunas() {
        return alunas;
    }

    public void setAlunas(Long alunas) {
        this.alunas = alunas;
    }
    
    public void Executar() {
        System.out.println("----- Questão 4 - Comparar quantidade de alunos e alunas -----");
        System.out.println("");
        System.out.println("Insira a quantidade estudantes na sala;");
        System.out.println("Alunas: ");
        alunas = scanear.nextLong();
        System.out.println("Alunos: ");
        alunos = scanear.nextLong();
        System.out.println("----------------------------------");
        if (alunas - alunos > 0 || alunas == alunos) {
            //sala tem mais alunas ou a mesma quantidade
            System.out.println("A sala tem " + alunas + " alunas e " + alunos + " alunos");
        } 
        else if (alunas - alunos < 0) {
            //sala tem mais alunos
            System.out.println("A sala tem " + alunos + " alunos e " + alunas + " alunas");
        }
        System.out.println("----------------------------------");
        System.out.println("");
    }
}
