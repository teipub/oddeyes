package teipub

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView

/**
 * Created by tei on 2016-09-10.
 * teipub.io
 */
@Controller
class HelloController {

    @RequestMapping("/hello")
    fun hello(): ModelAndView {
        val mav = ModelAndView()
        mav.addObject("name", "teipub.io-_-")

        return mav
    }
}
