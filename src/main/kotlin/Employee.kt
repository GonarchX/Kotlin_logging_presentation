import org.apache.log4j.LogManager
import org.apache.log4j.Logger
import java.lang.Exception

class Employee {
    companion object{
        private var EmployeeNum : Int = 1
    }

    val ID = EmployeeNum

    var isDefCostumeEquipped : Boolean = false

    var isOnWork : Boolean = false

    var isLive : Boolean = true

    //  Создание логгера
    var logger: Logger = LogManager.getLogger("Employee $ID")

    init {
        EmployeeNum++
    }

    fun doAction (someAction: () -> Unit){
        if (isLive == false){
            logger.fatal("Umer mujik((")
            throw Exception()
        } else someAction()
    }


    fun goToWork () {
        if (isOnWork == false){
            isOnWork = true
            logger.info("Go to work")
        }
        else
        {
            logger.warn("Tried to go to work when was at work")
        }
    }

    fun goToHome () {
        if (isOnWork == true){
            isOnWork = false
            logger.info("Go to home")
        }
        else
        {
            logger.warn("Tried to go to home when was at home")
        }
    }

    fun goToEat () = logger.debug("Go to eat")

    fun equipDefCostume() {
        if (isDefCostumeEquipped == false)
        {
            isDefCostumeEquipped = true
            logger.info("Equip costume")
        }
    }

    fun takeOffDefCostume() {
        if (isDefCostumeEquipped == true)
        {
            isDefCostumeEquipped = false
            logger.info("Took off suit")
        }
    }

    fun checkReactor() {
        logger.info("Check reactor")
        if (isDefCostumeEquipped != true) isLive = false
    }
}