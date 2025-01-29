import java.util.*;
public class Q09_MostFreuentCharacter {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:  ");
        String str=sc.nextLine();
        Map<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
        }
        char res=' ';
        int max=0;
        for(Map.Entry<Character,Integer>entry:hm.entrySet()){
            int count=0;
            if(entry.getValue()>max){
                max=entry.getValue();
                if(max>count){
                    res=entry.getKey();
                    count=max;
                }
            }

        }
        System.out.println("Most Freuent Character: "+res);
        sc.close();
    }
}
