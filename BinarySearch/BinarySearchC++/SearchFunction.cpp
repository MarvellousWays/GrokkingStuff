



SearchFunction::SearchFunction()
{
}

int SearchFunction::binary_search(int list[], int item)
{
	int low = 0;
	int high = sizeof(list);
	int mid = 0;
	int guess = 0;

	while (low <= high) {
		mid = (low + high) / 2;
		guess = list[mid];
		if (guess == item) return mid;
		if (guess > item) high = mid - 1;
		else low = mid + 1;
	}
	return -1;
}


SearchFunction::~SearchFunction()
{
}
