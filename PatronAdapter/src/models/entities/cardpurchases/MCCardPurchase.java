package models.entities.cardpurchases;

import models.entities.targets.MCCard;

import java.util.Date;

public class MCCardPurchase extends CardPurchase{

    private MCCard mcCard;
    private String clientCode;

    public MCCardPurchase(String cardId, float amount, String clientCode) {
        this.mcCard = new MCCard(cardId);
        this.amount = amount;
        this.clientCode = clientCode;
    }


    @Override
    public void cardPay() {
        System.out.println("Pago hecho de $" + amount + " de la tarjeta " +
                mcCard.getCardId() + " del cliente " + clientCode);
    }
}
