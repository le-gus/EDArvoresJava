package ABB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArvoreBinariaBuscaTest {

    @Test
    void testRetonarQuantidadeNosArvoreVazia() {

        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

        assertTrue(arvore.ehVazia());
        assertEquals(0, arvore.pegaQuantididadeNosArvore());

    }

    @Test
    void testRetonarQuantidadeNosArvoreComElementos() {

        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

        No no7 = new No(7, null, null);
        No no6 = new No(6, no7, null);
        No no2 = new No(2, null, null);
        No no5 = new No(5, no6, no2);
        No no10 = new No(10, null, null);
        No no9 = new No(9, no10, no5);

        arvore.setRaiz(no9);

        assertFalse(arvore.ehVazia());
        assertEquals(6, arvore.pegaQuantididadeNosArvore());

    }

    @Test
    void testRetonarQuantidadeNosSubNosComFilhoDireito() {

        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

        No no7 = new No(7, null, null);
        No no6 = new No(6, no7, null);
        No no2 = new No(2, null, null);
        No no5 = new No(5, no6, no2);
        No no10 = new No(10, null, null);
        No no9 = new No(9, no10, no5);

        arvore.setRaiz(no9);

        assertFalse(arvore.ehVazia());
        assertEquals(2, arvore.pegaQuantidadeNosDosSubnos(no6));

    }

    @Test
    void testRetonarQuantidadeNosSubNosComFilhoEsquedo() {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

        No no7 = new No(7, null, null);
        No no6 = new No(6, no7, null);
        No no1 = new No(1, null, null);
        No no2 = new No(2, null, no1);
        No no5 = new No(5, no6, no2);
        No no10 = new No(10, null, null);
        No no9 = new No(9, no10, no5);

        arvore.setRaiz(no9);

        assertFalse(arvore.ehVazia());
        assertEquals(2, arvore.pegaQuantidadeNosDosSubnos(no2));
    }

    @Test
    void testRetonarQuantidadeNosSubNosComFolha() {

        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

        No no7 = new No(7, null, null);
        No no6 = new No(6, no7, null);
        No no1 = new No(1, null, null);
        No no2 = new No(2, null, no1);
        No no5 = new No(5, no6, no2);
        No no10 = new No(10, null, null);
        No no9 = new No(9, no10, no5);

        arvore.setRaiz(no9);

        assertFalse(arvore.ehVazia());
        assertEquals(1, arvore.pegaQuantidadeNosDosSubnos(no1));
        assertEquals(1, arvore.pegaQuantidadeNosDosSubnos(no7));
        assertEquals(1, arvore.pegaQuantidadeNosDosSubnos(no10));

    }

    @Test
    void testPegaAlturaArvoreVazia() {

        ArvoreBinariaBuscaBuilder builder = new ArvoreBinariaBuscaBuilder();

        ArvoreBinariaBusca arvore = builder.montaArvoreVazia();

        assertEquals(0, arvore.pegaAlturaArvore());
    }

    @Test
    void testPegaAlturaArvoreSoRaiz() {

        ArvoreBinariaBuscaBuilder builder = new ArvoreBinariaBuscaBuilder();

        ArvoreBinariaBusca arvore = builder.montaArvoreSoRaiz();

        assertEquals(0, arvore.pegaAlturaArvore());
    }

    @Test
    void testPegaAlturaArvoreSoFilhoDireito() {

        ArvoreBinariaBuscaBuilder builder = new ArvoreBinariaBuscaBuilder();

        ArvoreBinariaBusca arvore = builder.montaArvoreRaizFilhoDireito();

        assertEquals(1, arvore.pegaAlturaArvore());
    }

    @Test
    void testPegaAlturaArvoreSoFilhoEsquerdo() {

        ArvoreBinariaBuscaBuilder builder = new ArvoreBinariaBuscaBuilder();

        ArvoreBinariaBusca arvore = builder.montaArvoreRaizFilhoEsquerdo();

        assertEquals(1, arvore.pegaAlturaArvore());
    }

    @Test
    void testPegaAlturaArvoreDoisFilhos() {

        ArvoreBinariaBuscaBuilder builder = new ArvoreBinariaBuscaBuilder();

        ArvoreBinariaBusca arvore = builder.montaArvoreRaizFilhoDireitoEsquerdo();

        assertEquals(1, arvore.pegaAlturaArvore());
    }

        @Test
        void imprimePreOrder(){
            ArvoreBinariaBuscaBuilder builder = new ArvoreBinariaBuscaBuilder();

            ArvoreBinariaBusca arvore = builder.montaArvoreCheiaDoisNiveis();
            arvore.imprimirPreOrder();
        }


}
