# 笔记

### 参数传递
1.前后端参数传递

   * 声明
   ```
   @RequestMapping("/hello/{p1}/{p2}")
       public Result test(@PathVariable String p1, @PathVariable int p2) {
           return "p1=" + p1 + ",p2=" + p2 ;
       }
   
   @RequestMapping("/hello")
   public Result hello(@RequestParam String p3, @RequestParam String p4) {
       return "p3=" + p3 + ",p4=" + p4;
   }
   
   参数也可设置默认值，当前端不传递该参数时，会使用默认值
   @RequestParam(value = "p4", defaultValue = "testP4") String p4
   ```
   * 调用：
   ```
   /hello/p1Value/p2Value  接口声明时有两个参数，前端调用也要传递两个
   /hello?p3=p3Value&p4=p4Value
   ```