package org.boudnik.ariadne.opsos;

import org.boudnik.ariadne.Dimension;
import org.boudnik.ariadne.External;

/**
 * @author Alexandre_Boudnik
 * @since 05/18/2018
 */
public class Hardware extends External<Hardware.Record> {
    public static class Record {
        int device;
        String state;
        String city;
    }

    @Override
    protected Record record() {
        return new Record();
    }

    public Hardware(Dimension... dimensions) {
        super(dimensions);
    }

}
