package acc.br.primeiraAPI

import org.springframework.web.bind.annotation.RestController
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
class HelloController(val helloService: HelloService) {

    @GetMapping("/hello")
    fun foo(): String {
        return "hello world!"
    }

    @GetMapping("/service")
    fun helloKotlinService(): String {
        return helloService.getHello()
    }


}