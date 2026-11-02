package gg.corz;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class liliiIIliiliiIIl {
   private int IIlIllilIl;
   public static final int iIiiIlilIl = 32;
   public static final int liiiIlilIl = 6400;
   private long IlIIllilIl;
   public static final int IliiIlilIl = 12;
   private int iiIIllilIl;
   private int IiIIllilIl;
   private final HashSet<Long> iIIIllilIl;
   public static final int iiiiIlilIl = 4096;
   private int liIIllilIl;
   public static final int IiiiIlilIl = 200;
   private long ilIIllilIl;
   public static final int iliiIlilIl = 64;
   public static final int lliiIlilIl = 20;
   private static final long IIIIllilIl = 6861051372358106689L;
   private final LinkedHashMap<Long, IliIIIIilliIIIIi> lIIIllilIl = new LinkedHashMap<Long, IliIIIIilliIIIIi>(64, 0.75F, true) {
      @Override
      protected boolean removeEldestEntry(Entry<Long, IliIIIIilliIIIIi> e) {
         return this.size() > 4096;
      }
   };
   private long llIIllilIl;

   public boolean Iilllilliill(long target, long tick, int kind) {
      IliIIIIilliIIIIi var6 = this.lIIIllilIl.get(liiiIIllIl(target, tick));
      return var6 != null && kind < var6.iIIIIIliil || this.IIlllIlliIll(tick, kind) || this.Illlllllilll(target, kind);
   }

   public String IIIilIIiiIIi() {
      return IlIillIiilIi<"IlIillIiilIi","OSMvfKBGrbaX2DzIBCVOVsjT7ER38Hs1QNMVTMdr6Rbe">()
         + this.lIIIllilIl.size()
         + IlIillIiilIi<"IlIillIiilIi","+z5bPoWrVHJaKcU7ju6JVFeXM6LALZepUEwW8sEbEIUAnbM0Tkia">()
         + this.IiIIllilIl
         + IlIillIiilIi<"IlIillIiilIi","eWqvydgkt5fgfcJA30ZBs7JE5NB1aas5tnffarBJmzLBfBwI7ql0+g==">()
         + this.liIIllilIl
         + IlIillIiilIi<"IlIillIiilIi","VY8K54+fDa/SEOv4GaWxi2V+EMN8KAJLtvgaUkQcpbJO52NOrg==">()
         + this.iiIIllilIl
         + IlIillIiilIi<"IlIillIiilIi","a6+KgIWH0uvwosh7aqJEJ/FVXjKOoBV3QcD+WNiYs2FFvl4=">()
         + this.IIlIllilIl;
   }

   private IliIIIIilliIIIIi lIiiIiIlilli(long k) {
      IliIIIIilliIIIIi var3 = this.lIIIllilIl.get(k);
      if (var3 == null) {
         var3 = new IliIIIIilliIIIIi();
         var3.liiiiiIiil = this.ilIIllilIl;
         var3.iiiiiiIiil = this.IlIIllilIl;
         this.lIIIllilIl.put(Long.valueOf(k), var3);
      }

      if (var3.liiiiiIiil != this.ilIIllilIl) {
         var3.liiiiiIiil = this.ilIIllilIl;
         var3.IIIIIIliil = 0;
         if (var3.IlIIIIliil != null) {
            var3.IlIIIIliil.clear();
         }
      }

      return var3;
   }

   public boolean Illlllllilll(long kind, int tick) {
      IliIIIIilliIIIIi var4 = this.lIIIllilIl.get(kind);
      return var4 != null && tick < var4.iIIIIIliil;
   }

   public int IiIlliIliiIl(long target) {
      IliIIIIilliIIIIi var3 = this.lIIIllilIl.get(liiiIIllIl(6861051372358106689L, target));
      return var3 == null ? Integer.MIN_VALUE : var3.iIIIIIliil;
   }

   public static long IliIlllilIi(String state, String reason) {
      long var7 = 6761240433388849681L;
      long var2 = -3750763034362895579L;
      String var4 = state + '|' + reason;
      var7 ^= (0L ^ var7) & -1L << 32;

      while ((int)(var7 >>> 32) < var4.length()) {
         var7 ^= ((long)var4.charAt((int)(var7 >>> 32)) ^ var7) & -1L >>> 32;
         if (((int)var7 < 48 || (int)var7 > 57) && (int)var7 != 45) {
            var2 = (var2 ^ (long)((int)var7)) * 1099511628211L;
         }

         var7 += 4294967296L;
      }

      return var2;
   }

   public void Iiilliiliiil() {
      this.lIIIllilIl.clear();
      this.iIIIllilIl.clear();
      this.IlIIllilIl = 0L;
      this.llIIllilIl = Long.MIN_VALUE;
      this.ilIIllilIl++;
   }

   public int IIillIiliIil(long target, long kind) {
      IliIIIIilliIIIIi var5 = this.lIIIllilIl.get(liiiIIllIl(target, kind));
      return var5 == null ? 0 : var5.lIIIIIliil;
   }

   public iIilIillIlilIill IIIllIIliIIl(long tick, long target, int kind, int budget) {
      IliIIIIilliIIIIi var7 = this.lIiiIiIlilli(liiiIIllIl(tick, target));
      if (budget < var7.iIIIIIliil) {
         this.liIIllilIl++;
         return iIilIillIlilIill.IlIllilill;
      } else if (++var7.IIIIIIliil < kind) {
         return iIilIillIlilIill.lIIllilill;
      } else {
         this.iliIiiliiiii(var7, budget);
         IliIIIIilliIIIIi var8 = this.lIiiIiIlilli(liiiIIllIl(6861051372358106689L, target));
         var8.iIIIIIliil = Math.max(var8.iIIIIIliil, var7.iIIIIIliil);
         return iIilIillIlilIill.iIIllilill;
      }
   }

   public int Ililllililil(long kind) {
      IliIIIIilliIIIIi var3 = this.lIIIllilIl.get(kind);
      return var3 == null ? 0 : var3.lIIIIIliil;
   }

   private void iliIiiliiiii(IliIIIIilliIIIIi e, int tick) {
      if (this.IlIIllilIl - e.iiiiiiIiil >= 64L) {
         e.lIIIIIliil = 0;
      }

      e.iiiiiiIiil = this.IlIIllilIl;
      e.lIIIIIliil++;
      e.iIIIIIliil = tick + iIlIlllllill(e.lIIIIIliil);
      this.IiIIllilIl++;
   }

   public iIilIillIlilIill IlIlllIlilIl(long distinct, long tick, int kind, int target) {
      IliIIIIilliIIIIi var7 = this.lIiiIiIlilli(distinct);
      if (target < var7.iIIIIIliil) {
         this.liIIllilIl++;
         return iIilIillIlilIill.IlIllilill;
      } else {
         if (var7.IlIIIIliil == null) {
            var7.IlIIIIliil = new HashSet<>();
         }

         if (var7.IlIIIIliil.size() < kind) {
            var7.IlIIIIliil.add(tick);
         }

         if (var7.IlIIIIliil.size() < kind) {
            return iIilIillIlilIill.lIIllilill;
         } else {
            this.iliIiiliiiii(var7, target);
            return iIilIillIlilIill.iIIllilill;
         }
      }
   }

   public boolean IilliliilIIi(long tempLayout, long confirms) {
      if (tempLayout != this.IlIIllilIl) {
         this.IlIIllilIl = tempLayout;
         this.llIIllilIl = confirms;
         this.iIIIllilIl.clear();
         this.iIIIllilIl.add(confirms);
         this.ilIIllilIl++;
         this.iiIIllilIl++;
         return true;
      } else if (confirms == this.llIIllilIl) {
         return false;
      } else {
         this.llIIllilIl = confirms;
         if (this.iIIIllilIl.size() >= 4096) {
            this.iIIIllilIl.clear();
         }

         if (!this.iIIIllilIl.add(confirms)) {
            this.IIlIllilIl++;
            return false;
         } else {
            this.ilIIllilIl++;
            this.iiIIllilIl++;
            return true;
         }
      }
   }

   public static long liiiIIllIl(long target, long kind) {
      return (target ^ kind * -7046029254386353131L) * 1099511628211L;
   }

   public liliiIIliiliiIIl() {
      this.iIIIllilIl = new HashSet<>();
      this.llIIllilIl = Long.MIN_VALUE;
      this.ilIIllilIl = 1L;
   }

   public static int iIlIlllllill(int strikes) {
      return Math.min(6400, 200 << Math.min(Math.max(strikes, 1) - 1, 5));
   }

   public boolean IIlllIlliIll(long target, int tick) {
      return tick < this.IiIlliIliiIl(target);
   }
}
