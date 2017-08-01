@Controller


class MyApp {

    @RequestMapping("/")
    @ResponseBody
    String Message(){
        return "<h1>hello World!</h1>"
    }
}