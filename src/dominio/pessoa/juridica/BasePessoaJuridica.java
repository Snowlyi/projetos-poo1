package dominio.pessoa.juridica;

import java.time.LocalDate;

import dominio.pessoa.BasePessoa;

public abstract class BasePessoaJuridica extends BasePessoa {
    protected String cnpj;
    protected String incricaoEstadual;
    protected LocalDate dataInicioVinculo;
    protected LocalDate dataFinalVinculo;

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getIncricaoEstadual() {
        return incricaoEstadual;
    }
    public void setIncricaoEstadual(String incricaoEstadual) {
        this.incricaoEstadual = incricaoEstadual;
    }
    public LocalDate getDataInicioVinculo() {
        return dataInicioVinculo;
    }
    public void setDataInicioVinculo(LocalDate dataInicioVinculo) {
        this.dataInicioVinculo = dataInicioVinculo;
    }
    public LocalDate getDataFinalVinculo() {
        return dataFinalVinculo;
    }
    public void setDataFinalVinculo(LocalDate dataFinalVinculo) {
        this.dataFinalVinculo = dataFinalVinculo;
    }
    public BasePessoaJuridica(long codigo, LocalDate dataDeInclusao, LocalDate dataDeAlteracao, String nome,
            String telefone, String email, String cnpj, String incricaoEstadual,
            LocalDate dataInicioVinculo, LocalDate dataFinalVinculo) {
        super(codigo, dataDeInclusao, dataDeAlteracao, nome, telefone, email);
        this.cnpj = cnpj;
        this.incricaoEstadual = incricaoEstadual;
        this.dataInicioVinculo = dataInicioVinculo;
        this.dataFinalVinculo = dataFinalVinculo;
    }
}
