package maowcraft;

import java.util.concurrent.ThreadLocalRandom;

public class WwwWwwMinecraftMojangNetOrg {
    // I'm sorry
    public static void main(String[] args) {
        if (args[0].length() > 0) {
            int style = 0;
            int length1 = Integer.parseInt(args[0]);
            if (args[2].length() > 0) {
                switch(args[2].toLowerCase()) {
                    case "site":
                        style = 1;
                        break;
                    case "package":
                        style = 2;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + args[3].toLowerCase());
                }
            }
            if (args[1].length() > 0) {
                int length2 = Integer.parseInt(args[1]);
                for (int i = 0; i < length2; i++) {
                    switch(style) {
                        case 1:
                            System.out.println("www.www." + getString(length1, style) + "net.org");
                        case 2:
                            System.out.println("net/org/" + getString(length1, style));
                    }
                }
            } else if (args[0].length() < 0 || args[0] == null) {
                throw new IndexOutOfBoundsException("Empty parameter for argument 2 in index 1");
            }
        } else if (args[0].length() < 0 || args[0] == null) {
            throw new IndexOutOfBoundsException("Empty parameter for argument 1 in index 0");
        }
    }
    private static String getString(int length, int style) {
        String styleCharacter = ".";
        if(style == 2) {
            styleCharacter = "/";
        }
        StringBuilder completedString = new StringBuilder();
        if (length > 0) {
            for (int i = 0; i != length; i++) {
                String randomSiteName;
                int randomNum = ThreadLocalRandom.current().nextInt(0, 2);
                switch(randomNum) {
                    case 0:
                        randomSiteName = "minecraft" + styleCharacter;
                        break;
                    case 1:
                        randomSiteName = "mojang" + styleCharacter;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + randomNum);
                }
                completedString.append(randomSiteName);
            }
        }
        return completedString.toString();
    }
}


