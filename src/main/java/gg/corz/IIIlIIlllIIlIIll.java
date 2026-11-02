package gg.corz;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class IIIlIIlllIIlIIll {
   private double iiiliiIlll;
   private double IIIiiiIlll;
   private static final int IilliiIlll = 3;
   private int llIiiiIlll;
   private int ilIiiiIlll;
   private static final int iilliiIlll = 16;
   private boolean iiIiiiIlll;
   private long IiiliiIlll;
   private boolean IiIiiiIlll;
   private lllIIIiillIIIi IIliiiIlll;
   private int lIIiiiIlll;
   private final Map<Long, Integer> lliliiIlll;
   private final ArrayDeque<Long> ililiiIlll;
   private int iIIiiiIlll;
   private static final int illliiIlll = 8;
   private static final int IIiliiIlll = 10;
   private static final double lIiliiIlll = 0.06;
   private long IlIiiiIlll;
   private static final double iIiliiIlll = 0.06;
   private static final int lllliiIlll = 2;
   private final Map<Long, Integer> IliliiIlll = new HashMap<>();
   private static final int lilliiIlll = 3;
   private long liIiiiIlll;
   private int liiliiIlll;

   public illilllIililll Iiilliiliiil(int tick) {
      return new illilllIililll(
         this.liiliiIlll,
         this.iiiliiIlll,
         this.IIIiiiIlll,
         this.lIIiiiIlll,
         Math.max(0, tick - this.lIIiiiIlll),
         this.iIIiiiIlll,
         this.llIiiiIlll,
         this.IIliiiIlll,
         List.copyOf(this.ililiiIlll)
      );
   }

   public liIiiIIiiiIiiIIi lIiiIiIlilli(long tick, int fingerprint, int ttl) {
      long var6 = 6950517939720359416L;
      var6 ^= ((long)this.IliliiIlll.merge(tick, 1, Integer::sum).intValue() << 32 ^ var6) & -1L << 32;
      if ((int)(var6 >>> 32) < 2) {
         return liIiiIIiiiIiiIIi.illiIiiiil;
      } else {
         this.lliliiIlll.put(tick, fingerprint + Math.max(1, ttl));
         return liIiiIIiiiIiiIIi.lIiiIiiiil;
      }
   }

   private boolean IIlllIlliIll(long cell) {
      if (!this.ililiiIlll.isEmpty() && this.ililiiIlll.peekLast() == cell) {
         return false;
      } else {
         this.ililiiIlll.addLast(cell);

         while (this.ililiiIlll.size() > 8) {
            this.ililiiIlll.removeFirst();
         }

         return true;
      }
   }

   public void IIIilIIiiIIi(int tick) {
      this.lIIiiiIlll = tick;
      if (this.llIiiiIlll > 0) {
         this.ilIiiiIlll = tick;
      }
   }

   private static long iIlIlllllill(long value, long hash) {
      value ^= hash;
      return value * 1099511628211L;
   }

   public void iliIiiliiiii(long initial, IIililIllIililIl fingerprint) {
      this.IiiliiIlll = initial;
      this.ililiiIlll.clear();
      this.iIIiiiIlll = 0;
      this.IlIiiiIlll = 0L;
      this.llIiiiIlll = 0;
      this.ilIiiiIlll = -1073741824;
      this.liiliiIlll = fingerprint.iIlIlllllill();
      this.iiiliiIlll = IiIlliIliiIl(fingerprint.lIiiIiIlilli());
      this.IIIiiiIlll = IiIlliIliiIl(fingerprint.iliIiiliiiii());
      this.lIIiiiIlll = fingerprint.IliIlllilIi();
      this.IiIiiiIlll = fingerprint.IIIllIIliIIl();
      this.liIiiiIlll = fingerprint.IiIlliIliiIl();
      this.iiIiiiIlll = fingerprint.IIlllIlliIll();
      this.IIliiiIlll = lllIIIiillIIIi.IIIllIililIIllIili;
      this.IIlllIlliIll(fingerprint.IilliliilIIi());
   }

   public boolean IilliliilIIi(long fingerprint, int tick) {
      Integer var4 = this.lliliiIlll.get(fingerprint);
      if (var4 == null) {
         return true;
      } else if (tick >= var4) {
         this.lliliiIlll.remove(fingerprint);
         this.IliliiIlll.remove(fingerprint);
         return true;
      } else {
         return false;
      }
   }

   private long Iilllilliill() {
      long var11 = -1887919257756934544L;
      Long[] var1 = this.ililiiIlll.toArray(Long[]::new);
      var11 ^= ((long)var1.length << 32 ^ var11) & -1L << 32;
      long var3 = var1[(int)(var11 >>> 32) - 1];
      long var5 = var1[(int)(var11 >>> 32) - 2];
      long var7 = Long.compareUnsigned(var3, var5) <= 0 ? var3 : var5;
      long var9 = var7 == var3 ? var5 : var3;
      return iIlIlllllill(iIlIlllllill(-3750763034362895579L, var7), var9);
   }

   public static long liiiIIllIl(long target, long stand, List<Long> route) {
      long var5 = route != null && !route.isEmpty() ? (Long)route.get(0) : 0L;
      return IliIlllilIi(target, stand, var5, null, route);
   }

   private boolean Illlllllilll() {
      long var3 = 4524883856037240444L;
      Long[] var1 = this.ililiiIlll.toArray(Long[]::new);
      var3 ^= ((long)var1.length << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) >= 3
         && var1[(int)(var3 >>> 32) - 1].equals(var1[(int)(var3 >>> 32) - 3])
         && !var1[(int)(var3 >>> 32) - 1].equals(var1[(int)(var3 >>> 32) - 2]);
   }

   private lllIIIiillIIIi IlIlllIlilIl(IIililIllIililIl s) {
      if (s.iIlIlllllill() > this.liiliiIlll) {
         this.liiliiIlll = s.iIlIlllllill();
         this.iiiliiIlll = IiIlliIliiIl(s.lIiiIiIlilli());
         this.IIIiiiIlll = IiIlliIliiIl(s.iliIiiliiiii());
         return lllIIIiillIIIi.iIIllIiliIlIllIili;
      } else if (s.iIlIlllllill() == this.liiliiIlll && IiIlliIliiIl(s.lIiiIiIlilli()) < this.iiiliiIlll - 0.06) {
         this.iiiliiIlll = IiIlliIliiIl(s.lIiiIiIlilli());
         return lllIIIiillIIIi.llIllIiliilIllIili;
      } else if (s.iIlIlllllill() == this.liiliiIlll && IiIlliIliiIl(s.iliIiiliiiii()) < this.IIIiiiIlll - 0.06) {
         this.IIIiiiIlll = IiIlliIliiIl(s.iliIiiliiiii());
         return lllIIIiillIIIi.IiIllIililiIllIili;
      } else if (s.IiIlliIliiIl() > this.liIiiiIlll) {
         return lllIIIiillIIIi.lIlllIiliiIlllIili;
      } else if (s.IIlllIlliIll() && !this.iiIiiiIlll) {
         return lllIIIiillIIIi.IllllIililllllIili;
      } else {
         return s.IIIllIIliIIl() && !this.IiIiiiIlll && s.iliIiiliiiii() <= 0.2 && s.Illlllllilll()
            ? lllIIIiillIIIi.iiIllIiliIIlllIili
            : lllIIIiillIIIi.IIIllIililIIllIili;
      }
   }

   public static long IliIlllilIi(long route, long stand, long start, iiiIIiilIIIlIiil firstTransition, List<Long> target) {
      long var8 = -3750763034362895579L;
      var8 = iIlIlllllill(var8, route);
      var8 = iIlIlllllill(var8, stand);
      var8 = iIlIlllllill(var8, start);
      var8 = iIlIlllllill(var8, firstTransition == null ? -1L : (long)firstTransition.ordinal());
      if (target != null) {
         for (long var11 : target) {
            var8 = iIlIlllllill(var8, var11);
         }
      }

      return var8;
   }

   public liIiiIIiiiIiiIIi IIIllIIliIIl(IIililIllIililIl sample) {
      long var8 = -9183487124704438015L;
      long var10 = -2393530914665526213L;
      if (sample.liiiIIllIl() == 0L) {
         return liIiiIIiiiIiiIIi.illiIiiiil;
      } else if (this.IiiliiIlll != sample.liiiIIllIl()) {
         this.iliIiiliiiii(sample.liiiIIllIl(), sample);
         return liIiiIIiiiIiiIIi.illiIiiiil;
      } else {
         lllIIIiillIIIi var2 = this.IlIlllIlilIl(sample);
         if (var2 != lllIIIiillIIIi.IIIllIililIIllIili) {
            this.IIliiiIlll = var2;
            this.lIIiiiIlll = sample.IliIlllilIi();
            if (var2 == lllIIIiillIIIi.iIIllIiliIlIllIili
               || var2 == lllIIIiillIIIi.lIlllIiliiIlllIili
               || var2 == lllIIIiillIIIi.iiIllIiliIIlllIili
               || var2 == lllIIIiillIIIi.IllllIililllllIili) {
               this.ililiiIlll.clear();
               this.iIIiiiIlll = 0;
               this.IlIiiiIlll = 0L;
            }
         } else {
            this.IIliiiIlll = lllIIIiillIIIi.IIIllIililIIllIili;
         }

         var8 ^= ((long)this.IIlllIlliIll(sample.IilliliilIIi()) << 32 ^ var8) & -1L << 32;
         var8 ^= ((long)((int)(var8 >>> 32) != 0 && this.Illlllllilll() ? 1 : 0) ^ var8) & -1L >>> 32;
         this.IiIiiiIlll = sample.IIIllIIliIIl();
         this.liIiiiIlll = Math.max(this.liIiiiIlll, sample.IiIlliIliiIl());
         this.iiIiiiIlll = this.iiIiiiIlll | sample.IIlllIlliIll();
         if ((int)var8 == 0) {
            return var2 == lllIIIiillIIIi.IIIllIililIIllIili ? liIiiIIiiiIiiIIi.illiIiiiil : liIiiIIiiiIiiIIi.IiliIiiiil;
         } else {
            long var5 = this.Iilllilliill();
            if (var5 == this.IlIiiiIlll) {
               this.iIIiiiIlll++;
            } else {
               this.IlIiiiIlll = var5;
               this.iIIiiiIlll = 1;
            }

            var10 ^= ((long)Math.max(0, sample.IliIlllilIi() - this.lIIiiiIlll) << 32 ^ var10) & -1L << 32;
            if (var2 != lllIIIiillIIIi.IIIllIililIIllIili || (int)(var10 >>> 32) < 16) {
               return liIiiIIiiiIiiIIi.liliIiiiil;
            } else if (this.llIiiiIlll == 0 && this.iIIiiiIlll >= 3) {
               this.llIiiiIlll = 1;
               this.ilIiiiIlll = sample.IliIlllilIi();
               this.iIIiiiIlll = 0;
               this.ililiiIlll.clear();
               this.IIlllIlliIll(sample.IilliliilIIi());
               return liIiiIIiiiIiiIIi.iiliIiiiil;
            } else {
               return this.llIiiiIlll > 0 && this.iIIiiiIlll >= 3 && sample.IliIlllilIi() - this.ilIiiiIlll >= 10
                  ? liIiiIIiiiIiiIIi.IIiiIiiiil
                  : liIiiIIiiiIiiIIi.liliIiiiil;
            }
         }
      }
   }

   private static double IiIlliIliiIl(double value) {
      return Double.isFinite(value) ? Math.max(0.0, value) : Double.POSITIVE_INFINITY;
   }

   public IIIlIIlllIIlIIll() {
      this.lliliiIlll = new HashMap<>();
      this.ililiiIlll = new ArrayDeque<>();
      this.liiliiIlll = -1;
      this.iiiliiIlll = Double.POSITIVE_INFINITY;
      this.IIIiiiIlll = Double.POSITIVE_INFINITY;
      this.ilIiiiIlll = -1073741824;
      this.IIliiiIlll = lllIIIiillIIIi.IIIllIililIIllIili;
   }

   public void IIillIiliIil() {
      this.ililiiIlll.clear();
      this.iIIiiiIlll = 0;
      this.IlIiiiIlll = 0L;
      this.llIiiiIlll = 0;
      this.IiiliiIlll = 0L;
   }

   public IiIllilliIllil Ililllililil() {
      IiIllilliIllil var1 = new IiIllilliIllil(this.IliliiIlll.size(), this.lliliiIlll.size(), this.ililiiIlll.size());
      this.IliliiIlll.clear();
      this.lliliiIlll.clear();
      this.IIillIiliIil();
      this.liiliiIlll = -1;
      this.iiiliiIlll = Double.POSITIVE_INFINITY;
      this.IIIiiiIlll = Double.POSITIVE_INFINITY;
      this.lIIiiiIlll = 0;
      this.IIliiiIlll = lllIIIiillIIIi.IIIllIililIIllIili;
      return var1;
   }
}
