from selenium import webdriver#导入selenium库
brower = webdriver.Chrome()#声明浏览器
ur1 = "http:www.baidu.com"
brower.get(ur1)#打开网址
print(brower.page_source)#打印网页源代码
brower.close()#关闭浏览器
