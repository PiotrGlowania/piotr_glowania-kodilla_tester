public class ArraysExample {

    public static void main(String[] args) {

        int[] myInts = new int[10];

        myInts[0] = -11;

        System.out.println(myInts[0]);

        String[] myStrings = new String[] {"zero"};

        System.out.println(myStrings.length);

        for (int i = 0; i < myStrings.length; i++) {
            System.out.println(myStrings[i]);
        }

    }
}
