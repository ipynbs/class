from flask import Blueprint,render_template,request,url_for,redirect
import pymysql
import config

prefix = 'freeboard'

app = Blueprint(prefix,__name__,url_prefix=f'/{prefix}')

@app.route("insertform")
def insertform():
    return render_template('freeboard/insertform.html')

@app.route("insertproc")
def insertporc():
    title = request.args.get('title')
    content = request.args.get('content')
    writer = request.args.get('writer')
    
    connection = config.connect()
    cursor = connection.cursor()
    sql = f"""insert into freeboard (title,content,writer,regdate) values('{title}','{content}','{writer}',now())"""
    cursor.execute(sql)
    connection.commit()
    config.close(connection)
    
    return redirect('/freeboard/select')

@app.route("select")
def select():
    pageNum = request.args.get('pageNum')
    '''
    pageNum None
    pageNum 1
    pageNum 2
    '''
    if pageNum == None:
        pageNum =1
    else:
        pageNum = int(pageNum)
        
    '''
    1 -> 0 -> (1-1)*3 = 0
    2 -> 3
    3 -> 6
    4 -> 9
    '''
    connection = config.connect()
    cursor = connection.cursor()
    sql = f'select * from freeboard ORDER BY idx DESC LIMIT {((pageNum -1)*3)},3'
    cursor.execute(sql)
    res = cursor.fetchall()
    config.close(connection)
    
    connection = config.connect()
    cursor = connection.cursor()
    sql = f'select count(idx) from freeboard'
    cursor.execute(sql)
    cnt = cursor.fetchall()
    rowcnt = int(cnt[0][0])
    Pagecnt = rowcnt//3
    pagecnt = Pagecnt if rowcnt%3==0 else Pagecnt+1
    print('pagecnt',pagecnt)
    print('Pagecnt',Pagecnt)
    config.close(connection)
    return render_template(f'{prefix}/select.html',res=res,pagecnt=pagecnt,pageNum=pageNum)