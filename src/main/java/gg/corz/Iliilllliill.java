package gg.corz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class Iliilllliill {
   public static final int lliiIIliiliiIIli = 1;
   private final Map<Long, List<liiIllIiiiiIllIi>> ilIIlIliIiIIlIli = new LinkedHashMap<>();
   private int liIIlIliiiIIlIli;
   public static final int IiiiIIliliiiIIli = 2;
   private int iIlIlIliIllIlIli;
   public static final int iIiiIIliIliiIIli = 0;
   private int IIlIlIlilIlIlIli;
   public static final int IlIIlIlillIIlIli = 2048;
   private int lllIlIliillIlIli;
   public static final int iiiiIIliIIIIlIli = -1;
   private static final String lIIIlIliiIIIlIli = "executor proof invalid at arrival";

   public static boolean IIIllIIliIIl(long a, long b) {
      return llIiIiililIiIiil.IIlllIlliIll(a) == llIiIiililIiIiil.IIlllIlliIll(b)
         && Math.abs(llIiIiililIiIiil.IiIlliIliiIl(a) - llIiIiililIiIiil.IiIlliIliiIl(b)) <= 1
         && Math.abs(llIiIiililIiIiil.Illlllllilll(a) - llIiIiililIiIiil.Illlllllilll(b)) <= 1;
   }

   private static boolean iliIiiliiiii(int queried, int recorded) {
      return queried == -1 || queried == recorded;
   }

   public void IIillIiliIil() {
      this.ilIIlIliIiIIlIli.clear();
      this.liIIlIliiiIIlIli = 0;
      this.IIlIlIlilIlIlIli = 0;
      this.iIlIlIliIllIlIli = 0;
      this.lllIlIliillIlIli = 0;
   }

   public int iIlIlllllill(long target, long dependencyFingerprint) {
      long var8 = -4311679774898853645L;
      List var5 = this.ilIIlIliIiIIlIli.get(target);
      if (var5 == null) {
         return 0;
      } else {
         var8 ^= (0L ^ var8) & -1L << 32;
         Iterator var7 = var5.iterator();

         while (var7.hasNext()) {
            if (((liiIllIiiiiIllIi)var7.next()).iliIiiliiiii() != dependencyFingerprint) {
               var7.remove();
               var8 += 4294967296L;
            }
         }

         if (var5.isEmpty()) {
            this.ilIIlIliIiIIlIli.remove(target);
         }

         this.liIIlIliiiIIlIli -= (int)(var8 >>> 32);
         this.lllIlIliillIlIli += (int)(var8 >>> 32);
         return (int)(var8 >>> 32);
      }
   }

   public int IIlllIlliIll() {
      return this.iIlIlIliIllIlIli;
   }

   public void IilliliilIIi(long target) {
      List var3 = this.ilIIlIliIiIIlIli.remove(target);
      if (var3 != null) {
         this.liIIlIliiiIIlIli = this.liIIlIliiiIIlIli - var3.size();
      }
   }

   public int IlIlllIlilIl() {
      return this.liIIlIliiiIIlIli;
   }

   public String liiiIIllIl(long target, long stand, int supportFace, int poseClass, long dependencyFingerprint) {
      List var9 = this.ilIIlIliIiIIlIli.get(target);
      if (var9 == null) {
         return null;
      } else {
         for (liiIllIiiiiIllIi var11 : var9) {
            if (var11.iliIiiliiiii() == dependencyFingerprint
               && IIIllIIliIIl(var11.liiiIIllIl(), stand)
               && lIiiIiIlilli(var11.iIlIlllllill(), supportFace)
               && iliIiiliiiii(var11.IilliliilIIi(), poseClass)) {
               this.iIlIlIliIllIlIli++;
               return var11.lIiiIiIlilli();
            }
         }

         return null;
      }
   }

   public boolean IliIlllilIi(long stand, long target, int tick, int poseClass, String dependencyFingerprint, long supportFace, int reason) {
      long var16 = 3354346049927563364L;
      String var11 = dependencyFingerprint != null && !dependencyFingerprint.isBlank()
         ? dependencyFingerprint
         : Iiilliiliiil<"Iiilliiliiil","QJJ3AtKwev+L6mtoWfBVQMsbzjrpIxNssb/Rur6wXONNLk9c2SsZCazdjr0TwNFouwojNr/NZuyu0VgF/w==">();
      liiIllIiiiiIllIi var12 = new liiIllIiiiiIllIi(stand, target, tick, poseClass, var11, supportFace, reason);
      if (this.ilIIlIliIiIIlIli.size() >= 2048 && !this.ilIIlIliIiIIlIli.containsKey(stand)) {
         Iterator var13 = this.ilIIlIliIiIIlIli.keySet().iterator();
         var13.next();
         var13.remove();
      }

      List var18 = this.ilIIlIliIiIIlIli.computeIfAbsent(stand, k -> new ArrayList<>());

      for (long var19 = var16 ^ (0L ^ var16) & -1L << 32; (int)(var19 >>> 32) < var18.size(); var19 += 4294967296L) {
         liiIllIiiiiIllIi var15 = (liiIllIiiiiIllIi)var18.get((int)(var19 >>> 32));
         if (var15.liiiIIllIl() == target && var15.iIlIlllllill() == tick && var15.IilliliilIIi() == poseClass) {
            var18.set((int)(var19 >>> 32), var12);
            return false;
         }
      }

      var18.add(var12);
      this.liIIlIliiiIIlIli++;
      this.IIlIlIlilIlIlIli++;
      return true;
   }

   public String Iilllilliill() {
      return Iiilliiliiil<"Iiilliiliiil","+PSKWN7n4IrtXs/OCHw432uchxr3aATibGQgBHFQqp3cFB6+xyj2GKsCGARCW7VwJw==">()
         + this.IIlIlIlilIlIlIli
         + Iiilliiliiil<"Iiilliiliiil","kT/WZoZf+PkYAfeVxG6mfO5Gzd8922kDxfJ9lIF5To6HWhQ/H2geP5t/NOnfQfw=">()
         + this.iIlIlIliIllIlIli
         + Iiilliiliiil<"Iiilliiliiil","oIvJw9ximCRr35HJIC3iMom036rgiFH7ptt3ve1RLaJf7PYazIZ7+pd/BKSA7jg=">()
         + this.liIIlIliiiIIlIli
         + Iiilliiliiil<"Iiilliiliiil","2eyHlu1eYOKBnvssF9gmXwquLlZNECZCHSfGWeUjyjmYYNc1qf4nGwuO61zZrrpb5IFW">()
         + this.lllIlIliillIlIli;
   }

   public int IiIlliIliiIl() {
      return this.IIlIlIlilIlIlIli;
   }

   private static boolean lIiiIiIlilli(int recorded, int queried) {
      return recorded == 0 || queried == 0 || recorded == queried;
   }

   public int Illlllllilll() {
      return this.lllIlIliillIlIli;
   }
}
