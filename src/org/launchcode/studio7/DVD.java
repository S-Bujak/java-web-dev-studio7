package org.launchcode.studio7;

public class DVD extends Disc implements Optical {
    public DVD(String name, int storageCapacity, String discType, int maxSpeed) {
        super(name, storageCapacity, discType, maxSpeed);
    }

    @Override
    public void spinDisc() {

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
