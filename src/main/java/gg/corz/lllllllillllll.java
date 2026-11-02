package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import net.minecraft.class_1309;
import net.minecraft.class_1511;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3966;
import net.minecraft.class_638;
import net.minecraft.class_2338.class_2339;

public final class lllllllillllll {
   private class_243 lllIliiilillIliiil;
   private float iIlIliiilIllIliiil;
   public static final double ililIiiilIiilIiiil = 2.2;
   public static final double lIliIiiiliIliIiiil = 0.299;
   private class_2338 iliIliiilIiiIliiil;
   public static final int IIllIiiillIllIiiil = 2;
   private final iIIlillIlIlill IlIIliiilllIIliiil = new iIIlillIlIlill();
   public static final int IIiiIiiillIiiIiiil = 20;
   private String IliIliiillliIliiil;
   public static final double iIIiIiiilIlIiIiiil = 0.5;
   private final Map<Long, Long> ilIIliiilIiIIliiil = new HashMap<>();
   public static final int liIlIiiiliiIlIiiil = 3;
   public static final double iIiiIiiilIliiIiiil = 2.0;
   private int iilIliiilIIiIliiil;
   public static final String iiiiIiiilIIIIliiil = "/kf";
   private String lIiIliiiliIiIliiil;
   public static final double IIIiIiiillIIiIiiil = 3.2;
   public static final String IiiiIiiilliiiIiiil = "crystal";
   public static final int iIllIiiilIlllIiiil = 3;
   public static final double iiIiIiiilIIliIiiil = 0.1;
   public static final double IlIlIiiilllIlIiiil = 0.6;
   private long IilIliiillilIliiil;
   public static final double iiiIIiiilIIIlIiiil = 6.0;
   public static final int illiIiiilIiliIiiil = 10;
   private float IIIlliiillIIlliiil;
   public static final Set<String> lIIIliiiliIIIliiil = Set.of(
      lliIliliIl<"lliIliliIl","N4T4Zwcce5gMmah8vq5ScxxiiW4vJcHoi4uvacpQWg==">(),
      lliIliliIl<"lliIliliIl","LdpQ8o1gxhXq66J8WyWnaOgCX0bypKV0oDksS82ws3KIbg==">(),
      lliIliliIl<"lliIliliIl","fcfzEuYiGpSi6dFGS+4GfpKwMoNx0dXoUxGl1hWgREygDfo=">(),
      lliIliliIl<"lliIliliIl","gXpmO4Lp4gvKn8fmpcZmrKfZqwbN85srhNFc+94VX5jpmmo=">(),
      lliIliliIl<"lliIliliIl","Rzk0yBjgTKXJTZdglXjlcdk5R28rjSwfNu1itE0pt678Q+csLhoT">(),
      lliIliliIl<"lliIliliIl","Nw3MQFAA7v3jbL/4brcWZYgTAhmz6W4F6ddVj0hQBGJ+4tY=">(),
      lliIliliIl<"lliIliliIl","bZzTHBd5ipcr1+BkM+av2LL8Ja72k2+MZkCKVDk2O+U=">()
   );
   public static final int IillIiiillillIiiil = 6;
   public static final double lIIlIiiiliIIlIiiil = 5.0;
   public static final String lliiIiiililiiIiiil = "unsafe";
   public static final double llIiIiiililIiIiiil = 1.0;
   public static final int liliIiiiliiliIiiil = 8;
   public static final String IiiIIiiilliiIIiiil = "Terminator";
   private long liiIliiiliiiIliiil;
   public static final double liilIiiiliiilIiiil = 2.6;
   private class_2338 liIIliiiliiIIliiil;
   public static final double IlliIiiilllliIiiil = 3.5;
   public static final double IlilIiiilllilIiiil = 2.5;
   public static final int llllIiiililllIiiil = 6;
   public static final double IiIiIiiilliIiIiiil = 2.0;
   public static final double lIilIiiiliIilIiiil = 1.6;
   public static final double ilIlIiiilIiIlIiiil = 0.15;
   private double IIlIliiillIlIliiil = Double.NEGATIVE_INFINITY;
   public static final int iillIiiilIIilIiiil = 6;
   private int llIlliiililIlliiil;
   private float iIIlliiilIlIlliiil;

   private static llillIIlilillIIl Iilllilliill(lllIIiiillIIii c) {
      long var4 = 2263678566036361436L;
      var4 ^= ((long)(c.IliIlllilIi() == IiIIlillliIIlill.lIlIiilill ? 1 : 0) << 32 ^ var4) & -1L << 32;
      ilIIiiiIiIIiii var2 = (int)(var4 >>> 32) != 0 ? c.iIlIlllllill() : null;
      var4 ^= ((long)Ililllililil(c.IliIlllilIi()) ^ var4) & -1L >>> 32;
      return new llillIIlilillIIl(
         c.liiiIIllIl(),
         (int)(var4 >>> 32) != 0 ? c.liiiIIllIl() : null,
         null,
         (boolean)((int)var4),
         (int)var4 == 0,
         true,
         null,
         null,
         var2 == null ? null : var2.IliIlllilIi(),
         var2 == null ? null : var2.liiiIIllIl()
      );
   }

   static double Iiiiliiiiiii(class_1937 w, class_243 feet) {
      long var7 = 5759427467376848191L;
      long var9 = -7910179298623577726L;
      if (w != null && feet != null) {
         var7 ^= ((long)class_3532.method_15357(feet.field_1352) << 32 ^ var7) & -1L << 32;
         var7 ^= ((long)class_3532.method_15357(feet.field_1350) ^ var7) & -1L >>> 32;
         var9 ^= ((long)class_3532.method_15357(feet.field_1351 + 0.001) << 32 ^ var9) & -1L << 32;
         class_2339 var5 = new class_2339();

         for (long var14 = var9 ^ (0L ^ var9) & -1L >>> 32; (int)var14 <= 6; var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
            var5.method_10103((int)(var7 >>> 32), (int)(var14 >>> 32) - (int)var14 - 1, (int)var7);
            if (!w.method_8320(var5).method_26220(w, var5).method_1110()) {
               return (double)((int)(var14 >>> 32) - (int)var14);
            }
         }

         return feet.field_1351;
      } else {
         return feet == null ? 0.0 : feet.field_1351;
      }
   }

   private static double Iilililiiili(class_243 eye, class_243 b, class_243 a) {
      float[] var3 = ilIiiIiIii.Ililllililil(eye, b);
      float[] var4 = ilIiiIiIii.Ililllililil(eye, a);
      return liiIIliliiiIIlil.Iilllilliill(var3[0], var3[1], var4[0], var4[1]);
   }

   private void IIiIllIiIl() {
      this.lllIliiilillIliiil = null;
      this.IilIliiillilIliiil = Long.MIN_VALUE;
   }

   private static boolean Iliilliiilii(iIilIiIiIlilIiIi p, class_2338 spot) {
      return p != null
         && spot != null
         && p.lIiiIiIlilli() == spot.method_10263()
         && p.iliIiiliiiii() == spot.method_10264()
         && p.IIIllIIliIIl() == spot.method_10260();
   }

   public IiiIliliiIli IilliliilIIi(IIllIIllIllIIl in, IiiIliliiIli s, ilIlIIIlIiIlIIIl base) {
      long var49 = 7377291060667708765L;
      long var51 = 7033412580380987421L;
      long var53 = 8930821194677976106L;
      long var41 = -7303380522713788016L;
      long var43 = -4999981099566624048L;
      long var45 = -711275130131432292L;
      long var47 = -341219289616177128L;
      liiilIiliiiilIil var4 = in == null ? null : in.IiIlliIliiIl();
      lliiilIiiliiilIi var5 = in == null ? null : in.IlIlllIlilIl();
      class_310 var6 = class_310.method_1551();
      if (var4 != null && var5 != null && s != null && base != null && base.IlIlllIlilIl() != null && var6.field_1724 != null && var6.field_1687 != null) {
         class_243 var7 = var4.IIIllIIliIIl() != null ? var4.IIIllIIliIIl() : var4.iliIiiliiiii();
         class_243 var8 = var5.liiiIIllIl();
         if (var7 != null && var8 != null) {
            if (var4.iIlIlllllill() != this.iilIliiilIIiIliiil) {
               this.iilIliiilIIiIliiil = var4.iIlIlllllill();
               this.IlIIliiilllIIliiil.IIlllIlliIll();
               this.ilIIliiilIiIIliiil.clear();
               this.lilIliilIl();
               this.IIiIllIiIl();
               this.lIlIliIlIl();
            }

            long var9 = in.IIIllIIliIIl();
            this.iIIIlIlIIl(base.IilliliilIIi(), var9);
            this.llIIlilIIl(base, var9);
            this.illIlIilIl(var9);
            double var11 = Math.hypot(var7.field_1352 - var8.field_1352, var7.field_1350 - var8.field_1350);
            double var13 = var7.method_1022(var8);
            lllIIiiillIIii var15 = this.lIiiIiIlilli(in, base, var7, var9);
            IilliIIllilliIIl var16 = in.IilliliilIIi(iIlIIIIiIllIIIIi.IiiiliIiil);
            IilliIIllilliIIl var17 = in.IilliliilIIi(iIlIIIIiIllIIIIi.liiiliIiil);
            var41 ^= ((long)lliIliliIl<"lliIliliIl","VepIbu0rOWcr5hs7mbOrD+cZkvrjAlifWQziYD7HUyw=">().equals(var16.IlIlllIlilIl()) << 32 ^ var41) & -1L << 32;
            var41 ^= ((long)lliIliliIl<"lliIliliIl","+OyqMBJeSgi5g9PX0wu0SXb/SNucFyqDgkYGZdJPsukPBa5n">().equals(var16.IlIlllIlilIl()) ^ var41) & -1L >>> 32;
            var43 ^= ((long)iiIiIIIlIIliIIIl.IlIlllIlilIl(base.Iilllilliill(), (boolean)((int)var41), var16.IilliliilIIi()) << 32 ^ var43) & -1L << 32;
            var43 ^= ((long)(base.lIiiIiIlilli() && (int)(var43 >>> 32) == 0 ? 1 : 0) ^ var43) & -1L >>> 32;
            var45 ^= (
                  (long)iiIiIIIlIIliIIIl.IiIlliIliiIl(var16.iIlIlllllill(), var16.IilliliilIIi(), (boolean)((int)(var41 >>> 32)), (boolean)((int)var43)) << 32
                     ^ var45
               )
               & -1L << 32;
            var45 ^= ((long)(var17.iIlIlllllill() && in.Iilllilliill() <= 0 && var5.Iliilliiilii() >= 0.9F ? 1 : 0) ^ var45) & -1L >>> 32;
            iiliiiIiIIiiiiIi var24 = base.iIlIlllllill();
            var47 ^= (
                  (long)(var24 != null && var24.IIIllIIliIIl() == iIlIIIIiIllIIIIi.lIIIiiIiil && var24.IIlllIlliIll() != null && var5.IIiilIiiiIii() ? 1 : 0)
                        << 32
                     ^ var47
               )
               & -1L << 32;
            var47 ^= ((long)(var15 != null && var15.IlIlllIlilIl() ? 1 : 0) ^ var47) & -1L >>> 32;
            var49 ^= ((long)(var15 != null && var15.IiIlliIliiIl() ? 1 : 0) << 32 ^ var49) & -1L << 32;
            var49 ^= (
                  (long)(
                        var15 != null && iiIiIIIlIIliIIIl.IIIIllIIIl(var15.IliIlllilIi(), (boolean)((int)var47), var15.Iilllilliill(), var15.IIlllIlliIll())
                           ? 1
                           : 0
                     )
                     ^ var49
               )
               & -1L >>> 32;
            var51 ^= ((long)((int)(var45 >>> 32) != 0 && var16.IIIllIIliIIl() ? 1 : 0) << 32 ^ var51) & -1L << 32;
            IiliiIIililiiIIi var30 = iiIiIIIlIIliIIIl.Iliilliiilii(
               (boolean)((int)var43),
               (boolean)((int)var41),
               (boolean)((int)(var41 >>> 32)),
               (boolean)((int)var47),
               (int)var47 != 0 && var15.IliIlllilIi() == IiIIlillliIIlill.liIIiilill,
               (boolean)((int)(var49 >>> 32)),
               var15 == null ? 0.0 : (double)var15.iliIiiliiiii(),
               (boolean)((int)(var45 >>> 32)),
               (int)(var45 >>> 32) != 0 ? var16.IilliliilIIi() : 0.0,
               var13,
               (boolean)((int)var45),
               (int)var45 != 0 && var17.IIIllIIliIIl(),
               base.iliIiiliiiii(),
               (boolean)((int)(var47 >>> 32)),
               (boolean)((int)var49),
               (boolean)((int)(var51 >>> 32))
            );
            var51 ^= (
                  (long)(
                        var30 == IiliiIIililiiIIi.iiIlliiiil
                              && iiIiIIIlIIliIIIl.Iiiiliiiiiii(
                                 (boolean)((int)var43),
                                 (boolean)((int)var41),
                                 (boolean)((int)(var41 >>> 32)),
                                 (boolean)((int)var47),
                                 (boolean)((int)var49),
                                 (boolean)((int)(var45 >>> 32)),
                                 (boolean)((int)(var51 >>> 32))
                              )
                           ? 1
                           : 0
                     )
                     ^ var51
               )
               & -1L >>> 32;
            llillIIlilillIIl var33 = null;
            iIiIiilIliIiil var34 = null;
            class_243 var35 = null;
            iIlIIIIiIllIIIIi var32;
            switch (var30) {
               case iiIlliiiil:
                  var32 = iIlIIIIiIllIIIIi.iliiliIiil;
                  var33 = Iilllilliill(var15);
                  var35 = var15.IIIllIIliIIl();
                  break;
               case IIllliiiil:
                  var32 = iIlIIIIiIllIIIIi.IiiiliIiil;
                  break;
               case lIllliiiil:
                  var32 = iIlIIIIiIllIIIIi.liiiliIiil;
                  break;
               case iIllliiiil:
                  var32 = iIlIIIIiIllIIIIi.lIIIiiIiil;
                  var34 = (int)(var47 >>> 32) != 0 ? var24.IIlllIlliIll() : null;
                  break;
               default:
                  var32 = iIlIIIIiIllIIIIi.lliiliIiil;
                  if (var15 != null) {
                     var33 = Iilllilliill(var15);
                     var35 = var15.IIIllIIliIIl();
                  } else {
                     var35 = this.IiIiliIiiiIi(base, var7, var13, var9);
                  }
            }

            IilliIIllilliIIl var36 = in.IilliliilIIi(iIlIIIIiIllIIIIi.IlIIiiIiil);
            var53 ^= ((long)(!base.IIIllIIliIIl() && var5.Ililllililil() > 0 ? 1 : 0) << 32 ^ var53) & -1L << 32;
            if (iiIiIIIlIIliIIIl.iIIIlIlIIl(
               var30,
               (int)var45 != 0 && var17.IIIllIIliIIl(),
               (boolean)((int)(var53 >>> 32)),
               var36.iIlIlllllill() && lliIliliIl<"lliIliliIl","N5vGcCe9gyNDJngqXNOut693xu09nJPLz9TT+Zq6immQimY=">().equals(var36.IlIlllIlilIl())
            )) {
               var32 = iIlIIIIiIllIIIIi.IlIIiiIiil;
               var33 = null;
               var34 = null;
               var35 = null;
            }

            IlliIiIlllliIiIl var38 = var30 == IiliiIIililiiIIi.iIllliiiil
               ? (
                  var24 != null && var24.Iilllilliill() != null
                     ? var24.Iilllilliill()
                     : new IlliIiIlllliIiIl(IIliIilIliIi.lIIIIlIIliIIIIlIIl, var8, 0.1, false, true, Long.MIN_VALUE)
               )
               : (
                  var30 == IiliiIIililiiIIi.Illlliiiil && base.Illlllllilll() != null
                     ? base.Illlllllilll()
                     : this.Illlllllilll(in, var4, var7, var8, var11, base.liiiIIllIl(), var9, (boolean)((int)var43))
               );
            this.IiIIlliIIl(
               var30 == IiliiIIililiiIIi.iiIlliiiil && (int)var47 != 0 && var15.IliIlllilIi() != IiIIlillliIIlill.iiIIiilill && !iiIIlIIlIl(base, var15)
                  ? var15.liiiIIllIl()
                  : null,
               base
            );
            this.lIiIliiiliIiIliiil = IIillIiliIil(
                  var32 == iIlIIIIiIllIIIIi.IlIIiiIiil ? lliIliliIl<"lliIliliIl","pxSKHQuwxTyodVJIs5tFhhF42qIC4dIpM5JYgVw+OQ==">() : var30.name(), var15
               )
               + (var15 == null ? this.IliIliiillliIliiil : "");
            if ((int)var51 != 0 && var32 == iIlIIIIiIllIIIIi.iliiliIiil) {
               this.lIiIliiiliIiIliiil = this.lIiIliiiliIiIliiil + lliIliliIl<"lliIliliIl","dsl6vbpQNjm9rA49MPd/KiuARtjd0U0PbWcKQ552/g==">();
            }

            iiliiiIiIIiiiiIi var39 = new iiliiiIiIIiiiiIi(
               iIliIiIiIlliIiIi.lliIiIiIIi,
               iIlIIillIllIIill.lliilllill,
               var15 == null ? 0.0 : var15.lIiiIiIlilli(),
               iiiIiiIlIIIliiIl.lliiIlIlll,
               var32,
               var33,
               null,
               var34,
               null,
               var38,
               var35,
               Integer.MAX_VALUE,
               0,
               lliIliliIl<"lliIliliIl","Zh+jEUQO/W/pYy/bToBcA1zylBnZZv1sdygkMen43u3grOf7aiQ=">(),
               null
            );
            IlIIIillllIIIill var40 = var38.IliIlllilIi() == IIliIilIliIi.IiiiiIIIlliiiiIIIl ? IlIIIillllIIIill.ilIilllill : IlIIIillllIIIill.iIIilllill;
            return new IiiIliliiIli(
               iIllIliIlllIli.lIiiIIIIIl,
               s.liiiIIllIl(),
               s.iIlIlllllill(),
               var32,
               var40,
               false,
               1.0F,
               s.IlIlllIlilIl(),
               s.IiIlliIliiIl(),
               s.IIlllIlliIll(),
               illlliIlIillliIl.iilIiiiIll,
               true,
               var32 == iIlIIIIiIllIIIIi.IlIIiiIiil || s.IIillIiliIil(),
               lliIliliIl<"lliIliliIl","Zh+jEUQO/W/pYy/bToBcA1zylBnZZv1sdygkMen43u3grOf7aiQ=">(),
               var39,
               false,
               s.IlIillIiilIi()
            );
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public String liiiIIllIl() {
      return this.lIiIliiiliIiIliiil;
   }

   public void IliIlllilIi() {
      this.IlIIliiilllIIliiil.IIlllIlliIll();
      this.ilIIliiilIiIIliiil.clear();
      this.lilIliilIl();
      this.IIiIllIiIl();
      this.lIlIliIlIl();
      this.iilIliiilIIiIliiil = -1;
      this.lIiIliiiliIiIliiil = lliIliliIl<"lliIliliIl","R0OhghhzPF2ImRnj3hZ9IaVpxQCIAgPMJE9444o=">();
      this.IliIliiillliIliiil = "";
   }

   static IillIiillillIiil Iiilliiliiil(IillIiillillIiil target, IilIlIIllilIlIIl r) {
      return new IillIiillillIiil(
         target.IilliliilIIi(),
         target.lIiiIiIlilli(),
         target.iliIiiliiiii(),
         target.IIIllIIliIIl(),
         target.IlIlllIlilIl(),
         target.IiIlliIliiIl(),
         target.IIlllIlliIll(),
         target.Illlllllilll(),
         target.Iilllilliill(),
         target.IIillIiliIil(),
         target.Ililllililil(),
         target.Iiilliiliiil(),
         target.IIIilIIiiIIi(),
         target.IlIillIiilIi(),
         target.IiIiliIiiiIi(),
         target.IIlilIliiIli(),
         target.Illillliilli(),
         r,
         target.IIiilIiiiIii(),
         target.Iliilliiilii(),
         target.Iiiiliiiiiii(),
         target.IIIIllIIIl(),
         target.iIIIlIlIIl(),
         target.llIIlilIIl()
      );
   }

   private void lilIliilIl() {
      this.liIIliiiliiIIliiil = null;
      this.IIlIliiillIlIliiil = Double.NEGATIVE_INFINITY;
      this.iIlIliiilIllIliiil = 0.0F;
   }

   private lllIIiiillIIii lIiiIiIlilli(IIllIIllIllIIl in, ilIlIIIlIiIlIIIl feet, class_243 tick, long s) {
      long var64 = 7023991077560116305L;
      long var66 = 1058494481272728853L;
      long var68 = 1034902233816901706L;
      long var70 = 9063615476415932535L;
      long var56 = 363227917026093601L;
      long var72 = -5089147576561046752L;
      long var58 = 4018962376623154724L;
      long var60 = 3394393484270500343L;
      long var62 = -800879630146903224L;
      this.IliIliiillliIliiil = lliIliliIl<"lliIliliIl","RIcxiBRtpo5a0qRzp6JF2lxGMIuIrUA63p6b9cDs2Gs=">();
      IillIiillillIiil var6 = feet.IliIlllilIi();
      class_310 var7 = class_310.method_1551();
      class_638 var8 = var7.field_1687;
      lliiilIiiliiilIi var9 = in.IlIlllIlilIl();
      liiilIiliiiilIil var10 = in.IiIlliIliiIl();
      if (var6 != null && var8 != null && var6.IilliliilIIi() != null) {
         if (!lllIliIlillIliIl.IiIiliIiiiIi()) {
            this.lilIliilIl();
            return null;
         } else {
            var56 ^= ((long)Math.max(0, in.Iilllilliill()) << 32 ^ var56) & -1L << 32;
            IillIiillillIiil var12 = Iiilliiliiil(var6, IilIlIIllilIlIIl.IIIIlillIl);
            IillIiillillIiil var13 = Iiilliiliiil(var6, new IilIlIIllilIlIIl((int)(var56 >>> 32), var10.llIIlilIIl()));
            lIIiIiiIIiIi var14 = var6.Illlllllilll();
            long var15 = var6.Iilllilliill();
            class_243 var17 = feet.IlIlllIlilIl();
            class_1309 var18 = var6.IilliliilIIi();
            class_243 var19 = var6.lIiiIiIlilli() != null && var6.lIiiIiIlilli().IliIlllilIi() != null ? var6.lIiiIiIlilli().IliIlllilIi() : tick;
            double var20 = Math.min(tick.field_1351, var19.field_1351);
            double var22 = iiIiIIIlIIliIIIl.lIiiIiIlilli(var10.IIlllIlliIll(), var20, IIIIllIIIl(var8, var19));
            class_243 var24 = var9.liiiIIllIl();
            double var25 = iiIiIIIlIIliIIIl.IIlllIlliIll(
               var9.iliIiiliiiii(), var9.lIiiIiIlilli() == null ? 0.0 : var9.lIiiIiIlilli().field_1351, var24.field_1351, IIIIllIIIl(var8, var24)
            );
            class_243 var27 = Double.isNaN(var25) ? null : new class_243(var17.field_1352, var17.field_1351 - (var24.field_1351 - var25), var17.field_1350);
            var56 ^= ((long)feet.IIIllIIliIIl() ^ var56) & -1L >>> 32;
            var58 ^= ((long)((int)var56 != 0 && var9.Iiilliiliiil() > 0 && var6.IiIlliIliiIl() && var6.IIlllIlliIll() ? 1 : 0) << 32 ^ var58) & -1L << 32;
            iIilIiIiIlilIiIi var30 = feet.liiiIIllIl();
            ArrayList var31 = new ArrayList();
            class_238 var32 = new class_238(
               var17.field_1352 - 6.0, var17.field_1351 - 6.0, var17.field_1350 - 6.0, var17.field_1352 + 6.0, var17.field_1351 + 6.0, var17.field_1350 + 6.0
            );
            class_239 var33 = lllIliIlillIliIl.Iilililiiili(var17, feet.IiIlliIliiIl(), feet.IIlllIlliIll());

            for (class_1511 var35 : var8.method_8390(class_1511.class, var32, e -> e.method_5805() && !e.method_31481())) {
               class_238 var36 = var35.method_5829();
               if (!(lllIliIlillIliIl.IIlilIliiIli(var17, var36) >= 3.0)) {
                  class_2338 var37 = lllIliIlillIliIl.iliIiiliiiii(var35).method_10062();
                  var58 ^= ((long)var35.method_5628() ^ var58) & -1L >>> 32;
                  if (!this.IllIllllIl(var37, s) && (var14 == null || !var14.IIlilIliiIli((int)var58, var15))) {
                     var60 ^= ((long)(var14 != null && var14.IIillIiliIil(var37.method_10063(), var15) ? 1 : 0) << 32 ^ var60) & -1L << 32;
                     var60 ^= ((long)(var14 != null && var14.IiIiliIiiiIi((int)var58, s, var6.Ililllililil()) ? 1 : 0) ^ var60) & -1L >>> 32;
                     if ((int)var60 == 0 || var37.equals(this.liIIliiiliiIIliiil)) {
                        IiIIlillliIIlill var41;
                        class_243 var10000;
                        label326: {
                           var41 = (int)var60 != 0 ? IiIIlillliIIlill.iiIIiilill : IiIIlillliIIlill.liIIiilill;
                           if (var33 instanceof class_3966 var43 && var43.method_17782() == var35) {
                              var10000 = lllIliIlillIliIl.llIIlilIIl(var36, var17, feet.IiIlliIliiIl(), feet.IIlllIlliIll(), 3.0);
                              break label326;
                           }

                           var10000 = null;
                        }

                        class_243 var42 = var10000;
                        double var75 = iiIiIIIlIIliIIIl.Illlllllilll(var42 != null, Illillliilli(var17, var36.method_1005(), feet));
                        var31.add(
                           new IIiIIiillIiIIiil(
                              var41,
                              var37,
                              null,
                              var35,
                              (boolean)((int)(var60 >>> 32)),
                              iiIiIIIlIIliIIIl.Iiilliiliiil(
                                 var41,
                                 IIiilIiiiIii(var18, var35.method_73189(), var19, var20),
                                 var75,
                                 Iliilliiilii(var30, var37),
                                 var37.equals(this.liIIliiiliiIIliiil)
                              ),
                              var75,
                              var42 != null ? var42 : var36.method_1005(),
                              false
                           )
                        );
                     }
                  }
               }
            }

            var62 ^= ((long)class_3532.method_15357(var19.field_1352) << 32 ^ var62) & -1L << 32;
            var62 ^= ((long)class_3532.method_15357((var10.IIlllIlliIll() ? var19.field_1351 : var22) + 0.001) ^ var62) & -1L >>> 32;
            var64 ^= ((long)class_3532.method_15357(var19.field_1350) << 32 ^ var64) & -1L << 32;
            var64 ^= (
                  (long)iiIiIIIlIIliIIIl.iliIiiliiiii(var10.IIlllIlliIll(), var10.IlIlllIlilIl() == null ? 0.0 : var10.IlIlllIlilIl().field_1351, var20 - var22)
                     ^ var64
               )
               & -1L >>> 32;
            var58 ^= ((long)(var10.liiiIIllIl() ? (int)var62 : iiIiIIIlIIliIIIl.IilliliilIIi(var22)) ^ var58) & -1L >>> 32;
            var60 ^= (
                  (long)(var10.liiiIIllIl() ? (int)var62 : Math.min((int)var62, iiIiIIIlIIliIIIl.IilliliilIIi((int)var64 > 0 ? var20 : var22))) << 32 ^ var60
               )
               & -1L << 32;
            double var40 = 25.0;
            class_2339 var74 = new class_2339();
            if ((int)var56 != 0) {
               var66 ^= ((long)((int)(var60 >>> 32)) << 32 ^ var66) & -1L << 32;

               while ((int)(var66 >>> 32) >= (int)var62 - 3) {
                  for (var66 ^= (-3L ^ var66) & -1L >>> 32; (int)var66 <= 3; var66 ^= (var66 ^ var66 + (long)1) & -1L >>> 32) {
                     for (var68 ^= (-12884901888L ^ var68) & -1L << 32; (int)(var68 >>> 32) <= 3; var68 += 4294967296L) {
                        var74.method_10103((int)(var62 >>> 32) + (int)var66, (int)(var66 >>> 32), (int)(var64 >>> 32) + (int)(var68 >>> 32));
                        if (!(
                              var17.method_1028((double)var74.method_10263() + 0.5, (double)var74.method_10264() + 0.5, (double)var74.method_10260() + 0.5)
                                 > var40
                           )
                           && IlIlllIlilIl(var17, var74)
                           && lllIliIlillIliIl.IliIlllilIi(var74)) {
                           class_2338 var46 = var74.method_10062();
                           if (!this.IllIllllIl(var46, s)) {
                              class_243 var47 = lllIliIlillIliIl.liiiIIllIl(var46);
                              if (!(var47.method_1022(var19) > 5.0)) {
                                 var68 ^= ((long)(var14 != null && var14.IiIlliIliiIl(var46.method_10063(), var15) ? 1 : 0) ^ var68) & -1L >>> 32;
                                 if ((int)var68 != 0 || lllIliIlillIliIl.IIIllIIliIIl(var46)) {
                                    class_243 var49 = IlIillIiilIi(var46, var17);
                                    double var50 = Illillliilli(var17, var49, feet);
                                    if ((int)(var66 >>> 32) <= (int)var58
                                       || iiIiIIIlIIliIIIl.IIIllIIliIIl(IiIIlillliIIlill.IIlIiilill, var50, (int)(var56 >>> 32), (int)var64)) {
                                       var31.add(
                                          new IIiIIiillIiIIiil(
                                             IiIIlillliIIlill.IIlIiilill,
                                             var46,
                                             null,
                                             null,
                                             true,
                                             iiIiIIIlIIliIIIl.Iiilliiliiil(
                                                IiIIlillliIIlill.IIlIiilill,
                                                IIiilIiiiIii(var18, var47, var19, var20),
                                                var50,
                                                Iliilliiilii(var30, var46),
                                                var46.equals(this.liIIliiiliiIIliiil)
                                             ),
                                             var50,
                                             var49,
                                             false
                                          )
                                       );
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

                  var66 += -4294967296L;
               }
            }

            if ((int)(var58 >>> 32) != 0) {
               var66 ^= ((long)((int)(var60 >>> 32)) << 32 ^ var66) & -1L << 32;

               while ((int)(var66 >>> 32) >= Math.min((int)(var60 >>> 32), (int)var58) - 1) {
                  for (var66 ^= (-2L ^ var66) & -1L >>> 32; (int)var66 <= 2; var66 ^= (var66 ^ var66 + (long)1) & -1L >>> 32) {
                     for (var68 ^= (-8589934592L ^ var68) & -1L << 32; (int)(var68 >>> 32) <= 2; var68 += 4294967296L) {
                        if ((int)var66 != 0 || (int)(var68 >>> 32) != 0) {
                           var74.method_10103((int)(var62 >>> 32) + (int)var66, (int)(var66 >>> 32), (int)(var64 >>> 32) + (int)(var68 >>> 32));
                           if (!(
                              var17.method_1028((double)var74.method_10263() + 0.5, (double)var74.method_10264() + 0.5, (double)var74.method_10260() + 0.5)
                                 > var40
                           )) {
                              var70 ^= ((long)(!IlIlllIlilIl(var17, var74) ? 1 : 0) << 32 ^ var70) & -1L << 32;
                              if ((int)(var70 >>> 32) == 0 || var27 != null && IlIlllIlilIl(var27, var74)) {
                                 class_2338 var77 = var74.method_10062();
                                 if (!this.IllIllllIl(var77, s)
                                    && (var14 == null || !var14.iIIIlIlIIl(var77.method_10063(), var15))
                                    && lllIliIlillIliIl.IlIillIiilIi(var77)) {
                                    ilIIiiiIiIIiii var48 = IIIilIIiiIIi(var77, var17, feet);
                                    if (var48 != null) {
                                       class_243 var80 = lllIliIlillIliIl.illilIilil(var48.IliIlllilIi(), var48.liiiIIllIl());
                                       double var81 = Illillliilli(var17, var80, feet);
                                       if ((int)(var66 >>> 32) <= (int)var58
                                          || iiIiIIIlIIliIIIl.IIIllIIliIIl(IiIIlillliIIlill.lIlIiilill, var81, (int)(var56 >>> 32), (int)var64)) {
                                          var31.add(
                                             new IIiIIiillIiIIiil(
                                                IiIIlillliIIlill.lIlIiilill,
                                                var77,
                                                var48,
                                                null,
                                                true,
                                                iiIiIIIlIIliIIIl.Iiilliiliiil(
                                                   IiIIlillliIIlill.lIlIiilill,
                                                   IIiilIiiiIii(var18, lllIliIlillIliIl.liiiIIllIl(var77), var19, var20),
                                                   var81,
                                                   false,
                                                   var77.equals(this.liIIliiiliiIIliiil)
                                                ),
                                                var81,
                                                var80,
                                                (boolean)((int)(var70 >>> 32))
                                             )
                                          );
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }

                  var66 += -4294967296L;
               }
            }

            if (var31.isEmpty()) {
               this.IliIliiillliIliiil = lliIliliIl<"lliIliliIl","k0hPlA73E1PHh3AglzkpUGpYHaIGQ7mYTyrON8AdbA==">();
               this.lilIliilIl();
               return null;
            } else {
               var31.sort(Comparator.comparingDouble(IIiIIiillIiIIiil::iliIiiliiiii).reversed());
               ilIiliilIiIiliil var76 = in.IliIlllilIi();
               illIlillIilIlill var44 = new illIlillIilIlill(
                  var12,
                  var13,
                  var17,
                  var24,
                  var9.iliIiiliiiii(),
                  var30,
                  var76,
                  var76 != null && var76.iIIIlIlIIl(),
                  (int)(var56 >>> 32),
                  Math.max(0, var6.Ililllililil()),
                  var25
               );
               ArrayList var45 = new ArrayList();
               var70 ^= (0L ^ var70) & -1L << 32;
               class_243 var78 = null;
               double var79 = Double.NEGATIVE_INFINITY;
               var70 ^= (0L ^ var70) & -1L >>> 32;
               var72 ^= (0L ^ var72) & -1L << 32;

               for (IIiIIiillIiIIiil var53 : var31) {
                  if (!Ililllililil(var53.IliIlllilIi())) {
                     var70 ^= (var70 ^ var70 + (long)1) & -1L >>> 32;
                     lllIIiiillIIii var54 = this.IIIllIIliIIl(var53, var44, false);
                     if (var54 != null) {
                        if (var54.IliIlllilIi() == IiIIlillliIIlill.iiIIiilill && !var54.IlIlllIlilIl()) {
                           var70 ^= (4294967296L ^ var70) & -1L << 32;
                           if ((var54.Illlllllilll() || var54.iliIiiliiiii() >= 2.0F) && (var78 == null || var54.lIiiIiIlilli() > var79)) {
                              var78 = var54.IIIllIIliIIl();
                              var79 = var54.lIiiIiIlilli();
                           }
                        }

                        var45.add(var54);
                     }
                  }
               }

               var72 ^= (0L ^ var72) & -1L >>> 32;

               for (IIiIIiillIiIIiil var84 : var31) {
                  if (Ililllililil(var84.IliIlllilIi())) {
                     if (var78 != null
                        && !iiIiIIIlIIliIIIl.IIillIiliIil(
                           var84.IliIlllilIi(), var84.IIIllIIliIIl(), Iilililiiili(var17, var84.IlIlllIlilIl(), var78), (int)(var56 >>> 32)
                        )) {
                        var72 += 4294967296L;
                     } else if ((int)var72 < 6 || var84.liiiIIllIl().equals(this.liIIliiiliiIIliiil)) {
                        var72 ^= (var72 ^ var72 + (long)1) & -1L >>> 32;
                        var70 ^= (var70 ^ var70 + (long)1) & -1L >>> 32;
                        lllIIiiillIIii var55 = this.IIIllIIliIIl(var84, var44, (boolean)((int)(var70 >>> 32)));
                        if (var55 != null) {
                           var45.add(var55);
                        }
                     }
                  }
               }

               lllIIiiillIIii var83 = this.iliIiiliiiii(var45);
               if (var83 == null) {
                  this.IliIliiillliIliiil = lliIliliIl<"lliIliliIl","SKDX9OT8HVN//Z0qUF/95VlfRRRUTx+X/68nqW5l">()
                     + var31.size()
                     + lliIliliIl<"lliIliliIl","58F0K6kdXBkt7XnDWLFXDZCtPUOeC4kKpuLiOvg=">()
                     + (int)var70
                     + lliIliliIl<"lliIliliIl","OxZzjw6bS1ael3JhF7eSgwUXdrYIzKoAmXq0N5w=">()
                     + (int)(var72 >>> 32);
                  this.lilIliilIl();
                  return null;
               } else {
                  this.IliIliiillliIliiil = "";
                  this.liIIliiiliiIIliiil = var83.liiiIIllIl();
                  this.IIlIliiillIlIliiil = var83.lIiiIiIlilli();
                  this.iIlIliiilIllIliiil = var83.iliIiiliiiii();
                  this.lllIliiilillIliiil = var83.IIIllIIliIIl();
                  this.IilIliiillilIliiil = s;
                  return var83;
               }
            }
         }
      } else {
         return null;
      }
   }

   private void illIlIilIl(long tick) {
      Iterator var3 = this.ilIIliiilIiIIliiil.entrySet().iterator();

      while (var3.hasNext()) {
         if (tick >= (Long)((Entry)var3.next()).getValue()) {
            var3.remove();
         }
      }
   }

   static double IIIIllIIIl(class_1937 w, class_243 feet) {
      long var9 = -1833657906447799119L;
      if (w != null && feet != null) {
         double var2 = Double.NEGATIVE_INFINITY;

         for (long var11 = var9 ^ (0L ^ var9) & -1L << 32; (int)(var11 >>> 32) < 4; var11 += 4294967296L) {
            double var5 = feet.field_1352 + (((int)(var11 >>> 32) & 1) == 0 ? -0.299 : 0.299);
            double var7 = feet.field_1350 + (((int)(var11 >>> 32) & 2) == 0 ? -0.299 : 0.299);
            var2 = Math.max(var2, Iiiiliiiiiii(w, new class_243(var5, feet.field_1351, var7)));
         }

         return var2;
      } else {
         return Iiiiliiiiiii(w, feet);
      }
   }

   private void IiIIlliIIl(class_2338 at, ilIlIIIlIiIlIIIl in) {
      IlliIlllllliIlll var3 = in.IilliliilIIi();
      this.iliIliiilIiiIliiil = at;
      this.liiIliiiliiiIliiil = var3 == null ? Long.MIN_VALUE : var3.Illlllllilll();
      this.IIIlliiillIIlliiil = in.IiIlliIliiIl();
      this.iIIlliiilIlIlliiil = in.IIlllIlliIll();
   }

   private static boolean iiIIlIIlIl(ilIlIIIlIiIlIIIl c, lllIIiiillIIii in) {
      IillIiillillIiil var2 = c.IliIlllilIi();
      return in.IliIlllilIi() == IiIIlillliIIlill.IIlIiilill
         && var2 != null
         && var2.Illlllllilll() != null
         && var2.Illlllllilll().IiIlliIliiIl(in.liiiIIllIl().method_10063(), var2.Iilllilliill());
   }

   private class_243 IiIiliIiiiIi(ilIlIIIlIiIlIIIl feet, class_243 in, double tick, long dist) {
      class_243 var7 = feet.IlIlllIlilIl();
      if (this.lllIliiilillIliiil != null && dist - this.IilIliiillilIliiil <= 10L && var7.method_1022(this.lllIliiilillIliiil) <= 6.0) {
         return this.lllIliiilillIliiil;
      } else {
         class_243 var8 = IIlilIliiIli(feet.liiiIIllIl(), var7);
         if (var8 == null && tick > 3.5) {
            IillIiillillIiil var9 = feet.IliIlllilIi();
            class_243 var10 = var9 != null && var9.lIiiIiIlilli() != null && var9.lIiiIiIlilli().IliIlllilIi() != null ? var9.lIiiIiIlilli().IliIlllilIi() : in;
            return new class_243(var10.field_1352, Iiiiliiiiiii(class_310.method_1551().field_1687, var10), var10.field_1350);
         } else {
            return var8;
         }
      }
   }

   private lllIIiiillIIii iliIiiliiiii(List<lllIIiiillIIii> out) {
      lllIIiiillIIii var2 = null;
      lllIIiiillIIii var3 = null;
      lllIIiiillIIii var4 = null;
      lllIIiiillIIii var5 = null;

      for (lllIIiiillIIii var7 : out) {
         if (!var7.IlIlllIlilIl() && !var7.IiIlliIliiIl()) {
            if (var4 == null || var7.lIiiIiIlilli() > var4.lIiiIiIlilli()) {
               var4 = var7;
            }
         } else {
            if (var2 == null || var7.lIiiIiIlilli() > var2.lIiiIiIlilli()) {
               var2 = var7;
            }

            if (var7.liiiIIllIl().equals(this.liIIliiiliiIIliiil) && (var3 == null || var7.lIiiIiIlilli() > var3.lIiiIiIlilli())) {
               var3 = var7;
            }

            if (var7.IlIlllIlilIl() && var7.IIillIiliIil() && (var5 == null || var7.lIiiIiIlilli() > var5.lIiiIiIlilli())) {
               var5 = var7;
            }
         }
      }

      if (var2 == null) {
         return var4;
      } else if (var5 != null
         && var5 != var2
         && iiIiIIIlIIliIIIl.Iilllilliill(
            var5.Iilllilliill(), var5.Illlllllilll(), var5.iliIiiliiiii(), var5.lIiiIiIlilli(), var2.Iilllilliill(), var2.Illlllllilll(), var2.lIiiIiIlilli()
         )) {
         return var5;
      } else if (var3 != null && var3 != var2) {
         return iiIiIIIlIIliIIIl.Iilililiiili(
               var3.lIiiIiIlilli(), var3.Illlllllilll(), var3.Iilllilliill(), var2.lIiiIiIlilli(), var2.Illlllllilll(), var2.Iilllilliill()
            )
            ? var2
            : var3;
      } else {
         return var2;
      }
   }

   private lllIIiiillIIii IIIllIIliIIl(IIiIIiillIiIIiil armed, illIlillIilIlill c, boolean x) {
      long var32 = 3558809857455194364L;
      long var24 = -1647154671955874211L;
      long var26 = 7215622107550901149L;
      long var28 = 8216676808655082627L;
      long var30 = 9020263210143235655L;
      if (armed.IliIlllilIi() == IiIIlillliIIlill.iiIIiilill) {
         return armed.liiiIIllIl().equals(this.liIIliiiliiIIliiil) && Double.isFinite(this.IIlIliiillIlIliiil)
            ? new lllIIiiillIIii(
               IiIIlillliIIlill.iiIIiilill,
               armed.liiiIIllIl(),
               null,
               armed.IilliliilIIi(),
               this.IIlIliiillIlIliiil,
               this.iIlIliiilIllIliiil,
               armed.IlIlllIlilIl(),
               true,
               false,
               false,
               false,
               false,
               false
            )
            : null;
      } else {
         var24 ^= ((long)(armed.IliIlllilIi() == IiIIlillliIIlill.liIIiilill ? 1 : 0) << 32 ^ var24) & -1L << 32;
         var24 ^= ((long)((int)iiIiIIIlIIliIIIl.IliIlllilIi(armed.IIIllIIliIIl())) ^ var24) & -1L >>> 32;
         var26 ^= ((long)((int)(var24 >>> 32) != 0 ? 0 : c.IIlllIlliIll() + (armed.IliIlllilIi() == IiIIlillliIIlill.lIlIiilill ? 1 : 0)) << 32 ^ var26)
            & -1L << 32;
         var26 ^= ((long)((int)(var24 >>> 32) == 0 && c.IlIlllIlilIl() && c.IiIlliIliiIl() > (int)(var26 >>> 32) ? 1 : 0) ^ var26) & -1L >>> 32;
         if ((int)var26 != 0 && x && armed.IliIlllilIi() == IiIIlillliIIlill.IIlIiilill) {
            return null;
         } else {
            iIlIIlilIllIIlil var8 = IIlllIlliIll(armed, (int)(var24 >>> 32) == 0 && c.IlIlllIlilIl() ? c.IliIlllilIi() : c.liiiIIllIl());
            if (var8 == null) {
               return null;
            } else {
               var28 ^= ((long)var8.IliIlllilIi() << 32 ^ var28) & -1L << 32;
               if ((int)(var28 >>> 32) == 0 && !lliIliliIl<"lliIliliIl","LdpQ8o1gxhXq66J8WyWnaOgCX0bypKV0oDksS82ws3KIbg==">().equals(var8.liiiIIllIl())) {
                  return null;
               } else {
                  ilIiliilIiIiliil var10 = c.IIIllIIliIIl();
                  float var11 = var10 != null && (int)var26 == 0 && !armed.IiIlliIliiIl()
                     ? var10.IlIlllIlilIl(var8.IilliliilIIi(), var8.lIiiIiIlilli())
                     : var8.IilliliilIIi();
                  float var12 = var8.IilliliilIIi();
                  float var13 = var8.iIlIlllllill();
                  var28 ^= ((long)IiIlliIliiIl(var13, c.liiiIIllIl()) ^ var28) & -1L >>> 32;
                  var30 ^= ((long)((int)var26 != 0 ? c.IiIlliIliiIl() : 0) << 32 ^ var30) & -1L << 32;
                  var30 ^= (
                        (long)(
                              (int)(var24 >>> 32) != 0
                                    && iiIiIIIlIIliIIIl.IlIillIiilIi(
                                       armed.lIiiIiIlilli(), c.IiIlliIliiIl(), (boolean)((int)(var28 >>> 32)), var13, (boolean)((int)var28)
                                    )
                                 ? 1
                                 : 0
                           )
                           ^ var30
                     )
                     & -1L >>> 32;
                  if ((int)var30 != 0) {
                     iIlIIlilIllIIlil var17 = IIlllIlliIll(armed, c.IliIlllilIi());
                     if (var17 == null || !var17.IliIlllilIi()) {
                        return null;
                     }

                     var13 = var17.iIlIlllllill();
                     var12 = var17.IilliliilIIi();
                     var11 = var12;
                     var28 ^= ((long)IiIlliIliiIl(var13, c.liiiIIllIl()) ^ var28) & -1L >>> 32;
                     var30 ^= ((long)c.IiIlliIliiIl() << 32 ^ var30) & -1L << 32;
                  }

                  var32 ^= ((long)((int)var28 != 0 && !c.liiiIIllIl().Iiiiliiiiiii() ? 1 : 0) << 32 ^ var32) & -1L << 32;
                  double var18 = (int)(var24 >>> 32) != 0 ? armed.IilliliilIIi().method_23318() : (double)armed.liiiIIllIl().method_10264() + 1.0;
                  if (!iiIiIIIlIIliIIIl.IIlilIliiIli(
                     armed.IiIlliIliiIl() ? c.Illlllllilll() : c.IilliliilIIi().field_1351,
                     armed.IiIlliIliiIl() || c.lIiiIiIlilli(),
                     var18,
                     var13,
                     var11,
                     (boolean)((int)var28),
                     (boolean)((int)(var32 >>> 32))
                  )) {
                     return null;
                  } else if (!iiIiIIIlIIliIIIl.IIIilIIiiIIi(armed.IliIlllilIi(), var13, var12, var11, armed.lIiiIiIlilli(), (boolean)((int)var28))) {
                     return null;
                  } else {
                     double var20 = iiIiIIIlIIliIIIl.Illillliilli(
                        armed.IliIlllilIi(),
                        var13,
                        var12,
                        var11,
                        (boolean)((int)var28),
                        (boolean)((int)(var32 >>> 32)),
                        armed.lIiiIiIlilli(),
                        Iliilliiilii(c.iliIiiliiiii(), armed.liiiIIllIl()),
                        armed.IIIllIIliIIl(),
                        (int)(var30 >>> 32)
                     );
                     class_243 var22 = armed.IlIlllIlilIl();
                     var32 ^= ((long)((int)(var24 >>> 32) != 0 && armed.lIiiIiIlilli() ? 1 : 0) ^ var32) & -1L >>> 32;
                     return new lllIIiiillIIii(
                        (int)var30 != 0 ? IiIIlillliIIlill.iiIIiilill : armed.IliIlllilIi(),
                        armed.liiiIIllIl(),
                        armed.iIlIlllllill(),
                        armed.IilliliilIIi(),
                        var20,
                        var13,
                        var22,
                        (int)(var28 >>> 32) != 0 && (int)var30 == 0,
                        (int)var30 != 0 && iiIiIIIlIIliIIIl.IiIiliIiiiIi(c.IiIlliIliiIl(), (int)var24),
                        (boolean)((int)var26),
                        (boolean)((int)var28),
                        (boolean)((int)(var32 >>> 32)),
                        (boolean)((int)var32)
                     );
                  }
               }
            }
         }
      }
   }

   public static boolean iIlIlllllill(IiiIliliiIli defends, boolean breaching, boolean brain) {
      long var6 = 2425651196809358217L;
      if (defends == null) {
         return true;
      } else {
         iIllIliIlllIli var3 = defends.IliIlllilIi();
         iIlIIIIiIllIIIIi var4 = defends.IilliliilIIi();
         var6 ^= (
               (long)(
                        var4 != iIlIIIIiIllIIIIi.IIIIiiIiil
                              && var4 != iIlIIIIiIllIIIIi.IlIIiiIiil
                              && var4 != iIlIIIIiIllIIIIi.iIIIiiIiil
                              && var4 != iIlIIIIiIllIIIIi.iiiiliIiil
                              && var4 != iIlIIIIiIllIIIIi.ilIIiiIiil
                           ? 0
                           : 1
                     )
                     << 32
                  ^ var6
            )
            & -1L << 32;
         return iiIiIIIlIIliIIIl.llIIlilIIl(
            breaching, brain, var3 == iIllIliIlllIli.iliiIIIIIl, var3 == iIllIliIlllIli.IliiIIIIIl, (boolean)((int)(var6 >>> 32))
         );
      }
   }

   private static double IIiilIiiiIii(class_1309 feetY, class_243 te, class_243 feet, double centre) {
      return (double)lllIliIlillIliIl.ilIllIiIll(feetY, te.method_1022(feet), 6.0F) * iiIiIIIlIIliIIIl.Ililllililil(te.field_1351, centre);
   }

   private void llIIlilIIl(ilIlIIIlIiIlIIIl in, long tick) {
      long var8 = -9043045867212212293L;
      IlliIlllllliIlll var4 = in.IilliliilIIi();
      long var5 = var4 == null ? Long.MIN_VALUE : var4.Illlllllilll();
      var8 ^= (
            (long)(
                     this.iliIliiilIiiIliiil != null
                           && this.iliIliiilIiiIliiil.equals(this.liIIliiiliiIIliiil)
                           && var5 == this.liiIliiiliiiIliiil
                           && liiIIliliiiIIlil.Iilllilliill(this.IIIlliiillIIlliiil, this.iIIlliiilIlIlliiil, in.IiIlliIliiIl(), in.IIlllIlliIll()) <= 2.0
                        ? 1
                        : 0
                  )
                  << 32
               ^ var8
         )
         & -1L << 32;
      this.llIlliiililIlliiil = (int)(var8 >>> 32) != 0 ? this.llIlliiililIlliiil + 1 : 0;
      this.iliIliiilIiiIliiil = null;
      if (this.llIlliiililIlliiil >= 8) {
         this.ilIIliiilIiIIliiil.put(this.liIIliiiliiIIliiil.method_10063(), tick + 20L);
         this.lilIliilIl();
         this.IIiIllIiIl();
         this.lIlIliIlIl();
      }
   }

   private static class_243 IlIillIiilIi(class_2338 base, class_243 eye) {
      double var2 = (double)base.method_10264() + 1.0;
      if (eye.field_1351 >= var2) {
         return new class_243((double)base.method_10263() + 0.5, var2, (double)base.method_10260() + 0.5);
      } else {
         double var4 = eye.field_1352 - ((double)base.method_10263() + 0.5);
         double var6 = eye.field_1350 - ((double)base.method_10260() + 0.5);
         class_2350 var8 = Math.abs(var4) >= Math.abs(var6)
            ? (var4 >= 0.0 ? class_2350.field_11034 : class_2350.field_11039)
            : (var6 >= 0.0 ? class_2350.field_11035 : class_2350.field_11043);
         return lllIliIlillIliIl.illilIilil(base, var8);
      }
   }

   static boolean IlIlllIlilIl(class_243 base, class_2338 eye) {
      return lllIliIlillIliIl.IIlilIliiIli(base, lllIliIlillIliIl.IilliliilIIi(eye)) < 2.85;
   }

   private static double Illillliilli(class_243 point, class_243 eye, ilIlIIIlIiIlIIIl in) {
      float[] var3 = ilIiiIiIii.Ililllililil(point, eye);
      return liiIIliliiiIIlil.Iilllilliill(in.IiIlliIliiIl(), in.IIlllIlliIll(), var3[0], var3[1]);
   }

   private boolean IllIllllIl(class_2338 tick, long p) {
      Long var4 = this.ilIIliiilIiIIliiil.get(tick.method_10063());
      return var4 != null && p < var4;
   }

   private IlliIiIlllliIiIl Illlllllilll(
      IIllIIllIllIIl h, liiilIiliiiilIil us, class_243 tick, class_243 t, double spot, iIilIiIiIlilIiIi anchoring, long feet, boolean s
   ) {
      class_638 var11 = class_310.method_1551().field_1687;
      double var12 = us.IIlllIlliIll() ? tick.field_1351 : Iiiiliiiiiii(var11, tick);
      class_243 var14 = new class_243(tick.field_1352, var12, tick.field_1350);
      if (spot > 4.5 || var11 == null) {
         this.IlIIliiilllIIliiil.IiIlliIliiIl(lliIliliIl<"lliIliliIl","N4T4Zwcce5gMmah8vq5ScxxiiW4vJcHoi4uvacpQWg==">());
         double[] var20 = iiIiIIIlIIliIIIl.iiIIlIIlIl(tick.field_1352, tick.field_1350, t.field_1352, t.field_1350, 1.6);
         return new IlliIiIlllliIiIl(
            IIliIilIliIi.IiiiiIIIlliiiiIIIl, new class_243(var20[0], var12, var20[1]), 1.0, true, false, Long.MIN_VALUE, var14, iiIIllIlIIlIllIl.iIililIiIl
         );
      } else if (s) {
         return new IlliIiIlllliIiIl(IIliIilIliIi.lIIIIlIIliIIIIlIIl, t, 0.1, false, true, Long.MIN_VALUE);
      } else {
         iIillIilIlillIil var15 = this.IlIIliiilllIIliiil
            .IliIlllilIi(
               feet,
               iIIlillIlIlill.IiiIlliiIl(var11),
               tick.field_1352,
               tick.field_1351,
               tick.field_1350,
               var12,
               t.field_1352,
               t.field_1351,
               t.field_1350,
               anchoring,
               null,
               false
            );
         double var17 = var15 == null ? Double.NaN : Math.hypot(var15.IliIlllilIi() - tick.field_1352, var15.liiiIIllIl() - tick.field_1350);
         class_243 var16;
         if (var15 != null
            && iIIlillIlIlill.Iilllilliill(var15, spot, us.IIlllIlliIll())
            && var17 <= (var15.IIIllIIliIIl() <= -0.5 ? 3.2 : 2.6)
            && iiIiIIIlIIliIIIl.IiIIlliIIl(var15.IIIllIIliIIl(), var17, 2.2)) {
            var16 = new class_243(var15.IliIlllilIi(), (double)var15.lIiiIiIlilli(), var15.liiiIIllIl());
         } else {
            double[] var19 = iiIiIIIlIIliIIIl.iiIIlIIlIl(tick.field_1352, tick.field_1350, t.field_1352, t.field_1350, 2.5);
            var16 = new class_243(var19[0], var12, var19[1]);
         }

         return new IlliIiIlllliIiIl(IIliIilIliIi.IiiiiIIIlliiiiIIIl, var16, 0.5, spot > 2.0, true, Long.MIN_VALUE, var14, iiIIllIlIIlIllIl.iIililIiIl);
      }
   }

   private static ilIIiiiIiIIiii IIIilIIiiIIi(class_2338 eye, class_243 in, ilIlIIIlIiIlIIIl cell) {
      class_2338 var3 = eye.method_10074();
      return lllIliIlillIliIl.IIillIiliIil(var3, class_2350.field_11036)
         ? new ilIIiiiIiIIiii(var3, class_2350.field_11036)
         : lllIliIlillIliIl.Iiilliiliiil(eye, in, cell.IiIlliIliiIl(), cell.IIlllIlliIll(), 4.4);
   }

   public lllllllillllll() {
      this.IilIliiillilIliiil = Long.MIN_VALUE;
      this.iilIliiilIIiIliiil = -1;
      this.lIiIliiiliIiIliiil = lliIliliIl<"lliIliliIl","R0OhghhzPF2ImRnj3hZ9IaVpxQCIAgPMJE9444o=">();
      this.IliIliiillliIliiil = "";
      this.liiIliiiliiiIliiil = Long.MIN_VALUE;
   }

   private void iIIIlIlIIl(IlliIlllllliIlll tick, long snap) {
      if (tick != null && this.liIIliiiliiIIliiil != null && tick.IIillIiliIil() != null) {
         if (lIIIliiiliIIIliiil.contains(tick.IIillIiliIil())) {
            this.ilIIliiilIiIIliiil.put(this.liIIliiiliiIIliiil.method_10063(), snap + 6L);
            this.lilIliilIl();
            this.IIiIllIiIl();
         }
      }
   }

   private static iIlIIlilIllIIlil IIlllIlliIll(IIiIIiillIiIIiil c, IillIiillillIiil r) {
      return switch (c.IliIlllilIi()) {
         case liIIiilill -> Ililiiillliliiil.lIiiIiIlilli(
         r, IlliIlillliIli.iliiIlIIIl, c.liiiIIllIl(), c.liiiIIllIl(), c.IilliliilIIi(), lllIliIlillIliIl.IiliiliIll
      );
         case IIlIiilill -> Ililiiillliliiil.lIiiIiIlilli(r, IlliIlillliIli.lliiIlIIIl, c.liiiIIllIl(), c.liiiIIllIl(), null, lllIliIlillIliIl.IiliiliIll);
         case lIlIiilill -> Ililiiillliliiil.lIiiIiIlilli(
         r.IliIlllilIi(c.iIlIlllllill()), IlliIlillliIli.IiiiIlIIIl, c.liiiIIllIl(), c.liiiIIllIl(), null, lllIliIlillIliIl.IiliiliIll
      );
         case iiIIiilill -> null;
      };
   }

   private static boolean Ililllililil(IiIIlillliIIlill kind) {
      return kind == IiIIlillliIIlill.IIlIiilill || kind == IiIIlillliIIlill.lIlIiilill;
   }

   private void lIlIliIlIl() {
      this.iliIliiilIiiIliiil = null;
      this.liiIliiiliiiIliiil = Long.MIN_VALUE;
      this.llIlliiililIlliiil = 0;
   }

   private static boolean IiIlliIliiIl(float r, IillIiillillIiil dealt) {
      return Float.isFinite(dealt.Iliilliiilii()) && iiIiiliIIliili.IlIlllIlilIl(r, dealt.Iliilliiilii());
   }

   static class_243 IIlilIliiIli(iIilIiIiIlilIiIi eye, class_243 spot) {
      if (eye != null && spot != null) {
         class_2338 var2 = new class_2338(eye.lIiiIiIlilli(), eye.iliIiiliiiii(), eye.IIIllIIliIIl());
         if (lllIliIlillIliIl.IIlilIliiIli(spot, lllIliIlillIliIl.IilliliilIIi(var2)) >= 3.0) {
            return null;
         } else {
            return spot.field_1351 >= eye.IilliliilIIi()
               ? new class_243(eye.IliIlllilIi(), eye.IilliliilIIi(), eye.iIlIlllllill())
               : lllIliIlillIliIl.IilliliilIIi(var2).method_1005();
         }
      } else {
         return null;
      }
   }

   private static String IIillIiliIil(String lane, lllIIiiillIIii c) {
      if (c == null) {
         return lane;
      } else {
         class_2338 var2 = c.liiiIIllIl();
         return lane
            + lliIliliIl<"lliIliliIl","Avh/ph3JjNk4Mn3U8Zj2TzIKdKuM5k5AJcpF9sk=">()
            + c.IliIlllilIi().name()
            + (
               c.IlIlllIlilIl()
                  ? lliIliliIl<"lliIliliIl","U0DIXYnblHINo8cXn1gBrJKG9CZStDeQkO8DPnw=">()
                  : lliIliliIl<"lliIliliIl","WXlpht3Nfmg2JVRRE4Z7Uox7QV3kgENUUxEW3hQ=">()
            )
            + var2.method_10263()
            + lliIliliIl<"lliIliliIl","eLM64QXnJ3usEBTUAoq0dV8Ig/6Cv7EvWubpmlQ=">()
            + var2.method_10264()
            + lliIliliIl<"lliIliliIl","eLM64QXnJ3usEBTUAoq0dV8Ig/6Cv7EvWubpmlQ=">()
            + var2.method_10260()
            + (c.IIlllIlliIll() ? lliIliliIl<"lliIliliIl","aObECmHCoHjfkPdGkNw6meKB4Cwq3HcbK5Rny6w=">() : "");
      }
   }
}
