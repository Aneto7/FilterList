import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterList {
    public static void main(String[] argas) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        System.out.println("Insert the time to travel: ");
        int time = sc.nextInt();
        System.out.println("Insert five values to time of five musics: ");
        int music1 = sc.nextInt();
        int music2 = sc.nextInt();
        int music3 = sc.nextInt();
        int music4 = sc.nextInt();
        int music5 = sc.nextInt();

        list.add(music1);
        list.add(music2);
        list.add(music3);
        list.add(music4);
        list.add(music5);

        List<Integer> result = list.stream().filter(x->x > time).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(result);
    }
}
