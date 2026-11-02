package gg.corz;

import java.util.Optional;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1320;
import net.minecraft.class_1799;
import net.minecraft.class_1893;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_5134;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import net.minecraft.class_1322.class_1323;

public final class IiiIIliliiIIli {
   private int iiliiiiiiIIiiiiiii;
   private long ilIiiiiiiIiIiiiiii = Long.MIN_VALUE;
   public static final double IIIliiiiilIIliiiii = 0.05;
   public static final double IIlIiiiiilIlIiiiii = 3.4;
   private String llliiiiiiilliiiiii = IIIillIIil<"IIIillIIil","1phKCCie/9XHB58btgbzLvjVQQQD89z3cxUKEAs=">();
   private float IIliiiiiilIliiiiii;
   public static final int IiIliiiiiliIliiiii = 30;
   public static final String lIlliiiiiiIlliiiii = "-";
   public static final int llIliiiiiilIliiiii = 2;
   private final Object lliliiiiiililiiiii;
   private class_243 IIIIIIIIIl;
   private float liIiiiiiiiiIiiiiii;
   public static final double liIIiiiiiiiIIiiiii = 3.0;
   public static final double iilIiiiiiIIiIiiiii = 6.0;
   private long lIiiiiiiiiIiiiiiii;
   public static final float liiIiiiiiiiiIiiiii = 0.9F;
   private final illillIlIilillIl iiiliiiiiIIIiiiiii;
   private final iilllIiIIillIi Iiiliiiiiliiliiiii;
   public static final double iIlIiiiiiIllIiiiii = 2.5;
   public static final double iIIliiiiiIlIliiiii = 2.95;
   private long lIIIIIIIIl;
   private float Iliiiiiiilliiiiiii;
   private final lIlIiIIliIlIiIIl lIIiiiiiiiIIiiiiii;
   public static final double iiIliiiiiIIlliiiii = 2.0;
   public static final double iIiliiiiiIliliiiii = 2.0;
   public static final double lIiIiiiiiiIiIiiiii = 0.8;
   public static final int illliiiiiIilliiiii = 8;
   public static final float ilIIiiiiiIiIIiiiii = 0.95F;
   private float iliiiiiiiIiiiiiiii;
   private int Iiliiiiiililiiiiii = -1;
   public static final double IIiliiiiilIiliiiii = 0.5;
   public static final String Illliiiiilllliiiii = "los";
   public static final double iliIiiiiiIiiIiiiii = 0.45;
   public static final int lilliiiiiiilliiiii = 40;
   public static final double IliIiiiiilliIiiiii = 4.0;
   private boolean iIliiiiiiIlliiiiii;
   public static final int IilIiiiiililIiiiii = 70;
   public static final double lllIiiiiiillIiiiii = 1.2;
   private final IllIilIilllIilIi IlIiiiiiillIiiiiii;
   private class_243 liiiiiiiiiiiiiiiii;

   private int Iilililiiili(class_746 p, class_1309 spec, llIlilIlilIlilIl shield, boolean e) {
      long var6 = -317295658757805095L;
      var6 ^= ((long)shield.IliIlllilIi() << 32 ^ var6) & -1L << 32;
      return !e
            && (int)(var6 >>> 32) >= 0
            && (int)(var6 >>> 32) < 9
            && lIIlliIIll((int)(var6 >>> 32))
            && lIlllIliIlllIl.iIlIlllllill(p.method_31548().method_5438((int)(var6 >>> 32)))
         ? (int)(var6 >>> 32)
         : this.iIlIlllllill(spec);
   }

   public boolean iliIiiliiiii(liiilIiliiiilIil t, llIlilIlilIlilIl spec, int targetReadyIn) {
      long var25 = -1089093415040148761L;
      long var27 = 3336844332660911274L;
      class_310 var4 = class_310.method_1551();
      class_746 var5 = var4.field_1724;
      if (var5 != null && var4.field_1687 != null && var4.field_1761 != null) {
         class_1309 var6 = t == null ? null : t.lIiiIiIlilli();
         if (spec != null && var6 != null && var6.method_5805() && !var6.method_31481()) {
            long var7 = IIllIIlilIllIIli.IlIlllIlilIl();
            var25 ^= ((long)(2 + (int)Math.ceil(Math.max(0.0, (double)illIllilIilIllil.IIIllIIliIIl()) / 50.0)) << 32 ^ var25) & -1L << 32;
            if (this.ilIiiiiiiIiIiiiiii != Long.MIN_VALUE
               && var7 - this.ilIiiiiiiIiIiiiiii <= (long)((int)(var25 >>> 32))
               && (long)t.iIIIlIlIIl() >= var7 - this.ilIiiiiiiIiIiiiiii) {
               return this.llIIlilIIl(IIIillIIil<"IIIillIIil","HPNZrWbExsZqo9ioXINztQMfsGZKBRQ/KVYU1SDlD7noaU4=">());
            } else {
               var25 ^= ((long)IlIllllIll(t) ^ var25) & -1L >>> 32;
               var27 ^= ((long)this.Iilililiiili(var5, var6, spec, (boolean)((int)var25)) << 32 ^ var27) & -1L << 32;
               if ((int)(var27 >>> 32) < 0) {
                  return this.llIIlilIIl(
                     (int)var25 != 0
                        ? IIIillIIil<"IIIillIIil","eahCgmwpOAMRDNsqr43dzVIcWZAy04FD6pqoDP+dDLGjMw==">()
                        : IIIillIIil<"IIIillIIil","SjI6cKfK/lr7Os5vLYxi6b4iOR9BG7DXv22oj90ARoc4vg==">()
                  );
               } else {
                  class_1799 var12 = var5.method_31548().method_5438((int)(var27 >>> 32));
                  if (var12.method_7960()) {
                     return this.llIIlilIIl(IIIillIIil<"IIIillIIil","SjI6cKfK/lr7Os5vLYxi6b4iOR9BG7DXv22oj90ARoc4vg==">());
                  } else if ((int)var25 != 0 && !lIlllIliIlllIl.liiiIIllIl(var12)) {
                     return this.llIIlilIIl(IIIillIIil<"IIIillIIil","eahCgmwpOAMRDNsqr43dzVIcWZAy04FD6pqoDP+dDLGjMw==">());
                  } else {
                     class_243 var13 = var5.method_33571();
                     class_238 var14 = var6.method_5829();
                     double var15 = lllIliIlillIliIl.IIlilIliiIli(var13, var14);
                     class_243 var17 = IIillIiliIil(var13, var14, var6, spec.IIIllIIliIIl());
                     float[] var18 = ilIiiIiIii.Ililllililil(var13, IIlllIlliIll(var17, Iilllilliill(var6), Iilllilliill(var5)));
                     IIIliIilIIliIi var19 = var15 < 2.5 ? IIIliIilIIliIi.IIiIIiliilIiIIilii : IIIliIilIIliIi.lilIIiliiiilIIilii;
                     float var20 = var5.method_7261(0.5F);
                     float var21 = lllllillll(var5, var12) + Iillllilll(var12);
                     if (targetReadyIn > 0 && !IIiilIiiiIii(var21, t.llIIlilIIl(), var20)) {
                        this.Iiiliiiiiliiliiiii.IIlllIlliIll(IiilIiIiliilIiIi.IlIllIiIIi, var18[0], var18[1], var19, 70);
                        return this.llIIlilIIl(IIIillIIil<"IIIillIIil","iX9iR4EcMtpp8ATZ2qTCronWFc81ZddWCgycdqmEJl0rUw==">());
                     } else if (!(var15 <= 2.95)) {
                        this.Iiiliiiiiliiliiiii.IIlllIlliIll(IiilIiIiliilIiIi.IlIllIiIIi, var18[0], var18[1], var19, 70);
                        return this.llIIlilIIl(IIIillIIil<"IIIillIIil","cMQ5H9eCZtQa/GIgHfhQbRN4TKxfwzICCOKYcOD161dW">());
                     } else {
                        float var22 = this.Iiiliiiiiliiliiiii.IilliliilIIi();
                        float var23 = this.Iiiliiiiiliiliiiii.lIiiIiIlilli();
                        if (!IlIlllIlilIl(var13, var22, var23, var6)) {
                           float[] var24 = this.Iiiliiiiiliiliiiii.Ililllililil(IiilIiIiliilIiIi.IlIllIiIIi, var18[0], var18[1], var19, 70, 8.0F);
                           return this.lilIliilIl(
                              var6,
                              var5.method_73189(),
                              var22,
                              var23,
                              var7,
                              var24 == null
                                 ? IIIillIIil<"IIIillIIil","3UZ8EGyQ9IJO0i1JRzDtcPKlAfgjTdTN9XK8Ds7iWw==">()
                                 : IIIillIIil<"IIIillIIil","2TsLR06vpWXp+mM9TyLmq3wrb/XNAco/pB8U2vryDzdE5A==">()
                           );
                        } else {
                           this.iiliiiiiiIIiiiiiii = 0;
                           this.Iiiliiiiiliiliiiii.IIlllIlliIll(IiilIiIiliilIiIi.IlIllIiIIi, var18[0], var18[1], var19, 70);
                           if (!this.iiiliiiiiIIIiiiiii.iIlIlllllill()) {
                              return this.llIIlilIIl(IIIillIIil<"IIIillIIil","CJ4OU+5Mh4avOZFV6KGbdLrd3Pm9p8KndzmdILOA1jIT">());
                           } else if (!IIllIIlilIllIIli.IIlilIliiIli(this.lliliiiiiililiiiii, var6)) {
                              return this.llIIlilIIl(IIIillIIil<"IIIillIIil","HQ2r9fc0JmYhTF/apUUep+KcS0STpOjiZsiB6vys8bs=">());
                           } else {
                              var27 ^= ((long)(var5.method_5624() && var20 > 0.9F ? 1 : 0) ^ var27) & -1L >>> 32;
                              if (!this.lIIiiiiiiiIIiiiiii.IiIlliIliiIl((int)(var27 >>> 32), IIllIIlilIllIIli.IlIlllIlilIl())) {
                                 return this.llIIlilIIl(IIIillIIil<"IIIillIIil","XAAHahhoNy2LQqk4RCnWEZcl+Kw0ueQCee4X393aEtA=">());
                              } else {
                                 this.IiIIlliIIl(var21, t.IlIillIiilIi(), t.IiIiliIiiiIi(), (boolean)((int)var27));
                                 return this.iiIIlIIlIl(var4, var5, var6, var13, var22, var23);
                              }
                           }
                        }
                     }
                  }
               }
            }
         } else {
            return this.llIIlilIIl(IIIillIIil<"IIIillIIil","MJYN6DzFi5tuZK6U+8gb8traQ/Z36PHazttxqFPGhWh0mA==">());
         }
      } else {
         return this.llIIlilIIl(IIIillIIil<"IIIillIIil","hYT3PcnV9H3UZle5LN+hNH2Sw49go58iwwu8INhJZupcIw==">());
      }
   }

   private boolean iiiIlIIIll(class_746 p, int slot) {
      return slot >= 0 && slot < 9 && lIIlliIIll(slot) ? iIIIlIlIIl(p.method_31548().method_5438(slot)) : false;
   }

   private static boolean IlIllllIll(liiilIiliiiilIil t) {
      return t != null && t.lIiiIiIlilli() != null && t.IIIIllIIIl() && liliIIliiiliIIli.IliIlllilIi(t.lIiiIiIlilli());
   }

   static boolean IllIllllIl(boolean turned, double consecutive) {
      return turned && consecutive <= 2.0;
   }

   public float IlIillIiilIi() {
      return this.IIliiiiiilIliiiiii;
   }

   private boolean lilIliilIl(class_1309 why, class_243 pitch, float now, float e, long yaw, String us) {
      long var9 = -4671439788538341264L;
      var9 ^= (
            (long)(
                     why.method_5628() == this.Iiliiiiiililiiiiii
                           && IllIllllIl(
                              this.lIiiiiiiiiIiiiiiii != Long.MIN_VALUE && yaw == this.lIiiiiiiiiIiiiiiii + 1L,
                              liiIIliliiiIIlil.Iilllilliill(this.Iliiiiiiilliiiiiii, this.iliiiiiiiIiiiiiiii, now, e)
                           )
                        ? 1
                        : 0
                  )
                  << 32
               ^ var9
         )
         & -1L << 32;
      this.iiliiiiiiIIiiiiiii = (int)(var9 >>> 32) != 0 ? this.iiliiiiiiIIiiiiiii + 1 : 1;
      this.Iiliiiiiililiiiiii = why.method_5628();
      this.lIiiiiiiiiIiiiiiii = yaw;
      this.Iliiiiiiilliiiiiii = now;
      this.iliiiiiiiIiiiiiiii = e;
      if (this.iiliiiiiiIIiiiiiii >= 8 && this.liiiiiiiiiiiiiiiii == null) {
         this.liiiiiiiiiiiiiiiii = why.method_73189();
         this.IIIIIIIIIl = pitch;
         this.lIIIIIIIIl = yaw;
      }

      return this.llIIlilIIl(us);
   }

   static double Iliilliiilii(double r, double width) {
      double var4 = Double.isFinite(width) && width > 0.0 ? width : 0.0;
      double var6 = var4 * 0.5 - Math.min(0.1, var4 * 0.25);
      return !(r > 0.0) ? 72.0 : 0.8 * Math.toDegrees(Math.atan(var6 / r));
   }

   static float IIIIllIIIl(float armor, iiIllIlIIlllIl raw, float meleeEpf) {
      iiIllIlIIlllIl var3 = raw == null ? iiIllIlIIlllIl.lliIilIlliliIilIll : raw;
      return iiIiiliIIliili.lIiiIiIlilli(armor, new iiIllIlIIlllIl(var3.IliIlllilIi(), var3.liiiIIllIl(), var3.iIlIlllllill(), meleeEpf, -1));
   }

   private boolean illIlIilIl(class_1309 us, class_243 e, long now) {
      if (this.liiiiiiiiiiiiiiiii != null && this.IIIIIIIIIl != null) {
         if (us.method_5628() == this.Iiliiiiiililiiiiii
            && !lIlIliIlIl(us.method_73189().method_1022(this.liiiiiiiiiiiiiiiii), e.method_1022(this.IIIIIIIIIl), now - this.lIIIIIIIIl)) {
            return true;
         } else {
            this.IIiIllIiIl();
            return false;
         }
      } else {
         return false;
      }
   }

   public IilliIIllilliIIl liiiIIllIl(IIllIIllIllIIl s) {
      long var22 = 4508664576294048738L;
      long var24 = -1563764697529499858L;
      long var26 = -57063174906426567L;
      long var28 = -21229403484200740L;
      class_310 var2 = class_310.method_1551();
      class_746 var3 = var2.field_1724;
      liiilIiliiiilIil var4 = s == null ? null : s.IiIlliIliiIl();
      if (var3 != null && var2.field_1687 != null && var4 != null && var4.lIiiIiIlilli() != null) {
         class_1309 var5 = var4.lIiiIiIlilli();
         class_243 var6 = var3.method_33571();
         double var7 = lllIliIlillIliIl.IIlilIliiIli(var6, var5.method_5829());
         if (var7 > 3.4) {
            return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.liiiliIiil, IIIillIIil<"IIIillIIil","QIKUHCZbKP8jUhmqxQptfRz0GORVGmpI/nkxVUthqw==">());
         } else if (this.illIlIilIl(var5, var3.method_73189(), IIllIIlilIllIIli.IlIlllIlilIl())) {
            return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.liiiliIiil, IIIillIIil<"IIIillIIil","UTuTAfEPG5ttOLaN8veAk8Ot8dY6Fh4p8GwXkZFBpA==">());
         } else {
            var22 ^= ((long)IlIllllIll(var4) << 32 ^ var22) & -1L << 32;
            var22 ^= ((long)this.iIlIlllllill(var5) ^ var22) & -1L >>> 32;
            if ((int)var22 < 0) {
               return IilliIIllilliIIl.IliIlllilIi(
                  iIlIIIIiIllIIIIi.liiiliIiil,
                  (int)(var22 >>> 32) != 0
                     ? IIIillIIil<"IIIillIIil","eahCgmwpOAMRDNsqr43dzVIcWZAy04FD6pqoDP+dDLGjMw==">()
                     : IIIillIIil<"IIIillIIil","FZVhxyXfLmyvp7EgPMRvWu53zkqjPXgzC08LRbEpbvq66T9qvw==">()
               );
            } else {
               class_1799 var11 = var3.method_31548().method_5438((int)var22);
               var24 ^= ((long)(var3.method_31548().method_67532() == (int)var22 ? 1 : 0) << 32 ^ var24) & -1L << 32;
               var24 ^= ((long)iIlllIllll(var3, var11, (boolean)((int)(var24 >>> 32))) ^ var24) & -1L >>> 32;
               if ((int)(var22 >>> 32) == 0) {
                  float var14 = lllllillll(var3, var11);
                  float var15 = Iillllilll(var11);
                  iiIllIlIIlllIl var16 = var4.IlIillIiilIi() == null ? iiIllIlIIlllIl.lliIilIlliliIilIll : var4.IlIillIiilIi();
                  var26 ^= ((long)((int)var24 + IIllllIlll(s)) << 32 ^ var26) & -1L << 32;
                  float var18;
                  if (s.Iilllilliill() <= (int)(var26 >>> 32)) {
                     var18 = iIiIlIiIliIlIi.liiiIIllIl(var14, var15, 0.95F, false, var16, var4.IiIiliIiiiIi());
                  } else {
                     float var19 = iIiIlIiIliIlIi.IliIlllilIi(var14, var15, 0.95F, false);
                     float var20 = var4.llIIlilIIl();
                     float var21 = Float.isFinite(var20) ? Math.max(0.0F, var19 - var20) : 0.0F;
                     var18 = iiIiiliIIliili.lIiiIiIlilli(
                        var21, new iiIllIlIIlllIl(var16.IliIlllilIi(), var16.liiiIIllIl(), var16.iIlIlllllill(), var4.IiIiliIiiiIi(), -1)
                     );
                  }

                  float var30 = var4.Illillliilli() > 0.0F && Float.isFinite(var4.Illillliilli()) ? var4.Illillliilli() : 1.0F;
                  var26 ^= ((long)(var18 * var30 >= var4.IliIlllilIi() ? 1 : 0) ^ var26) & -1L >>> 32;
                  var28 ^= ((long)((int)var26 == 0 || !var4.IllIllllIl() && var4.Iilililiiili() ? 0 : 1) << 32 ^ var28) & -1L << 32;
                  return new IilliIIllilliIIl(
                     iIlIIIIiIllIIIIi.liiiliIiil,
                     true,
                     (double)var18,
                     (int)var24,
                     (boolean)((int)var26),
                     (boolean)((int)(var28 >>> 32)),
                     (int)(var24 >>> 32) != 0
                        ? IIIillIIil<"IIIillIIil","Ot4FY3VYPfdOtyjJic+jhMW9W5dUSzDlAsm6qvzRv/NJ">()
                        : IIIillIIil<"IIIillIIil","VI2UU6Uj4Zy5OYzRhC2f3YxlsOKtubUFs4mUsr6k753hug==">()
                  );
               } else {
                  return !lIlllIliIlllIl.liiiIIllIl(var11)
                     ? IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.liiiliIiil, IIIillIIil<"IIIillIIil","eahCgmwpOAMRDNsqr43dzVIcWZAy04FD6pqoDP+dDLGjMw==">())
                     : new IilliIIllilliIIl(
                        iIlIIIIiIllIIIIi.liiiliIiil,
                        true,
                        6.0,
                        (int)var24,
                        false,
                        false,
                        IIIillIIil<"IIIillIIil","eahCgmwpOAMRDNsqr43dzVIcWZAy04FD6pqoDP+dDLGjMw==">()
                     );
               }
            }
         }
      } else {
         return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.liiiliIiil, IIIillIIil<"IIIillIIil","DZcYI3nkdRG13NYfuXIcm37HFWCOvl1ulNpc63dwpefKHGNtoA==">());
      }
   }

   static float lllllillll(class_746 p, class_1799 weapon) {
      double var2 = p.method_45326(class_5134.field_23721);
      double var4 = p.method_45325(class_5134.field_23721) - var2 - iilllIIill(p.method_6047(), class_5134.field_23721);
      return (float)Math.max(0.0, var2 + iilllIIill(weapon, class_5134.field_23721) + var4);
   }

   public int iIlIlllllill(class_1309 t) {
      long var5 = 123380353829248038L;
      class_310 var2 = class_310.method_1551();
      class_746 var3 = var2.field_1724;
      if (var3 == null) {
         return -1;
      } else {
         if (t != null && liliIIliiiliIIli.IliIlllilIi(t)) {
            var5 ^= ((long)this.lIIiiiiiiiIIiiiiii.IilliliilIIi(lIlllIliIlllIl::liiiIIllIl, false) << 32 ^ var5) & -1L << 32;
            if ((int)(var5 >>> 32) >= 0) {
               return (int)(var5 >>> 32);
            }
         }

         var5 ^= ((long)lIlllIliIlllIl.IiIlliIliiIl(-1) << 32 ^ var5) & -1L << 32;
         return (int)(var5 >>> 32) >= 0 && lIIlliIIll((int)(var5 >>> 32))
            ? (int)(var5 >>> 32)
            : this.lIIiiiiiiiIIiiiiii.IilliliilIIi(lIlllIliIlllIl::iIlIlllllill, false);
      }
   }

   public boolean IilliliilIIi(class_1309 wantCrit, boolean t) {
      long var13 = 10514414875232262L;
      class_310 var3 = class_310.method_1551();
      class_746 var4 = var3.field_1724;
      if (var4 != null && var3.field_1687 != null && var3.field_1761 != null && wantCrit != null && wantCrit.method_5805()) {
         var13 ^= ((long)this.iIlIlllllill(wantCrit) << 32 ^ var13) & -1L << 32;
         if ((int)(var13 >>> 32) < 0) {
            return false;
         } else {
            class_243 var6 = var4.method_33571();
            class_238 var7 = wantCrit.method_5829();
            if (!this.lIIiiiiiiiIIiiiiii.lIiiIiIlilli((int)(var13 >>> 32), false)) {
               this.lliIliliIl(var6, liIlliiIll(var7), IIIliIilIIliIi.lilIIiliiiilIIilii);
               return false;
            } else {
               class_243 var8 = lllIliIlillIliIl.IIIIllIIIl(
                  var7, wantCrit, var6, this.Iiiliiiiiliiliiiii.IilliliilIIi(), this.Iiiliiiiiliiliiiii.lIiiIiIlilli(), 2.95, 0.1
               );
               if (var8 == null) {
                  var8 = liIlliiIll(var7);
               }

               double var9 = lllIliIlillIliIl.IIlilIliiIli(var6, var7);
               this.lliIliliIl(
                  var6,
                  IIlllIlliIll(var8, Iilllilliill(wantCrit), Iilllilliill(var4)),
                  var9 < 2.5 ? IIIliIilIIliIi.IIiIIiliilIiIIilii : IIIliIilIIliIi.lilIIiliiiilIIilii
               );
               if (!this.iiiliiiiiIIIiiiiii.iIlIlllllill()) {
                  return false;
               } else if (var4.method_7261(0.5F) < 0.95F) {
                  return false;
               } else if (t && !ilIllIiIll(var4)) {
                  return false;
               } else if (!IlIlllIlilIl(var6, this.Iiiliiiiiliiliiiii.IilliliilIIi(), this.Iiiliiiiiliiliiiii.lIiiIiIlilli(), wantCrit)) {
                  return false;
               } else if (!IIllIIlilIllIIli.IIlilIliiIli(this.lliliiiiiililiiiii, wantCrit)) {
                  return false;
               } else {
                  class_1799 var11 = var4.method_31548().method_5438((int)(var13 >>> 32));
                  float var12 = var4.method_7261(0.5F);
                  this.IiIIlliIIl(
                     lllllillll(var4, var11) + Iillllilll(var11),
                     lllIliIlillIliIl.iiiIlIIIll(wantCrit),
                     lllIliIlillIliIl.iIiIlIliIl(wantCrit),
                     var4.method_5624() && var12 > 0.9F
                  );
                  return this.iiIIlIIlIl(var3, var4, wantCrit, var6, this.Iiiliiiiiliiliiiii.IilliliilIIi(), this.Iiiliiiiiliiliiiii.lIiiIiIlilli());
               }
            }
         }
      } else {
         return false;
      }
   }

   private static class_243 Iilllilliill(class_1297 e) {
      return e == null ? class_243.field_1353 : Illlllllilll(e.method_23317(), e.method_23318(), e.method_23321(), e.field_6014, e.field_6036, e.field_5969);
   }

   private static boolean Ililllililil(class_243 e, class_243 eye, class_1309 to) {
      float[] var3 = ilIiiIiIii.Ililllililil(e, eye);
      return IlIlllIlilIl(e, var3[0], var3[1], to);
   }

   public static boolean IiIlliIliiIl(class_238 dir, class_243 box, class_243 eye, double reach) {
      return dir != null && box != null && eye != null
         ? liiIIliliiiIIlil.Iilililiiili(dir, box, box.method_1019(eye.method_1021(Math.max(0.0, reach))), 0.1)
         : false;
   }

   public long Iiilliiliiil() {
      return this.ilIiiiiiiIiIiiiiii;
   }

   static class_243 Iiiiliiiiiii(class_238 box) {
      class_243 var1 = box.method_1005();
      return new class_243(var1.field_1352, Math.min(box.field_1325 - 0.1, box.field_1322 + 0.45), var1.field_1350);
   }

   private boolean iiIIlIIlIl(class_310 mc, class_746 t, class_1309 p, class_243 yaw, float pitch, float eye) {
      if (!iIIIlIlIIl(t.method_6047())) {
         return this.llIIlilIIl(IIIillIIil<"IIIillIIil","sZ4aOdNIp/3z/JKDZ6oBRPEFWKaAjYyBJhdOVRAtRRU=">());
      } else {
         double var7 = this.iIiIlIliIl(t, p, yaw, pitch, eye);
         mc.field_1761.method_2918(t, p);
         t.method_6104(class_1268.field_5808);
         if (this.IlIiiiiiillIiiiiii != null) {
            this.IlIiiiiiillIiiiiii.Illlllllilll(var7, 3.0, true);
         }

         this.ilIiiiiiiIiIiiiiii = IIllIIlilIllIIli.IlIlllIlilIl();
         this.llliiiiiiilliiiiii = IIIillIIil<"IIIillIIil","1phKCCie/9XHB58btgbzLvjVQQQD89z3cxUKEAs=">();
         this.IIiIllIiIl();
         return true;
      }
   }

   private int IiiIlliiIl(class_746 planned, int fallback, int p) {
      if (this.iiiIlIIIll(planned, fallback)) {
         return fallback;
      } else {
         return this.iiiIlIIIll(planned, p) ? p : -1;
      }
   }

   static boolean IIiilIiiiIii(float lastScaledTaken, float charge, float raw) {
      return iliiiillIiiiiill.iIiilIliil(lastScaledTaken, charge) && raw >= 0.9F;
   }

   static class_243 Illlllllilll(double lastX, double z, double lastY, double x, double lastZ, double y) {
      double var12 = lastX - x;
      double var14 = z - lastZ;
      double var16 = lastY - y;
      double var18 = var12 * var12 + var14 * var14 + var16 * var16;
      return Double.isFinite(var18) && !(var18 > 4.0) ? new class_243(var12, var14, var16) : class_243.field_1353;
   }

   private static int IIllllIlll(IIllIIllIllIIl s) {
      double var1 = s.IlIlllIlilIl() == null ? 0.0 : s.IlIlllIlilIl().IIiIllIiIl();
      return (int)Math.ceil(Math.max(0.0, Double.isFinite(var1) ? var1 : 0.0) / 50.0);
   }

   private static double Ilillllill(double x) {
      return (x % 360.0 + 540.0) % 360.0 - 180.0;
   }

   private static boolean lIilliIill(class_6880<class_1320> b, class_6880<class_1320> a) {
      if (b == a) {
         return true;
      } else {
         Optional var2 = a.method_40230();
         return var2.isPresent() && b.method_40225((class_5321)var2.get());
      }
   }

   private void lliIliliIl(class_243 eye, class_243 speed, IIIliIilIIliIi point) {
      float[] var4 = ilIiiIiIii.Ililllililil(eye, speed);
      this.Iiiliiiiiliiliiiii.IIlllIlliIll(IiilIiIiliilIiIi.IlIllIiIIi, var4[0], var4[1], point, 70);
   }

   public static boolean IliIlllilIi(
      boolean targetGrounded,
      float strictRay,
      boolean targetReadyIn,
      boolean yawTolerance,
      boolean requireGrounded,
      boolean yawError,
      int sprintVariant,
      double slotStable,
      double charge,
      boolean serverSprinting
   ) {
      return targetGrounded
         && strictRay >= 0.95F
         && (targetReadyIn ? yawTolerance : !yawTolerance)
         && (!yawError || requireGrounded)
         && sprintVariant <= 0
         && slotStable <= charge
         && serverSprinting;
   }

   static float Iillllilll(class_1799 weapon) {
      long var2 = -3724135970496240051L;
      var2 ^= ((long)lIlllIliIlllIl.lIiiIiIlilli(weapon, class_1893.field_9118) << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) > 0 ? 0.5F * (float)((int)(var2 >>> 32)) + 0.5F : 0.0F;
   }

   public boolean IiIiliIiiiIi() {
      return this.iIliiiiiiIlliiiiii;
   }

   static boolean lIlIliIlIl(double himMoved, double usMoved, long held) {
      return !Double.isNaN(himMoved) && !Double.isNaN(usMoved) ? himMoved >= 0.5 || usMoved >= 0.5 || held < 0L || held >= 40L : true;
   }

   private void IiIIlliIIl(float meleeEpf, iiIllIlIIlllIl sprintHit, float armor, boolean raw) {
      this.liIiiiiiiiiIiiiiii = Float.isFinite(meleeEpf) ? Math.max(0.0F, meleeEpf) : 0.0F;
      this.IIliiiiiilIliiiiii = IIIIllIIIl(this.liIiiiiiiiiIiiiiii, sprintHit, armor);
      this.iIliiiiiiIlliiiiii = raw;
   }

   public String IIlilIliiIli() {
      return this.llliiiiiiilliiiiii;
   }

   private static boolean ilIllIiIll(class_746 p) {
      return !p.method_24828()
         && p.field_6017 > 0.0
         && p.method_18798().field_1351 < 0.0
         && !p.method_5624()
         && !p.method_5799()
         && !p.method_6101()
         && !p.method_5765();
   }

   public IiiIIliliiIIli(Object aim, iilllIiIIillIi gates, illillIlIilillIl slots, lIlIiIIliIlIiIIl audit, IllIilIilllIilIi owner) {
      this.lIiiiiiiiiIiiiiiii = Long.MIN_VALUE;
      this.lIIIIIIIIl = Long.MIN_VALUE;
      this.lliliiiiiililiiiii = aim;
      this.Iiiliiiiiliiliiiii = gates;
      this.iiiliiiiiIIIiiiiii = slots;
      this.lIIiiiiiiiIIiiiiii = audit;
      this.IlIiiiiiillIiiiiii = owner;
   }

   private void IIiIllIiIl() {
      this.iiliiiiiiIIiiiiiii = 0;
      this.lIiiiiiiiiIiiiiiii = Long.MIN_VALUE;
      this.liiiiiiiiiiiiiiiii = null;
      this.IIIIIIIIIl = null;
      this.lIIIIIIIIl = Long.MIN_VALUE;
   }

   static boolean iIIIlIlIIl(class_1799 held) {
      return held != null && !held.method_7960() && (lIlllIliIlllIl.iIlIlllllill(held) || lIlllIliIlllIl.liiiIIllIl(held));
   }

   private static double iilllIIill(class_1799 s, class_6880<class_1320> attribute) {
      if (s != null && !s.method_7960()) {
         double[] var2 = new double[1];
         s.method_57354(class_1304.field_6173, (mod, attributex) -> {
            if (lIilliIill(mod, attribute) && attributex.comp_2450() == class_1323.field_6328) {
               var2[0] += attributex.comp_2449();
            }
         });
         return var2[0];
      } else {
         return 0.0;
      }
   }

   private boolean llIIlilIIl(String why) {
      this.llliiiiiiilliiiiii = why;
      return false;
   }

   static class_243 IIlllIlliIll(class_243 targetStep, class_243 selfStep, class_243 goal) {
      if (targetStep == null) {
         return null;
      } else {
         class_243 var3 = selfStep == null ? class_243.field_1353 : selfStep;
         class_243 var4 = goal == null ? class_243.field_1353 : goal;
         return targetStep.method_1019(var3.method_1020(var4));
      }
   }

   private static boolean lIIlliIIll(int slot) {
      long var4 = -1534830790846192623L;
      boolean[] var1 = new boolean[9];
      boolean[] var2 = new boolean[9];

      for (long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < 9; var6 += 4294967296L) {
         var1[(int)(var6 >>> 32)] = IIIIilIilIIIilIi.ilIllIiIll((int)(var6 >>> 32));
         var2[(int)(var6 >>> 32)] = IIIIilIilIIIilIi.iiiIlIIIll((int)(var6 >>> 32));
      }

      return !liillIlliiillIll.iIlIlllllill(slot, IIIIilIilIIIilIi.IlIllllIll(), var1, var2, false);
   }

   public static boolean IlIlllIlilIl(class_243 yaw, float eye, float e, class_1309 pitch) {
      return lllIliIlillIliIl.Ilillllill(yaw, eye, e, pitch, 2.95, 2.95);
   }

   private double iIiIlIliIl(class_746 eye, class_1309 p, class_243 yaw, float t, float pitch) {
      class_238 var6 = p.method_5829();
      if (var6.method_1006(yaw)) {
         return 0.0;
      } else {
         class_243 var7 = eye.method_5631(pitch, t);
         Optional var8 = var6.method_992(yaw, yaw.method_1019(var7.method_1021(4.0)));
         return var8.<Double>map(yaw::method_1022).orElseGet(() -> lllIliIlillIliIl.IIlilIliiIli(yaw, var6));
      }
   }

   private static class_243 IIillIiliIil(class_243 e, class_238 eye, class_1309 box, class_243 hint) {
      long var13 = 7438310098191997630L;
      long var15 = -4225233933356389120L;
      var13 ^= ((long)(lllIliIlillIliIl.IIlilIliiIli(e, eye) <= 2.95 ? 1 : 0) << 32 ^ var13) & -1L << 32;
      if ((int)(var13 >>> 32) != 0 && hint != null && Ililllililil(e, hint, box)) {
         return hint;
      } else {
         class_243 var5 = eye.method_1005();
         double[][] var6 = iliiiillIiiiiill.liIIiiiIIi(
            eye.field_1323,
            eye.field_1322,
            eye.field_1321,
            eye.field_1320,
            eye.field_1325,
            eye.field_1324,
            var5.field_1352 - e.field_1352,
            var5.field_1350 - e.field_1350
         );
         class_243 var7 = null;
         double[][] var8 = var6;
         var13 ^= ((long)var6.length ^ var13) & -1L >>> 32;

         for (long var19 = var15 ^ (0L ^ var15) & -1L << 32; (int)(var19 >>> 32) < (int)var13; var19 += 4294967296L) {
            double[] var11 = var8[(int)(var19 >>> 32)];
            class_243 var12 = new class_243(var11[0], var11[1], var11[2]);
            if ((int)(var13 >>> 32) != 0 && Ililllililil(e, var12, box)) {
               return var12;
            }

            if (var7 == null || e.method_1025(var12) < e.method_1025(var7)) {
               var7 = var12;
            }
         }

         return var7 != null ? var7 : (hint != null ? hint : Iiiiliiiiiii(eye));
      }
   }

   private static int iIlllIllll(class_746 p, class_1799 weapon, boolean selected) {
      double var3 = 4.0 + iilllIIill(weapon, class_5134.field_23723);
      double var5 = var3 > 0.0 ? 20.0 / var3 : 20.0;
      if (!selected) {
         return 1 + (int)Math.ceil(0.95F * var5);
      } else {
         float var7 = p.method_7261(0.5F);
         return var7 >= 0.95F ? 0 : (int)Math.ceil((double)(0.95F - var7) * var5);
      }
   }

   public boolean IIIllIIliIIl(liiilIiliiiilIil targetReadyIn, int t) {
      class_310 var3 = class_310.method_1551();
      class_746 var4 = var3.field_1724;
      class_1309 var5 = targetReadyIn == null ? null : targetReadyIn.lIiiIiIlilli();
      if (var4 == null || var3.field_1687 == null || var5 == null || !var5.method_5805() || var5.method_31481()) {
         return false;
      } else if (t <= 2 && !this.Iiiliiiiiliiliiiii.IiIiliIiiiIi()) {
         class_243 var6 = var4.method_33571();
         class_238 var7 = var5.method_5829();
         double var8 = lllIliIlillIliIl.IIlilIliiIli(var6, var7);
         if (var8 <= 3.4 && this.iIlIlllllill(var5) >= 0) {
            class_243 var10 = IIillIiliIil(var6, var7, var5, null);
            float[] var11 = ilIiiIiIii.Ililllililil(var6, IIlllIlliIll(var10, Iilllilliill(var5), Iilllilliill(var4)));
            this.Iiiliiiiiliiliiiii
               .IIlllIlliIll(
                  IiilIiIiliilIiIi.IlIllIiIIi, var11[0], var11[1], var8 < 2.5 ? IIIliIilIIliIi.IIiIIiliilIiIIilii : IIIliIilIIliIi.lilIIiliiiilIIilii, 30
               );
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public float IIIilIIiiIIi() {
      return this.liIiiiiiiiiIiiiiii;
   }

   public boolean lIiiIiIlilli(liiilIiliiiilIil t, llIlilIlilIlilIl spec, lllliIilillliIil targetReadyIn, int sprint) {
      long var34 = -4646774400264392213L;
      long var36 = 200707901567476448L;
      class_310 var5 = class_310.method_1551();
      class_746 var6 = var5.field_1724;
      if (var6 != null && var5.field_1687 != null && var5.field_1761 != null && t != null && spec != null) {
         class_1309 var7 = t.lIiiIiIlilli();
         if (var7 == null || !var7.method_5805() || var7.method_31481()) {
            return false;
         } else if (IlIllllIll(t)) {
            this.IilliliilIIi(var7, false);
            return false;
         } else {
            var34 ^= ((long)this.IiiIlliiIl(var6, spec.IliIlllilIi(), this.iIlIlllllill(var7)) << 32 ^ var34) & -1L << 32;
            class_243 var9 = var6.method_33571();
            class_238 var10 = var7.method_5829();
            if ((int)(var34 >>> 32) < 0) {
               this.lliIliliIl(var9, liIlliiIll(var10), IIIliIilIIliIi.lilIIiliiiilIIilii);
               return this.llIIlilIIl(IIIillIIil<"IIIillIIil","sZ4aOdNIp/3z/JKDZ6oBRPEFWKaAjYyBJhdOVRAtRRU=">());
            } else {
               class_243 var11 = var10.method_1005();
               double var12 = var11.field_1352 - var9.field_1352;
               double var14 = var11.field_1350 - var9.field_1350;
               double var16 = Math.sqrt(var12 * var12 + var14 * var14);
               float var18 = IlliiIIlllliiIIl.iIlIlllllill(var12, var14);
               double var19 = Iliilliiilii(var16, Math.min(var10.method_17939(), var10.method_17941()));
               double var21 = Math.max(-var19, Math.min(var19, Ilillllill((double)(spec.iIlIlllllill() - var18))));
               float var23 = (float)((double)var18 + var21);
               class_243 var24 = liIlliiIll(var10);
               float var25 = ilIiiIiIii.Ililllililil(var9, var24)[1];
               IIIliIilIIliIi var26 = var16 < 2.5 ? IIIliIilIIliIi.IIiIIiliilIiIIilii : IIIliIilIIliIi.lilIIiliiiilIIilii;
               if (!this.lIIiiiiiiiIIiiiiii.lIiiIiIlilli((int)(var34 >>> 32), false)) {
                  this.Iiiliiiiiliiliiiii.IIlllIlliIll(IiilIiIiliilIiIi.IlIllIiIIi, var23, var25, var26, 70);
                  return false;
               } else {
                  this.Iiiliiiiiliiliiiii.IIlllIlliIll(IiilIiIiliilIiIi.IlIllIiIIi, var23, var25, var26, 70);
                  float var27 = var6.method_7261(0.5F);
                  var34 ^= ((long)(targetReadyIn != null && targetReadyIn.IilliliilIIi() ? 1 : 0) ^ var34) & -1L >>> 32;
                  double var29 = Math.abs(Ilillllill((double)(this.Iiiliiiiiliiliiiii.IilliliilIIi() - spec.iIlIlllllill())));
                  var36 ^= ((long)this.iiiliiiiiIIIiiiiii.IlIlllIlilIl((int)(var34 >>> 32)) << 32 ^ var36) & -1L << 32;
                  if (!IliIlllilIi(
                     (boolean)((int)(var36 >>> 32)),
                     var27,
                     spec.liiiIIllIl(),
                     (boolean)((int)var34),
                     t.IIlllIlliIll(),
                     spec.lIiiIiIlilli(),
                     sprint,
                     var29,
                     (double)spec.IilliliilIIi(),
                     true
                  )) {
                     return false;
                  } else if (!this.iiiliiiiiIIIiiiiii.iIlIlllllill()) {
                     return false;
                  } else {
                     var36 ^= ((long)IlIlllIlilIl(var9, this.Iiiliiiiiliiliiiii.IilliliilIIi(), this.Iiiliiiiiliiliiiii.lIiiIiIlilli(), var7) ^ var36)
                        & -1L >>> 32;
                     if (!IliIlllilIi(
                        (boolean)((int)(var36 >>> 32)),
                        var27,
                        spec.liiiIIllIl(),
                        (boolean)((int)var34),
                        t.IIlllIlliIll(),
                        spec.lIiiIiIlilli(),
                        sprint,
                        var29,
                        (double)spec.IilliliilIIi(),
                        (boolean)((int)var36)
                     )) {
                        return false;
                     } else if (!IIllIIlilIllIIli.IIlilIliiIli(this.lliliiiiiililiiiii, var7)) {
                        return false;
                     } else {
                        class_1799 var33 = var6.method_31548().method_5438((int)(var34 >>> 32));
                        this.IiIIlliIIl(lllllillll(var6, var33) + Iillllilll(var33), t.IlIillIiilIi(), t.IiIiliIiiiIi(), (int)var34 != 0 && var27 > 0.9F);
                        return this.iiIIlIIlIl(var5, var6, var7, var9, this.Iiiliiiiiliiliiiii.IilliliilIIi(), this.Iiiliiiiiliiliiiii.lIiiIiIlilli());
                     }
                  }
               }
            }
         }
      } else {
         return false;
      }
   }

   public void Illillliilli() {
      this.llliiiiiiilliiiiii = IIIillIIil<"IIIillIIil","1phKCCie/9XHB58btgbzLvjVQQQD89z3cxUKEAs=">();
   }

   private static class_243 liIlliiIll(class_238 box) {
      class_243 var1 = box.method_1005();
      return new class_243(var1.field_1352, Math.min(box.field_1325 - 0.1, box.field_1322 + 1.2), var1.field_1350);
   }
}
