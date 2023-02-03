import requests
from bs4 import BeautifulSoup

# 오늘의 운세 띠별
url = 'https://fortune.nate.com/contents/freeunse/dayjiji.nate?jijiPage=0/'
req = requests.get(url)

html = req.text
soup = BeautifulSoup(html, 'html.parser')

# rank = 1
for tag in soup.select('td[id="con_txt"]'):
    print(tag)
    # rank += 1
