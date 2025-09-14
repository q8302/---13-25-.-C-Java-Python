1.
  public class MainArray {
    public static void main(String[] args) {
        char[] spisok = {'1','D','3','B','c','5','D'};

        StringBuilder numbers = new StringBuilder();
        StringBuilder letters = new StringBuilder();

        for (char ch : spisok) {
            if (Character.isDigit(ch)) numbers.append(ch);
            else if (Character.isLetter(ch)) letters.append(ch);
        }

        System.out.println("Цифры: " + numbers);
        System.out.println("Буквы: " + letters);
    }
}
2.
  public class MainString {
    public static void main(String[] args) {
        String s = "AaBbCcDd";

        StringBuilder upper = new StringBuilder();
        StringBuilder lower = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) upper.append(ch);
            else if (Character.isLowerCase(ch)) lower.append(ch);
        }

        System.out.println("Заглавные: " + upper);
        System.out.println("Строчные: " + lower);
    }
}
