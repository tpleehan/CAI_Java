'''
* 문자열 (string)
- 단일 문자를 따옴표('', "")로 감싸서 나열한 문자 데이터의 집합형태
- 따옴표 안에 어떤 형태의 데이터가 들어가도 문자로 인식한다.
- 전 세계의 모든 문자를 저장할 수 있고, 길이의 제한이 없다.
'''

# 나는 그에게 "도와줘!" 라고 말했다.
# 탈출문자를 적용해서(\) 따옴표를 문자로 표현할 수 있다.
s1 = "나는 그에게 \"안녕하세요\" 라고 말했다."

# Let's get together
s2 = "Let's get together"
# s2 = 'Let\'s get together'

file1 = 'C:\\temp\\new.jpg'
print(file1)

# 문자열 앞에 r이라는 접두어를 붙이면 해당 문자열은 탈출 문자를 적용하지 않는다.
file2 = r'C:\temp\new.jpg'
print(file2)

# 여러줄 주석으로 사용하는 '''은 문자열 선언이다. 변수로 담지 않으면 문장 주석으로 사용할 수 있다.
anthem = """
동해물과 백두산이 마르고 닳도록
하느님이 보우하사 우리나라 만세
무궁화 삼천리 화려 강산
대한 사람 대한으로 길이 보전하세
"""
print(anthem)

# \를 문장 끝에 붙여주면 line continue 효과가 있다.
anthem2 = """
동해물과 백두산이 마르고 닳도록 \
하느님이 보우하사 우리나라 만세 \
무궁화 삼천리 화려 강산 \
대한 사람 대한으로 길이 보전하세
"""
print(anthem2)

'''
* 문자열 연산
- 파이썬은 문자열의 덧셈 연산과 곱셈 연산을 지원한다.
- 덧셈 연산은 문자열을 서로 연결하여 결합한다.
'''
s3 = '오늘의 날씨는 '
s4 = '영하로 춥습니다.'
print(s3 + s4 + ' 따뜻한 옷을 입고 외출하세요.')

'''
- 파이썬에서는 문자열의 곱센 연산을 지원한다.
- 곱센 연산자 (*)로 문자열을 정해진 수 만큼 반복 연결한다.
'''
print('python ' * 4) 
print('-' * 30)

# print(s3 * 1.7) (x) 실수를 연산할 수 없다.
# print(s3 * s4) (x) 문자열과 정수만 연산 할 수 있다.
