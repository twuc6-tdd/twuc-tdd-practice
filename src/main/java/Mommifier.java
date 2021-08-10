import java.util.stream.Stream;

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
        System.out.println(Stream.of(inputString).filter(v -> isVowel(v)).count());
        return Stream.of(inputString).filter(v -> isVowel(v)).count();
    }

    private boolean isVowel(String v) {
        return v.matches("[aeiou]+");
    }


}
