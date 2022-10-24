# Have you ever had a piggy bank?
# Imagine creating a game where:
# A fox collects coins that are randomly placed
# For each coin collected your score increases by 10
# Let's get started
'''Task 1:  Set the playground'''
print("***** Task 1: ******") 
print()
# Import the pgzrun and random modules
# Set the WIDTH and HEIGHT variables to 400
# Create a variable score and initialize it to 0
# Create a boolean variable called game_over that keeps a tab on the status of the game.
# Set the game_over variable to False
# Use the Actor class to create the fox and coin sprites.
# Place the:
# - fox sprite at coordinate position 100,100
# - coin sprite at coordinate position 200,200

import pgzrun
import random
# Set the height and width of the screen
WIDTH=400
HEIGHT=400
score=0
 
# Boolean variable to say if the game is over or not
game_over=False
# Create two actors using the images and setting their position
fox=Actor("fox")
fox.pos=100,100
coin=Actor("coin")
coin.pos=200,200


'''Task 2:  Get the Actors'''
print("***** Task 2: ******") 
print()
# Use draw() function to:
# - Set the background of the screen to limegreen [Hint: Use screen.fill()]
# - Load the fox and coin sprite [Hint: Use draw()]
# - Display the score [Hint: Use screen.draw.text()]
# If the game is over:
# - Set the background color to cyan
# - Display the final score 

def draw():
   screen.fill("limegreen")
   fox.draw()
   coin.draw()
   screen.draw.text("Score:"+str(score),color="black",topleft=(10,10))
   if game_over:
       screen.fill("cyan")      
       screen.draw.text("FinalScore:"+str(score),topleft=(10,10),fontsize=60)


'''Task 3:  Ready to Play'''
print("***** Task 3: ******") 
print()
# Write a function 
# - to place the coin randomly
# - set the game_over variable to true
# Use the update function to 
# - obtain the keyboard presses and 
# - move the fox by 2 pixel each time the key is pressed
# Set the game to play for 20 seconds. [Hint: clock.schedule(time_up,20.0)
# Call the function to place the coin
# Ensure your last line of the program is pgzrun.go()

# Function to place the coin
def place_coin():
   coin.x=random.randint(20,(WIDTH-20))
   coin.y=random.randint(20,(HEIGHT-20))
 
# Function to set the game_over variable to True
def time_up():
   global game_over
   game_over=True
  
# The built-in update function will run automatically 60 times a second
def update():
   global score   
   if keyboard.left:    # Moves fox 2 pixels to left if left arrow key is pressed
       fox.x=fox.x-2      
   elif keyboard.right: # Moves fox 2 pixels to right if left arrow key is pressed
       fox.x=fox.x+2
   elif keyboard.up:    # Moves fox 2 pixels to up if up arrow key is pressed
       fox.y=fox.y-2
   elif keyboard.down:  # Moves fox 2 pixels to down if down arrow key is pressed
       fox.y=fox.y+2
   coin_collected=fox.colliderect(coin) #Variable will be true if the fox touches the coin
   if coin_collected:
       score=score+10
       place_coin()
# Set the time schedule to 20 seconds
clock.schedule(time_up,20.0)
place_coin()
pgzrun.go()
 

''' Awesome!! That's a brilliant game you have developed. '''
