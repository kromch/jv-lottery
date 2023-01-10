package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    enum Colors {
        Aquamarine,
        Azure,
        BurlyWood,
        CadetBlue,
        Gainsboro,
        Gold,
        Gray,
        Khaki,
        LawnGreen,
        LightGreen,
        LightSkyBlue,
        Linen,
        MediumOrchid,
        MediumPurple,
        MistyRose,
        Olive,
        OliveDrab,
        Orange,
        OrangeRed,
        Orchid,
        PaleTurquoise,
        Peru,
        Pink,
        Plum,
        RoyalBlue,
        SandyBrown,
        SeaGreen,
        SteelBlue;
    }

    public String getRandomColor() {
        Random random = new Random();
        Colors[] colors = Colors.values();
        return colors[random.nextInt(colors.length - 1)].toString();
    }
}
