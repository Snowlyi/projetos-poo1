package dominio.Questao09;

import dominio.BaseQuestoes;


public class Questao09 extends BaseQuestoes {       
    Double valorConta, consumoMetroCubico;
    String nomeCliente, tipoCliente;
    
    public Double getValorConta() {
        return valorConta;
    }

    public void setValorConta(Double valorConta) {
        this.valorConta = valorConta;
    }

    public Double getConsumoMetroCubico() {
        return consumoMetroCubico;
    }

    public void setConsumoMetroCubico(Double consumoMetroCubico) {
        this.consumoMetroCubico = consumoMetroCubico;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
public void Executar() {
    System.out.println("----- Questão 9 - Calcular conta de água -----");
    System.out.println("");
    System.out.println("Insira os dados do cliente: ");
    System.out.println("----------------------------------------------");
    System.out.println("Insira o nome do cliente: ");
    nomeCliente = scanear.next();
    System.out.println("Insira o valor do consumo em m3");
    consumoMetroCubico = scanear.nextDouble();
    System.out.println("Insira o tipo do cliente (Residencial, comercial ou industrial)");
    tipoCliente = scanear.next();
    valorConta = calculoContaAgua(consumoMetroCubico, tipoCliente);
    System.out.println("Nome: " + nomeCliente + "\nValor da conta: " + valorConta + "Tipo de cliente" + tipoCliente);

}

public Double calculoContaAgua(Double x, String z) {
    switch (z) {
        case "residencial":
            System.out.println("caso1");
            return (x + 5) + (x * 0.05);
        case "comercial":
            System.out.println("caso2");
            if (x < 80D) {
               return 500D;
            } 
            else {
                return 500D + (x * 0.04D);
            }
        case "industrial":
            System.out.println("caso3");
            if (x < 100D) {
                return 800D;
            } 
            else {
                return 800D + (x * 0.04D);
            }
        default:
            System.out.println("Tipo de cliente inválido");
            return null;
}
}


}
