import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

/**
 * Created by JoaoPedroCardoso on 24/05/18 */

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = ["br.com.vainoracha.core.model"])
@EnableJpaRepositories(basePackages = ["br.com.vainoracha.core.repository"])
@EnableTransactionManagement
open class RepositoryConfiguration