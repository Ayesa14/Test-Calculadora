import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperacionesBasicasTest {
    @Test
    public void testSumaPositivos(){
        Assertions.assertEquals(5, OperacionesBasicas.operar(1,2,3));
    }
    @Test
    public void testSumaNegativos(){
        Assertions.assertEquals(-5,OperacionesBasicas.operar(1,-2,-3));
    }
    @Test
    public void testSumaCero(){
        Assertions.assertEquals(3,OperacionesBasicas.operar(1,0,3));
    }
    @Test
    public void testRestaPositivos(){
        Assertions.assertEquals(2,OperacionesBasicas.operar(2,4,2));
    }
    @Test
    public void testRestaNegativos(){
        Assertions.assertEquals(-4,OperacionesBasicas.operar(2,-9,-5));
    }
    @Test
    public void testRestaCero(){
        Assertions.assertEquals(-3,OperacionesBasicas.operar(2,0,3));
    }
    @Test
    public void testMultiplicarPositivos(){
        Assertions.assertEquals(10,OperacionesBasicas.operar(3,2,5));
    }
    @Test
    public void testMultiplicarNegativos(){
        Assertions.assertEquals(50,OperacionesBasicas.operar(3,-5,-10));
    }
    @Test
    public void testDividirPositivos(){
        Assertions.assertEquals(5,OperacionesBasicas.operar(4,10,2));
    }
    @Test
    public void testDividirNegativos(){
        Assertions.assertEquals(5,OperacionesBasicas.operar(4,-10,-2));
    }
    @Test
    public void testRaizCuadrada(){
        Assertions.assertEquals(4,OperacionesBasicas.operar(5,2,16));
    }
    @Test
    public void testRaizCualquierIndice(){
        Assertions.assertEquals(3,OperacionesBasicas.operar(5,3,27));
    }

}
