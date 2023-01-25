# erumyFortune
`이루미작명소의 서비스 종료로 이 모듈은 더이상 작동하지 않습니다.`

erumyFortune은 [이루미작명SYS](http://www.erumy.com/)의 무료 서비스 '오늘의 운세'를 이용한 크롤링 기반의 모듈입니다. 생년월일과 날짜를 전송하여 운세 데이터를 받습니다.  

```json
{
    "Fortune": "오늘은 대길이다. 하는 일은 모두 잘 될 것이다.", 
    "day": "20190108"
}
```
전송된 데이터는 위와 같은 `dict` 자료형으로 반환됩니다.  

# 필요한 모듈
```sh
pip install bs4
```
```sh
pip install requests
```
실행을 위해선 [BeautifulSoup](https://www.crummy.com/software/BeautifulSoup/bs4/doc/) 라이브러리와 [requests](http://docs.python-requests.org/en/master/) 라이브러리가 필요합니다. `bash`나 `명령 프롬트` 등의 `CLI`를 열고 위의 문구를 타이핑하여 설치해주세요.  

# 기타
데이터에 대한 모든 저작권은 [이루미작명SYS](http://www.erumy.com/)에 있으므로 개발자는 이 모듈에 대해 어떠한 저작권도 주장하지 않습니다.
