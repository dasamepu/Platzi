string = "HoLa"
new_string = ""

for letter in string:
  if letter == letter.upper():
    new_string += letter.lower()
  else:
    new_string += letter.upper()

print(new_string)
