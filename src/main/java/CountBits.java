public class CountBits {
    public short countBits(int x) {
        short numBits = 0;
        while (x != 0) {
            System.out.println(x & 1);
            numBits += (x & 1);
            x >>>= 1;
        }
        System.out.println(numBits);
        return numBits;
    }
}
