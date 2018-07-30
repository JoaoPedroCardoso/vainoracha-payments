import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by JoaoPedroCardoso on 11/05/18
 */
@Entity
data class Block(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: String,
                 var name: String,
                 var phone: String?,
                 var dayOfOperation: String?,
                 var note: String?,
                 var address: String)