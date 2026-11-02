package gg.corz;

public final class IiIlillliIlill {
   public static final int IiIllIlIiliIllIlIi = 2;
   public static final int llIllIlIiilIllIlIi = 1;

   public static boolean IlIlllIlilIl(IilIlIlililIlIli r) {
      return r == IilIlIlililIlIli.IiiiiiIlIi || r == IilIlIlililIlIli.liiiiiIlIi || r == IilIlIlililIlIli.lIIIIIllIi;
   }

   public static IilIlIlililIlIli IliIlllilIi(iIlIiiIllIii s) {
      if (s.iliIiiliiiii()) {
         return IilIlIlililIlIli.iliiiiIlIi;
      } else if (s.IliIlllilIi() > 1) {
         return IilIlIlililIlIli.IiiiiiIlIi;
      } else if (s.IliIlllilIi() < -2) {
         return IilIlIlililIlIli.liiiiiIlIi;
      } else if (!s.iIlIlllllill() || !s.IilliliilIIi()) {
         return IilIlIlililIlIli.iiiiiiIlIi;
      } else if (s.IliIlllilIi() > 0 && !s.IIIllIIliIIl()) {
         return IilIlIlililIlIli.IIIIIIllIi;
      } else if (s.IliIlllilIi() < 0 && !s.IlIlllIlilIl()) {
         return IilIlIlililIlIli.ilIIIIllIi;
      } else {
         return !s.liiiIIllIl() && !s.lIiiIiIlilli() ? IilIlIlililIlIli.lIIIIIllIi : IilIlIlililIlIli.lliiiiIlIi;
      }
   }

   public static boolean liiiIIllIl(iIlIiiIllIii s) {
      return IliIlllilIi(s) == IilIlIlililIlIli.lliiiiIlIi;
   }

   public static IllIlilllIli lIiiIiIlilli(iiiIIiilIIIlIiil kind) {
      return switch (kind) {
         case IIlIiillil, IlIIiillil -> IllIlilllIli.iIiIIiIIlIliIIiIIl;
         case liIIiillil -> IllIlilllIli.lliIIiIIliliIIiIIl;
         case iiIIiillil, lIlIiillil, iIIIiillil -> IllIlilllIli.IiiIIiIIlliiIIiIIl;
         case iIlIiillil -> IllIlilllIli.iiiIIiIIlIIIlIiIIl;
         case ilIIiillil -> IllIlilllIli.lIIlIiIIliIIlIiIIl;
         case llIIiillil, IIIIiillil, IiIIiillil, lIIIiillil -> IllIlilllIli.IlIlIiIIlllIlIiIIl;
      };
   }

   public static boolean iliIiiliiiii(iiiIIiilIIIlIiil jumpEnabled, boolean kind, boolean surfaceWalk) {
      if (jumpEnabled == null) {
         return false;
      } else {
         return surfaceWalk
            ? jumpEnabled == iiiIIiilIIIlIiil.IIIIiillil
               || jumpEnabled == iiiIIiilIIIlIiil.lIIIiillil
               || jumpEnabled == iiiIIiilIIIlIiil.lIlIiillil
               || jumpEnabled == iiiIIiilIIIlIiil.iiIIiillil
            : kind || lIiiIiIlilli(jumpEnabled) != IllIlilllIli.IiiIIiIIlliiIIiIIl && lIiiIiIlilli(jumpEnabled) != IllIlilllIli.lIIlIiIIliIIlIiIIl;
      }
   }

   public static boolean IIIllIIliIIl(iiiIIiilIIIlIiil kind) {
      return kind != null && lIiiIiIlilli(kind) != null;
   }

   public static IilIlIlililIlIli IilliliilIIi(IIlIiilllIlIiill e) {
      long var5 = 6755496870924649658L;
      long var7 = -5800849040756448383L;
      var5 ^= ((long)Math.abs(e.IliIlllilIi()) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)Math.abs(e.iIlIlllllill()) ^ var5) & -1L >>> 32;
      var7 ^= ((long)((int)(var5 >>> 32) == 1 && (int)var5 == 1 ? 1 : 0) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)((int)(var5 >>> 32) + (int)var5 != 2 || (int)(var5 >>> 32) != 2 && (int)var5 != 2 ? 0 : 1) ^ var7) & -1L >>> 32;
      if (((int)var7 != 0 || (int)(var5 >>> 32) <= 1 && (int)var5 <= 1) && ((int)(var5 >>> 32) != 0 || (int)var5 != 0 || e.liiiIIllIl() != 0)) {
         if ((int)(var7 >>> 32) != 0 && !e.IiIlliIliiIl()) {
            return IilIlIlililIlIli.IlIIIIllIi;
         } else if ((int)var7 == 0 || e.liiiIIllIl() <= 0 && e.liiiIIllIl() >= -1) {
            if ((int)var7 != 0 && !e.Ililllililil()) {
               return IilIlIlililIlIli.IIIIIIllIi;
            } else {
               return (int)var7 != 0 && !e.IIlllIlliIll()
                  ? IilIlIlililIlIli.llIIIIllIi
                  : IliIlllilIi(
                     new iIlIiiIllIii(
                        e.liiiIIllIl(),
                        e.IilliliilIIi(),
                        e.lIiiIiIlilli(),
                        e.iliIiiliiiii(),
                        e.IIIllIIliIIl(),
                        e.IlIlllIlilIl(),
                        e.Ililllililil(),
                        e.Iiilliiliiil()
                     )
                  );
            }
         } else {
            return IilIlIlililIlIli.iIIIIIllIi;
         }
      } else {
         return IilIlIlililIlIli.iIIIIIllIi;
      }
   }

   private IiIlillliIlill() {
   }

   public static iiiIIiilIIIlIiil iIlIlllllill(IIlIiilllIlIiill e) {
      long var3 = 6912289539898095602L;
      var3 ^= ((long)Math.abs(e.IliIlllilIi()) << 32 ^ var3) & -1L << 32;
      var3 ^= ((long)Math.abs(e.iIlIlllllill()) ^ var3) & -1L >>> 32;
      if ((int)(var3 >>> 32) + (int)var3 != 2 || (int)(var3 >>> 32) != 2 && (int)var3 != 2) {
         if (e.Illlllllilll()) {
            return iiiIIiilIIIlIiil.iiIIiillil;
         } else if (e.IIIilIIiiIIi() == liiiiIlliiiiiIll.iIIIiiilll) {
            return iiiIIiilIIIlIiil.IlIIiillil;
         } else if (e.liiiIIllIl() > 0) {
            return iiiIIiilIIIlIiil.iIIIiillil;
         } else if (e.liiiIIllIl() < 0) {
            return iiiIIiilIIIlIiil.llIIiillil;
         } else if (e.IIIilIIiiIIi() == liiiiIlliiiiiIll.ilIIiiilll) {
            return iiiIIiilIIIlIiil.iIlIiillil;
         } else if (e.IIIilIIiiIIi() == liiiiIlliiiiiIll.llIIiiilll) {
            return iiiIIiilIIIlIiil.liIIiillil;
         } else if (e.IIIilIIiiIIi() == liiiiIlliiiiiIll.IlIIiiilll) {
            return iiiIIiilIIIlIiil.IiIIiillil;
         } else if (e.Iilllilliill()) {
            return iiiIIiilIIIlIiil.IIlIiillil;
         } else if (e.IIillIiliIil()) {
            return iiiIIiilIIIlIiil.lIlIiillil;
         } else {
            return (int)(var3 >>> 32) == 1 && (int)var3 == 1 ? iiiIIiilIIIlIiil.lIIIiillil : iiiIIiilIIIlIiil.IIIIiillil;
         }
      } else {
         return iiiIIiilIIIlIiil.ilIIiillil;
      }
   }
}
