public class Ppj03 {
    boolean isRaining = false;
    int wrt = 5;

    public void checkIsRaining() {
        if(this.isRaining) {
            System.out.println("Is raining");
        } else {
            System.out.println("Is not raining");
        }
    }

    public boolean isIncludeInCollection() {
        if (this.wrt > -15 && wrt >= -10) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Ppj03 ppj03 = new Ppj03();
        ppj03.checkIsRaining();
    }
}
