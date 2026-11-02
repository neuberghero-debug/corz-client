package gg.corz;

import com.corz.client.mixins.AccessorMinecraftClient;
import net.minecraft.class_10584;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_5134;
import net.minecraft.class_746;

public final class Iillllllilllll {
   private long iIIIiiiilIlIIiiiil;
   private double IIIIiiiillIIIiiiil;
   public static final int IlIiliiilllIiliiil = 9;
   private boolean iililiiilIIiiliiil;
   private class_243 iiIIiiiilIIlIiiiil;
   private long IiIIiiiilliIIiiiil;
   public static final double Illlliiilllllliiil = 6.0;
   private final IIllllIlll llliliiililliliiil;
   public static final int iiIlliiilIIllliiil = 20;
   private final illillIlIilillIl IIliliiillIliliiil;
   public static final String lIIiliiiliIIiliiil = "-";
   private double liiiliiiliiiiliiil;
   public static final double illlliiilIillliiil = 0.6;
   private final iilllIiIIillIi liIiliiiliiIiliiil;
   public static final double lIllliiiliIllliiil = 2.6;
   private int lIlIiiiiliIlIiiiil;
   public static final double llilliiilililliiil = 2.0;
   public static final double IIilliiillIilliiil = 0.35;
   private int llIIiiiililIIiiiil;
   private String lIiiliiiliIiiliiil;
   private int Iliiliiillliiliiil;
   private final Object ilIiliiilIiIiliiil;
   private long Iililiiillililiiil = Long.MIN_VALUE;
   public static final int IiIlliiilliIlliiil = 70;
   public static final int iiilliiilIIIiliiil = 3;
   private final lIlIiIIliIlIiIIl iIliliiilIlliliiil;
   public static final double iIilliiilIlilliiil = 0.25;
   public static final double lillliiiliillliiil = 0.4;
   public static final double Iiilliiilliilliiil = 1.0E-4;
   private double iliiliiilIiiiliiil;

   public void IliIlllilIi() {
      this.lIiiliiiliIiiliiil = lilIliilIl<"lilIliilIl","j463U2TMDUwMuK72JYP7xzjYR8C0tj1jC3ax4zU=">();
   }

   private class_243 IIIilIIiiIIi(class_1309 reach, class_238 box, class_243 eye, double dist, double t) {
      double var8 = t + 0.6;
      if (box.method_1006(eye)) {
         this.Iliiliiillliiliiil = -1;
         return lllIliIlillIliIl.IIIIllIIIl(box, reach, eye, this.liIiliiiliiIiliiil.IilliliilIIi(), this.liIiliiiliiIiliiil.lIiiIiIlilli(), t, 0.1);
      } else {
         class_243 var10 = this.Iliiliiillliiliiil == reach.method_5628() && dist <= var8 + 0.4
            ? IiIiliIiiiIi(box, this.iliiliiilIiiiliiil, this.liiiliiiliiiiliiil, this.IIIIiiiillIIIiiiil)
            : null;
         if (var10 != null && !lllIliIlillIliIl.IiIIlliIIl(eye, var10)) {
            var10 = null;
         }

         if (var10 == null || !(dist > t) && !Illillliilli(box, eye, var10, llIIliiilIIlii.liiiIIllIl(t))) {
            class_243 var11 = dist <= var8
               ? lllIliIlillIliIl.IIIIllIIIl(box, reach, eye, this.liIiliiiliiIiliiil.IilliliilIIi(), this.liIiliiiliiIiliiil.lIiiIiIlilli(), t, 0.1)
               : null;
            class_243 var12 = var11 != null ? var11 : (var10 != null ? var10 : IiIIlliIIl(box, eye));
            if (dist <= var8 + 0.4) {
               this.IlIillIiilIi(reach.method_5628(), box, var12);
            } else {
               this.Iliiliiillliiliiil = -1;
            }

            return var12;
         } else {
            return var10;
         }
      }
   }

   static int IIiilIiiiIii(boolean leftBefore, int sameGoal) {
      return leftBefore ? Math.max(1, sameGoal - 1) : 3;
   }

   public Iillllllilllll(Object owner, iilllIiIIillIi slots, illillIlIilillIl ledger, lIlIiIIliIlIiIIl gates, IIllllIlll aim) {
      this.lIiiliiiliIiiliiil = lilIliilIl<"lilIliilIl","j463U2TMDUwMuK72JYP7xzjYR8C0tj1jC3ax4zU=">();
      this.Iliiliiillliiliiil = -1;
      this.iIIIiiiilIlIIiiiil = Long.MIN_VALUE;
      this.llIIiiiililIIiiiil = -1;
      this.IiIIiiiilliIIiiiil = Long.MIN_VALUE;
      this.ilIiliiilIiIiliiil = owner;
      this.liIiliiiliiIiliiil = slots;
      this.IIliliiillIliliiil = ledger;
      this.iIliliiilIlliliiil = gates;
      this.llliliiililliliiil = aim;
   }

   public String Iiilliiliiil() {
      return this.lIiiliiiliIiiliiil;
   }

   static class_243 Iiiiliiiiiii(class_243 left, int stepsLeft) {
      if (left != null && stepsLeft > 0) {
         double var2 = left.method_1033();
         return Double.isFinite(var2) && !(var2 < 1.0E-4) && !(var2 / (double)stepsLeft > 2.0)
            ? left.method_1021(1.0 / (double)stepsLeft)
            : class_243.field_1353;
      } else {
         return class_243.field_1353;
      }
   }

   public long IIillIiliIil() {
      return this.Iililiiillililiiil;
   }

   public void IIIllIIliIIl(float yaw, float pitch) {
      this.liIiliiiliiIiliiil.IIlllIlliIll(IiilIiIiliilIiIi.iiIllIiIIi, yaw, pitch, IIIliIilIIliIi.illIIiliiIilIIilii, 20);
   }

   public void iliIiiliiiii(class_1309 intent, iIllllIlIlllllIl t) {
      class_310 var3 = class_310.method_1551();
      class_746 var4 = var3.field_1724;
      if (var4 != null && var3.field_1687 != null && intent != null) {
         class_243 var5 = var4.method_33571();
         class_238 var6 = intent.method_5829();
         double var7 = lllIliIlillIliIl.IIlilIliiIli(var5, var6);
         long var9 = IIllIIlilIllIIli.IlIlllIlilIl();
         class_243 var11 = this.IIIilIIiiIIi(intent, var6, var5, var7, IIlllIlliIll(var4));
         if (var11 == null) {
            var11 = IiIIlliIIl(var6, var5);
         }

         class_243 var12 = iiIIlIIlIl(var11, this.Iilililiiili(intent, var9), this.IIIIllIIIl(var4, t, var9));
         float[] var13 = ilIiiIiIii.Ililllililil(var5, var12);
         IIIliIilIIliIi var14 = var7 < 2.6
            ? IIIliIilIIliIi.IIiIIiliilIiIIilii
            : (var7 < 6.0 ? IIIliIilIIliIi.lilIIiliiiilIIilii : IIIliIilIIliIi.illIIiliiIilIIilii);
         this.liIiliiiliiIiliiil.IIlllIlliIll(IiilIiIiliilIiIi.IlIllIiIIi, var13[0], var13[1], var14, 70);
      }
   }

   public void IilliliilIIi() {
      this.Iliiliiillliiliiil = -1;
      this.iIIIiiiilIlIIiiiil = Long.MIN_VALUE;
      this.llIIiiiililIIiiiil = -1;
      this.IiIIiiiilliIIiiiil = Long.MIN_VALUE;
      this.iiIIiiiilIIlIiiiil = null;
      this.lIlIiiiiliIlIiiiil = 0;
   }

   static boolean Illillliilli(class_238 inner, class_243 eye, class_243 point, double box) {
      class_243 var5 = point.method_1020(eye);
      double var6 = var5.method_1033();
      return !(var6 > 1.0E-4) ? true : liiIIliliiiIIlil.Iilililiiili(inner, eye, eye.method_1019(var5.method_1021(box / var6)), 0.1);
   }

   static boolean Illlllllilll(class_310 mc) {
      return ((AccessorMinecraftClient)mc).corzGetAttackCooldown() > 0;
   }

   static class_243 IiIIlliIIl(class_238 box, class_243 eye) {
      class_243 var2 = box.method_1005();
      double var3 = box.field_1322 + 0.35;
      double var5 = box.field_1325 - 0.25;
      double var7 = Math.max(var3, Math.min(var5, eye.field_1351));
      return new class_243(var2.field_1352, var7, var2.field_1350);
   }

   public boolean Ililllililil() {
      return this.iililiiilIIiiliiil;
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private class_243 IIIIllIIIl(class_746 intent, iIllllIlIlllllIl p, long tick) {
      long var21 = 7694028807276332269L;
      long var23 = -8920563662022808858L;
      long var25 = -2168282031163425824L;
      class_243 var5 = lIlIliIlIl(intent);
      if (!intent.method_5799()
         && !intent.method_5771()
         && !intent.method_6101()
         && !intent.method_5765()
         && !intent.method_6128()
         && !intent.method_31549().field_7479) {
         class_243 var6;
         byte var49;
         label116: {
            var6 = intent.method_18798();
            var21 ^= (
                  (long)(this.iIIIiiiilIlIIiiiil != Long.MIN_VALUE && tick - this.iIIIiiiilIlIIiiiil <= 1L && tick >= this.iIIIiiiilIlIIiiiil ? 1 : 0) << 32
                     ^ var21
               )
               & -1L << 32;
            if (p instanceof iIllllIlIlllllIl) {
               iIllllIlIlllllIl var10000 = p;

               IilIIIililIIIi var19;
               label94: {
                  label114: {
                     try {
                        var49 = var10000.IlIlllIlilIl();
                     } catch (Throwable var33) {
                        var39 = var33;
                        boolean var10001 = false;
                        break label114;
                     }

                     var21 ^= ((long)var49 ^ var21) & -1L >>> 32;
                     var23 ^= ((long)((int)var21) << 32 ^ var23) & -1L << 32;
                     iIllllIlIlllllIl var41 = p;

                     try {
                        var41.IiIlliIliiIl();
                     } catch (Throwable var32) {
                        var39 = var32;
                        boolean var50 = false;
                        break label114;
                     }

                     iIllllIlIlllllIl var42 = p;

                     try {
                        var42.IIlllIlliIll();
                     } catch (Throwable var31) {
                        var39 = var31;
                        boolean var51 = false;
                        break label114;
                     }

                     iIllllIlIlllllIl var43 = p;

                     try {
                        var44 = var43.Illlllllilll();
                     } catch (Throwable var30) {
                        var39 = var30;
                        boolean var52 = false;
                        break label114;
                     }

                     var19 = var44;
                     iIllllIlIlllllIl var45 = p;

                     try {
                        var45.Iilllilliill();
                     } catch (Throwable var29) {
                        var39 = var29;
                        boolean var53 = false;
                        break label114;
                     }

                     iIllllIlIlllllIl var46 = p;

                     try {
                        var46.IIillIiliIil();
                     } catch (Throwable var28) {
                        var39 = var28;
                        boolean var54 = false;
                        break label114;
                     }

                     iIllllIlIlllllIl var47 = p;

                     try {
                        var49 = var47.Ililllililil();
                        break label94;
                     } catch (Throwable var27) {
                        var39 = var27;
                        boolean var55 = false;
                     }
                  }

                  Throwable var11 = var39;
                  throw new MatchException(var11.toString(), var11);
               }

               var21 ^= ((long)var49 ^ var21) & -1L >>> 32;
               var23 ^= ((long)((int)var21) ^ var23) & -1L >>> 32;
               if (var19 == IilIIIililIIIi.IIillIililIillIili) {
                  var49 = 1;
                  break label116;
               }
            }

            var49 = 0;
         }

         var25 ^= ((long)var49 << 32 ^ var25) & -1L << 32;
         double var9 = iIIIlIlIIl(intent.method_24828(), var6.field_1351, (boolean)((int)(var25 >>> 32)), llIIlilIIl(intent));
         return new class_243((int)(var21 >>> 32) != 0 ? var6.field_1352 : var5.field_1352, var9, (int)(var21 >>> 32) != 0 ? var6.field_1350 : var5.field_1350);
      } else {
         return var5;
      }
   }

   static class_243 iiIIlIIlIl(class_243 goal, class_243 selfStep, class_243 targetStep) {
      if (goal == null) {
         return null;
      } else {
         class_243 var3 = selfStep == null ? class_243.field_1353 : selfStep;
         class_243 var4 = targetStep == null ? class_243.field_1353 : targetStep;
         return goal.method_1019(var3.method_1020(var4));
      }
   }

   private void IlIillIiilIi(int point, class_238 id, class_243 box) {
      this.Iliiliiillliiliiil = point;
      this.iliiliiilIiiiliiil = IIlilIliiIli(box.field_1352, id.field_1323, id.field_1320);
      this.liiiliiiliiiiliiil = IIlilIliiIli(box.field_1351, id.field_1322, id.field_1325);
      this.IIIIiiiillIIIiiiil = IIlilIliiIli(box.field_1350, id.field_1321, id.field_1324);
   }

   private class_243 Iilililiiili(class_1297 tick, long e) {
      long var9 = -6475928010780243724L;
      class_243 var4 = lIlIliIlIl(tick);
      class_10584 var5 = tick.method_66233();
      if (var5 != null && var5.method_66270()) {
         class_243 var6 = var5.method_66265();
         var9 ^= (
               (long)(this.llIIiiiililIIiiiil == tick.method_5628() && this.IiIIiiiilliIIiiiil == e - 1L && this.iiIIiiiilIIlIiiiil != null ? 1 : 0) << 32
                  ^ var9
            )
            & -1L << 32;
         var9 ^= (
               (long)(
                     (int)(var9 >>> 32) != 0
                        ? IIiilIiiiIii(var6.equals(this.iiIIiiiilIIlIiiiil), this.lIlIiiiiliIlIiiiil)
                        : Iliilliiilii(var4, var6.method_1020(tick.method_73189()))
                  )
                  ^ var9
            )
            & -1L >>> 32;
         this.llIIiiiililIIiiiil = tick.method_5628();
         this.IiIIiiiilliIIiiiil = e;
         this.iiIIiiiilIIlIiiiil = var6;
         this.lIlIiiiiliIlIiiiil = (int)var9;
         return Iiiiliiiiiii(var6.method_1020(tick.method_73189()), (int)var9);
      } else {
         this.llIIiiiililIIiiiil = -1;
         return var5 == null ? var4 : class_243.field_1353;
      }
   }

   static double iIIIlIlIIl(boolean vy, double jump, boolean jumpVelocity, double onGround) {
      if (!Double.isFinite(jump)) {
         return 0.0;
      } else if (!vy) {
         return jump;
      } else {
         return jumpVelocity ? Math.max(onGround, jump) : Math.max(0.0, jump);
      }
   }

   static class_243 lIlIliIlIl(class_1297 e) {
      if (e == null) {
         return class_243.field_1353;
      } else {
         double var1 = e.method_23317() - e.field_6014;
         double var3 = e.method_23318() - e.field_6036;
         double var5 = e.method_23321() - e.field_5969;
         double var7 = var1 * var1 + var3 * var3 + var5 * var5;
         return Double.isFinite(var7) && !(var7 > 4.0) ? new class_243(var1, var3, var5) : class_243.field_1353;
      }
   }

   private static double llIIlilIIl(class_746 p) {
      return p.method_45325(class_5134.field_23728) + (double)p.method_37416();
   }

   static double IIlilIliiIli(double lo, double hi, double v) {
      double var6 = v - hi;
      return var6 > 1.0E-4 && Double.isFinite(lo) ? Math.max(0.0, Math.min(1.0, (lo - hi) / var6)) : 0.5;
   }

   public static boolean IiIlliIliiIl(class_243 yaw, float pitch, float eye, class_1309 t, double reach) {
      return !(reach > 0.0) ? false : lllIliIlillIliIl.Ilillllill(yaw, pitch, eye, t, reach, llIIliiilIIlii.liiiIIllIl(reach));
   }

   public boolean iIlIlllllill() {
      long var2 = -765130984151787856L;
      var2 ^= ((long)this.liiiIIllIl() << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) >= 0 && this.iIliliiilIlliliiil.lIiiIiIlilli((int)(var2 >>> 32), false);
   }

   public static double IIlllIlliIll(class_746 p) {
      return llIIliiilIIlii.IliIlllilIi(p.method_45325(class_5134.field_47759));
   }

   public int liiiIIllIl() {
      long var5 = 2833314761507857121L;
      class_746 var1 = class_310.method_1551().field_1724;
      if (var1 == null) {
         return -1;
      } else {
         double[] var2 = new double[9];

         for (long var7 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var7 >>> 32) < 9; var7 += 4294967296L) {
            var2[(int)(var7 >>> 32)] = iIIiIIilIlIiIIil.iIlIlllllill(var1.method_31548().method_5438((int)(var7 >>> 32)));
         }

         double var3 = iIIiIIilIlIiIIil.lIiiIiIlilli(var2);
         return this.iIliliiilIlliliiil.IilliliilIIi(best -> iIIiIIilIlIiIIil.iliIiiliiiii(best, var3), false);
      }
   }

   public boolean IlIlllIlilIl(class_1309 minCharge, float t, boolean crit, boolean serverSprinting) {
      long var9 = 5758673566613675717L;
      class_310 var5 = class_310.method_1551();
      class_746 var6 = var5.field_1724;
      if (var6 == null || var5.field_1687 == null || var5.field_1761 == null) {
         return this.IllIllllIl(lilIliilIl<"lilIliilIl","VsmCm7ALrZSC2wigWtjBCGntwpHpk1apf1AHMHmMm9jr8Q==">());
      } else if (minCharge != null && minCharge.method_5805() && !minCharge.method_31481()) {
         var9 ^= ((long)this.liiiIIllIl() << 32 ^ var9) & -1L << 32;
         if ((int)(var9 >>> 32) < 0) {
            return this.IllIllllIl(lilIliilIl<"lilIliilIl","yMbP3rrphDUd2HoWOZIHWreZEGvl3B/Y1yszS74ZG0VjIEP3">());
         } else if (!this.iIliliiilIlliliiil.lIiiIiIlilli((int)(var9 >>> 32), false)) {
            return this.IllIllllIl(lilIliilIl<"lilIliilIl","18kjyw3ltSHRuh/X2UQGuyvN1Ec5deD4WSM5Es4VNLA=">());
         } else if (!iIIiIIilIlIiIIil.liiiIIllIl(var6.method_6047())) {
            return this.IllIllllIl(lilIliilIl<"lilIliilIl","bnbALpOz87NEO9c6cwviR/VMy7v9T/dsuND1Oo8Bu6w=">());
         } else if (Illlllllilll(var5)) {
            return this.IllIllllIl(lilIliilIl<"lilIliilIl","9lr8NaUWwvkaLKofBz4U5iiwH7Mx7KwnrF/v4O0TGTIqq7E=">());
         } else if (var6.method_7261(0.5F) < t) {
            return this.IllIllllIl(lilIliilIl<"lilIliilIl","KVVoHRUTcOLstrdkoRQwFUs6gRYsYEngwXZKKxLSErDeqQ==">());
         } else if (!crit || !serverSprinting && Iilllilliill(var6)) {
            if (!this.IIliliiillIliliiil.iIlIlllllill()) {
               return this.IllIllllIl(lilIliilIl<"lilIliilIl","Sl+gC8ANxWplomt7Xv/2QyexTdftCwPVHbhXNti4DEHD">());
            } else if (this.llliliiililliliiil.IIlllIlliIll()) {
               var6.method_7346();
               return this.IllIllllIl(lilIliilIl<"lilIliilIl","z4NAeGooUDOjtDrui9hG8p46gAiUstmTboIH7tXomgD9AUQ=">());
            } else {
               class_243 var8 = var6.method_33571();
               if (!IiIlliIliiIl(var8, this.liIiliiiliiIiliiil.IilliliilIIi(), this.liIiliiiliiIiliiil.lIiiIiIlilli(), minCharge, IIlllIlliIll(var6))) {
                  return this.IllIllllIl(lilIliilIl<"lilIliilIl","RA5/NWQNE+yXYYBU5mQxuWc2o9gZqr7Kuls3gPnG1g==">());
               } else if (!IIllIIlilIllIIli.IIlilIliiIli(this.ilIiliiilIiIiliiil, minCharge)) {
                  return this.IllIllllIl(lilIliilIl<"lilIliilIl","Di+gvLLFJjmMJUfIBO9eBotham5DAmhZpXqvXPhaD+k=">());
               } else {
                  var5.field_1761.method_2918(var6, minCharge);
                  var6.method_6104(class_1268.field_5808);
                  this.Iililiiillililiiil = IIllIIlilIllIIli.IlIlllIlilIl();
                  this.iililiiilIIiiliiil = crit;
                  this.lIiiliiiliIiiliiil = lilIliilIl<"lilIliilIl","j463U2TMDUwMuK72JYP7xzjYR8C0tj1jC3ax4zU=">();
                  return true;
               }
            }
         } else {
            return this.IllIllllIl(lilIliilIl<"lilIliilIl","0e4YWRZsKE0aMM/oVJdqBbSKStYQDjcPeCLj8LTBl8A=">());
         }
      } else {
         return this.IllIllllIl(lilIliilIl<"lilIliilIl","TZ0XW5AUt7zq57bIbiC5EbVASvGQHO89wWh6042bwo678A==">());
      }
   }

   static int Iliilliiilii(class_243 left, class_243 last) {
      double var2 = last == null ? 0.0 : last.method_1033();
      double var4 = left == null ? 0.0 : left.method_1033();
      return var4 > 1.0E-4 && Double.isFinite(var2) ? (int)Math.max(1L, Math.min(3L, Math.round(var2 / var4))) : 3;
   }

   public void lIiiIiIlilli(long tick) {
      this.iIIIiiiilIlIIiiiil = tick;
   }

   static class_243 IiIiliIiiiIi(class_238 fz, double box, double fy, double fx) {
      return new class_243(
         fz.field_1323 + box * (fz.field_1320 - fz.field_1323),
         fz.field_1322 + fy * (fz.field_1325 - fz.field_1322),
         fz.field_1321 + fx * (fz.field_1324 - fz.field_1321)
      );
   }

   public static boolean Iilllilliill(class_746 p) {
      return !p.method_24828()
         && p.field_6017 > 0.0
         && p.method_18798().field_1351 < 0.0
         && !p.method_5624()
         && !p.method_5799()
         && !p.method_6101()
         && !p.method_5765()
         && !p.method_5771();
   }

   private boolean IllIllllIl(String why) {
      this.lIiiliiiliIiiliiil = why;
      return false;
   }
}
