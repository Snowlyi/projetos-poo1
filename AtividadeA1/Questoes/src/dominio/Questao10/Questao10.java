package dominio.Questao10;

import dominio.BaseQuestoes;

public class Questao10 extends BaseQuestoes{
    long dependentes;
    double impostoRenda,salario;
    
    public void Executar(){
        System.out.println("----- Questão 10 - Cálculo imposto de renda ------");
        System.out.println("");
        System.out.println("Digite o número de dependentes:");
        dependentes = scanear.nextLong();
        System.out.println("Digite o seu salário:");
        salario = scanear.nextDouble();
        calculo(impostoRenda, salario);
        scanear.close();
}
    public void calculo(double impostoRenda, double salario) {
        if (salario >= 18108) {
            impostoRenda=salario*0.20;
            impostoRenda=impostoRenda*1.04;
            System.out.println("seu impostoRenda bruto é de R$ " + impostoRenda);
        }
        else if(salario > 7545 && salario <= 18108){
            impostoRenda=salario*0.08;
            impostoRenda=impostoRenda*1.04;
            System.out.println("Seu impostoRenda bruto é de R$ " + impostoRenda);
        }
        else {
            System.out.println("Voçê não precisa pagar imposto de renda");
        }
    }

    public long getDependetes() {
        return dependentes;
    }

    public void setDependetes(long dependetes) {
        this.dependentes = dependetes;
    }

    public double getimpostoRenda() {
        return impostoRenda;
    }

    public void setimpostoRenda(double impostoRenda) {
        this.impostoRenda = impostoRenda;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}    
