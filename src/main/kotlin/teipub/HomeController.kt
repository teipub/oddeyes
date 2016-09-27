package teipub

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by tei on 2016-08-15.
 * teipub.io
 */
@Controller
class HomeController {
    @RequestMapping("/")
    fun home(model: Model): String {
        model.addAttribute("name", "teipub")
        return "home"
    }
}


