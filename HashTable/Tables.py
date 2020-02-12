# initialization
dict = {'Name': 'Zara', 'Age': 7, 'Class': 'First'}

print("dict[Name]:", dict['Name'])
print("dict[Age]:", dict['Age'])

# table updating
dict['Age'] = 9
dict['Town'] = "Riga"

print("dict[Age]:", dict['Age'])
print("dict[Town]:", dict['Town'])

# deleting
del dict['Name']    # remove entry with key 'Name'
dict.clear()        # remove all entries in dict
del dict            # delete entire dictionary

