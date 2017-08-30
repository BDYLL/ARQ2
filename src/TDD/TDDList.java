package TDD;

public class TDDList implements IList {
    private int count=0;
    @Override
    public int size() {
        return 0;
    }

    @Override
    public void add(String s) {
        count++;
    }
}
