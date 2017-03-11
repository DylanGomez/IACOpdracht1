package dylangomezvazquez.acculaden;

/**
 * Created by dylan on 28-2-2017.
 */
import dylangomezvazquez.acculadenrequest.AccuLadenRequest;
import dylangomezvazquez.acculadenresponse.ObjectFactory;
import dylangomezvazquez.acculadenresponse.AccuLadenResponse;

import javax.jws.WebService;

@WebService(endpointInterface = "dylangomezvazquez.acculaden.WSInterface")
public class AccuServiceImple implements WSInterface {

    public AccuLadenResponse accuLaden(AccuLadenRequest parameters) throws ApplicatieFout {

        ObjectFactory factory = new ObjectFactory();
        AccuLadenResponse response = factory.createAccuLadenResponse();
        int vermogen = parameters.getVermogen();
        double procent = parameters.getProcent();
        int voltage = parameters.getDuur();
        int uur = parameters.getVermogen() / 10;
//        wilde na veel moeite niet naar behoren werken
//        double remaining = uur / (procent/100);

        try{

            if ( vermogen > 0 && procent >= 0 && procent <= 100 && voltage > 0 && vermogen ==(int)vermogen && procent ==(double)procent
                    && voltage ==(int)voltage) {
//                if (uur == remaining){
//                    remaining = remaining - uur;
//                }
                String successtring = "De accu heeft heeft een vermogen van " + vermogen + " Ampére, \n de accu heeft momenteel nog " + procent
                        + " procent over. De batterij heeft een voltage van " + voltage + " volt \n" +
                        "opladen van 0 tot 100% duurt: " + uur + " uur";

                response.setResult(successtring.toString());
            }else{
                throw new RuntimeException();
            }
        }catch (RuntimeException e){

            dylangomezvazquez.acculadenerror.ObjectFactory errorFactory = new dylangomezvazquez.acculadenerror.ObjectFactory();
            dylangomezvazquez.acculadenerror.ApplicatieFout x = errorFactory.createApplicatieFout();
            x.setErrorCode(404);
            x.setMessage("Values not accepted ");

            ApplicatieFout fout = new ApplicatieFout("Meegegeven accu gegevens zijn niet goed", x);
            throw fout;
        }

        return response;
    }


}