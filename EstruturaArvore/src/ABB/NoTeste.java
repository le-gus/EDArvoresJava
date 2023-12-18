package ABB;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NoTeste {
    @Test
    void testeRetornaEhFolhaNaoTemFilhos() {
        No no7 = new No(9,null,null);

        assertTrue(no7.ehFolha());
    }

    @Test
    void testeRetornaNaoEhFolhaTemFilhoDireito() {
        No no10 =  new No(10,null,null);
        No no7 = new No(7,no10, null);

        assertTrue(no10.ehFolha());
        assertFalse(no7.ehFolha());
    }

    @Test
    void testeRetornaNaoEhFolhaTemFilhoEsquerdo() {
        No no5 = new No(5,null,null);
        No no7 = new No(7, null, no5);

        assertTrue(no5.ehFolha());
        assertFalse(no7.ehFolha());
    }


}
