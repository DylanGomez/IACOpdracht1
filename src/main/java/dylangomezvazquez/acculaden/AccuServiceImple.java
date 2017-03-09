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

        try{

            Integer vermogen = parameters.getVermogen() * parameters.getVermogen();
            String procent = "De accu heeft heeft een vermogen van "+ parameters.getVermogen() + ", de accu heeft momenteel nog "+ parameters.getProcent()
                    + " procent over opladen bij het huidige tankstation duurt: " + parameters.getDuur() + " minuten";
            System.out.println(procent);

            response.setResult(procent.toString());

        }catch (RuntimeException e){

            dylangomezvazquez.acculadenerror.ObjectFactory errorFactory = new dylangomezvazquez.acculadenerror.ObjectFactory();
            dylangomezvazquez.acculadenerror.ApplicatieFout x = errorFactory.createApplicatieFout();
            x.setErrorCode(404);
            x.setMessage("Value cannot be found");

            ApplicatieFout fout = new ApplicatieFout("Meegegeven accu gegevens zijn niet goed", x);
            throw fout;
        }

        return response;
    }


}