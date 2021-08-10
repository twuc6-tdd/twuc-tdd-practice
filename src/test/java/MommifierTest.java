import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MommifierTest {

    private  Mommifier mommifier;
    @BeforeEach void setUp(){

        mommifier=new Mommifier();

    }
    @Test
    void should_creat_mommifier(){
        mommifier = new Mommifier();
    }

    @Test
    void should_return_input_string_when_given_inout_string_vowels_less_than_30_percent(){
        String inputString="dasfdesfsd";

        String result=mommifier.convertString(inputString);

        Assertions.assertEquals(result,inputString);
    }

    @Test
    void should_return_replaced_string_when_given_inout_string_vowels_longer_than_30_percent(){
        String inputString="aaaaaaaad";

        String result=mommifier.convertString(inputString);

        Assertions.assertEquals(result,"mommyd");
    }
}
