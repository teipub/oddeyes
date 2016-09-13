package teipub

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class OddEyesBlogApplication  {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(OddEyesBlogApplication::class.java, *args)
        }
    }
}