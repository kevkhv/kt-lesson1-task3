fun main() {

    var amountPurchases = 2 // счетчик покупок в магазине
    val price = 10050     // цена товара в копейках
    val amount = 120        // количество товара
    val sumPurchases = amount * price   // сумма покупки
    val discount =
        if (sumPurchases > 100100 && sumPurchases < 999900) 10000 else if (sumPurchases > 1000000) (sumPurchases * 0.05).toInt() else 0 // основная скидка
    val total = sumPurchases - discount // сумма покупок с учетом основной скидки
    val moreDiscount =
        if (amountPurchases > 1) (total * 0.01).toInt() else 0 // дополнительная скидка
    val total1 = total - moreDiscount  // сумма покупок с учетом дополнительной скидки
    amountPurchases += 1 // увеличиваем счетчик на 1 после каждой покупки

    println("Покупка - ${sumPurchases / 100} рублей")
    println("После применения 5% скидки - ${total / 100} рублей ${total % 100} копеек ")
    println("После применения 1% скидки - ${total1 / 100} рублей ${total1 % 100} копеек.")


}
