package gg.corz;

import java.util.Arrays;
import org.lwjgl.glfw.GLFW;

public final class illiilIiliil {
   public static final int IllilIiilllilIii = 30;
   public static final int lIlilIiiiIlilIii = -1;
   private static final int[] lililIiiiililIii = new int[349];
   private static final int[] IIiilIiilIiilIii = new int[349];
   private static final boolean illilIiiIililIii = System.getProperty(IIlllIlliIll<"IIlllIlliIll","jIu6W5DSt9EboulLsddmoTYzQjufkOIT09p8WZMR3gYRX/g=">(), "")
      .toLowerCase()
      .startsWith(IIlllIlliIll<"IIlllIlliIll","/e89Oze7ytkif+3itQMxdjdEtJCj+7Aoi8RpWjuVDM8T5jw=">());

   static {
      Arrays.fill(lililIiiiililIii, -1);
      Arrays.fill(IIiilIiilIiilIii, Integer.MIN_VALUE);
      IliIlllilIi(256, 1);

      for (int var0 = 0; var0 < 10; var0++) {
         IliIlllilIi(290 + var0, 59 + var0);
      }

      IliIlllilIi(300, 87);
      IliIlllilIi(301, 88);
      IliIlllilIi(96, 41);

      for (int var1 = 1; var1 <= 9; var1++) {
         IliIlllilIi(48 + var1, 1 + var1);
      }

      IliIlllilIi(48, 11);
      IliIlllilIi(45, 12);
      IliIlllilIi(61, 13);
      IliIlllilIi(259, 14);
      IliIlllilIi(258, 15);
      liiiIIllIl(IIlllIlliIll<"IIlllIlliIll","i1pbvB59XoWvd8tpB27L9ht9Zc2gp3K331Lre5vqXINbJCqGMK4=">(), 16);
      IliIlllilIi(91, 26);
      IliIlllilIi(93, 27);
      IliIlllilIi(257, 28);
      IliIlllilIi(341, 29);
      liiiIIllIl(IIlllIlliIll<"IIlllIlliIll","QDAS1QauStfxBfDsM0KU5VAZb7zHFqq8WKfVA492rfSFIBz0CQ==">(), 30);
      IliIlllilIi(59, 39);
      IliIlllilIi(39, 40);
      IliIlllilIi(340, 42);
      IliIlllilIi(92, 43);
      liiiIIllIl(IIlllIlliIll<"IIlllIlliIll","jU44uhfIwzTR+hCw/8JbZCHry0z+tQja1VzdOC4WDkvxgDM=">(), 44);
      IliIlllilIi(44, 51);
      IliIlllilIi(46, 52);
      IliIlllilIi(47, 53);
      IliIlllilIi(344, 54);
      IliIlllilIi(332, 55);
      IliIlllilIi(342, 56);
      IliIlllilIi(32, 57);
      IliIlllilIi(280, 58);
      IliIlllilIi(282, 69);
      IliIlllilIi(281, 70);
      IliIlllilIi(327, 71);
      IliIlllilIi(328, 72);
      IliIlllilIi(329, 73);
      IliIlllilIi(333, 74);
      IliIlllilIi(324, 75);
      IliIlllilIi(325, 76);
      IliIlllilIi(326, 77);
      IliIlllilIi(334, 78);
      IliIlllilIi(321, 79);
      IliIlllilIi(322, 80);
      IliIlllilIi(323, 81);
      IliIlllilIi(320, 82);
      IliIlllilIi(330, 83);
      IliIlllilIi(161, 86);
      IliIlllilIi(336, 3597);
      IliIlllilIi(335, 3612);
      IliIlllilIi(345, 3613);
      IliIlllilIi(331, 3637);
      IliIlllilIi(283, 3639);
      IliIlllilIi(346, 3640);
      IliIlllilIi(284, 3653);
      IliIlllilIi(268, 3655);
      IliIlllilIi(266, 3657);
      IliIlllilIi(269, 3663);
      IliIlllilIi(267, 3665);
      IliIlllilIi(260, 3666);
      IliIlllilIi(261, 3667);
      IliIlllilIi(343, 3675);
      IliIlllilIi(347, 3676);
      IliIlllilIi(348, 3677);
      IliIlllilIi(265, 57416);
      IliIlllilIi(263, 57419);
      IliIlllilIi(262, 57421);
      IliIlllilIi(264, 57424);
   }

   private static void liiiIIllIl(String letters, int first) {
      for (int var2 = 0; var2 < letters.length(); var2++) {
         IliIlllilIi(letters.charAt(var2), first + var2);
      }
   }

   public static int iliIiiliiiii(int key) {
      return lIiiIiIlilli(key, illilIiiIililIii ? IlIlllIlilIl(key) : -1, illilIiiIililIii);
   }

   public static int lIiiIiIlilli(int key, int scancode, boolean windows) {
      long var4 = 4633834232768234407L;
      if (key != (-(-2043223706 + -127 << 29 | -2043223706 + -127 >>> 3) ^ 255402744) && key != (-1504268439 - 103 ^ 97 ^ -1504268679)) {
         if (windows) {
            var4 ^= ((long)IilliliilIIi(scancode) << 32 ^ var4) & -1L << 32;
            if ((int)(var4 >>> 32) != ((1577782668 * 1056139499 * -2014922929 >>> 17 | 1577782668 * 1056139499 * -2014922929 << 15) ^ 220329841)) {
               return (int)(var4 >>> 32);
            }
         }

         return iIlIlllllill(key);
      } else {
         return iIlIlllllill(key);
      }
   }

   public static int IilliliilIIi(int scancode) {
      if (scancode <= 0 || scancode > 511) {
         return -1;
      } else if (scancode == 325) {
         return 69;
      } else if (scancode != 69 && scancode != 326) {
         int var1 = scancode & 0xFF;
         if ((scancode & 256) == 0) {
            return var1;
         } else {
            return var1 != 72 && var1 != 75 && var1 != 77 && var1 != 80 ? 3584 | var1 : 57344 | var1;
         }
      } else {
         return 3653;
      }
   }

   public static int iIlIlllllill(int key) {
      return key >= 0 && key < lililIiiiililIii.length ? lililIiiiililIii[key] : -1;
   }

   private static int IlIlllIlilIl(int key) {
      if (key >= 0 && key < IIiilIiilIiilIii.length) {
         int var1 = IIiilIiilIiilIii[key];
         if (var1 != Integer.MIN_VALUE) {
            return var1;
         } else {
            int var2;
            try {
               var2 = GLFW.glfwGetKeyScancode(key);
            } catch (Throwable var4) {
               var2 = -1;
            }

            IIiilIiilIiilIii[key] = var2;
            return var2;
         }
      } else {
         return -1;
      }
   }

   private static void IliIlllilIi(int code, int key) {
      lililIiiiililIii[code] = key;
   }

   public static int[] IIIllIIliIIl() {
      return Arrays.stream(lililIiiiililIii)
         .filter(c -> c != ((-((70556792 << 29 | 70556792 >>> 3) - 19) >>> 5 | -((70556792 << 29 | 70556792 >>> 3) - 19) << 27) ^ -670813029))
         .distinct()
         .sorted()
         .toArray();
   }

   private illiilIiliil() {
   }
}
