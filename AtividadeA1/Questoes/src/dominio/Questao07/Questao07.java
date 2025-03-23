package dominio.Questao07;

import dominio.BaseQuestoes;

public class Questao07 extends BaseQuestoes{
    Double valorTotal, valorPagamento, qtdParcelas;
    String formaPagamento; 

    public Double getValorTotal() {
        return valorTotal;
    }


    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }


    public Double getValorPagamento() {
        return valorPagamento;
    }


    public void setValorPagamento(Double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }


    public Double getQtdParcelas() {
        return qtdParcelas;
    }


    public void setQtdParcelas(Double qtdParcelas) {
        this.qtdParcelas = qtdParcelas;
    }


    public String getFormaPagamento() {
        return formaPagamento;
    }


    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    public void Executar() {
        System.out.println("----- Questão 7 - Formas de pagamento -----");
        System.out.println("");
        System.out.println("Insira o valor total gasto pelo cliente; ");
        valorTotal = scanear.nextDouble();
        System.out.println("");
        opcoesPagamento(formaPagamento);
        formaPagamento = scanear.nextLine();
        switch (formaPagamento) {
            case "a":
                pagamentoVista(valorTotal);
                System.out.println("O valor da compra será de R$ " + valorPagamento);
            break;
            case "b":
            parcelamentoDuasVezes(valorTotal);
                valorPagamento = valorTotal/2;
                System.out.println("O valor das parcelas será de R$ " + valorPagamento);
            break;
            case "c":
                if (valorTotal >= 100) {
                    System.out.println("Insira em quantas parcelas deseja pagar: ");
                    qtdParcelas = scanear.nextDouble();
                    if (qtdParcelas < 3 || qtdParcelas > 10) {
                        System.out.println("Quantidade de parcelas inválida, insira um valor entre 3 e 10");
                        qtdParcelas = scanear.nextDouble();
                    } else {
                        parcelamentoTresOuMais(valorTotal, qtdParcelas);
                        System.out.println("O valor das parcelas será de R$ " + valorPagamento);
                    }
                }
                System.out.println("O valor total não pode ser parcelado em mais de duas parcelas (menos que R$100,00)");
            break;
            default:
                System.out.println("Opção inválida");
            break;
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("");
    }


    public String opcoesPagamento(String x) {
        System.out.println("------------- Selecione o método de pagamento -------------");
        System.out.println("Opção A -> Pagamento à vista, com 10% de desconto");
        System.out.println("Opção B -> Parcelado em duas vezes sem juros");
        System.out.println("Opção C -> Parcelado de 3 à 10 vezes, com 3% de juro ao mês");
        return scanear.nextLine();
    }

    public Double pagamentoVista(Double x) {
        return valorPagamento = valorTotal - (valorTotal * 0.1);
    }

    public Double parcelamentoDuasVezes(Double x) {
        return valorPagamento = valorTotal/2;
    }

    public Double parcelamentoTresOuMais(Double x, Double y) {
        Double juros;
        juros = (x * 0.3);
       return valorPagamento = (x / y) + juros;
    }
}

