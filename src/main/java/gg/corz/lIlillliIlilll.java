package gg.corz;

public final class lIlillliIlilll {
   private static volatile Object IIlIllIIilIlIllIIi = null;

   private lIlillliIlilll() {
   }

   public static synchronized boolean iIlIlllllill(Object who) {
      return IIlIllIIilIlIllIIi == null || IIlIllIIilIlIllIIi == who;
   }

   public static synchronized boolean IliIlllilIi(Object who) {
      if (who == null) {
         return false;
      } else if (IIlIllIIilIlIllIIi != null && IIlIllIIilIlIllIIi != who) {
         return false;
      } else {
         IIlIllIIilIlIllIIi = who;
         return true;
      }
   }

   public static synchronized void iliIiiliiiii() {
      IIlIllIIilIlIllIIi = null;
   }

   public static synchronized boolean IilliliilIIi(Object who) {
      return IIlIllIIilIlIllIIi != null && IIlIllIIilIlIllIIi == who;
   }

   public static synchronized void liiiIIllIl(Object who) {
      if (IIlIllIIilIlIllIIi == who) {
         IIlIllIIilIlIllIIi = null;
      }
   }

   public static synchronized boolean lIiiIiIlilli() {
      return IIlIllIIilIlIllIIi == null;
   }
}
