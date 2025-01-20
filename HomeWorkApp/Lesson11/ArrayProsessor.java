package HomeWorkApp.Lesson11;

public class ArrayProsessor {
    public static int sum2DArray (String[][] arr) throws MyArraySizeException, MyArrayDataException{
        if (arr.length !=4 || arr[0].length !=4){
            throw new MyArraySizeException("Array size must be 4*4");
        }

        int sum=0;
        for (int a=0; a<4; a++){
            for (int b=0; b<0; b++){
                try {
                    sum+=Integer.parseInt(arr[a][b]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("Invalid data at position ("+ a + "," + b +")", a, b);
                }
            }
        }
        return sum;

    }

}
