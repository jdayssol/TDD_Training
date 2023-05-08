package ex2;

public class RomanConverterUtils {
        public static String romanConverterUtils(int num) {
            /*
             * 1. variable initialization
             * 2. basicNum is corresponding to the basicRoman one by one
             * */
            int[] basicNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] basicRoman =  {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            int remainNum = num;
            String result = "";
            // my solution
            for (int i = 0; i < basicNum.length; i++) {
                if (remainNum == 0) {
                    break;
                }
                if (remainNum / basicNum[i] > 0) {
                    for (int j = 0; j < remainNum / basicNum[i]; j++) {
                        result += basicRoman[i];
                    }
                }
                remainNum %= basicNum[i];
            }

            return result;
        }
}
