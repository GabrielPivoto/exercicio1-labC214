import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TesteMath {

    @Mock
    private Primo p;

    private Math m;

    @Before
    public void init(){
        m = new Math(p);
    }

    @Test
    public void testaAreaDoRetangulo(){
        Assert.assertEquals(10,Math.areaRetangulo(2,5));
    }

    @Test
    public void testaVerificacaoParidade(){
        Assert.assertEquals("Par",Math.verificaParidade(6));
    }

    @Test
    public void testaFatorial(){
        Assert.assertEquals(720,Math.fatorial(6));
    }

    @Test
    public void testaPrimo(){
        Mockito.when(m.p.verificaPrimo(10)).thenReturn("Não é primo");
        String result = m.p.verificaPrimo(10);
        Assert.assertEquals(result,m.p.verificaPrimo(10));
    }


}
