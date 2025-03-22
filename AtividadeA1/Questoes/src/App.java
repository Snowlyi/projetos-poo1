import dominio.Questao02.Questao02;
import dominio.Questao03.Questao03;
import dominio.Questao04.Questao04;
import dominio.Questao05.Questao05;
import dominio.BaseQuestoes;
import dominio.Questao01.Questao01;

public class App {
    public static void main(String[] args) throws Exception {
        BaseQuestoes ex01 = new Questao01();
        //ex01.Executar();
        BaseQuestoes ex02 = new Questao02();
        //ex02.Executar();
        BaseQuestoes ex03 = new Questao03();
        ex03.Executar();
        //BaseQuestoes ex04 = new Questao04();
        //ex04.Executar();
        //BaseQuestoes ex05 = new Questao05();
        //ex05.Executar();   
    
    }
}