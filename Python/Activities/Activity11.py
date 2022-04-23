dict = {'Apple': 100, 'Mango': 149, 'Papaya': 26, 'Guava': 35}
print("dict['Apple']: ", dict['Apple'])
print("dict['Mango']: ", dict['Mango'])

key = input("Enter a fruit to check")
if key.lower in dict.keys():
    print(f"{key} is Present")
else :
  print(f"{key} is not Present")
    