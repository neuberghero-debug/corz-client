package gg.corz;

import java.util.Locale;

public final class lIIlIIiliIIlIIil {
   public static final int IllIIlIIil = -1;

   public static int iliIiiliiiii(int markKey, int toggleKey) {
      return markKey;
   }

   public static iiillIlIIIilIl IilliliilIIi(int markKey, int toggleKey) {
      return IliIlllilIi(toggleKey, markKey) ? iiillIlIIIilIl.lIiIIiIlliIiIIiIll : iiillIlIIIilIl.iilIIiIllIIiIIiIll;
   }

   public static String iIlIlllllill(String ownerActionName) {
      return IiIlliIliiIl<"IiIlliIliiIl","aVXrBSYL8JqO6J2See3eP2RbCAnWwmfEPUsOcaofjGSTA0SFDdUlgOSUj9VlB/sP">() + ownerActionName;
   }

   public static String IlIlllIlilIl(int toggleKey, int markKey, iiillIlIIIilIl resolution) {
      return String.format(
         Locale.ROOT,
         IiIlliIliiIl<"IiIlliIliiIl","5sXNG5VS2Aae1LLV5MuVL4JuY1mh78y1EIHQ0PV31Ndm05g3GXFAtcM8lmvuHeeqGtWJ1lJXmQsw1niaC62vyvTJp6Sgo/WAaEx/Hs8b+uzgpRJdXlzI">(),
         toggleKey,
         markKey,
         resolution,
         lIiiIiIlilli(toggleKey, markKey)
      );
   }

   public static boolean IliIlllilIi(int otherKey, int proposedKey) {
      return otherKey != -1 && otherKey == proposedKey;
   }

   public static boolean liiiIIllIl(int proposedKey, int otherKey) {
      return !IliIlllilIi(proposedKey, otherKey);
   }

   private lIIlIIiliIIlIIil() {
   }

   public static int lIiiIiIlilli(int toggleKey, int markKey) {
      return IilliliilIIi(toggleKey, markKey) == iiillIlIIIilIl.lIiIIiIlliIiIIiIll ? -1 : markKey;
   }

   public static IiIliiIiliIliiIi IIIllIIliIIl(int toggleKey, int markKey, int pressedKey) {
      if (toggleKey == -1) {
         return IiIliiIiliIliiIi.iiliIIIlIi;
      } else if (toggleKey == markKey) {
         return IiIliiIiliIliiIi.IIiiIIIlIi;
      } else {
         return toggleKey == pressedKey ? IiIliiIiliIliiIi.lIiiIIIlIi : IiIliiIiliIliiIi.iiliIIIlIi;
      }
   }
}
