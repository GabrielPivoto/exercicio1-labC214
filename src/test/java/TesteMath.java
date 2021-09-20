import org.junit.Assert;
import org.junit.Test;

public class TesteMath {

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

}
