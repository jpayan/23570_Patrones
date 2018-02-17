package Observers;

import Wrappers.DHLDataWrapper;

public class Client3 implements Observer {
    @Override
    public void update(Object object) {
        if (object instanceof DHLDataWrapper) {
            DHLDataWrapper dhlData = (DHLDataWrapper) object;
            System.out.println("\n----------------DHL PACKAGE DATA----------------");
            System.out.println(dhlData.getLatitude());
            System.out.println(dhlData.getLongitude());
        }
        else {
            // throw UnsubscribedException
        }
    }
}
