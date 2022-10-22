import math
from tkinter import *

window=Tk()
window.title("Advanced Calculator", )
window.geometry('600x600')

lab1 = Label(text = "Enter first number: ", fg = "pink" ,font=("Times new roman", 20))
lab1.grid(column=1, row=0)

entry1 = Entry(window, width=15)
entry1.grid(column=1, row=2)

lab2= Label(text="Enter second number: ", fg="pink", font=("Times new roman", 20))
lab2.grid(column=1, row=3)

entry2=Entry(window,width=15)
entry2.grid(column=1, row=4)


def add():
  ans=int(entry1.get())+int(entry2.get())
  lab3.configure(text=ans)

def sub():
  ans=int(entry1.get())-int(entry2.get())
  lab3.configure(text=ans)

def div():
  ans=int(entry1.get())/int(entry2.get())
  lab3.configure(text=ans)

def mult():
  ans=int(entry1.get())*int(entry2.get())
  lab3.configure(text=ans)

def fac():
  ans=math.factorial(int(entry1.get()))
  lab3.configure(text=ans)
def logar():
  ans=math.log(int(entry1.get()),int(entry2.get()))
  lab3.configure(text=ans)

def GCD():
  ans=math.gcd(int(entry1.get()),int(entry2.get()))
  lab3.configure(text=ans)

def power():
  ans=math.pow(int(entry1.get()), int(entry2.get()))
  lab3.configure(text=ans)

def modulus():
  ans = int(entry1.get())%int(entry2.get())
  lab3.configure(text=ans)

def hypo():
  ans= math.hypot(int(entry1.get()),int(entry2.get()))
  lab3.configure(text=ans)

def sqr():
  ans= math.sqrt(int(entry1.get()))
  lab3.configure(text=ans)

lab3 = Label(text = "Answer ", font=("Times new roman", 20), fg="black")  
lab3.grid(column=1, row=7)

btn1 = Button(text="+", fg="white", bg="pink", command=add)
btn1.grid(column=0, row=6)
btn2 = Button(text="-", fg="white", bg="pink", command=sub)
btn2.grid(column=0,row=7)
btn3=Button(text="x", fg="white", bg="pink", command=mult)
btn3.grid(column=0, row=8)
btn4=Button(text="/", fg="white",bg="pink",command=div)
btn4.grid(column=0, row=9)
btn9=Button(text="GCD", fg="white", bg="pink", command=GCD)
btn9.grid(column=0, row=10)
btn5=Button(text="FACTORIAL", fg="white", bg="pink", command=fac)
btn5.grid(column=2,row=6)
btn6=Button(text="LOGARITHM", fg="white", bg="pink", command=logar)
btn6.grid(column=2, row=7)
btn7=Button(text="MODULUS", fg="white",bg="pink", command=modulus)
btn7.grid(column=2, row=8)
btn8=Button(text="POWER", fg="white", bg="pink", command=power)
btn8.grid(column=2, row=9)
btn10=Button(text="SQR ROOT", fg="white", bg="pink", command=sqr)
btn10.grid(column=2, row=10)
btn11=Button(text="HYPOTENUSE", fg="white", bg="pink", command=hypo)
btn11.grid(column=2,row=11)