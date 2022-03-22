import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/resources/data.csv")
public class ParametrizedTest {

    private String value1;
    private int value2;

    public void setValue1(String value) {
        this.value1 = value;
    }

    public void setValue2(int value) {
        this.value2 = value;
    }

    @Qualifier
    public String qualifier() {
        return value1 + "=>" + value2;
    }

    @Test
    public void test() {
        System.out.println(value1 + " " + value2);
    }

}
