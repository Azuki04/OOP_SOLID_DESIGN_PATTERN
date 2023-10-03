package design_pattern.factory.desert_factory;

import design_pattern.factory.desert_object.Desert;

public abstract class DesertFactory {

    public Desert orderDesert(){
        return createDesert();
    }




    protected abstract Desert createDesert();
}
