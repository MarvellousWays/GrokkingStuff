def binary_search(list,item):
    high = len(list)
    low = 0

    while low <= high:
        mid = int((low+high)/2)
        guess = list[int(mid)]
        if guess == item:
            return mid
        if guess > item:
            high = mid - 1
        else:
            low = mid + 1
    return None


my_list = [1, 3, 5, 7, 9]
print("HelloWorld")
print(binary_search(my_list, 7))


