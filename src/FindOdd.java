import java.util.HashMap;

public class FindOdd {

    public static int oddManOut(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
                if (hm.containsKey(arr[i]) && hm.get(arr[i]) == 1) {
                    hm.put(arr[i], 0);
                } else hm.put(arr[i], 1);
            }

        for (int o : hm.keySet()) {
            if(hm.get(o).equals(1)) {
                return o;
            }
        }
        return 0;
    }
}
