package org.launchcode.studio7;

public class CD extends Disc implements Optical {
    public CD(String name, int storageCapacity, String discType, int maxSpeed) {
        super(name, storageCapacity, discType, maxSpeed);
    }

    @Override
    public void spinDisc() {
        //do what you want-  sout spinning noises
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
