template <typename T>
void show_value(const T& arr)
{
    for (auto element : arr)
    {
        cout << element << ' ';
    }
    
    cout << '\n';
}


void insertionSort1(int n, vector<int> arr)
{
    for (int i = 1; i < n; ++i)
    {
        int key = arr[i];
        int j;

        for (j = i-1; j >= 0 && arr[j] > key; --j)
        {
            arr[j+1] = arr[j];
            show_value(arr);
        }

        arr[j+1] = key;
    }
    
    show_value(arr);
}


template <typename T>
void insertion_sort(T& arr)
{
	int n = arr.size();

	for (int i = 1; i < n; ++i)
	{
		int key = arr[i];
		int j;

		for (j = i-1; j >= 0 && arr[j] > key; --j)
		{
			arr[j+1] = arr[j];
		}

		arr[j+1] = key;
	}
}

