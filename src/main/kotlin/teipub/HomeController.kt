package teipub

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

/**
 * Created by tei on 2016-08-15.
 * teipub.io
 */
@Controller
class HomeController {

    @RequestMapping("/")
    fun home(): ModelAndView {
        val mav = ModelAndView("home")
        mav.addObject("name", "teipub")
        return mav
    }
}
