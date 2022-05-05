package model.moduleType;

public class ModuleTypeO implements ModuleTypeInterface{
    @Override
    public String getName() {
        return "O";
    }

    @Override
    public String getDescription() {
        return "Out of service";
    }

    @Override
    public Float getTravelTime() {
        return null;
    }

    @Override
    public Float getRemovalTime(int n) {
        return null;
    }
}
