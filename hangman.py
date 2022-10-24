import random,os
wordList = ["anime", "volleyball", "watcher", "king", "promise", "fly"]
chosenWord = random.choice(wordList)
lives = 6
letters = []

men = [
"Welcome to Hangman Eternity, where you cannot stop playing...literally\
\n\
|------\n\
|    O\n\
| ---|---\n\
|   / \\ \n\
|  /   \\ \n\
|_____",

"Welcome to Hangman Eternity, where you cannot stop playing...literally\
\n\
|------\n\
|    O\n\
| ---|---\n\
|   /  \n\
|  /     \n\
|_____",

"Welcome to Hangman Eternity, where you cannot stop playing...literally\
\n\
|------\n\
|    O\n\
| ---|---\n\
|     \n\
|      \n\
|_____",

"Welcome to Hangman Eternity, where you cannot stop playing...literally\
\n\
|------\n\
|    O\n\
| ---|\n\
|    \n\
|   \n\
|_____",

"Welcome to Hangman Eternity, where you cannot stop playing...literally\
\n\
|------\n\
|    O\n\
|    |\n\
|    \n\
|   \n\
|_____",

"Welcome to Hangman Eternity, where you cannot stop playing...literally\
\n\
|------\n\
|    O\n\
| \n\
|   \n\
|   \n\
|_____",

"Welcome to Hangman Eternity, where you cannot stop playing...literally\
\n\
|------\n\
|    \n\
| \n\
|   \n\
|   \n\
|_____",

]

def mainScreen():
  winLose()
  os.system('clear')
  stickman()
  usedLetters()
  drawWord()
  getLetter()
  
def stickman():
  print(men[lives])
def usedLetters():
  print("".join(letters))
def drawWord():
  userWord= []
  for letter in chosenWord:
    if letter in letters:
      userWord.append(letter)
    else:
      userWord.append("_")
  print("".join(userWord))
def getLetter():
  global lives
  gotten= input("Enter a letter: ")
  if not gotten.isalpha():
    mainScreen()
  elif not len(gotten)==1:
    mainScreen()
  elif gotten in letters:
    mainScreen()
  else:
    letters.append(gotten)
    if not gotten in chosenWord:
      lives = lives-1
    mainScreen()

def drawTheWord():
  word = []
  for letter in chosenWord:
    if letter in letters:
      word.append(letter)
    else:
      word.append("_")
  print(" ".join(word))

def winLose():
  global lives
  global chosenWord
  global letters
  if lives==0:
    os.system('clear')
    print("You lost!!!")
    input("Press enter to play again")
    chosenWord = random.choice(wordList)
    lives = 6
    letters = []
  else:
    won = True
    for letter in chosenWord:
      if letter in letters:
        continue
      else:
        won = False
    if won:
      print("You won!!!")
      input("Press enter to play again")
      chosenWord = random.choice(wordList)
      lives = 6
      letters = []

      
mainScreen()
       

