# ex03.html과 똑같은것
class Car:
    def __init__(self, name):
        self.name = name
        print('생성자 호출')

    def getDrive(self):
        print('getDrive')

    def __str__(self):
        # print('toString')
        return f'{self.name} = toString'


car = Car("아무")
car.getDrive()
# car.__str__()
print(car)

cars = [Car("현대"), Car("기아"), Car("르노삼성")]
for car in cars:
    print(car)
