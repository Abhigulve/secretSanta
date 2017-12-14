import java.util.*;

public class SecretSantaConfig {

    //public final  List<String>names= Arrays.asList("Abhijeet","Pratik","Saad","Kunal","Prachi","Mansi","Gayatri","Akshaya","Nasrin","Rasika");
    public final List<String> names = Arrays.asList("Abhijeet", "sham", "kc", "Abhijit", "Rushi");

    public static final Map<String, String> map = new HashMap<String, String>();

    public static void config() {
        map.put("Abhijeet", "abhigulve06@gmail.com");
        map.put("Rushi", "rushisonawane00@gmail.com");
        map.put("sham", "shambhand2020@gmail.com");
        map.put("kc", "");
        map.put("", "");
        /*map.put("Pratik","abhijeet.awari@gmail.com");
        map.put("Saad","saad.patel@gmail.com");
        map.put("Kunal","");
        */
    }


    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("Abhijeet");
        names.add("sham");
        names.add("kc");
        names.add("Abhijit Awari");
        names.add("Rushi");
        System.out.println(SecretSanta.getSecretSanta(names));
    }
}


