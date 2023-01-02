public class Recursive_Main
{
    public static int BinarySearch(int[]Data, int Target,int LowerBound,int UpperBound) {
        int index = (LowerBound + UpperBound) / 2;
        if (Data[index] == Target) return index; // finding the position
        else if (UpperBound < LowerBound) return -1; // not find
        else {
            if (Data[index] > Target)
                return BinarySearch(Data, Target, LowerBound, index - 1);
            else // looking in upper half
                return BinarySearch(Data, Target, LowerBound, UpperBound);
        }
            }
            public static void main(String[] args)
            {
                int[] arr = {3,4,5,6,7,8,9};
                int a = BinarySearch(arr,8,3,8);
                System.out.println("The index of element number 8 in the array is : " + a);

        }

        }


