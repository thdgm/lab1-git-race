package es.unizar.webeng.hello.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@Controller
class FirstController {


    @RequestMapping("first")
    fun firstEndpoint(model: MutableMap<String, Any>): String {
        return "page1.html";

    }
}