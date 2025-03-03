package net.minestom.server.recipe.display;

import net.minestom.server.network.NetworkBuffer;
import net.minestom.server.registry.StaticProtocolObject;
import net.minestom.server.utils.NamespaceID;
import net.minestom.server.utils.nbt.BinaryTagSerializer;
import org.jetbrains.annotations.NotNull;

/**
 * AUTOGENERATED by GenericEnumGenerator
 */
public enum RecipeDisplayType implements StaticProtocolObject {
    CRAFTING_SHAPELESS(NamespaceID.from("minecraft:crafting_shapeless")),

    CRAFTING_SHAPED(NamespaceID.from("minecraft:crafting_shaped")),

    FURNACE(NamespaceID.from("minecraft:furnace")),

    STONECUTTER(NamespaceID.from("minecraft:stonecutter")),

    SMITHING(NamespaceID.from("minecraft:smithing"));

    public static final NetworkBuffer.Type<RecipeDisplayType> NETWORK_TYPE = NetworkBuffer.Enum(RecipeDisplayType.class);

    public static final BinaryTagSerializer<RecipeDisplayType> NBT_TYPE = BinaryTagSerializer.fromEnumKeyed(RecipeDisplayType.class);

    private final NamespaceID namespace;

    RecipeDisplayType(@NotNull NamespaceID namespace) {
        this.namespace = namespace;
    }

    @NotNull
    @Override
    public NamespaceID namespace() {
        return this.namespace;
    }

    @Override
    public int id() {
        return this.ordinal();
    }
}
