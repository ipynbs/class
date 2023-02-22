import pymysql

host = '127.0.0.1'
port = 3306
user = 'root'
password = '1234'
dbname = 'SHkim'
charset = 'utf8'


def selectRow(idx):
    db = pymysql.connect(
        host=host,
        port=port,
        user=user,
        password=password,
        db=dbname,
        charset=charset
    )
    sql = f'select * from freeboard where idx = {idx}'
    cursor = db.cursor()
    cursor.execute(sql)
    res = cursor.fetchone()
    db.close()
    return res


def select(page):
    db = pymysql.connect(
        host=host,
        port=port,
        user=user,
        password=password,
        db=dbname,
        charset=charset
    )
    startrow = (page-1)*3
    # 1페이지이면 startrow 가 0
    # 2페이지이면 startrow 가 3
    # 3페이지이면 startrow 가 6
    sql = f'select * from freeboard order by idx desc limit {startrow},3'
    cursor = db.cursor()
    cursor.execute(sql)
    res = cursor.fetchall()
    db.close()
    return res


def selectPageRowCnt():
    db = pymysql.connect(
        host=host,
        port=port,
        user=user,
        password=password,
        db=dbname,
        charset=charset
    )
    sql = f'SELECT COUNT(idx) FROM freeboard;'
    cursor = db.cursor()
    cursor.execute(sql)
    res = cursor.fetchone()
    rowCnt = res[0]
    pageCnt = int(rowCnt / 3)  # 소수점 삭제
    pageCnt = pageCnt if rowCnt % 3 == 0 else pageCnt + 1
    print(pageCnt, rowCnt)
    db.close()
    return pageCnt, rowCnt


def insert(title, content, writer, star):
    db = pymysql.connect(
        host=host,
        port=port,
        user=user,
        password=password,
        db=dbname,
        charset=charset
    )
    sql = f"""INSERT INTO freeboard
        (title,content,writer,regdate,star)
        VALUES
        ('{title}','{content}','{writer}',NOW(),'{star}')"""
    cursor = db.cursor()
    cursor.execute(sql)
    db.commit()
    db.close()
    print('insert해야됨')


def delete(idx):
    db = pymysql.connect(
        host=host,
        port=port,
        user=user,
        password=password,
        db=dbname,
        charset=charset
    )
    sql = f"""DELETE FROM freeboard WHERE idx = {idx}"""
    cursor = db.cursor()
    cursor.execute(sql)
    db.commit()
    db.close()
    print("delete해야됨", idx)


def update(title, content, writer, idx):
    db = pymysql.connect(
        host=host,
        port=port,
        user=user,
        password=password,
        db=dbname,
        charset=charset
    )
    sql = f"""UPDATE freeboard
            SET title = '{title}',
	        content = '{content}',
	        writer = '{writer}'
            WHERE idx = {idx};"""
    cursor = db.cursor()
    cursor.execute(sql)
    db.commit()
    db.close()
    print("update수정해야됨")
