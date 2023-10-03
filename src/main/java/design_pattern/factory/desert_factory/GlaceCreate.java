package design_pattern.factory.desert_factory;

import design_pattern.factory.desert_object.Desert;
import design_pattern.factory.desert_object.Glace;

public class GlaceCreate extends DesertFactory {


    @Override
    protected Desert createDesert() {
        return new Glace();
    }
}
