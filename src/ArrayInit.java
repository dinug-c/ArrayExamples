public class ArrayInit {
    public static void main(String[] args) throws Exception {
        // first method to declare array 
        // int[] arrInt = new int[]{1,2,3,4,5,6};
        // can be simplify 
        int[] arrInt = {1,2,3,4,5,6};
        // second method to declare array
        int[] arrInt2 = new int[6]; // 6 is array length thats means this array have 6 elment/numbers
        arrInt2[0] = 1; // putting value into array with index
        arrInt2[1] = 2;
        arrInt2[2] = 3;
        arrInt2[3] = 4;
        arrInt2[4] = 5;
        arrInt2[5] = 6;

        // output first method
        System.out.println(arrInt[0]);
        System.out.println(arrInt[1]);
        System.out.println(arrInt[2]);
        System.out.println(arrInt[3]);
        System.out.println(arrInt[4]);
        System.out.println(arrInt[5]);

        // output second method
        System.out.println(arrInt2[0]);
        System.out.println(arrInt2[1]);
        System.out.println(arrInt2[2]);
        System.out.println(arrInt2[3]);
        System.out.println(arrInt2[4]);
        System.out.println(arrInt2[5]);
    }
}
