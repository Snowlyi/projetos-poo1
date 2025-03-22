package dominio.Questao01;
import dominio.BaseQuestoes;

public class Questao01 extends BaseQuestoes { 
    
    private Long num1, num2;

    public Long getNum1() {
            return num1;
        }

        public void setNum1(Long num1) {
            this.num1 = num1;
        }

        public Long getNum2() {
            return num2;
        }

        public void setNum2(Long num2) {
            this.num2 = num2;
        }

    public void Executar() {
        System.out.println("----- Questão 1 - Comparar os dois valores -----");
        System.out.println("Digite um valor inteiro: ");
        num1 = scanear.nextLong();
        System.out.println("Digite outro valor inteiro: ");
        num2 = scanear.nextLong();
        System.out.println("------------------------------------------------");
        compararNumeros(num1, num2);
        System.out.println("------------------------------------------------");
        System.out.println("");
    }

    public void compararNumeros(Long x, Long y) {
        if (x > y) {
            System.out.println(x + " é maior que " + y);
        }
        else if (x == y) {
            System.out.println(x + " é igual à " + y);
        }
        else {
            System.out.println(y + " é maior que " + x);
        }

    }
}
