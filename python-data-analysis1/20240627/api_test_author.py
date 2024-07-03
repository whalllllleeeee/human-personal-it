import requests                 # api 호출 패키지
from bs4 import BeautifulSoup   # json 혹은 xml을 parsing하는 패키지

api_key = 'zOOiXPwM%2FCZ7Kfva%2FV082AoisG0BN6tS9lG2NyDPDoXFc8PRgLIeBVpq5lEE5YTonMXlFRXp5lTN0XomjS1Rpg%3D%3D'
base_request_url = f'http://apis.data.go.kr/9720000/searchservice/basic?serviceKey={api_key}&pageno=1&displaylines=10&search=자료명,미국'

response = requests.get(base_request_url)
soup = BeautifulSoup(response.text, 'lxml')

print(soup.prettify())