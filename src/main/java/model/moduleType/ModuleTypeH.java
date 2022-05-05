package model.moduleType;

public class ModuleTypeH implements ModuleTypeInterface{
    @Override
    public String getName() {
        return "H";
    }

    @Override
    public String getDescription() {
        return "High speed transit - optimized";
    }

    @Override
    public Float getTravelTime() {
        return 0.5f;
    }

    @Override
    public Float getRemovalTime(int n) {
        return (float) (3 * n + 4);
    }
}
