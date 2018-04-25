
import javax.faces.bean.ManagedBean;

@ManagedBean
public class IMCBean {

    private float peso = 0;
    private float altura = 0;
    private float IMC = 0;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getIMC() {
        return IMC;
    }

    public void setIMC(float IMC) {
        this.IMC = IMC;
    }

    public void calcular() {
        this.IMC = this.peso/(this.altura*this.altura);
    }
    
    public void limpar() {
        this.peso = 0;
        this.altura = 0;
        this.IMC = 0;
    }
}
