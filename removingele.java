public class removingele {
    public static void main(String[] args) {
        skip("","baccad");
        System.out.println(str("baccdapjkl"));
        System.out.println(Apple("bcapplesdfbgf"));
        
    }
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p, up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
    }
    static String str( String up){
        if(up.isEmpty()){
            
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return str(up.substring(1));
        }else{
            return ch+str(up.substring(1));
        }
    }
    static String Apple( String up){
        if(up.isEmpty()){
            
            return "";
        }
        
        if(up.startsWith("apple")){
            return Apple(up.substring(5));
        }else{
            return up.charAt(0)+Apple(up.substring(1));
        }
    }

    
}
