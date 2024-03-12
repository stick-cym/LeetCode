package leetcode2024.date_3;

public class CapitalizeTheTitle {
    public static void main(String[] args) {
        String title = "capiTalIze tHe titLe";
        System.out.println(capitalizeTitle(title));
    }

    public static String capitalizeTitle(String title) {
        String[] words=title.split(" ");
        StringBuilder newTitle=new StringBuilder();
        for (String word: words){
            if(word.length()<3){
                newTitle.append(word.toLowerCase()).append(" ");
            }else{
                String lowerCase = word.toLowerCase();
                newTitle.append(lowerCase.replaceFirst(lowerCase.substring(0, 1),lowerCase.substring(0, 1).toUpperCase())).append(" ");
            }
        }
        return newTitle.toString().trim();
    }
}
