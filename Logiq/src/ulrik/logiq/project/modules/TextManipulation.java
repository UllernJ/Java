package ulrik.logiq.project.modules;

public class TextManipulation {

    public String actions(String action, String word ) {
        if(action.contains("PALINDROME")) {
            StringBuilder rev = new StringBuilder(word);
            rev.reverse();
            if(word.equals(rev.toString())) {
                return "true";
            }
            else {
                return "false";
            }
        }
        else if(action.contains("WHITESPACE")) {
            return word.replaceAll("\\s+","");
        }
        else if(action.contains("REVERSE")) {
            StringBuilder reverse = new StringBuilder(word);
            reverse.reverse();
            return reverse.toString();

        }
        else if(action.contains("UNIQUE_COUNT")) {
            return String.valueOf(word.chars().distinct().count()) + " UNIQUE LETTERS";

        }
        else if(action.contains("CAPITALIZE")) {
            return word.toUpperCase();
        }
        return null;
    }

}


