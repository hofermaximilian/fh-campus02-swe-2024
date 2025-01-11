package at.campus02.swe.e2e;

import at.campus02.swe.Calculator;
import at.campus02.swe.logic.CalculatorImpl;
import at.campus02.swe.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class EndToEndTest {

    @Test
    public void MulTest() throws Exception {

        Calculator cal = new CalculatorImpl();

        Parser parser = new Parser(cal);
        Assert.assertEquals(6.0, parser.parse(new File("src/test/resources/test04-e2e.xml")), 0);
    }

    @Test
    public void ModTest() throws Exception {

        Calculator cal = new CalculatorImpl();

        Parser parser = new Parser(cal);
        Assert.assertEquals(2.0, parser.parse(new File("src/test/resources/test05-e2e.xml")), 0);
    }

    @Test
    public void SinTest() throws Exception {

        Calculator cal = new CalculatorImpl();

        Parser parser = new Parser(cal);
        Assert.assertEquals(1, parser.parse(new File("src/test/resources/test06-e2e.xml")), 0);
    }

    @Test
    public void CosTest() throws Exception {

        Calculator cal = new CalculatorImpl();

        Parser parser = new Parser(cal);
        Assert.assertEquals(-1, parser.parse(new File("src/test/resources/test07-e2e.xml")), 0);
    }

    @Test
    public void DotproductTest1() throws Exception {

        Calculator cal = new CalculatorImpl();

        Parser parser = new Parser(cal);
        Assert.assertEquals(11, parser.parse(new File("src/test/resources/test08_e2e_dotproduct1.xml")), 0);
    }

    @Test
    public void DotproductTest2() throws Exception {

        Calculator cal = new CalculatorImpl();

        Parser parser = new Parser(cal);
        Assert.assertEquals(70, parser.parse(new File("src/test/resources/test09_e2e_dotproduct2.xml")), 0);
    }

}
