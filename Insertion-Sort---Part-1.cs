
class Result
{

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    static void ShowValue(List<int> arr)
    {
        foreach (int v in arr)
            Console.Write(v + " ");
        Console.WriteLine();
    }

    public static void insertionSort1(int n, List<int> arr)
    {
        int key = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            ShowValue(arr);
            j--;
        }

        arr[j + 1] = key;
        ShowValue(arr);
    }
}
