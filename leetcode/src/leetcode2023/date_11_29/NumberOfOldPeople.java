package leetcode2023.date_11_29;

public class NumberOfOldPeople {
    public static void main(String[] args) {
        String[] details={"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(details));
    }

    public static int countSeniors(String[] details) {
        int res=0;
        for (String detail : details) {
            if (Integer.parseInt(detail.substring(11, 13)) > 60) {
                res++;
            }
        }
        return res;
    }
}
