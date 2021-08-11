public static Minecraft getMinecraft() {
    Class minecraft = Minecraft.class;
    Field instance = minecraft.getDeclaredField("theMinecraft");
    instance.setAccessible(true);
    return instance.get(null);
}
