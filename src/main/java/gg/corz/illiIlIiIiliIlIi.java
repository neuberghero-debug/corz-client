package gg.corz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.LongSupplier;
import java.util.function.LongUnaryOperator;

public final class illiIlIiIiliIlIi {
   public static final int iIiIiIIIIi = 3;
   private int IlIliIIIIi;
   private int iIIliIIIIi;
   private final Map<Long, liiIliliiiIlil> liiIiIIIIi = new LinkedHashMap<>();
   public static final int iilIiIIIIi = 0;
   public static final int lIiIiIIIIi = 2;
   public static final int iliIiIIIIi = 6;
   private final Map<String, Integer> iiiIiIIIIi = new HashMap<>();
   public static final int IIiIiIIIIi = 1;
   private String IIIliIIIIi = "";
   public static final int lliIiIIIIi = 5;
   private int lIIliIIIIi;
   private static final String[] IiiIiIIIIi = new String[]{
      IiIiliIiiiIi<"IiIiliIiiiIi","lR+p2giELkzCpR6EgO4XupQ5ZTYesmMtKch5h7BJ/IQ=">(),
      IiIiliIiiiIi<"IiIiliIiiiIi","qbBw22j1p9qKpV6YNQTfM1FM8uYXjQs4XHYByy5kuCc=">(),
      IiIiliIiiiIi<"IiIiliIiiiIi","H/nMVCnXlI/w0reuEycDKmbH7nP8eWKN+HQMguDMAPtn">(),
      IiIiliIiiiIi<"IiIiliIiiiIi","h9kqhszqY4rkTWq6naJwfcC0RcmC/UD20QEtgrPOdaWX">(),
      IiIiliIiiiIi<"IiIiliIiiiIi","cv+58GygCHTbfAa9WKubccOU+DSPS9PFledUT+xmaJPJ">(),
      IiIiliIiiiIi<"IiIiliIiiiIi","cLr3yAKzBGNYDKyQqTdq7TcU05IBQOtGCzp6EE+hlPJv">(),
      IiIiliIiiiIi<"IiIiliIiiiIi","Twa4PdyTMiaV0aCbO4WR+Gsy7kF5clFOXuM0iquSLe5jUg==">()
   };
   public static final int IliIiIIIIi = 4;

   private boolean IIIllIIliIIl(long why, String region) {
      this.liiIiIIIIi.remove(why);
      this.IIIliIIIIi = region;
      this.iIIliIIIIi++;
      this.iiiIiIIIIi.merge(region, 1, Integer::sum);
      return false;
   }

   public liiIliliiiIlil Iiilliiliiil(long region) {
      return this.liiIiIIIIi.get(region);
   }

   public int Illlllllilll() {
      return this.iIIliIIIIi;
   }

   public int IIlllIlliIll() {
      return this.lIIliIIIIi;
   }

   public void IilliliilIIi(long targets, ilIllIllIiIllIll reason, long[] tick, long[] targetSigs, int side, String regionRev, int region, long ctx) {
      liiIliliiiIlil var11 = this.liiIiIIIIi.get(targets);
      if (var11 != null && var11.iiIliiiIiIIlliiiIi.equals(reason)) {
         var11.illliiiIiIilliiiIi |= 1 << side;
         var11.iIiliiiIiIliliiiIi = ctx;
         this.IlIliIIIIi++;
      } else {
         this.liiIiIIIIi.put(targets, new liiIliliiiIlil(targets, reason, (long[])tick.clone(), (long[])targetSigs.clone(), 1 << side, regionRev, region, ctx));
         this.lIIliIIIIi++;
      }
   }

   public void iliIiiliiiii(long region) {
      if (this.liiIiIIIIi.containsKey(region)) {
         this.IIIllIIliIIl(region, IiIiliIiiiIi<"IiIiliIiiiIi","9+4kibmcoxIcDtlY6FxuM+3zyAhBTo+p6oZrhqepROPXtA+I9r5GicQt7NTj">());
      }
   }

   public Collection<liiIliliiiIlil> Ililllililil() {
      return this.liiIiIIIIi.values();
   }

   public Map<String, Integer> IIillIiliIil() {
      return this.iiiIiIIIIi;
   }

   public String IIIilIIiiIIi() {
      if (this.liiIiIIIIi.isEmpty()) {
         return IiIiliIiiiIi<"IiIiliIiiiIi","/fjfUhxljFo97HmdJe5fotJzGvlCrjp+DFev42f1A8I=">();
      } else {
         ArrayList var1 = new ArrayList();

         for (liiIliliiiIlil var3 : this.liiIiIIIIi.values()) {
            var1.add(var3.IliIlllilIi());
         }

         return String.join(IiIiliIiiiIi<"IiIiliIiiiIi","AAoUoMX9ZUxFgDDR6HgcnaaIdBfH0x6QLe40x083">(), var1);
      }
   }

   public int IiIlliIliiIl() {
      return this.liiIiIIIIi.size();
   }

   public static boolean iIlIlllllill(lIilIIIliIilIIIl c) {
      return c == lIilIIIliIilIIIl.iIilIIllIl;
   }

   public String IlIlllIlilIl() {
      return this.IIIliIIIIi;
   }

   public int Iilllilliill() {
      return this.IlIliIIIIi;
   }

   public void IlIillIiilIi() {
      this.liiIiIIIIi.clear();
   }

   public static String IliIlllilIi(int side) {
      return side >= 0 && side < IiiIiIIIIi.length ? IiiIiIIIIi[side] : IiIiliIiiiIi<"IiIiliIiiiIi","Ct+ZBL4mTWnlnSd1rnVhOUUSf2kpLvByPEXadks=">();
   }

   public boolean lIiiIiIlilli(long now, ilIllIllIiIllIll sigOf, int region, LongSupplier side, LongUnaryOperator regionRevNow) {
      long var11 = 1627745855025295603L;
      liiIliliiiIlil var7 = this.liiIiIIIIi.get(now);
      if (var7 == null) {
         return false;
      } else if (var7.iiIliiiIiIIlliiiIi.liiiIIllIl() != sigOf.liiiIIllIl() || var7.iiIliiiIiIIlliiiIi.iIlIlllllill() != sigOf.iIlIlllllill()) {
         return this.IIIllIIliIIl(now, IiIiliIiiiIi<"IiIiliIiiiIi","xp6AHbWWraMOksSsUXd47WKf/AkBnu/zAUdx+ApQDpuk2uwLTTkoHuTlAu/l">());
      } else if (var7.iiIliiiIiIIlliiiIi.IilliliilIIi() != sigOf.IilliliilIIi()) {
         return this.IIIllIIliIIl(now, IiIiliIiiiIi<"IiIiliIiiiIi","Aaq705nXFQa8jVfOibA+p15GFt1on0XFipXEbsTP/oqX3UVX1TB/ZiATTRO3">());
      } else if (var7.iiIliiiIiIIlliiiIi.lIiiIiIlilli() != sigOf.lIiiIiIlilli()) {
         return this.IIIllIIliIIl(now, IiIiliIiiiIi<"IiIiliIiiiIi","Q35xJKiOgMLGeFsQ4IcQX49MlBvuHV837CPco+O7whnISk2O9btShiTCwpc=">());
      } else if ((var7.illliiiIiIilliiiIi & 1 << region) == 0) {
         return false;
      } else {
         long var8 = side.getAsLong();
         if (var8 != var7.iIiliiiIiIliliiiIi) {
            for (long var13 = var11 ^ (0L ^ var11) & -1L << 32; (int)(var13 >>> 32) < var7.lIlliiiIiiIlliiiIi.length; var13 += 4294967296L) {
               if (regionRevNow.applyAsLong(var7.lIlliiiIiiIlliiiIi[(int)(var13 >>> 32)]) != var7.IllliiiIilllliiiIi[(int)(var13 >>> 32)]) {
                  return this.IIIllIIliIIl(now, IiIiliIiiiIi<"IiIiliIiiiIi","f2/hloUgw6rBVwNoxAPgxj2Cg4s2OlPGTHsBe2fwsAi5vbUJ+FKMQ9TTQh0=">());
               }
            }

            var7.iIiliiiIiIliliiiIi = var8;
         }

         return true;
      }
   }

   public static int liiiIIllIl(int fz, int tx, int fy, int tz, int fx, int ty) {
      long var16 = 380994545792774487L;
      long var12 = -1087531584467979650L;
      long var14 = -965598209267976333L;
      var12 ^= ((long)(tz - fz) << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)(fx - tx) ^ var12) & -1L >>> 32;
      var14 ^= ((long)(ty - fy) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)Math.abs((int)(var12 >>> 32)) ^ var14) & -1L >>> 32;
      var16 ^= ((long)Math.abs((int)var12) << 32 ^ var16) & -1L << 32;
      var16 ^= ((long)Math.abs((int)(var14 >>> 32)) ^ var16) & -1L >>> 32;
      if ((int)var14 <= 2 && (int)(var16 >>> 32) <= 2 && (int)var16 <= 2) {
         return 6;
      } else if ((int)(var16 >>> 32) > (int)var14 && (int)(var16 >>> 32) > (int)var16) {
         return (int)var12 > 0 ? 4 : 5;
      } else if ((int)var14 >= (int)var16) {
         return (int)(var12 >>> 32) > 0 ? 0 : 1;
      } else {
         return (int)(var14 >>> 32) > 0 ? 2 : 3;
      }
   }
}
