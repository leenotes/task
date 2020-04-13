from selenium import webdriver
from selenium.webdriver.common.keys import Keys#导入key模块
driver = webdriver.Chrome()
driver.implicitly_wait(3)#智能等待时间
driver.get("https://pypi.org/")#进入网页
print(driver.title)
assert 'Python'in driver.title
elem = driver.find_element_by_name('q')#输入框元素
#模拟键盘操作
elem.clear()
elem.send_keys('deniro')
elem.send_keys(Keys.RETURN)
assert 'No results found.'not in driver.page_source#返回页面员代码
driver.close()#关闭页面

