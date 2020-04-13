text = "*hello""\n""*word"
lst = text.split("*")
result = ""
if lst[0] =="":
    lst = lst[1:]
for i,item in enumerate(lst):
    result +="["+ str(i+1)+"]"+item
print (result)

f=open("./a1.txt","w")
f.write(" hello \n word")
f=open("./a1.txt","r")
lines = f.readline()
n=0
with open("./a2.txt","a+") as f:
    for line in lines:
        f.writelines(str(n)+""+line)
        n=n+1


