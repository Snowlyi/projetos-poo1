package dominio.Questao02;

import dominio.BaseQuestoes;

public class Questao02 extends BaseQuestoes{
    private Long base1, altura1, area1, base2, altura2, area2;

    public Long getBase1() {
        return base1;
    }

    public void setBase1(Long base1) {
        this.base1 = base1;
    }

    public Long getAltura1() {
        return altura1;
    }

    public void setAltura1(Long altura1) {
        this.altura1 = altura1;
    }

    public Long getArea1() {
        return area1;
    }

    public void setArea1(Long area1) {
        this.area1 = area1;
    }
    public Long getBase2() {
        return base2;
    }

    public void setBaseB(Long base2) {
        this.base2 = base2;
    }

    public Long getAltura2() {
        return altura2;
    }

    public void setAltura2(Long altura2) {
        this.altura2 = altura2;
    }
    public Long getArea2() {
        return area2;
    }

    public void setArea2(Long area2) {
        this.area2 = area2;
    }
    
    public void Executar() {
        System.out.println("----- Questão 2 - Comparar a área de dois retângulos -----");
        System.out.println("Insira a base e a altura do primeiro retângulo, em centímetros, respectivamente: ");
        base1 = scanear.nextLong();
        altura1 = scanear.nextLong();
        System.out.println("Insira a base e a altura do segundo retângulo, em centímetros, respectivamente: ");
        base2 = scanear.nextLong();
        altura2 = scanear.nextLong();
        System.out.println("-----------------------------------------------------------");
        area1 = calcularArea(base1, altura1);
        area2 = calcularArea(base2, altura2);

            if (area1 == area2) {
                System.out.println("As duas áreas são iguais");
            } 
            else if (area1 > area2) {
                System.out.println("A área do primeiro retângulo é maior, com " + (area1 - area2) + "cm de diferença"); 
            }
            else {System.out.println("A área do segundo retãngulo é maior, com " + (area2 - area1) + "cm de diferença");
            }
        System.out.println("-----------------------------------------------------------");
        System.out.println("");
    }

    public Long calcularArea(Long x, Long y) {
        return x * y;
    }
}
