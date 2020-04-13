from selenium import webdriver#导入selenium库
brower = webdriver.Chrome()#声明浏览器
brower.get("http://www.taobao.com")
input_1 = brower.find_elements_by_id("q")
input_2 = brower.find_element_by_css_selector("#q")
input_3 = brower.find_element_by_name("q")
print(input_1)
print(input_2)
print(input_3)
brower.close()