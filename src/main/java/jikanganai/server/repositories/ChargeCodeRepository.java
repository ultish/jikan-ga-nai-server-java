package jikanganai.server.repositories;

import jikanganai.server.entities.ChargeCode;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * TODO: Convert this to a DAO instead and fetch actual ChargeCodes from the
 * postgres DB
 */
@Component
public class ChargeCodeRepository {

    private Map<String, ChargeCode> chargecodes;

    public ChargeCodeRepository() {
        chargecodes = new HashMap<>();
        chargecodes.put("1", new ChargeCode("1", "test", "code", "desc",
            false, new Date(), new Date()
        ));
    }


    public ChargeCode find(String id) {
        return chargecodes.get(id);
    }

}
