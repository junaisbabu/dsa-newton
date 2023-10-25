package NewtonSchoolAssignments;

public class ChangeArrayElement {

        public static int[] SwapToEnd(int[] Array,int target)
        {
            int j = Array.length - 1;
            System.out.println(j+"jjjjjj");

            for (int i = 0; i < Array.length; i++)
            {
                if (Array[i] == target && i < (j - 1))
                    System.out.println(i+"i");
                System.out.println(j+"j");
                {
                    while (Array[j] == target && i < (j - 1))
                    {
                        j--;
                        System.out.println("j count: "+ j);
                    }

                    int temp = Array[j];
                    Array[j] = Array[i];
                    Array[i] = temp;
                }
            }
            return Array;
        }


        public static void main(String[] args)
        {
            int[] Array={6,1,6,8,10,4,15,6,3,9,6};
            int target=6;
            System.out.print("Before : ");
            for(int i=0;i<Array.length;i++)
            {
                System.out.print(Array[i]+" ");
            }

            int[] Result=SwapToEnd(Array,target);

            System.out.print("\nAfter  : ");
            for(int i=0;i<Result.length;i++)
            {
                System.out.print(Result[i]+" ");
            }
        }
    }



