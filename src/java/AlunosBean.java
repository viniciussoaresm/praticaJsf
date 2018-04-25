import javax.faces.bean.ManagedBean;

@ManagedBean
public class AlunosBean {
    
private String nome = "Vazio";
private String endereco = "Vazio";
private String telefone = "Vazio";
private String numero = "Vazio";
private String cidade = "Vazio";
private String resultado = "Insira os dados!";

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public void cadastraAluno()
    {
        this.resultado = "Aluno "+this.nome+" Cadastrado!";
    }
    
    public void limparAluno()
    {
        this.nome = "";
        this.cidade = "";
        this.endereco = "";
        this.numero = "";
        this.telefone = " ";
        this.resultado = "Formulario Limpo!";

    }
}