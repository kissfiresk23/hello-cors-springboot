## 测试跨域（单项目进行模拟，启动后以localhost访问进入测试页，以127.0.0.1的不同域来访问自己的接口（浏览器会认为是跨域）
	- 三个类处理跨域，选其中一种方案即可。建议 CorsConfig。CorsFilter 和 CorsIntercetor 没那么优雅。
	- 这篇博客对原理讲述得较深入，推荐 http://www.ruanyifeng.com/blog/2016/04/cors.html