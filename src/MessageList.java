import java.util.*;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
public class MessageList {

    public static void main(String args[]){
        ArrayList<MessageObj> marray = new ArrayList<MessageObj>();
        MessageObj m = new MessageObj(0,1);
        MessageObj n = new MessageObj(1,2);
        MessageObj o = new MessageObj(1,3);
        MessageObj p = new MessageObj(2,4);
        MessageObj q = new MessageObj(3,5);
        MessageObj x = new MessageObj(5,6);
        marray.add(m);
        marray.add(n);
        marray.add(o);
        marray.add(p);
        marray.add(q);
        marray.add(x);
        MessageList ml = new MessageList();
        Multimap<Integer,Integer> multimap = ml.getMap(marray);
        Map<Integer, Collection<Integer>> map = multimap.asMap();
        System.out.println("Multimap as a map");
        int root = 1;
        int level =0;
        ml.DrawTree(map,root,level);





//        for (Map.Entry<Integer,  Collection<Integer>> entry : map.entrySet()) {
//            int key = entry.getKey();
//            Collection<Integer> value = entry.getValue();
//            System.out.println(key + ":" + value);
//        }
    }


    public void DrawTree(Map<Integer, Collection<Integer>> map,int root,int level) {
        String tab = "";
        String dash = "";
//        for(int i=0;i<level;i++)
//            dash += "-";
        if(level>0)
            dash="-";
        for(int i=0;i<level-1;i++)
            tab += " ";
        if (map.get(root) != null) {
            Collection<Integer> value = map.get(root);
            System.out.println(tab+""+dash+""+root);
            for (Integer i : value)
                DrawTree(map, i,level+1);
        }
        else
            System.out.println(tab+""+dash+""+root);
    }
    private Multimap<Integer,Integer> getMap(ArrayList<MessageObj> marray){
        Multimap<Integer,Integer> multimap = ArrayListMultimap.create();
        for (MessageObj r : marray){
        if(r.getId()!=1){
         multimap.put(r.getParent(),r.getId());
    }
}
   return multimap;
        }
    }

