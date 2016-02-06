import numpy as np
import re

print "Connected"

## Regex to get numbers 
p = re.compile('\d+')

## Regex to get alphabets
p2 = re.compile('[a-z]', re.IGNORECASE)

p3 = re.compile('\d\d\|\d\d\|[0-4][0-9]')

print p3.findall("50|40|40")
print p.findall("asdfghjkl 456 123")

print p2.findall('asdaf ASD 456')