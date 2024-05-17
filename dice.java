import java.util.ArrayList;

public class dice {
    public static void dice1(String p , int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            dice1(p+i, target-i);
        }

    }
    public static ArrayList<String> dicelist(String p , int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> list = new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++){
            list.addAll(dicelist(p+i, target-i));
        }
        return list;

    }
    public static void main(String[] args) {
        dice1("", 4);
        System.out.println(dicelist("", 4));
        
    }
    
}
