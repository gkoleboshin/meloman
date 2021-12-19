fun main(args: Array<String>) {
    val itemPrice = 100_000
    val itemPriceRubl = itemPrice/100
    val itemPriceCop = itemPrice%100
    println("покупка $itemPriceRubl руб. $itemPriceCop коп. ->")
    val regularCustomer = true
    val lastTotalPrice = 1_000_000
    val discount = if (lastTotalPrice<100_100){0}else if(lastTotalPrice<1_000_100){10_000}else{lastTotalPrice/100*5}
    val totalPrice = itemPrice-discount
    val totalPriceRubl = totalPrice/100
    val totalPriceCop = totalPrice%100
    if (lastTotalPrice<1_000_100&&discount!=0){
        println("Сумма со скидкой 100 руб.: $totalPriceRubl руб. $totalPriceCop коп.")
    }else if(discount!=0) {
        println("Сумма со скидкой 5%.: $totalPriceRubl руб. $totalPriceCop коп.")
    }
    if (regularCustomer == true){
        val totalPriceRegularCustomer = totalPrice/100*99
        val totalPriceRegularCustomerRubl = totalPriceRegularCustomer/100
        val totalPriceRegularCustomerCop = totalPriceRegularCustomer%100
        println("Сумма покупки со скидкой постоянного покупателя: $totalPriceRegularCustomerRubl руб. $totalPriceRegularCustomerCop коп.")
    }
}