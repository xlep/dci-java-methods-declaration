public class Solution {

  public static void main(String[] args) {
    Solution solution = new Solution();

    solution.helloWorld();

    solution.greeting("Philipp");

    String underscores = solution.replaceSpaces("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
    System.out.println(underscores);
    underscores = solution.replaceSpacesOwnLogic("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
    System.out.println(underscores);
  }

  // Basics: hello world
  void helloWorld() {
    System.out.println("Hello World!");
  }

  // Basics: greeting
  void greeting(String name) {
    System.out.println("Good morning " + name);
  }

  // Basics: replace space with underscore
  String replaceSpaces(String text) {
    return text.replaceAll(" ", "_");
  }

  String replaceSpacesOwnLogic(String text) {
    StringBuilder resultText = new StringBuilder();

    for (int i = 0; i < text.length(); i++) {
      char charAt = text.charAt(i);

      if (charAt == ' ') {
        resultText.append('_');
      } else {
        resultText.append(charAt);
      }
    }

    return resultText.toString();
  }


}
