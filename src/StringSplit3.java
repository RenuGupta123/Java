public class StringSplit3 {
    public static void main(String[] args) {


        String str = "Hey Baby you are so lovely";
        //print string which starts with 'y'

        String[] stArr = str.split(" ");
        for (int i = 0; i < stArr.length; i++) {

            if (stArr[i].charAt(0) == 'l') {
                System.out.println(stArr[i]);
            }

        }

      /*  if (stArr[i].endsWith("y")) {
            System.out.println(stArr[i]);
        }*/
    }
}


