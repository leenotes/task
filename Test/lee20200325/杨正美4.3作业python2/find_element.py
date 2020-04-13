from selenium import webdriver#导入selenium库
from selenium.webdriver.common.by import By
brower = webdriver.Chrome()#声明浏览器
brower.get("http://www.baidu.com/")
brower.find_element("id","kw").send_keys("yoyoketang")
brower.find_element('css selector',"#su").click()