package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Mp3testing {


    @Test
    public void SwitchOnTest() {
        //given that there is an Ac
       Mp3 regnos = new Mp3();
        //when I switch on the Ac
        regnos.switchOn(true);
        //check that the Ac is on
        boolean regnosSwitch = regnos.getSwitchOn();
        assertEquals(true, regnosSwitch);
    }

    @Test
    public void SwitchOffTest() {
        //given that there is an Ac
        Mp3 regnos = new Mp3();
        //when I switch on the Ac
        regnos.setSwitchOff(false);
        //check that the Ac is off
        boolean regnosSwitc = regnos.getSwitchOn();
        assertEquals(false, regnosSwitc);
    }

}
