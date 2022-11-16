package sprint4Day4Live;

import java.util.*;
import java.util.Map;
class Main{
    public static void main(String[] args){

        String str = "zoomsessionmooz";

        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
            if(!hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i),1);
            }
        }

        int min = Integer.MAX_VALUE;

        for(int i=0;i<str.length();i++){
            String temp ="";

            for(int j=i;j<str.length();j++){
                temp+=str.charAt(j);

                HashMap<Character,Integer> hm2 = new HashMap<Character,Integer>();

                for(int k=0;k<temp.length();k++){
                    if(!hm2.containsKey(temp.charAt(k))){
                        hm2.put(temp.charAt(k),1);
                    }
                }

                if(hm.size() == hm2.size()){
                    if(min>temp.length()){
                        min = temp.length();
                    }
                }

            }
        }
        System.out.println(min);

//                for(int i=0;i<str.length();i++) {
//                    String temp = "";
//
//                    for (int j = i; j < str.length(); j++) {
//                        temp += str.charAt(j);
//                        System.out.println(temp);
//                    }
//                }
    }

}
