package models.entities.cardpurchases;

import models.entities.targets.MCCard;
import models.entities.targets.VisaCard;

import java.util.Date;

public class VisaCardPurchase extends CardPurchase{

    private VisaCard visaCard;
    private Date date;
    private Integer businessCode;
    private Integer postnetId;

    public VisaCardPurchase(String cardId, float amount, Date date, Integer businessCode, Integer postnetId) {

        this.visaCard = new VisaCard(cardId);
        this.amount = amount;
        this.date = date;
        this.businessCode = businessCode;
        this.postnetId = postnetId;
    }

    @Override
    public void cardPay() {

    }
}
