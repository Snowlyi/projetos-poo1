package dominio.pessoa;

import java.time.LocalDate;

public class Passageiro extends BasePessoa {
    private String documentoPessoal;
    private String numeroDeCartao;
    
    public String getDocumentoPessoal() {
        return documentoPessoal;
    }
    public void setDocumentoPessoal(String documentoPessoal) {
        this.documentoPessoal = documentoPessoal;
    }
    public String getNumeroDeCartao() {
        return numeroDeCartao;
    }
    public void setNumeroDeCartao(String numeroDeCartao) {
        this.numeroDeCartao = numeroDeCartao;
    }

    public Passageiro(long codigo, LocalDate dataDeInclusao, LocalDate dataDeAlteracao, String nome, String telefone,
            String email, String documentoPessoal, String numeroDeCartao) {
        super(codigo, dataDeInclusao, dataDeAlteracao, nome, telefone, email);
        this.documentoPessoal = documentoPessoal;
        this.numeroDeCartao = numeroDeCartao;
    }
    @Override
    public String toString() {
        return "Passageiro \n\n \n [Código= " + codigo + "\nDocumento Pessoal= " + documentoPessoal + " \nData De Inclusão= "
                + dataDeInclusao + " \nNúmero De Cartão= " + numeroDeCartao + "\nNome= " + nome + "\nData De Alteracão= "
                + dataDeAlteracao + "\nTelefone= " + telefone + "\nEmail= " + email + "]";
    }

}
