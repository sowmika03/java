class SpecificValue
{
    public static boolean containsVal(int[] arr, int value)
    {
        for (int num: arr) 
        {
            if (num == value)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        int[] numbers = {256,995,43,67,12,9,4};
        int value = 67;
        System.out.println("Do array contains " + value + " ? " + containsVal(numbers, value));
    }
}
/*
Do array contains 67 ? true
*/
