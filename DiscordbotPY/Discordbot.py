
import discord
import os


from dotenv import load_dotenv

load_dotenv()
TOKEN = os.getenv('DISCORD_TOKEN')

client = discord.Client()

@client.event
async def on_ready():
    print(f'{client.user} has connected to Discord!!!')

client.run(TOKEN)
bot = discord.client()


@bot.event
async def on_ready():
    #how much serves bot is connected to
    guild_count = 0

    for guild in bot.guilds:
        print(f"- {guild.id} (name: {guild.name})")

        guild_count = guild_count + 1
    
    print("ReminderBotPY is in " + str(guild_count) + " guilds.")

@bot.event
async def on_message(message):
    if message.content == "hello":
        await message.channel.send("Hi") 


bot.run("OTcxOTQ5OTE0MjA2NjU4NjYw.YnR85Q.ohYSaAOIsKfOvYsJiXoA3Ihoc18")
