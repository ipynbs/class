import qrcode

img = qrcode.make('안녕하세요 김길동입니다')
img.save('a.png')