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
    public void Test04Xml() throws Exception {

        Calculator cal = new CalculatorImpl();

        Parser parser = new Parser(cal);
        Assert.assertEquals(6.0,parser.parse(new File("src/test/resources/test04-e2e.xml")),0);
    }

    @Test
    public void Test05Xml() throws Exception {

        Calculator cal = new CalculatorImpl();

        Parser parser = new Parser(cal);
        Assert.assertEquals(2.0,parser.parse(new File("src/test/resources/test05-e2e.xml")),0);
    }
}
