package ABB;

public class ArvoreBinariaBusca {
    private No raiz;

    public ArvoreBinariaBusca() { raiz = null;}

    public No getRaiz(){
        return raiz;
    }

    public void setRaiz(No raiz){
        this.raiz = raiz;
    }

    public  boolean ehVazia(){
        return raiz == null;
    }

    public int pegaQuantidadeNosDosSubnos( No noReferencia){
        if (noReferencia == null){
            return 0;
        } else {
            return pegaQuantidadeNosDosSubnos(noReferencia.getEsquerdo()) + 1
                    + pegaQuantidadeNosDosSubnos(noReferencia.getDireito());
        }
    }

    public int pegaQuantididadeNosArvore() { return pegaQuantidadeNosDosSubnos(this.raiz);}

    public int pegaAlturaNo (No noReferencia){
        if (ehVazia()){
            return 0;
        }
        else {
            return pegaQuantidadeNosDosSubnos(noReferencia) - 1;
        }
    }
    public int pegaAlturaArvore(){return pegaAlturaNo(raiz);}

    public void imprimirPreOrder(No noReferencia) {
        if (noReferencia == null){
            return;
        }
        System.out.println(noReferencia.getElemento());
        imprimirPreOrder(noReferencia.getEsquerdo());
        imprimirPreOrder(noReferencia.getDireito());


    }
    public void imprimirPreOrder(){
        imprimirPreOrder(raiz);
    }

    public void imprimirInOrder(No noReferencia) {
        if (noReferencia == null){
            return;
        }
        imprimirInOrder(noReferencia.getEsquerdo());
        System.out.println(noReferencia.getElemento());
        imprimirInOrder(noReferencia.getDireito());


    }
    public void imprimirInOrder(){
        imprimirInOrder(raiz);
    }

    public void imprimirPosOrder(No noReferencia) {
        if (noReferencia == null){
            return;
        }
        imprimirPosOrder(noReferencia.getEsquerdo());
        imprimirPosOrder(noReferencia.getDireito());
        System.out.println(noReferencia.getElemento());

    }
    public void imprimirPosOrder(){
        imprimirInOrder(raiz);
    }
}
