import org.springframework.stereotype.Controller;
import orq.springframework.vi.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
1mport org.springframework.web.bind.annotation.RestController;


@Controller
//GRestController
public class HelloController {
    @GetMapping(value="/")
    public String hello() {return "Hello Vistula, in my first Spring controller";}

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name='name',required=false,defaultValue='World') String name, Model moel){
        model.addAttribute(attributeName: 'name',name);
        return greeting
    }

}