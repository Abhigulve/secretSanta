import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecretSanta {

    public static Map<String, String> getSecretSanta(List<String> names) {
        List<String> secretlist = new ArrayList<String>();
        secretlist.addAll(names);
        Map<String, String> finalMap = new HashMap<String, String>();
        boolean flag = true;
        List<String> giftgetter = new ArrayList<String>();
        for (int i = 0; i < names.size(); i++) {
            secretlist.remove(names.get(i));
            int randNum = (int) (Math.random() * secretlist.size());
            while (flag) {
                if (giftgetter.contains(secretlist.get(randNum))) {
                    randNum = (int) (Math.random() * secretlist.size());
                } else {
                    flag = true;
                    //System.out.println(names.get(i) + "-->" + secretlist.get(randNum));
                    finalMap.put(names.get(i), secretlist.get(randNum));
                    giftgetter.add(secretlist.get(randNum));
                    break;
                }
            }
            secretlist.remove(randNum);
            secretlist.add(names.get(i));
        }
        return finalMap;
    }
}
