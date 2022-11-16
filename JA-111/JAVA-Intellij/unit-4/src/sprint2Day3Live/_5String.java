package sprint2Day3Live;

public class _5String {
    public static void main(String[] args) {
        //1st way to create string
        String s1 ="edc ba";  // string literals

        System.out.println(s1.charAt(3));
        String s3 ="value";
        //2nd way to create string
        String s2 = new String("value");  // string with new operator

        String x;
        String y;

        System.out.println(s1 == s3); // will compare address -- output true
        System.out.println(s1 == s2); // will compare address -- output false
        //address of string generated by different way to create a string will be different even if content is same .
        //In the heap area a new object is created with new keyword hence a new  address is created
        //In literal method string is created in "String pool"  area
        String ans ="";
        StringBuilder sb = new StringBuilder(s1);
        int l =0;
        int r = sb.length()-1;


        //System.out.println(sb.charAt(3));
        while(l<r){
            sb.setCharAt(l, s1.charAt(r));
            sb.setCharAt(r, s1.charAt(l));
            l++;
            r--;
        }
        sb.deleteCharAt(2);
        System.out.println(sb);

//        for(int i=0;i<sb.length();i++){
//            if(i%2==0){
//                //System.out.println(sb.charAt(i));
//                //sb.delete(i,i+1);
//                ans+=sb.charAt(i);
//                //System.out.println(sb.charAt(i));
//
//            }
//        }
//        System.out.println(ans);

    }
}
