import dominio.BaseQuestoes;
import dominio.Questao01.Questao01;
import dominio.Questao02.Questao02;
import dominio.Questao03.Questao03;
import dominio.Questao04.Questao04;
import dominio.Questao05.Questao05;
import dominio.Questao06.Questao06;
import dominio.Questao07.Questao07;
import dominio.Questao08.Questao08;
import dominio.Questao09.Questao09;
import dominio.Questao10.Questao10;

public class App {
    public static void main(String[] args) throws Exception {
        BaseQuestoes ex01 = new Questao01();
        ex01.Executar();
        BaseQuestoes ex02 = new Questao02();
        ex02.Executar();
        BaseQuestoes ex03 = new Questao03();
        ex03.Executar();
        BaseQuestoes ex04 = new Questao04();
        ex04.Executar();
        BaseQuestoes ex05 = new Questao05();
        ex05.Executar();
        BaseQuestoes ex06 = new Questao06();
        ex06.Executar();
        BaseQuestoes ex07 = new Questao07();
        ex07.Executar();
        BaseQuestoes ex08 = new Questao08();
        ex08.Executar();
        BaseQuestoes ex09 = new Questao09();
        ex09.Executar();
        BaseQuestoes ex10 = new Questao10();
        ex10.Executar();    
    }
}