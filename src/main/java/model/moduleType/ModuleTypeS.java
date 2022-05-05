package model.moduleType;

public class ModuleTypeS implements ModuleTypeInterface{
    @Override
    public String getName() {
        return "S";
    }

    @Override
    public String getDescription() {
        return "Storage access time - optimized";
    }

    @Override
    public Float getTravelTime() {
        return 2f;
    }

    @Override
    public Float getRemovalTime(int n) {
        return (float) (n + 1);
    }
}
