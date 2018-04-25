import javax.faces.bean.ManagedBean;

@ManagedBean
public class formBean {
    
private String nome = "Vazio";
private String email = "Vazio";
private String telefone = "Vazio";
private String mensagem = "Vazio";
private String resultado = "Insira os dados!";

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void cadastra()
    {
        this.resultado = "Mensagem: "+this.mensagem+" enviada!";
    }
    
    public void limpar()
    {
        this.nome = "";
        this.telefone = " ";
        this.mensagem = "";
        this.email = "";
        this.resultado = "Formulario Limpo!";

    }
}