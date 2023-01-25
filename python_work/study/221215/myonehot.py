from tensorflow.keras.preprocessing.text import Tokenizer
from tensorflow.keras.utils import to_categorical

text = "나랑 점심 먹으러 갈래 점심 메뉴는 햄버거 갈래 갈래 햄버거 최고야"

tokenizer = Tokenizer()
tokenizer.fit_on_texts([text])
print('단어 집합 :',tokenizer.word_index)

sub_text = '''
    점심 먹으러 갈래 메뉴는 햄버거 최고야
    '''
encoded = tokenizer.texts_to_sequences([sub_text])[0]
print(encoded)
one_hot = to_categorical(encoded)
print(one_hot)