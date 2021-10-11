import java.lang.Exception

fun main()
{
    //Обычный день
    var e1 : Employee = Employee()
    e1.doAction { e1.goToWork() }
    e1.doAction { e1.goToEat() }
    e1.doAction { e1.equipDefCostume() }
    e1.doAction { e1.checkReactor() }
    e1.doAction { e1.takeOffDefCostume() }
    e1.doAction { e1.goToHome() }

    println()
    //Остался на работе по каким-то причинам
    var e2 : Employee = Employee()
    e2.isOnWork = true
    e2.doAction { e2.goToWork() }
    e2.doAction { e2.goToEat() }
    e2.doAction { e2.goToHome() }
    println()

    try {
    //Пошел проверять реактор без защитного костюма
    var e3 : Employee = Employee()
    e3.isOnWork = true
    e3.doAction { e3.goToWork() }
    e3.doAction { e3.goToEat() }
    e3.doAction { e3.checkReactor() }
    e3.doAction { e3.goToHome() }
    }
    catch (e : Exception){
        // Что-то делаем
    }
}
