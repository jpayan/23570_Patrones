package Observers;

import Wrappers.DHLDataWrapper;
import Wrappers.FEDEXDataWrapper;

public class Client1 implements Observer{

    @Override
    public void update(Object object) {
        if (object instanceof DHLDataWrapper) {
            DHLDataWrapper dhlData = (DHLDataWrapper) object;
            System.out.println("\n----------------DHL PACKAGE DATA----------------");
            System.out.println(dhlData.getLatitude());
            System.out.println(dhlData.getLongitude());
        }
        else if (object instanceof FEDEXDataWrapper) {
            FEDEXDataWrapper fedexData = (FEDEXDataWrapper) object;
            System.out.println("\n---------------FEDEX PACKAGE DATA---------------");
            System.out.println(fedexData.getOffice());
        }
        else {
            // throw UnsubscribedException
        }
    }
}
