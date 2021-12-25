fun main() {
    print("Загружено!")
    print("Всем привет!")
    println("Напишите сколько у вас денег:")
    var money = readLine()!!.toDouble()
    print("Напишите, сколько рублей стоит тот или иной подарок:")
    var gift = readLine()!!.toDouble()
    if (money > gift) {
        print("Всё ОК!")
    } else {
        print("Денег не хватает - копи ещё!")
    }
    if (money==gift)
    {

    }

}