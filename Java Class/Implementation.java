public class Implementation implements Contract {
    @Override
    public void term1() {
        System.out.println("in term 1");
    }

    @Override
    public void term2() {
        System.out.println("in term 2");
    }

    @Override
    public void extendedTerm() {
        System.out.println("in extended term");
    }
}
