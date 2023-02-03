from selenium import webdriver
from bs4 import BeautifulSoup
import time
import requests
import sys

url = 'https://naver.com'
response = requests.get(url)

href_list = []  # 크롤링 URL

if response.status_code == 200:
    # HTML 코드를 가져온다
    html = response.text
    soup = BeautifulSoup(html, 'html.parser')

    # a태그를 모두 찾음
    a = soup.find_all('a')  # 리스트

    for i in a:
        try:
            href = i.attrs['href']  # href를 찾음
            text = i.string
        except:
            pass
        href_list.append(href)

# 주소만 반환한다.
for name in href_list[:]:
    if name.find('?idx=') == -1:
        href_list.remove(name)
