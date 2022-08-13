
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {

        return list.stream()
                   .filter(e -> e instanceof Integer)
                   .collect(Collectors.toList());
    }

    public static String getType(Object ob) {

        return "Int";
    }
}
