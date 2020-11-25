import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
class Filter{
    public static Predicate<String> nameStartingWithPrefix(String prefix){
        return p -> p.startsWith(prefix);
    }

}
 class Mapper{

    public static Function<String, CharactersCount> getDistinctharactersCount(){

        return c -> new CharactersCount(c,charCount(c));


    }
    public static Integer charCount(String str){
        boolean[] isItThere = new boolean[Character.MAX_VALUE];

        for (int i = 0; i < str.length(); i++) {
            isItThere[str.charAt(i)] = true;
        }

        int count = 0;
        for (int i = 0; i < isItThere.length; i++) {
            if (isItThere[i] == true){
                count++;
            }
        }
        return count;
    }
}

class CharactersCount{
    private final String name;
    private final Integer distinctCharacterCount;
    CharactersCount(String name, Integer distinctCharacterCount){
        this.name = name;
        this.distinctCharacterCount = distinctCharacterCount;
    }

    @Override
    public String toString() {
        return "CharactersCount{" +
                "name='" + name + '\'' +
                ", distinctCharacterCount=" + distinctCharacterCount +
                '}';
    }
}
public class SahilVisa {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("aaa","aa","ab"));
        names.stream().filter(Filter.nameStartingWithPrefix("aa")).map(Mapper.getDistinctharactersCount())
                .forEachOrdered(System.out::println);
    }

}