public class FindFirstNonRepeat {
    public static char printfirstnon(String name){
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(name.indexOf(ch) == name.lastIndexOf(ch)){
                return ch;
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        String name= "yashswi sharma";
        System.out.println(printfirstnon(name));
    }
}
