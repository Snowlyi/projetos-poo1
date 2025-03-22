package dominio.Questao05;

import dominio.BaseQuestoes;

public class Questao05 extends BaseQuestoes{
    Long qtdMorangos, qtdMacas;

    public Long getQtdMorangos() {
        return qtdMorangos;
    }

    public void setQtdMorangos(Long qtdMorangos) {
        this.qtdMorangos = qtdMorangos;
    }

    public Long getQtdMacas() {
        return qtdMacas;
    }

    public void setQtdMacas(Long qtdMacas) {
        this.qtdMacas = qtdMacas;
    }
    
    public void Executar() {
        System.out.println("----- Questão 5 - Calculadora de preços para frutaria -----");
        System.out.println("");
        System.out.println("Insira a quantidade, em KG, de morangos: ");
        qtdMorangos = scanear.nextLong();
        System.out.println("Insira a quantidade, em KG, de maçãs: ");
        qtdMacas = scanear.nextLong();
        System.out.println("-------------------------------------");
        calcValor(qtdMorangos, qtdMacas);
        System.out.println("-------------------------------------");
        System.out.println("");
    }

    public void calcValor(Long x, Long y) {
        Double valorTotal, pesoMorang, pesoMaca;
        if (qtdMorangos > 5) {
            pesoMorang = 5.3;
        }
        else {
            pesoMorang = 7.5;
        }
        if (qtdMacas > 5) {
            pesoMaca = 2.8;
        } 
        else {
            pesoMaca = 3.5;
        }
        valorTotal = (qtdMorangos * pesoMorang) + (qtdMacas * pesoMaca);
        if (qtdMorangos + qtdMacas < 5 && valorTotal > 19) {
            Double valorDesc = valorTotal - (valorTotal * 0.08);
            System.out.println("O valor final da compra é R$ " + valorDesc);
        } 
        else {
            System.out.println("O valor final da compra é R$ " + valorTotal);
        }
    }
    
}
