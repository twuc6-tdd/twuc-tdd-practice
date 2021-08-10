import java.util.Arrays;
import java.util.List;

public class Mommifier {
    private final String VOWELS_STRING = "aeiou";

    public String convertString(String inputString){
        if(isShorterThan30Percent(inputString)){
            return inputString;
        }
        return inputString.replaceAll("[aeiou]+", "mommy");
    }

    public boolean isShorterThan30Percent(String inputString){
        return count(inputString) < inputString.length() *0.3;
    }
    public long count(String inputString) {

        String[] chars = inputString.split("");
        List<String> characters = Arrays.asList(chars);
        return characters.stream().filter(v -> isVowel(v)).count();
    }

    private boolean isVowel(String v) {
        return v.matches("[aeiou]+");
    }


}
