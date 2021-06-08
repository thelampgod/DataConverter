package ca.spottedleaf.dataconverter.common.types.nbt;

import ca.spottedleaf.dataconverter.common.types.ListType;
import ca.spottedleaf.dataconverter.common.types.MapType;
import ca.spottedleaf.dataconverter.common.types.TypeUtil;

public final class NBTTypeUtil implements TypeUtil {

    @Override
    public ListType createEmptyList() {
        return new NBTListType();
    }

    @Override
    public MapType<String> createEmptyMap() {
        return new NBTMapType();
    }
}
