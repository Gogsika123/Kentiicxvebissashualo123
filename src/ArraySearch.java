public class ArraySearch {//kenti ricxvebis sashualo aritmetikuliarray

    public static boolean searchInArray(int[] array, int answer) {
        for (int num : array) {
            if (num == answer) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 4, 7, 9, 12, 15};
        int answerNumber = 7;
        boolean isPresent = searchInArray(numbers, answerNumber);
        System.out.println("Is " + answerNumber + " present in the array? " + isPresent);
    }
}






