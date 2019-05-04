import java.util.ArrayList;
import java.util.List;

public class generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        if (numRows==0){
            return list;
        }
        list.add(new ArrayList());
        list.get(0).add(1);
        int i=1;
        while(i<numRows){
            List<Integer> tmp=new ArrayList<Integer>();
           int j=0;
           tmp.add(1);
           j++;
           while(j<i){
               tmp.add(j, list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
               j++;
           }
           tmp.add(1);
            list.add(tmp);
            i++;
            }
        return list;
        }

    public static void main(String[] args) {
        generate test=new generate();
        System.out.println(test.generate(3));
    }
}
