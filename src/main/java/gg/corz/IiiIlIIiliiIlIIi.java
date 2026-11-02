package gg.corz;

import java.util.ArrayDeque;
import java.util.Deque;

public final class IiiIlIIiliiIlIIi {
   private static long Iiililliil;
   private static volatile int IIIiilliil = 1;
   private static final Deque<iIiliiIiIliliiIi> lIililliil = new ArrayDeque<>();
   private static final double lillilliil = 1.0E-4;
   private static volatile boolean lIIiilliil;
   private static int llililliil = -1;
   private static final long illlilliil = 15000L;
   private static final long Iillilliil = 1000L;
   private static volatile double liililliil = -1.0;
   private static int ilililliil;
   private static long Ilililliil;
   private static final int IIililliil = 8;
   private static long iIililliil;
   private static final long iillilliil = 6000L;
   private static volatile double iiililliil;

   public static void iIlIlllllill() {
      lIililliil.clear();
      iIililliil = 0L;
      Ilililliil = 0L;
      llililliil = -1;
      ilililliil = 0;
      Iiililliil = 0L;
      liililliil = -1.0;
      iiililliil = 0.0;
      lIIiilliil = false;
      IIIiilliil = 1;
   }

   private static void liiiIIllIl(int placed, int total) {
      lIililliil.clear();
      lIililliil.addLast(new iIiliiIiIliliiIi(0L, placed));
      iIililliil = 0L;
      Iiililliil = 0L;
      llililliil = placed;
      ilililliil = total;
      liililliil = -1.0;
      iiililliil = 0.0;
      lIIiilliil = false;
   }

   public static double IilliliilIIi() {
      return liililliil;
   }

   public static double lIiiIiIlilli() {
      return iiililliil;
   }

   public static void IliIlllilIi(int nowMs, int active, int builderCount, boolean total, long placed) {
      long var15 = 2053830298476747234L;
      IIIiilliil = Math.max(1, builderCount);
      if (active <= 0) {
         iIlIlllllill();
      } else {
         nowMs = Math.max(0, Math.min(nowMs, active));
         long var6 = Ilililliil == 0L ? 0L : Math.max(0L, Math.min(1000L, placed - Ilililliil));
         Ilililliil = placed;
         if (llililliil < 0 || active != ilililliil || nowMs < llililliil - 8) {
            liiiIIllIl(nowMs, active);
         } else if (total) {
            iIililliil += var6;
            if (nowMs > llililliil) {
               Iiililliil = iIililliil;
            }

            llililliil = nowMs;
            lIililliil.addLast(new iIiliiIiIliliiIi(iIililliil, nowMs));

            while (lIililliil.size() > 2 && iIililliil - lIililliil.peekFirst().IliIlllilIi() > 15000L) {
               lIililliil.removeFirst();
            }

            iIiliiIiIliliiIi var8 = lIililliil.peekFirst();
            long var9 = iIililliil - var8.IliIlllilIi();
            var15 ^= ((long)(nowMs - var8.liiiIIllIl()) << 32 ^ var15) & -1L << 32;
            double var12 = var9 > 0L ? Math.max(0.0, (double)((int)(var15 >>> 32)) / (double)var9) : 0.0;
            iiililliil = var12 * 1000.0;
            var15 ^= ((long)(active - nowMs) ^ var15) & -1L >>> 32;
            lIIiilliil = (int)var15 > 0 && iIililliil - Iiililliil > 6000L;
            if ((int)var15 <= 0) {
               liililliil = 0.0;
            } else if (!(var12 <= 1.0E-4) && !lIIiilliil) {
               liililliil = (double)((int)var15) / var12 / 1000.0;
            } else {
               liililliil = -1.0;
            }
         }
      }
   }

   public static String IIlllIlliIll(double seconds) {
      if (seconds <= 0.0) {
         return Illlllllilll<"Illlllllilll","N5so/l9GkQdZ0B2FHjHChi1MzbppQtzFfsObCsuYJBc=">();
      } else {
         long var2 = (long)Math.ceil(seconds);
         long var4 = var2 / 3600L;
         long var6 = var2 % 3600L / 60L;
         long var8 = var2 % 60L;
         if (var4 > 0L) {
            return var4
               + Illlllllilll<"Illlllllilll","SRrRbn5IyaI2QT0Zv5hHq+c92Gwb9t2Cswc596eg">()
               + var6
               + Illlllllilll<"Illlllllilll","LjxHGXYlEfas3Rf/78sdFp9Fr92087uEmS7ImHU=">();
         } else {
            return var6 > 0L
               ? var6
                  + Illlllllilll<"Illlllllilll","Sow73HshkaVWgm6QKxOHlajwhDdnWUIBP04ac0XS">()
                  + var8
                  + Illlllllilll<"Illlllllilll","V8Z2SzylffdjM/5t4+v9WpBYNaCFpYuOWMvTAeg=">()
               : var8 + Illlllllilll<"Illlllllilll","V8Z2SzylffdjM/5t4+v9WpBYNaCFpYuOWMvTAeg=">();
         }
      }
   }

   public static String IiIlliIliiIl() {
      double var0 = liililliil;
      return var0 < 0.0 ? "" : IIlllIlliIll(var0);
   }

   private IiiIlIIiliiIlIIi() {
   }

   public static boolean IIIllIIliIIl() {
      return lIIiilliil;
   }

   public static int iliIiiliiiii() {
      return IIIiilliil;
   }

   public static boolean IlIlllIlilIl() {
      return liililliil >= 0.0;
   }
}
