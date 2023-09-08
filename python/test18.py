
from wordcloud import WordCloud

text = ""

with open("withNomi.txt", "r", encoding="utf-8") as f:
    lines = f.readlines()
    for line in lines:
        text+=line

print(text)
