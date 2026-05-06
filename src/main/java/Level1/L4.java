package Level1;

public class L4 {
    static void generate(){
        String text=null;
        System.out.println(text.length());
    }
    static void handle(){
        try{
            String text=null;
            System.out.println(text.length());
        }catch(NullPointerException e){
            System.out.println("Handled NullPointerException");
        }
    }
    public static void main(String[] args){
        try{generate();}catch(Exception e){}
        handle();
    }
}

