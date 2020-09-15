package models.entities;

import models.entities.cardpurchases.CardPurchase;
import models.interfaces.IPurchase;

public class CardPurchaseAdapter implements IPurchase {

    private CardPurchase cardPurchase;

    public CardPurchaseAdapter(CardPurchase cardPurchase) {
        this.cardPurchase = cardPurchase;
    }

    @Override
    public void pay() {
        cardPurchase.cardPay();
    }
}
