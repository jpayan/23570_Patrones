import Observables.DHLData;
import Observables.FEDEXData;
import Observables.CorreosDeMexicoData;
import Observers.Client1;
import Observers.Client2;
import Observers.Client3;

public class Main {
    public static void main(String[] args) {
        Client1 client1 = new Client1();
        Client2 client2 = new Client2();
        Client3 client3 = new Client3();

        DHLData dhlData = new DHLData();
        FEDEXData fedexData = new FEDEXData();
        CorreosDeMexicoData correosDeMexicoData = new CorreosDeMexicoData();

        dhlData.add(client1);
        dhlData.add(client2);
        dhlData.add(client3);

        fedexData.add(client1);
        fedexData.add(client2);

        correosDeMexicoData.add(client2);

        dhlData.updatePackageInfo();
        fedexData.updatePackageInfo();
        correosDeMexicoData.updatePackageInfo();
    }
}
