from flask import Flask,render_template,request
import random
import time
from flaskext.markdown import Markdown

app = Flask(__name__)

win = 0
lose = 0
draw = 0

Markdown(app, extentions=['nl2br', 'fenced_code'])

@app.route("/")
def index():
    return render_template('index.html',gugu="")

@app.route("/game")
def game():
    global win,lose,draw
    com = random.randint(0,2) #0가위, 1바위, 2보
    if request.args.get('game') is not None:
        if request.args.get('game') == '가위':
            if com == 0:
                draw += 1
            elif com == 1:
                lose += 1
            else:
                win += 1
        
        if request.args.get('game') == '바위':
            if com == 0:
                draw += 1
            elif com == 1:
                lose += 1
            else:
                win += 1
                
        if request.args.get('game') == '보':
            if com == 0:
                draw += 1
            elif com == 1:
                lose += 1
            else:
                win += 1
                
        elif request.args.get('game') == '리셋':
            win,draw,lose = 0,0,0
                
    return render_template('index.html',win=win,lose=lose,draw=draw)

@app.route("/time")
def time():
    print("time")
    if request.args.get('time') is not None \
            and request.args.get('time') !="":
        se = int(request.args.get('time'))
        print('se = ',se)
        hour = se//(60*60)
        hour_mod = se%(60*60)
        min = hour_mod//(60)
        sec = se%(60)

    return render_template("index.html",hour=hour,min=min,sec=sec)

@app.route("/gugudan")
def gugudan():
    gugu = ""
    fi,se = 0,0
    if request.args.get('fi') != "" and request.args.get('se') != "":
        fi = int(request.args.get('fi'))
        se = int(request.args.get('se'))
    (fi,se) = (fi,se) if fi < se else (se,fi)
    print('fi = ',fi)
    print('se = ',se)
    for start in range(fi,se+1):
        for i in range(1,10):
            gugu += fr"{start} * {i} = {start * i}<br>"
        
    return render_template("index.html",gugu=gugu)
app.run(debug=True)