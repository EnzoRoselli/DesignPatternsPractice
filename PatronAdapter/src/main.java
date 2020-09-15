import models.entities.CardPurchaseAdapter;
import models.entities.cardpurchases.CardPurchase;
import models.entities.cardpurchases.MCCardPurchase;
import models.interfaces.IPurchase;

public class main {

    public static void main(String[] args) {

        CardPurchase cardPurchase = new MCCardPurchase("5400-4567",1500,"8900451");
        IPurchase purchase = new CardPurchaseAdapter(cardPurchase);

        purchase.pay();
    }
}
