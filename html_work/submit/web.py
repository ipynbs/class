import requests
from bs4 import BeautifulSoup
from flask import Flask, render_template

app = Flask(__name__)


@app.route("/")
def fortune():
    return render_template("fortune.html")


@app.route("/snake.html")
def snake():
    url = 'https://fortune.nate.com/contents/freeunse/dayjiji.nate?&jijiPage=0&jiji=05&isFirst=f&dateparam=0'
    req = requests.get(url)

    html = req.text
    soup = BeautifulSoup(html, 'html.parser')

    # rank = 1
    tag = soup.select('td[id="con_txt"]')
    result = tag[0].text

    # print(tag)
    # rank += 1
    return render_template("snake.html", result=result)


@app.route("/chicken.html")
def chicken():
    url = 'https://fortune.nate.com/contents/freeunse/dayjiji.nate?&jijiPage=0&jiji=09&isFirst=f&dateparam=0'
    req = requests.get(url)

    html = req.text
    soup = BeautifulSoup(html, 'html.parser')

    # rank = 1
    tag = soup.select('td[id="con_txt"]')
    result = tag[0].text

    # print(tag)
    # rank += 1
    return render_template("chicken.html", result=result)


@app.route("/cow.html")
def cow():
    url = 'https://fortune.nate.com/contents/freeunse/dayjiji.nate?&jijiPage=0&jiji=01&isFirst=f&dateparam=0'
    req = requests.get(url)

    html = req.text
    soup = BeautifulSoup(html, 'html.parser')

    # rank = 1
    tag = soup.select('td[id="con_txt"]')
    result = tag[0].text

    # print(tag)
    # rank += 1
    return render_template("cow.html", result=result)


@app.route("/dog.html")
def dog():
    url = 'https://fortune.nate.com/contents/freeunse/dayjiji.nate?&jijiPage=0&jiji=10&isFirst=f&dateparam=0'
    req = requests.get(url)

    html = req.text
    soup = BeautifulSoup(html, 'html.parser')

    # rank = 1
    tag = soup.select('td[id="con_txt"]')
    result = tag[0].text

    # print(tag)
    # rank += 1
    return render_template("dog.html", result=result)


@app.route("/dragon.html")
def dragon():
    url = 'https://fortune.nate.com/contents/freeunse/dayjiji.nate?&jijiPage=0&jiji=04&isFirst=f&dateparam=0'
    req = requests.get(url)

    html = req.text
    soup = BeautifulSoup(html, 'html.parser')

    # rank = 1
    tag = soup.select('td[id="con_txt"]')
    result = tag[0].text

    # print(tag)
    # rank += 1
    return render_template("dragon.html", result=result)


@app.route("/horse.html")
def horse():
    url = 'https://fortune.nate.com/contents/freeunse/dayjiji.nate?&jijiPage=0&jiji=06&isFirst=f&dateparam=0'
    req = requests.get(url)

    html = req.text
    soup = BeautifulSoup(html, 'html.parser')

    # rank = 1
    tag = soup.select('td[id="con_txt"]')
    result = tag[0].text

    # print(tag)
    # rank += 1
    return render_template("horse.html", result=result)


@app.route("/monkey.html")
def monkey():
    url = 'https://fortune.nate.com/contents/freeunse/dayjiji.nate?&jijiPage=0&jiji=08&isFirst=f&dateparam=0'
    req = requests.get(url)

    html = req.text
    soup = BeautifulSoup(html, 'html.parser')

    # rank = 1
    tag = soup.select('td[id="con_txt"]')
    result = tag[0].text

    # print(tag)
    # rank += 1
    return render_template("monkey.html", result=result)


@app.route("/pig.html")
def pig():
    url = 'https://fortune.nate.com/contents/freeunse/dayjiji.nate?&jijiPage=0&jiji=11&isFirst=f&dateparam=0'
    req = requests.get(url)

    html = req.text
    soup = BeautifulSoup(html, 'html.parser')

    # rank = 1
    tag = soup.select('td[id="con_txt"]')
    result = tag[0].text

    # print(tag)
    # rank += 1
    return render_template("pig.html", result=result)


@app.route("/rabbit.html")
def rabbit():
    url = 'https://fortune.nate.com/contents/freeunse/dayjiji.nate?jijiPage=0/'
    req = requests.get(url)

    html = req.text
    soup = BeautifulSoup(html, 'html.parser')

    # rank = 1
    tag = soup.select('td[id="con_txt"]')
    result = tag[0].text

    # print(tag)
    # rank += 1
    return render_template("rabbit.html", result=result)


@app.route("/rat.html")
def rat():
    url = 'https://fortune.nate.com/contents/freeunse/dayjiji.nate?&jijiPage=0&jiji=00&isFirst=f&dateparam=0'
    req = requests.get(url)

    html = req.text
    soup = BeautifulSoup(html, 'html.parser')

    # rank = 1
    tag = soup.select('td[id="con_txt"]')
    result = tag[0].text

    # print(tag)
    # rank += 1
    return render_template("rat.html", result=result)


@app.route("/sheep.html")
def sheep():
    url = 'https://fortune.nate.com/contents/freeunse/dayjiji.nate?&jijiPage=0&jiji=07&isFirst=f&dateparam=0'
    req = requests.get(url)

    html = req.text
    soup = BeautifulSoup(html, 'html.parser')

    # rank = 1
    tag = soup.select('td[id="con_txt"]')
    result = tag[0].text

    # print(tag)
    # rank += 1
    return render_template("sheep.html", result=result)


@app.route("/tiger.html")
def tiger():
    url = 'http://fortune.nate.com/contents/freeunse/dayjiji.nate?&jijiPage=0&jiji=02&isFirst=f&dateparam=0'
    req = requests.get(url)

    html = req.text
    soup = BeautifulSoup(html, 'html.parser')

    # rank = 1
    tag = soup.select('td[id="con_txt"]')
    result = tag[0].text

    # print(tag)
    # rank += 1
    return render_template("tiger.html", result=result)


app.run(debug=True, port=5000)
