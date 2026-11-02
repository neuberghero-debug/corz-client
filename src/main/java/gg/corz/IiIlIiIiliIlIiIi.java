package gg.corz;

public final class IiIlIiIiliIlIiIi {
   private static volatile IiIlIlIlliIlIlIl IiiIIIiIIi = new IiIlIlIlliIlIlIl(false, false, 0, 0, Integer.MIN_VALUE, "", 0);

   public static void liiiIIllIl(boolean blocked, boolean loaded, int active, int total, int section, String activeLayer, int placed) {
      long var8 = -3679939963053332114L;
      var8 ^= ((long)Math.max(0, active) << 32 ^ var8) & -1L << 32;
      IiiIIIiIIi = new IiIlIlIlliIlIlIl(
         blocked,
         loaded,
         (int)(var8 >>> 32),
         Math.max(0, Math.min(total, (int)(var8 >>> 32))),
         section,
         activeLayer == null ? "" : activeLayer,
         Math.max(0, placed)
      );
   }

   public static int IlIlllIlilIl() {
      return IiiIIIiIIi.IlIlllIlilIl();
   }

   private IiIlIiIiliIlIiIi() {
   }

   public static String IiIlliIliiIl() {
      return IiiIIIiIIi.IiIlliIliiIl();
   }

   public static void iIlIlllllill() {
      IiiIIIiIIi = new IiIlIlIlliIlIlIl(false, false, 0, 0, Integer.MIN_VALUE, "", 0);
   }

   public static void IliIlllilIi(boolean active, boolean placed, int total, int loaded) {
      liiiIIllIl(active, placed, total, loaded, Integer.MIN_VALUE, "", 0);
   }

   public static int IIIllIIliIIl() {
      return IiiIIIiIIi.IIIllIIliIIl();
   }

   public static int iliIiiliiiii() {
      return IiiIIIiIIi.iliIiiliiiii();
   }

   public static float Iilllilliill() {
      return IiiIIIiIIi.IliIlllilIi();
   }

   public static boolean IilliliilIIi() {
      return IiiIIIiIIi.IilliliilIIi();
   }

   public static int IIlllIlliIll() {
      return IiiIIIiIIi.IIlllIlliIll();
   }

   public static boolean lIiiIiIlilli() {
      return IiiIIIiIIi.lIiiIiIlilli();
   }

   public static IiIlIlIlliIlIlIl Illlllllilll() {
      return IiiIIIiIIi;
   }

   public static int IIillIiliIil() {
      return Math.round(Iilllilliill() * 100.0F);
   }
}
