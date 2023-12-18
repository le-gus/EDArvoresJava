package ABB;

public class No {


    private int elemento;
    private No esquerdo;
    private No direito;


    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public No getDireito() {
        return direito;
    }

    public void setDireito(No direito) {
        this.direito = direito;
    }

    public No(int elemento, No direito, No esquerdo) {
        this.elemento = elemento;
        this.esquerdo = esquerdo;
        this.direito = direito;
    }
    public No getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;
    }
    public boolean ehFolha() {return (direito == null && esquerdo == null);}
}
