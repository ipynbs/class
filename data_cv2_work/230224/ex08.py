import cv2

cat = cv2.imread('cat.jpg')
print(cat.shape)
# print(cat[::100])
cv2.imshow('cat',cat)
key = cv2.waitKey(0) # 몇초동안 출력할건지
print(key)