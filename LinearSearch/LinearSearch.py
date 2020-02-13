def linSearch(arr, val):
    for i in range(len(arr)):
        if arr[i] == val:
            return i
    return


arr = []
for i in range(10):
    arr.append(i*i)

print((linSearch(arr, 49) + 1))        # prints pos of value
print()                             # to separate

for i in arr:
    print(i)
