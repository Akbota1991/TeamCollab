package Maya1;

public class Maya1 {
    public static void main(String[] args) {




        String str = "Mahliyo";
        String revers = "";

        for (int i = str.length()-1; i >=0; i--) {
            revers +=str.charAt(i);


        }
        System.out.println(revers);

    }
}
