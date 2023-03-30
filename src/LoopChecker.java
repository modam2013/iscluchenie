public class LoopChecker implements Checker{
  private static String ALLOWED_CHARACTERS="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM123456789_";

    @Override
   public boolean check(String s) {
        char[] chars= s.toCharArray();
        for (char simbol:chars) {
            if (!ALLOWED_CHARACTERS.contains(Character.toString(simbol))){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isValid(String s) {
        return false;
    }
}
