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
        scanear.close();
    }

    public void compararNumeros(Long num1, Long num2) {
        if (num1 > num2) {
            System.out.println(num1 + " é maior que " + num2);
        }
        else if (num1 == num2) {
            System.out.println(num1 + " é igual à " + num2);
        }
        else {
            System.out.println(num2 + " é maior que " + num1);
        }

    }
}
