import usecsv
import os

print(os.getcwd())
os.chdir(r'D:\240507-edu1\python-data-analysis1\20240626')

a = [['국어','영어','수학'],[99,88,77]]
usecsv.writecsv('test.csv', a)

total = usecsv.opencsv(r'D:\240507-edu1\python-data-analysis1\20240626\popSeoul2023.csv')
print(usecsv.switch(total))