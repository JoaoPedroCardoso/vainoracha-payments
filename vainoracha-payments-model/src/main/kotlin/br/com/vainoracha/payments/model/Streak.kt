import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

/**
 * Created by JoaoPedroCardoso on 11/05/18
 */
@Entity
data class Streak(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: String,
                  @JsonIgnore @ManyToOne @JoinColumn(name = "block_id") val block: Block,
                  val user: String,
                  val streakStatus: StreakStatus = StreakStatus.OPEN)

enum class StreakStatus constructor(val value: Int) {

    OPEN(1),
    AWAITING_PAYMENT(2),
    PAID(3),
    CANCELED(4),
    CLOSED(5);

    companion object {
        fun from(findValue: Int): StreakStatus = StreakStatus.values().first { it.value == findValue }
    }

}