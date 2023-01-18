public class StringSplit1 {

    public static void main(String[] args) {

        String str = " This is Java";

        String[] stArr = str.split("");

        for (int i = 0; i < stArr.length; i++) {
            System.out.println(stArr[i]);
        }


        String str1 = "Hey Baby you are so lovely";
        // print only the words that ends with 'y'
        String[] stArr1 = str.split(" ");

        {
            for (int i = 0; i < stArr1.length; i++) {
                String temp = stArr1[i];
                int l = temp.length();
                if (temp.charAt(l - 1) == 'y' || temp.charAt(l - 1) == 'Y')
                    System.out.println(stArr1[i]);
            }
        }

    }
}
