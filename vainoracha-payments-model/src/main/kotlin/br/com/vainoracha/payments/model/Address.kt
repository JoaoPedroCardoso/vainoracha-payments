import java.util.UUID
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

/**
 * Created by JoaoPedroCardoso on 11/05/18
 */
@Entity
@Table(name = "Address")
data class Address(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: UUID,
                   val publicPlace: String,
                   val number: String,
                   val complement: String?,
                   val city: String,
                   val neighborhood: String,
                   val state: String,
                   val zipCode: String,
                   val coordinate: String?)