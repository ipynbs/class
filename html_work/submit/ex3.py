from selenium import webdriver  # 사용하는 모듈 호출
from bs4 import BeautifulSoup
import sys  # 나중에 print 출력을 txt파일로 저장하기 위하여 사용됩니다.
import time  # 밑에 time.sleep(1)에서 사용됩니다.
import requests

# 나중에 output.txt라는 파일로 저장하는데, a: 이어 쓰기, w: 덮어쓰기, 경로지정 가능합니다.
sys.stdout = open("output.txt", "a")
path = "C:/Users/owner/Desktop/chromedriver.exe"  # 브라우저 드라이버가 위치한 경로를 입력합니다.
driver = webdriver.Chrome(path)
driver.implicitly_wait(3)  # 3초
url = "https://www.naver.com"  # 웹 크롤링 하고자 하는 홈페이지 주소를 적습니다.

time.sleep(1)  # 1초동안 지연됩니다. 컴퓨터 성능에 따라 지연이 필요하다면 사용합니다. (import time)

driver.get(url)  # 웹 크롤링할 사이트를 호출합니다.

# driver.find_element_by_name("HTML NAME")
# driver.find_element_by_xpath("//*[@id~~]")
# driver.find_element_by_tag_name(H1) #필요한 element를 찾아 위치를 지정해줍니다.

# 네이버 홈페이지의 [NAVER 로그인]을 클릭한다
driver.find_element_by_xpath('//*[@id="account"]/a').click()
driver.find_element_by_xpath(
    '//*[@id="account"]/a').send_keys('아이디')  # 아이디 텍스트를 쓴다


def iframe_move():
    """iframe 진입합니다."""
    content = driver.find_element_by_tag_name("iframe")
    driver.switch_to.frame(content)


def iframe_out():
    """iframe 탈출합니다."""
    driver.switch_to.default_content()


# 창 전환
print(driver.window_handles)
driver.switch_to.window(driver.window_handles[1])

html = driver.page_source  # element 가져오기
soup = BeautifulSoup(html, "html.parser")
datas = soup.select(".word")  # class가 ***.word 인 텍스트를 모두 선택합니다.
# datas=soup.find_all('div',{'class':'nick'})	# class가 nick인 데이터 찾는다.

for i in datas:
    print(i.get_text())  # 텍스트만 출력합니다.

for data in datas:
    print(data.text.strip())  # strip은 양쪽 공백을 지울 수 있으며 특정 문자도 삭제 가능합니다.

driver.quit()  # 브라우저를 종료합니다.
