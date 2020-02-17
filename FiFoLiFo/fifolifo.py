def printfifo(arr):             # fifo print()
    for i in arr:
        print(i)


def printlifo(arr):             # lifo print()
    for i in reversed(arr):
        print(i)


for i in range(10):
    arr.insert(i, i*i)              # lifo push()

arr.pop()           # last in first out

arr.reverse()   #
arr.pop()       # first in first out
arr.reverse()   #

list = []                           # fifo push(){
for i in range(10,-1,-1):           #
    list.append(i)                  #
list.reverse()                      # }

printfifo(list)
print()
printlifo(arr)
