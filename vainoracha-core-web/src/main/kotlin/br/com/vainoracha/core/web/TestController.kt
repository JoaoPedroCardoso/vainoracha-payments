package br.com.vainoracha.core.web

import br.com.vainoracha.core.api.TestApi
import br.com.vainoracha.core.api.representation.TestRepresentation
import br.com.vainoracha.core.service.TestService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

/**
 * Created by JoaoPedroCardoso on 23/05/18
 */
@RestController
class TestController @Autowired constructor(private val testService: TestService) : TestApi {

    override fun hello(@PathVariable(value = "name") name: String) = TestRepresentation(testService.hello(name).value)

}