
import pgzrun
import random
WIDTH=400
HEIGHT=400
score=0
 
game_over=False
fox=Actor("fox")
fox.pos=100,100
coin=Actor("coin")
coin.pos=200,200


def draw():
   screen.fill("limegreen")
   fox.draw()
   coin.draw()
   screen.draw.text("Score:"+str(score),color="black",topleft=(10,10))
   if game_over:
       screen.fill("cyan")      
       screen.draw.text("FinalScore:"+str(score),topleft=(10,10),fontsize=60)



def place_coin():
   coin.x=random.randint(20,(WIDTH-20))
   coin.y=random.randint(20,(HEIGHT-20))
 
# Function to set the game_over variable to True
def time_up():
   global game_over
   game_over=True
  
def update():
   global score   
   if keyboard.left:    
       fox.x=fox.x-2      
   elif keyboard.right: 
       fox.x=fox.x+2
   elif keyboard.up:   
       fox.y=fox.y-2
   elif keyboard.down: 
       fox.y=fox.y+2
   coin_collected=fox.colliderect(coin) 
   if coin_collected:
       score=score+10
       place_coin()

clock.schedule(time_up,20.0)
place_coin()
pgzrun.go()
 
