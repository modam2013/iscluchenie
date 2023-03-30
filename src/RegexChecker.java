public class RegexChecker implements Checker{
    @Override
    public boolean check(String s) {
        return s.matches("^\\W+$");
    }

    @Override
    public boolean isValid(String s) {
        return false;
    }
}
