package dominio.Questao08;

import dominio.BaseQuestoes;

public class Questao08 extends BaseQuestoes{
    Long valorFabrica, valorFinal;
    String adicionaisCarro;
    
    public Long getValorFabrica() {
        return valorFabrica;
    }


    public void setValorFabrica(Long valorFabrica) {
        this.valorFabrica = valorFabrica;
    }


    public Long getValorFinal() {
        return valorFinal;
    }


    public void setValorFinal(Long valorFinal) {
        this.valorFinal = valorFinal;
    }


    public String getAdicionaisCarro() {
        return adicionaisCarro;
    }


    public void setAdicionaisCarro(String adicionaisCarro) {
        this.adicionaisCarro = adicionaisCarro;
    }

    public void Executar() {
        Long i ;
        System.out.println("----- Questão 8 - Calcular valor final do carro -----");
        System.out.println("");
        System.out.println("Insira o valor de fábrica do carro: ");
        valorFabrica = scanear.nextLong();
        valorFinal = valorFabrica;
        System.out.println("Caso deseje adicionar algo no seu carro, digite 1, caso contrário, digite 0");
        i = scanear.nextLong();
        while (adicionaisCarro != "0") {
            if (i == 1) {
                System.out.println("-------------------------------------------");
                System.out.println("As opções disponíveis como adicionais são;");
                System.out.println("A -> Ar condicionado");
                System.out.println("B -> Pintura metálica");
                System.out.println("C -> Vidro elétrico");
                System.out.println("D -> Direção hidráulica");
                System.out.println("-------------------------------------------");
                System.out.println("Digite a opção que deseja adicionar: ");
                adicionaisCarro = scanear.next();
                switch (adicionaisCarro) {
                    case "a":
                        valorFinal = valorFinal + 1750;
                    break;
                    case "b":
                        valorFinal = valorFinal + 800;
                    break;
                    case "c":
                        valorFinal = valorFinal + 1200;
                    break;
                    case "d":
                        valorFinal = valorFinal + 2000;
                    break;
            }
            System.out.println("Caso deseje adicionar algo mais, digite 1, e caso não queira adicionar mais nada, digite 0: ");
            i = scanear.nextLong();
            }
            else {
                break;
            }
        }
        System.out.println("O valor total ficou em R$ " + valorFinal);
    }

}
