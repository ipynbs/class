# 사용 예: Discord Bot
```python
...
import discord_fortuneTell
...
@bot.command(aliases=['운세'])
async def today_fortune(ctx, *args):
    args = list(args)
    await ctx.send(discord_fortuneTell.out(args))
# my_bot에 작성된 코드
```
```python
import erumyFortune
...
def out(args):
    ...
    return res_str
# src/discord_fortuneTell.py
```
[Discord.py](https://github.com/Rapptz/discord.py) 기반의 디스코드 개인 봇에 운세 알림 기능을 추가한 예제입니다.
## 출력 결과  

오늘의 운세  
---
![today](./img/tdy.PNG)  
내일의 운세  
---  
![tomorrow](img/tm.PNG)  
어느 날의 운세  
---  
![someday](img/smday.PNG)  
