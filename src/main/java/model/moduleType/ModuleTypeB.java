package model.moduleType;

public class ModuleTypeB implements ModuleTypeInterface{
    @Override
    public String getName() {
        return "B";
    }

    @Override
    public String getDescription() {
        return "Balanced";
    }

    @Override
    public Float getTravelTime() {
        return 1f;
    }

    @Override
    public Float getRemovalTime(int n) {
        return (float) 2*n + 2;
    }
}
