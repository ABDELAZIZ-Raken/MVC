package org.ldv.myhello.controller
import jakarta.servlet.http.HttpServletRequest
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller

class MainController {
    @GetMapping("/")
    @ResponseBody
    fun myResponse() : String {
        return "Hello World du Contrôleur ! "
    }
    @GetMapping("/hello")
    @ResponseBody
    fun querryString(@RequestParam querry: Map<String, String>) : String {
        val nom = querry["nom"] ?: ""
        val prenom = querry["prenom"] ?: ""
        return "Hello ${nom} ${prenom}!"
    }
    @GetMapping("/hello-{language}")
    @ResponseBody
    fun findLanguage(@PathVariable("language")language: String,)


}