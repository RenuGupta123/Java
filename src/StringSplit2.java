public class StringSplit2 {

    public static void main(String[] args) {
        String str = "Hey Baby you are so lovely";
        //print string which ends with 'y'

        String[] stArr = str.split(" ");
        for (int i = 0; i < stArr.length; i++) {
            /*  String temp = stArr[i];
            int l = temp.length();
            if (temp.charAt(l - 1) == 'y') {
                System.out.println(stArr[i]);
            }

        }*/

            if (stArr[i].endsWith("y")) {
                System.out.println(stArr[i]);
            }
        }

    }
}
