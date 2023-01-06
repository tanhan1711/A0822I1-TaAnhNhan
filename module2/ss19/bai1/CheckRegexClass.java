package ss19.bai1;

public class CheckRegexClass {
    public static void main(String[] args) {
        String regexClass = "^[ACP]\\d{4}[IGHKLM]$";
        String className = "C0318G";
//        System.out.println(className.matches(regexClass));
        if (className.matches(regexClass)==true){
            System.out.println("Hop le");
        }else {
            System.out.println("ko hop le");
        }
        }
}
