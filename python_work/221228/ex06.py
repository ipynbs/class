import zipfile

# μμΆνλ€......
with zipfile.ZipFile('my.zip','w') as f:
    f.write('ex01.py')
    f.write('memo.txt')
    f.write('test.txt')