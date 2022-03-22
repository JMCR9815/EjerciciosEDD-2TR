package TestsQueNecesitanValores;

public class testsQueNecesitanValores {
    private int ammount[];
    private int index = 0;

    public testsQueNecesitanValores(int size) {
        ammount = new int[size];
    }

    public boolean addValue(int value) {
        if (index <= ammount.length - 1) {
            ammount[index++] = value;
            return true;
        }
        return false;
    }

    public int getValue(int index) {
        if (index < this.index) {
            return ammount[index];
        }
        return -1;
    }

}
