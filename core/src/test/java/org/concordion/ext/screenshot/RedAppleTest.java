package org.concordion.ext.screenshot;

import org.concordion.api.ExpectedToFail;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
@ExpectedToFail
public class RedAppleTest {
     public String getAppleColor(){
        return "Violet";
    }
}
