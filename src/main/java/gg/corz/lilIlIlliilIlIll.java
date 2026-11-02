package gg.corz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_2338;
import net.minecraft.class_243;

public final class lilIlIlliilIlIll {
   public static final double IilIlillll = -0.05;
   public static final String liillillll = "cooldown";
   public static final int iiiIlillll = 20;
   public static final int IiiiIillll = 6;
   private long IiIilillll;
   private iIiIiilIliIiil lIIilillll;
   public static final int lIlIlillll = 2;
   public static final String Iiillillll = "zone";
   public static final double IiIllillll = 0.1;
   public static final String IIlllillll = "landing";
   public static final double IIlIlillll = 16.0;
   public static final String Iilllillll = "hunt";
   public static final double IiiIlillll = 0.6;
   public static final int IIiIlillll = 30;
   private final long[] iiIilillll;
   public static final int lliIlillll = 6;
   public static final int IiIIlillll = 20;
   public static final String Ilillillll = "reserve";
   public static final int iIlIlillll = 2;
   public static final float liIllillll = 12.0F;
   public static final double llIllillll = 8.0;
   public static final double iiiiIillll = 0.75;
   private class_243 llIilillll;
   public static final int iIiIlillll = 40;
   public static final int iilIlillll = 8;
   public static final double lIIllillll = 4.0;
   public static final int lIiIlillll = 2;
   public static final double IllIlillll = 5.5;
   public static final String iiIllillll = "counter";
   public static final double lllIlillll = 4.5;
   public static final String llillillll = "cfg";
   public static final String iIillillll = "selfdmg";
   public static final String IIillillll = "noshot";
   public static final int liiIlillll = 10;
   private String IlIilillll;
   private final Map<String, liliIIiliiliIIil> ilIilillll;
   public static final double ilIllillll = 4.0;
   public static final int iliiIillll = 2;
   public static final double iIIllillll = 4.5;
   private static final int iiillillll = 7;
   public static final double iIiiIillll = 1.0;
   public static final int IlIIlillll = 1;
   public static final double iiIIlillll = 3.0;
   public static final double IIIIlillll = 10.0;
   public static final String iIlllillll = "aggro";
   public static final String Illllillll = "low";
   public static final double lIIIlillll = 0.25;
   public static final float liiiIillll = 0.001F;
   public static final double illIlillll = 32.0;
   public static final String lIillillll = "run";
   public static final int iliIlillll = Integer.MIN_VALUE;
   private String IIIilillll = IIIillIIil<"IIIillIIil","p/Ie7+6nXKDf2hUsmeWOQeHH9wWt3lLj3JOOgVk=">();
   public static final int lilIlillll = 2;
   public static final double llIIlillll = 1.0;
   public static final double IliiIillll = 1.5;
   public static final int IIIllillll = 24;
   public static final int lIiiIillll = 3;
   public static final int iIIIlillll = 16;
   public static final int ilIIlillll = 2;
   private final double[] liIilillll;
   public static final int IliIlillll = 8;
   public static final double IlIllillll = 4.0;
   public static final String ilillillll = "deflect";
   public static final String lIlllillll = "reach";
   public static final String illllillll = "climb";
   public static final String lilllillll = "stuck";
   private class_2338 iIIilillll;
   public static final int lliiIillll = 30;
   public static final int liIIlillll = 80;
   public static final String iilllillll = "-";

   public static String illIlIilIl(String miss) {
      if (IIIillIIil<"IIIillIIil","rxT9/eQiE8T56GVb3Vvo2c7fhKceTVxUnQEj+hTbfSheWSI=">().equals(miss)) {
         return IIIillIIil<"IIIillIIil","rxT9/eQiE8T56GVb3Vvo2c7fhKceTVxUnQEj+hTbfSheWSI=">();
      } else {
         return IIIillIIil<"IIIillIIil","v0DJfkWfFp5pQw1ShU4J/OZQ2apeOe0/kLc7qh1ipmE=">().equals(miss)
            ? IIIillIIil<"IIIillIIil","v0DJfkWfFp5pQw1ShU4J/OZQ2apeOe0/kLc7qh1ipmE=">()
            : IIIillIIil<"IIIillIIil","u0R/ZJibvPJMp5CkaUKcoFXoFvu3r94KXk7s25N1PFjEPg==">();
      }
   }

   public static int IIIIllIIIl(int eta) {
      return Math.max(0, eta) + 10;
   }

   private static llIIIIililIIIIil IlIllllIll(illlIiIiIillIiIi in) {
      long var10 = 2684050968954451174L;
      lIiiiiiiIiiiii var1 = in.IliIlllilIi();
      class_243 var2 = in.lIiiIiIlilli() != null ? in.lIiiIiIlilli() : in.IilliliilIIi();
      if (var2 == null) {
         return null;
      } else {
         lliiilIiiliiilIi var3 = var1.IilliliilIIi();
         double var4 = IliIlIIllliIlIIl.IIIIllIIIl(in.liiiIIllIl(), var2);
         var10 ^= ((long)Iilllilillli.IIIllIIliIIl(Math.max(0.0, var4 - 1.3)) << 32 ^ var10) & -1L << 32;
         IlIillllIill var7 = var1.liiiIIllIl().Illlllllilll();
         float var8 = var3.IliIlllilIi();
         var10 ^= ((long)(var7 != null && Float.isFinite(var8) && (double)var7.IliIlllilIi() >= 0.25 * (double)var8 ? 1 : 0) ^ var10) & -1L >>> 32;
         return !Iiilliiliiil(
               in.liiiIIllIl().field_1351 - var2.field_1351,
               var3.iliIiiliiiii(),
               var4,
               lilIliilIl(var1.IlIillIiilIi()),
               (int)(var10 >>> 32),
               (boolean)((int)var10)
            )
            ? null
            : new llIIIIililIIIIil(var2, 16, var4, IIIillIIil<"IIIillIIil","9pJPKN71fOmzhpV7R8sYY36cjZ6gI3DBqhSLHdew6Q==">(), true, -1);
      }
   }

   public static int Iiiiliiiiiii(double walk, int fleeing, boolean flight) {
      long var5 = 1070026557835373093L;
      var5 ^= ((long)(Math.max(1, fleeing) + 4) << 32 ^ var5) & -1L << 32;
      return !flight && Double.isFinite(walk)
         ? (int)Math.max((double)((int)(var5 >>> 32)), Math.min(30.0, Math.floor(walk) - 1.0 - 1.0))
         : Math.max((int)(var5 >>> 32), 30);
   }

   private long IIlllIlliIll(long tick) {
      return this.IiIilillll != Long.MIN_VALUE && tick >= this.IiIilillll ? tick - this.IiIilillll : -1L;
   }

   private static llIIIIililIIIIil IIllllIlll(illlIiIiIillIiIi in) {
      if (!in.IIillIiliIil()) {
         return null;
      } else {
         class_243 var1 = in.lIiiIiIlilli() != null ? in.lIiiIiIlilli() : in.IilliliilIIi();
         if (var1 == null) {
            return null;
         } else {
            double var2 = IliIlIIllliIlIIl.IIIIllIIIl(in.liiiIIllIl(), var1);
            return !IiIiliIiiiIi(true, var1.field_1351 - in.liiiIIllIl().field_1351, var2)
               ? null
               : new llIIIIililIIIIil(var1, 80, var2, IIIillIIil<"IIIillIIil","wsjirQRGxQTYaViC8RizRvIRHBvVR8/+iqvFus/g45PM">(), true, -1);
         }
      }
   }

   public lilIlIlliilIlIll() {
      this.ilIilillll = new HashMap<>();
      this.IiIilillll = Long.MIN_VALUE;
      this.liIilillll = new double[7];
      this.iiIilillll = Iilllilliill();
   }

   public static boolean IiIlliIliiIl(String why, double h) {
      long var5 = 4584251713444512524L;
      if (why != null && h >= 8.0) {
         var5 ^= (-4294967296L ^ var5) & -1L << 32;
         switch (why.hashCode()) {
            case -52151785:
               if (why.equals(IIIillIIil<"IIIillIIil","1TzbJOucexo8e3LNJs/bKlmfx1RQVeBi4oTjyIE1dtEp/4o=">())) {
                  var5 ^= (25769803776L ^ var5) & -1L << 32;
               }
               break;
            case 107348:
               if (why.equals(IIIillIIil<"IIIillIIil","9pJPKN71fOmzhpV7R8sYY36cjZ6gI3DBqhSLHdew6Q==">())) {
                  var5 ^= (21474836480L ^ var5) & -1L << 32;
               }
               break;
            case 3214227:
               if (why.equals(IIIillIIil<"IIIillIIil","VwFqOTg/QXhthWtKxYjDaYHBm/7htL2/nTk+5oOwMa8=">())) {
                  var5 ^= (0L ^ var5) & -1L << 32;
               }
               break;
            case 94750389:
               if (why.equals(IIIillIIil<"IIIillIIil","1LProJF7bcbIL8Zy+J/I3FNgR6i+gXUZje0qkgsFF6vt">())) {
                  var5 ^= (12884901888L ^ var5) & -1L << 32;
               }
               break;
            case 108386675:
               if (why.equals(IIIillIIil<"IIIillIIil","3YPRRZZVTx8k/wjnzLcS/epSykOas3dcijzF27wdCrJ+">())) {
                  var5 ^= (8589934592L ^ var5) & -1L << 32;
               }
               break;
            case 109776284:
               if (why.equals(IIIillIIil<"IIIillIIil","wsjirQRGxQTYaViC8RizRvIRHBvVR8/+iqvFus/g45PM">())) {
                  var5 ^= (17179869184L ^ var5) & -1L << 32;
               }
               break;
            case 957830652:
               if (why.equals(IIIillIIil<"IIIillIIil","csg58E5k1g/T4uQ7HfWr/SYobY3tFXnbC14empgQsYC8HJc=">())) {
                  var5 ^= (4294967296L ^ var5) & -1L << 32;
               }
         }
         return switch ((int)(var5 >>> 32)) {
            case 0, 1, 2, 3, 4, 5, 6 -> true;
            default -> false;
         };
      } else {
         return false;
      }
   }

   public static boolean llIIlilIIl(float ehp, int epf, float style, boolean totem, int res) {
      return IiIIlliIIl(ehp, epf, style, totem, res, 0);
   }

   public static int IllIllllIl(boolean flight, double eta, int stuck) {
      long var7 = -1255732315533468145L;
      var7 ^= ((long)Math.max(1, stuck + 4) << 32 ^ var7) & -1L << 32;
      if (!flight && Double.isFinite(eta)) {
         long var5 = (long)Math.floor(eta) - 15L;
         return (int)Math.max((long)((int)(var7 >>> 32)), Math.min(30L, var5));
      } else {
         return Math.max((int)(var7 >>> 32), 30);
      }
   }

   private static llIIIIililIIIIil iIlllIllll(illlIiIiIillIiIi in) {
      long var7 = -8671448761607228082L;
      lIiiiiiiIiiiii var1 = in.IliIlllilIi();
      if (var1.lIiiIiIlilli() != null && var1.lIiiIiIlilli().Illlllllilll()) {
         iIlIiiIiIllIiiIi var2 = var1.lIiiIiIlilli().IIlllIlliIll(40, var1.iliIiiliiiii(), var1.IIIllIIliIIl(), ilillIiill(in), null);
         if (var2 == null) {
            return null;
         } else {
            var7 ^= ((long)Math.min(var2.iIlIlllllill(), var2.liiiIIllIl() - 1) << 32 ^ var7) & -1L << 32;
            if ((int)(var7 >>> 32) < 3) {
               return null;
            } else {
               liIIiIlliiIIiIll var4 = var2.IliIlllilIi((int)(var7 >>> 32));
               double var5 = IliIlIIllliIlIIl.iIIIlIlIIl(in.liiiIIllIl().field_1352, in.liiiIIllIl().field_1350, var4.IliIlllilIi(), var4.iIlIlllllill());
               if (lilliiiillii.iliIiiliiiii(in.liiiIIllIl().field_1351, var4.liiiIIllIl(), var5)) {
                  return null;
               } else {
                  return IIillIiliIil(var5, (int)(var7 >>> 32), var4.liiiIIllIl() - in.liiiIIllIl().field_1351)
                     ? null
                     : new llIIIIililIIIIil(
                        liilliiill(var4),
                        Math.max(1, (int)(var7 >>> 32) - 1),
                        var5,
                        IIIillIIil<"IIIillIIil","1TzbJOucexo8e3LNJs/bKlmfx1RQVeBi4oTjyIE1dtEp/4o=">(),
                        false,
                        (int)(var7 >>> 32)
                     );
               }
            }
         }
      } else {
         return null;
      }
   }

   private double Illlllllilll(long tick) {
      long var5 = -631521484404587751L;
      var5 ^= ((long)Math.floorMod(tick, 7) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)Math.floorMod(tick - 6L, 7) ^ var5) & -1L >>> 32;
      return this.iiIilillll[(int)(var5 >>> 32)] == tick && this.iiIilillll[(int)var5] == tick - 6L
         ? this.liIilillll[(int)(var5 >>> 32)] - this.liIilillll[(int)var5]
         : Double.NaN;
   }

   private static double Ilillllill(Iiliiililiii nav) {
      iiilllIIIill var1 = nav.IliIlllilIi();
      return var1 != iiilllIIIill.iIilllIiIlilllIi && var1 != iiilllIIIill.llilllIiililllIi ? Double.NaN : nav.iIlIlllllill();
   }

   private static llIIIIililIIIIil iilllIIill(illlIiIiIillIiIi in) {
      long var16 = -4175096210604067452L;
      lIiiiiiiIiiiii var1 = in.IliIlllilIi();
      double var2 = in.iliIiiliiiii();
      if (!(var2 > 5.0)) {
         return null;
      } else {
         illIlIiIilIlIi var4 = var1.lIiiIiIlilli() == null ? null : var1.lIiiIiIlilli().IiIlliIliiIl();
         if (var4 == null) {
            return null;
         } else {
            liIIiIlliiIIiIll var5 = var4.IliIlllilIi();
            class_243 var6 = ilillIiill(in);
            double var7 = iliiiillIiiiiill.iIiliIlili(var5.IilliliilIIi(), var5.iliIiiliiiii(), var6.field_1352, var6.field_1350);
            iIlIiiIiIllIiiIi var9 = var1.lIiiIiIlilli().IIlllIlliIll(16, var1.iliIiiliiiii(), var1.IIIllIIliIIl(), var6, null);
            if (var9 == null) {
               return null;
            } else {
               liIIiIlliiIIiIll var10 = var9.IliIlllilIi(6);
               double var11 = IliIlIIllliIlIIl.iIIIlIlIIl(in.liiiIIllIl().field_1352, in.liiiIIllIl().field_1350, var10.IliIlllilIi(), var10.iIlIlllllill());
               if (!iliiiillIiiiiill.IiIliliIli(var2, var7, var11)) {
                  return null;
               } else {
                  var16 ^= ((long)Iilllilillli.IIIllIIliIIl(Math.max(0.0, var2 - 1.3)) << 32 ^ var16) & -1L << 32;
                  liIIiIlliiIIiIll var14 = var9.IliIlllilIi((int)(var16 >>> 32) + 1);
                  var16 ^= ((long)Math.max(1, (int)Math.ceil(iliiiillIiiiiill.llIliilIli(var2))) ^ var16) & -1L >>> 32;
                  return new llIIIIililIIIIil(
                     liilliiill(var14), (int)var16, var2, IIIillIIil<"IIIillIIil","72no+6NpvOeYUnAQFcbAFEZVcnU1sTyKI/TjylrLe+F/">(), false, -1
                  );
               }
            }
         }
      }
   }

   public static boolean lIlIliIlIl(class_243 missedCentre, class_243 missTick, long tick, long centre) {
      return missedCentre != null && missTick != null && centre != Long.MIN_VALUE && tick >= centre
         ? tick - centre < 2L && missedCentre.method_1022(missTick) <= 1.2
         : false;
   }

   private static llIIIIililIIIIil lllllillll(illlIiIiIillIiIi in) {
      long var16 = 2661789024461078482L;
      long var14 = 8148580569689458022L;
      lIiiiiiiIiiiii var1 = in.IliIlllilIi();
      class_243 var2 = in.lIiiIiIlilli() != null ? in.lIiiIiIlilli() : in.IilliliilIIi();
      if (var2 == null) {
         return null;
      } else {
         Iiliiililiii var3 = var1.IlIillIiilIi();
         double var4 = IliIlIIllliIlIIl.IIIIllIIIl(in.liiiIIllIl(), var2);
         var14 ^= ((long)Iilllilillli.IIIllIIliIIl(Math.max(0.0, var4 - 1.3)) << 32 ^ var14) & -1L << 32;
         var14 ^= ((long)(var3 == null ? 0 : var3.liiiIIllIl()) ^ var14) & -1L >>> 32;
         double var8 = var3 == null ? Double.NaN : Ilillllill(var3);
         double var10 = var2.field_1351 - in.liiiIIllIl().field_1351;
         var16 ^= ((long)in.IIlllIlliIll() << 32 ^ var16) & -1L << 32;
         if (!Ililllililil((int)var14, (int)(var16 >>> 32), var10, in.Illlllllilll(), var8, (int)(var14 >>> 32))) {
            return null;
         } else {
            var16 ^= ((long)Ililllililil((int)var14, (int)(var16 >>> 32), var10, in.Illlllllilll(), Double.NaN, (int)(var14 >>> 32)) ^ var16) & -1L >>> 32;
            return new llIIIIililIIIIil(
               var2,
               IllIllllIl((boolean)((int)var16), var8, (int)(var14 >>> 32)),
               var4,
               IIIillIIil<"IIIillIIil","3YPRRZZVTx8k/wjnzLcS/epSykOas3dcijzF27wdCrJ+">(),
               true,
               -1
            );
         }
      }
   }

   private static class_243 liilliiill(liIIiIlliiIIiIll s) {
      return new class_243(s.IliIlllilIi(), s.liiiIIllIl(), s.iIlIlllllill());
   }

   public static boolean Iilililiiili(double closing, double walk, double flight, int save, int stuck, boolean aim, int h) {
      if (!(closing > 5.5) || closing > 32.0 || Double.isNaN(walk)) {
         return false;
      } else if (aim) {
         return true;
      } else if (!(walk < 0.15)) {
         return false;
      } else if (walk < -0.05) {
         return true;
      } else {
         return !Double.isFinite(flight) ? true : flight - (double)(Math.max(1, save) + Math.max(0, stuck) + 1) >= (double)h;
      }
   }

   public llIiiliilIiili IliIlllilIi(illlIiIiIillIiIi in) {
      long var28 = 3582902335304698631L;
      long var30 = -2749940611421898651L;
      this.IIIilillll = IIIillIIil<"IIIillIIil","p/Ie7+6nXKDf2hUsmeWOQeHH9wWt3lLj3JOOgVk=">();
      if (in != null && in.IliIlllilIi() != null && in.liiiIIllIl() != null) {
         lIiiiiiiIiiiii var2 = in.IliIlllilIi();
         if (var2.liiiIIllIl() != null && var2.IilliliilIIi() != null && var2.iIlIlllllill() != null) {
            llIIIIililIIIIil var3 = IiiIlliiIl(in);
            if (var3 == null) {
               var3 = this.lIIlliIIll(in);
            }

            if (var3 == null) {
               var3 = IlIllllIll(in);
            }

            if (var3 == null) {
               var3 = liIlliiIll(in);
            }

            if (var3 == null) {
               var3 = IIllllIlll(in);
            }

            if (var3 == null) {
               var3 = iIlllIllll(in);
            }

            if (var3 == null) {
               var3 = lllllillll(in);
            }

            if (var3 == null) {
               var3 = ilIllIiIll(in);
            }

            llilIlIlililIlIl var4 = var2.liiiIIllIl().Iiilliiliiil();
            IlIIIlilllIIIlil var5 = var4 == null ? null : (var4.IliIlllilIi() == null ? IlIIIlilllIIIlil.iliIiilIil : var4.IliIlllilIi());
            var28 ^= (
                  (long)(
                           var5 == IlIIIlilllIIIlil.iliIiilIil && iliIiiliiiii(this.IIlllIlliIll(var2.IliIlllilIi()), this.Illlllllilll(var2.IliIlllilIi()))
                              ? 1
                              : 0
                        )
                        << 32
                     ^ var28
               )
               & -1L << 32;
            var28 ^= ((long)(var3 != null ? 0 : 1) ^ var28) & -1L >>> 32;
            if (var3 == null) {
               var3 = Iillllilll(in, (boolean)((int)(var28 >>> 32)));
            }

            if (var3 == null) {
               var3 = iilllIIill(in);
            }

            if (var3 == null) {
               return null;
            } else {
               if ((int)var28 == 1 && !IIIillIIil<"IIIillIIil","VwFqOTg/QXhthWtKxYjDaYHBm/7htL2/nTk+5oOwMa8=">().equals(var3.IilliliilIIi())) {
                  var28 ^= (2L ^ var28) & -1L >>> 32;
               }

               lliiilIiiliiilIi var8 = var2.IilliliilIIi();
               if (var4 != null && var4.lIiiIiIlilli() && var2.IlIlllIlilIl() != null) {
                  var30 ^= ((long)(var2.liiiIIllIl().IliIlllilIi().iiIIlIIlIl() && var2.liiiIIllIl().IIlllIlliIll() < 2 ? 1 : 0) << 32 ^ var30) & -1L << 32;
                  if (var8.IIiilIiiiIii() && Illillliilli(var4.IiIlliIliiIl(), var8, (boolean)((int)(var30 >>> 32)))) {
                     IilliIIllilliIIl var10 = var2.liiiIIllIl().IilliliilIIi(iIlIIIIiIllIIIIi.lIIIiiIiil);
                     if (!var10.iIlIlllllill() && IIIillIIil<"IIIillIIil","zUkPXsGLbq3Xsfuo48E+hbF0F2LUdH7gh1Or2qorEqFMrY4o">().equals(var10.IlIlllIlilIl())) {
                        return this.IIiIllIiIl(IIIillIIil<"IIIillIIil","zUkPXsGLbq3Xsfuo48E+hbF0F2LUdH7gh1Or2qorEqFMrY4o">());
                     } else {
                        Iiliiililiii var11 = var2.IlIillIiilIi();
                        lIlIilIiiIlIilIi var12 = var11 == null ? null : var11.iliIiiliiiii();
                        if (var12 != null
                           && var12 != lIlIilIiiIlIilIi.liIiiIlIIi
                           && !IiIIlliIIl(
                              var12.iIlIlllllill(),
                              var12.IilliliilIIi(),
                              var8.IliIlllilIi(),
                              var8.Iilllilliill() && var8.IIillIiliIil() >= 1,
                              var12.IiIlliIliiIl(),
                              var8.Iilllilliill() ? var8.IIillIiliIil() : 0
                           )
                           && !IIIllIIliIIl(var12.iIlIlllllill(), var12.IilliliilIIi(), var8.IliIlllilIi(), var2.liiiIIllIl().IliIlllilIi())) {
                           return this.IIiIllIiIl(IIIillIIil<"IIIillIIil","b2eAy0B8w+CGFAzfm2K+Pb2h2T4cX9vrcIo+fSxd3E1z6KE=">());
                        } else {
                           long var13 = var2.IliIlllilIi();
                           Iiiiilliiiil var15 = var2.IlIlllIlilIl();
                           iIiIlIliIl(var2, var15, var13);

                           try {
                              String var16 = null;

                              while (var3 != null) {
                                 iIiIiilIliIiil var17 = null;
                                 class_2338 var18 = null;
                                 String var19 = null;
                                 if (this.lIIilillll != null
                                    && var3.IilliliilIIi().equals(this.IlIilillll)
                                    && iiIIlIIlIl(this.llIilillll, var3.IliIlllilIi(), var13, this.lIIilillll.iliIiiliiiii())
                                    && !var15.lIiiIiIlilli(this.lIIilillll)) {
                                    var17 = this.lIIilillll;
                                    var18 = this.iIIilillll;
                                 } else {
                                    liliIIiliiliIIil var20 = this.ilIilillll.get(var3.IilliliilIIi());
                                    String var21 = var20 == null
                                       ? IIIillIIil<"IIIillIIil","u0R/ZJibvPJMp5CkaUKcoFXoFvu3r94KXk7s25N1PFjEPg==">()
                                       : var20.iIlIlllllill();
                                    if (var20 != null && lIlIliIlIl(var20.liiiIIllIl(), var3.IliIlllilIi(), var13, var20.IliIlllilIi())) {
                                       IIilIilllIilIill var38 = IIIillIIil<"IIIillIIil","rxT9/eQiE8T56GVb3Vvo2c7fhKceTVxUnQEj+hTbfSheWSI=">().equals(var21)
                                          ? var15.iliIiiliiiii(var13, var3.IilliliilIIi())
                                          : null;
                                       if (var38 == null) {
                                          var19 = var21;
                                       } else {
                                          var17 = var38.IliIlllilIi();
                                          var18 = var38.liiiIIllIl();
                                       }
                                    } else {
                                       var15.IliIlllilIi(in.IilliliilIIi());
                                       var15.iIlIlllllill(var3.IilliliilIIi());
                                       iiilIlilIIIiIlil var22 = lliIliliIl(var3.IilliliilIIi(), var8);
                                       class_243 var23 = var3.IliIlllilIi().method_1031(0.0, 1.62, 0.0);
                                       class_243 var24 = lIilliIill(var3.IilliliilIIi(), var3.IliIlllilIi(), in);
                                       if (!IIIillIIil<"IIIillIIil","csg58E5k1g/T4uQ7HfWr/SYobY3tFXnbC14empgQsYC8HJc=">().equals(var3.IilliliilIIi())
                                          && in.Iilllilliill() != null) {
                                          IIilIilllIilIill var25 = var15.IiIlliIliiIl(
                                             var3.IliIlllilIi(),
                                             var24,
                                             var3.liiiIIllIl(),
                                             var13,
                                             var2.iliIiiliiiii(),
                                             var2.IIlllIlliIll(),
                                             var2.Illlllllilll(),
                                             var8,
                                             1.2,
                                             var3.IilliliilIIi(),
                                             var22,
                                             var23,
                                             in.Iilllilliill()
                                          );
                                          if (var25 != null) {
                                             var17 = var25.IliIlllilIi();
                                             var18 = var25.liiiIIllIl();
                                          }
                                       }

                                       if (var17 == null) {
                                          var17 = var15.IlIlllIlilIl(
                                             var3.IliIlllilIi(),
                                             var24,
                                             var3.liiiIIllIl(),
                                             var13,
                                             var2.iliIiiliiiii(),
                                             var2.IIlllIlliIll(),
                                             var2.Illlllllilll(),
                                             var8,
                                             1.2,
                                             var3.IilliliilIIi(),
                                             var22,
                                             var23
                                          );
                                       }

                                       long var39 = var20 == null ? Long.MIN_VALUE : var20.IilliliilIIi();
                                       if (var17 == null && IiIlliIliiIl(var3.IilliliilIIi(), var3.iIlIlllllill()) && IlIlllIlilIl(var13, var39)) {
                                          var17 = var15.IlIlllIlilIl(
                                             var3.IliIlllilIi(),
                                             var24,
                                             var3.liiiIIllIl(),
                                             var13,
                                             var2.iliIiiliiiii(),
                                             var2.IIlllIlliIll(),
                                             var2.Illlllllilll(),
                                             var8,
                                             1.2,
                                             var3.IilliliilIIi(),
                                             var22,
                                             null
                                          );
                                          var39 = var17 == null ? var13 : Long.MIN_VALUE;
                                       }

                                       if (var17 == null) {
                                          var21 = illIlIilIl(var15.IilliliilIIi());
                                          this.ilIilillll.put(var3.IilliliilIIi(), new liliIIiliiliIIil(var13, var3.IliIlllilIi(), var21, var39));
                                          var19 = var21;
                                       }
                                    }

                                    if (var17 != null) {
                                       this.ilIilillll.remove(var3.IilliliilIIi());
                                       this.lIIilillll = var17;
                                       this.iIIilillll = var18;
                                       this.IlIilillll = var3.IilliliilIIi();
                                       this.llIilillll = var3.IliIlllilIi();
                                    }
                                 }

                                 if (var17 != null) {
                                    var30 ^= (
                                          (long)iliiiillIiiiiill.lIlliiIlli(
                                                liiIIliliiiIIlil.Iilllilliill(in.IlIlllIlilIl(), in.IiIlliIliiIl(), var17.IliIlllilIi(), var17.liiiIIllIl())
                                             )
                                             ^ var30
                                       )
                                       & -1L >>> 32;
                                    if (var3.lIiiIiIlilli()
                                       || var2.liiiIIllIl().IliIlllilIi().iiIIlIIlIl()
                                       || iliiiillIiiiiill.iiIliIIlli(var17.IilliliilIIi(), (int)var30, var3.iIlIlllllill())) {
                                       return new llIiiliilIiili(var17, var3.IilliliilIIi(), var3.IliIlllilIi(), var3.iliIiiliiiii(), var18);
                                    }

                                    var19 = IIIillIIil<"IIIillIIil","gWoZAbkG+VhryH+sOMJsvc5uJcG3djUSf/PdryGYig==">();
                                 }

                                 if (var16 == null) {
                                    var16 = var19;
                                 }

                                 llIIIIililIIIIil var35 = null;

                                 while (var35 == null && (int)var28 < 2) {
                                    int var10000 = (int)var28;
                                    var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32;
                                    var35 = var10000 == 0 ? Iillllilll(in, (boolean)((int)(var28 >>> 32))) : iilllIIill(in);
                                 }

                                 var3 = var35;
                                 if (var35 != null) {
                                    iIiIlIliIl(var2, var15, var13);
                                 }
                              }

                              return this.IIiIllIiIl(var16);
                           } finally {
                              var15.liiiIIllIl(null, 0, 0.0);
                           }
                        }
                     }
                  } else {
                     return this.IIiIllIiIl(IIIillIIil<"IIIillIIil","tKVYxOzWoooC8OPHGRfMF+Gl5vO+ruPwOmdluF/AyXrDboA=">());
                  }
               } else {
                  return this.IIiIllIiIl(IIIillIIil<"IIIillIIil","7yGkCqNFJtF/lBb/5PHlHFBcRfYHiNDOY9gKJ2WkGQ==">());
               }
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static void iIiIlIliIl(lIiiiiiiIiiiii tick, Iiiiilliiiil planner, long c) {
      iliilIlIiiilIl var4 = tick.IIlllIlliIll();
      iillilIIilil var5 = var4 == null ? null : var4.liiiIIllIl(tick.iIlIlllllill().iIlIlllllill());
      iIilIiIiIlilIiIi var6 = var5 == null ? null : var5.iIlIlllllill(c);
      if (var6 == null) {
         planner.liiiIIllIl(null, 0, 0.0);
      } else {
         planner.liiiIIllIl(var6, var5.IilliliilIIi(c) - 2, var6.IIlllIlliIll());
      }
   }

   private static llIIIIililIIIIil liIlliiIll(illlIiIiIillIiIi in) {
      lIiiiiiiIiiiii var1 = in.IliIlllilIi();
      Iiliiililiii var2 = var1.IlIillIiilIi();
      if (var2 == null) {
         return null;
      } else {
         class_243 var3 = in.lIiiIiIlilli() != null ? in.lIiiIiIlilli() : in.IilliliilIIi();
         if (var3 == null) {
            return null;
         } else {
            double var4 = IliIlIIllliIlIIl.IIIIllIIIl(in.liiiIIllIl(), var3);
            return !IlIillIiilIi(var2.liiiIIllIl(), var3.field_1351 - in.liiiIIllIl().field_1351, var4)
               ? null
               : new llIIIIililIIIIil(var3, 80, var4, IIIillIIil<"IIIillIIil","1LProJF7bcbIL8Zy+J/I3FNgR6i+gXUZje0qkgsFF6vt">(), true, -1);
         }
      }
   }

   public static boolean iiIIlIIlIl(class_243 prevLanding, class_243 tick, long validUntil, long newLanding) {
      return prevLanding != null && tick != null && validUntil <= newLanding ? prevLanding.method_1022(tick) <= 1.2 : false;
   }

   private static class_243 lIilliIill(String centre, class_243 why, illlIiIiIillIiIi in) {
      if (!IIIillIIil<"IIIillIIil","VwFqOTg/QXhthWtKxYjDaYHBm/7htL2/nTk+5oOwMa8=">().equals(centre)
         && !IIIillIIil<"IIIillIIil","72no+6NpvOeYUnAQFcbAFEZVcnU1sTyKI/TjylrLe+F/">().equals(centre)) {
         return in.liiiIIllIl();
      } else {
         lIiiiiiiIiiiii var3 = in.IliIlllilIi();
         illIlIiIilIlIi var4 = var3.lIiiIiIlilli() == null ? null : var3.lIiiIiIlilli().IiIlliIliiIl();
         if (var4 == null) {
            return in.liiiIIllIl();
         } else {
            liIIiIlliiIIiIll var5 = var4.IliIlllilIi();
            class_243 var6 = ilillIiill(in);
            return iIIIlIlIIl(
               why,
               in.liiiIIllIl(),
               var5.IilliliilIIi(),
               var5.iliIiiliiiii(),
               iliiiillIiiiiill.iIiliIlili(var5.IilliliilIIi(), var5.iliIiiliiiii(), var6.field_1352, var6.field_1350)
            );
         }
      }
   }

   public static boolean IIIilIIiiIIi(boolean rel, double onGround, double above, int flight, int h) {
      return !rel && onGround >= 1.0 && above <= 10.0 ? flight >= Math.max(1, h) + 1 + 1 + 2 : false;
   }

   public static int Iliilliiilii(int flight) {
      return Math.max(1, flight) + 2;
   }

   private static llIIIIililIIIIil ilIllIiIll(illlIiIiIillIiIi in) {
      long var11 = -4027395561108910392L;
      lIiiiiiiIiiiii var1 = in.IliIlllilIi();
      class_243 var2 = in.lIiiIiIlilli() != null ? in.lIiiIiIlilli() : in.IilliliilIIi();
      if (var2 == null) {
         return null;
      } else {
         lliiilIiiliiilIi var3 = var1.IilliliilIIi();
         double var4 = IliIlIIllliIlIIl.IIIIllIIIl(in.liiiIIllIl(), var2);
         var11 ^= ((long)Iilllilillli.IIIllIIliIIl(Math.max(0.0, var4 - 1.3)) << 32 ^ var11) & -1L << 32;
         double var7 = in.liiiIIllIl().field_1351 - var2.field_1351;
         class_243 var9 = var3.lIiiIiIlilli();
         var11 ^= ((long)lilliiiillii.IIIllIIliIIl(var3.iliIiiliiiii(), var9 == null ? 0.0 : var9.field_1351, var7 - 0.75) ^ var11) & -1L >>> 32;
         return !IIIilIIiiIIi(var3.iliIiiliiiii(), var7, var4, (int)var11, (int)(var11 >>> 32))
            ? null
            : new llIIIIililIIIIil(
               var2, Math.max(1, Math.min(16, (int)var11 - 1)), var4, IIIillIIil<"IIIillIIil","9pJPKN71fOmzhpV7R8sYY36cjZ6gI3DBqhSLHdew6Q==">(), true, -1
            );
      }
   }

   public static boolean Iiilliiliiil(double walkEta, boolean h, double rel, double underFire, int onGround, boolean flight) {
      return h && walkEta >= 0.75 && rel <= 10.0 ? lilliiiillii.IlIlllIlilIl(underFire, onGround, 1, true, flight, true) == IiIIIIliliIIIIli.IlliiIIlIi : false;
   }

   private static long[] Iilllilliill() {
      long[] var0 = new long[7];
      Arrays.fill(var0, Long.MIN_VALUE);
      return var0;
   }

   public static int IIlilIliiIli(boolean totems, int ehp, float escapePearls) {
      return totems && ehp <= 0 && !(escapePearls > 12.0F) ? 1 : 0;
   }

   public void lIiiIiIlilli(long tick) {
      this.IiIilillll = Long.MIN_VALUE;
   }

   public static boolean IlIillIiilIi(int h, double dy, double unreachableFor) {
      return h >= 20 && dy >= 3.0 && unreachableFor <= 16.0;
   }

   private static llIIIIililIIIIil IiiIlliiIl(illlIiIiIillIiIi in) {
      long var8 = -5009743542330353588L;
      lIiiiiiiIiiiii var1 = in.IliIlllilIi();
      if (var1.IiIlliIliiIl() == null) {
         return null;
      } else {
         ililIlIiIiilIlIi var2 = var1.IiIlliIliiIl().iliIiiliiiii(var1.iIlIlllllill().iIlIlllllill());
         if (var2 == null) {
            return iiiIlIIIll(in);
         } else if (var2.iIlIlllllill() == null) {
            return null;
         } else {
            double var3 = IliIlIIllliIlIIl.IIIIllIIIl(in.liiiIIllIl(), var2.iIlIlllllill());
            if (!(var3 > 5.0)) {
               return null;
            } else {
               long var5 = var2.iliIiiliiiii() == Long.MIN_VALUE ? 0L : Math.max(0L, var1.IliIlllilIi() - var2.iliIiiliiiii());
               var8 ^= ((long)((int)Math.max(0L, (long)var2.IilliliilIIi() - var5)) << 32 ^ var8) & -1L << 32;
               return new llIIIIililIIIIil(
                  var2.iIlIlllllill(),
                  IIIIllIIIl((int)(var8 >>> 32)),
                  var3,
                  IIIillIIil<"IIIillIIil","csg58E5k1g/T4uQ7HfWr/SYobY3tFXnbC14empgQsYC8HJc=">(),
                  true,
                  (int)(var8 >>> 32)
               );
            }
         }
      }
   }

   public static boolean IiIiliIiiiIi(boolean dy, double stuck, double h) {
      return dy && Double.isFinite(stuck) && Double.isFinite(h) && h <= 16.0 && !iliiiillIiiiiill.iIlIlllllill(stuck, h);
   }

   public static boolean Ililllililil(int dy, int unreachableFor, double flight, boolean rangeOption, double eta, int blocked) {
      if (dy >= 6) {
         return true;
      } else {
         return unreachableFor >= 6 && flight <= -1.5 && !rangeOption ? true : Double.isFinite(eta) && eta - (double)blocked >= 15.0;
      }
   }

   private llIIIIililIIIIil lIIlliIIll(illlIiIiIillIiIi in) {
      if (this.lIIilillll != null && this.IlIilillll != null && this.llIilillll != null && this.lIIilillll.iIlIlllllill() != null) {
         lIiiiiiiIiiiii var2 = in.IliIlllilIi();
         if (var2.liiiIIllIl().IlIillIiilIi() == iIlIIIIiIllIIIIi.lIIIiiIiil && var2.IliIlllilIi() <= this.lIIilillll.iliIiiliiiii()) {
            class_243 var3 = in.lIiiIiIlilli() != null ? in.lIiiIiIlilli() : in.IilliliilIIi();
            if (var3 == null || !(in.iliIiiliiiii() > 4.0)) {
               return null;
            } else {
               return IliIlIIllliIlIIl.IIIIllIIIl(var3, this.lIIilillll.iIlIlllllill()) > 4.5
                  ? null
                  : new llIIIIililIIIIil(this.llIilillll, Math.max(1, this.lIIilillll.IilliliilIIi()), in.iliIiiliiiii(), this.IlIilillll, true, -1);
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static boolean IIillIiliIil(double h, int land, double dy) {
      return !Double.isNaN(h) && !Double.isNaN(dy) ? !(h - 0.28 * (double)Math.max(0, land) > 3.5) && !(Math.abs(dy) > 1.0) : true;
   }

   public static boolean IiIIlliIIl(float epf, int res, float totems, boolean totem, int style, int ehp) {
      long var10 = 8664824250479721238L;
      if (!Float.isFinite(totems)) {
         return false;
      } else {
         float[] var6 = iililIlIIiilIl.lilllIllliilllIlll;
         var10 ^= ((long)Math.max(0, Math.min(var6.length - 1, style)) << 32 ^ var10) & -1L << 32;
         float var8 = totem && ehp >= 2 ? 1.5F : (totem ? 4.0F : 8.0F);
         float var9 = Math.min(var6[(int)(var10 >>> 32)], totems - var8);
         return lllllillillllill.liiiIIllIl(epf, res) <= var9 + 0.001F;
      }
   }

   private llIiiliilIiili IIiIllIiIl(String why) {
      this.IIIilillll = why;
      return null;
   }

   public void IilliliilIIi(long closing, double h, double tick) {
      long var8 = -4501711554981890253L;
      if (!(h > 5.5) || !(tick < 0.15)) {
         this.IiIilillll = Long.MIN_VALUE;
      } else if (this.IiIilillll == Long.MIN_VALUE) {
         this.IiIilillll = closing;
      }

      var8 ^= ((long)Math.floorMod(closing, 7) << 32 ^ var8) & -1L << 32;
      this.liIilillll[(int)(var8 >>> 32)] = h;
      this.iiIilillll[(int)(var8 >>> 32)] = closing;
   }

   public static boolean Illillliilli(boolean escapePearls, lliiilIiiliiilIi refSolo, boolean self) {
      long var4 = -6339636009437163092L;
      if (refSolo == null) {
         return true;
      } else {
         var4 ^= ((long)(self ? 0 : IIlilIliiIli(escapePearls, refSolo.IIillIiliIil(), refSolo.IliIlllilIi())) << 32 ^ var4) & -1L << 32;
         return refSolo.Illillliilli() <= (int)(var4 >>> 32) ? false : (double)refSolo.IliIlllilIi() > 6.0 || refSolo.Iilllilliill();
      }
   }

   private static class_243 ilillIiill(illlIiIiIillIiIi in) {
      return in.IIIllIIliIIl() == null ? class_243.field_1353 : in.IIIllIIliIIl();
   }

   public static int IIiilIiiiIii(IlIIIlilllIIIlil style) {
      return style != null && style != IlIIIlilllIIIlil.iliIiilIil ? 8 : 2;
   }

   private static llIIIIililIIIIil Iillllilll(illlIiIiIillIiIi in, boolean press) {
      long var32 = -4659703161654785704L;
      long var34 = 6666045549643670810L;
      long var28 = 2626189933488684883L;
      long var30 = -781270802784413421L;
      lIiiiiiiIiiiii var2 = in.IliIlllilIi();
      double var3 = in.iliIiiliiiii();
      var28 ^= ((long)var2.liiiIIllIl().IliIlllilIi().iiIIlIIlIl() << 32 ^ var28) & -1L << 32;
      if (var3 > ((int)(var28 >>> 32) != 0 ? 4.5 : 5.5) && var2.lIiiIiIlilli() != null) {
         illIlIiIilIlIi var6 = var2.lIiiIiIlilli().IiIlliIliiIl();
         if (var6 == null) {
            return null;
         } else {
            liIIiIlliiIIiIll var7 = var6.IliIlllilIi();
            class_243 var8 = ilillIiill(in);
            double var9 = iliiiillIiiiiill.iIiliIlili(var7.IilliliilIIi(), var7.iliIiiliiiii(), var8.field_1352, var8.field_1350);
            Iiliiililiii var11 = var2.IlIillIiilIi();
            var28 ^= ((long)(var11 == null || var11.IliIlllilIi() != iiilllIIIill.llilllIiililllIi && var11.liiiIIllIl() < 2 ? 0 : 1) ^ var28) & -1L >>> 32;
            double var13 = lilIliilIl(var11);
            double var15 = Double.isFinite(var13) ? var13 : iliiiillIiiiiill.llIliilIli(var3);
            var30 ^= ((long)Iilllilillli.IIIllIIliIIl(Math.max(0.0, var3 - 1.3)) << 32 ^ var30) & -1L << 32;
            llilIlIlililIlIl var18 = var2.liiiIIllIl().Iiilliiliiil();
            var30 ^= ((long)(press ? Integer.MIN_VALUE : IIiilIiiiIii(var18 == null ? null : var18.IliIlllilIi())) ^ var30) & -1L >>> 32;
            var32 ^= (
                  (long)(
                           (int)(var28 >>> 32) != 0
                              ? (in.Illlllllilll() || !(var3 <= 32.0) || Double.isNaN(var9) || !(var3 > 5.5) && (int)var28 == 0 && !(var9 < 0.15) ? 0 : 1)
                              : Iilililiiili(var3, var9, var15, (int)(var30 >>> 32), 1, (boolean)((int)var28), (int)var30)
                        )
                        << 32
                     ^ var32
               )
               & -1L << 32;
            if ((int)(var32 >>> 32) == 0) {
               return null;
            } else {
               iIlIiiIiIllIiiIi var21 = var2.lIiiIiIlilli().IIlllIlliIll(40, var2.iliIiiliiiii(), var2.IIIllIIliIIl(), var8, null);
               if (var21 == null) {
                  return null;
               } else {
                  var32 ^= ((long)(var21.liiiIIllIl() - 1) ^ var32) & -1L >>> 32;
                  liIIiIlliiIIiIll var23 = var21.IliIlllilIi(Math.min(Iliilliiilii((int)(var30 >>> 32)), (int)var32));
                  double var24 = IliIlIIllliIlIIl.iIIIlIlIIl(in.liiiIIllIl().field_1352, in.liiiIIllIl().field_1350, var23.IliIlllilIi(), var23.iIlIlllllill());
                  var34 ^= ((long)Iilllilillli.IIIllIIliIIl(Math.max(0.0, var24 - 1.3)) << 32 ^ var34) & -1L << 32;
                  if ((int)(var34 >>> 32) != (int)(var30 >>> 32)) {
                     var23 = var21.IliIlllilIi(Math.min(Iliilliiilii((int)(var34 >>> 32)), (int)var32));
                  }

                  var34 ^= ((long)(!(var9 < -0.05) && !press && (int)(var28 >>> 32) == 0 ? 0 : 1) ^ var34) & -1L >>> 32;
                  return new llIIIIililIIIIil(
                     liilliiill(var23),
                     Iiiiliiiiiii((int)var28 != 0 ? Double.NaN : var15, (int)(var34 >>> 32), (boolean)((int)var34)),
                     var3,
                     IIIillIIil<"IIIillIIil","VwFqOTg/QXhthWtKxYjDaYHBm/7htL2/nTk+5oOwMa8=">(),
                     true,
                     -1
                  );
               }
            }
         }
      } else {
         return null;
      }
   }

   public static boolean iliIiiliiiii(long grow, double age) {
      return grow >= 8L || age >= 0.6;
   }

   private static iiilIlilIIIiIlil lliIliliIl(String why, lliiilIiiliiilIi self) {
      long var4 = 8143110322622909301L;
      var4 ^= (-4294967296L ^ var4) & -1L << 32;
      switch (why.hashCode()) {
         case -52151785:
            if (why.equals(IIIillIIil<"IIIillIIil","1TzbJOucexo8e3LNJs/bKlmfx1RQVeBi4oTjyIE1dtEp/4o=">())) {
               var4 ^= (0L ^ var4) & -1L << 32;
            }
            break;
         case 107348:
            if (why.equals(IIIillIIil<"IIIillIIil","9pJPKN71fOmzhpV7R8sYY36cjZ6gI3DBqhSLHdew6Q==">())) {
               var4 ^= (8589934592L ^ var4) & -1L << 32;
            }
            break;
         case 3214227:
            if (why.equals(IIIillIIil<"IIIillIIil","VwFqOTg/QXhthWtKxYjDaYHBm/7htL2/nTk+5oOwMa8=">())) {
               var4 ^= (21474836480L ^ var4) & -1L << 32;
            }
            break;
         case 94750389:
            if (why.equals(IIIillIIil<"IIIillIIil","1LProJF7bcbIL8Zy+J/I3FNgR6i+gXUZje0qkgsFF6vt">())) {
               var4 ^= (12884901888L ^ var4) & -1L << 32;
            }
            break;
         case 108386675:
            if (why.equals(IIIillIIil<"IIIillIIil","3YPRRZZVTx8k/wjnzLcS/epSykOas3dcijzF27wdCrJ+">())) {
               var4 ^= (4294967296L ^ var4) & -1L << 32;
            }
            break;
         case 109776284:
            if (why.equals(IIIillIIil<"IIIillIIil","wsjirQRGxQTYaViC8RizRvIRHBvVR8/+iqvFus/g45PM">())) {
               var4 ^= (17179869184L ^ var4) & -1L << 32;
            }
      }
      return switch ((int)(var4 >>> 32)) {
         case 0 -> iiilIlilIIIiIlil.IilliliilIIi(iliiiillIiiiiill.lliliilili(self.Iilllilliill(), self.IIillIiliIil()));
         case 1 -> iiilIlilIIIiIlil.lIiiIiIlilli(iliiiillIiiiiill.lliliilili(self.Iilllilliill(), self.IIillIiliIil()));
         case 2 -> iiilIlilIIIiIlil.iliIiiliiiii(iliiiillIiiiiill.lliliilili(self.Iilllilliill(), self.IIillIiliIil()));
         case 3 -> iiilIlilIIIiIlil.IlIlllIlilIl(iliiiillIiiiiill.lliliilili(self.Iilllilliill(), self.IIillIiliIil()));
         case 4 -> iiilIlilIIIiIlil.IlIlllIlilIl(iliiiillIiiiiill.lliliilili(self.Iilllilliill(), self.IIillIiliIil()));
         case 5 -> iiilIlilIIIiIlil.IIIllIIliIIl(iliiiillIiiiiill.lliliilili(self.Iilllilliill(), self.IIillIiliIil()));
         default -> iiilIlilIIIiIlil.iIlIlllllill(iliiiillIiiiiill.lliliilili(self.Iilllilliill(), self.IIillIiliIil()));
      };
   }

   public String liiiIIllIl() {
      return this.IIIilillll;
   }

   public void iIlIlllllill() {
      this.IIIilillll = IIIillIIil<"IIIillIIil","p/Ie7+6nXKDf2hUsmeWOQeHH9wWt3lLj3JOOgVk=">();
      this.lIIilillll = null;
      this.iIIilillll = null;
      this.IlIilillll = null;
      this.llIilillll = null;
      this.ilIilillll.clear();
      this.IiIilillll = Long.MIN_VALUE;
      Arrays.fill(this.liIilillll, 0.0);
      Arrays.fill(this.iiIilillll, Long.MIN_VALUE);
   }

   public static boolean IlIlllIlilIl(long tick, long blindMiss) {
      return blindMiss == Long.MIN_VALUE || tick < blindMiss || tick - blindMiss >= 6L;
   }

   public static boolean IIIllIIliIIl(float ehp, int res, float t, ilIiliilIiIiliil epf) {
      if (epf != null && epf.iIIIlIlIIl() && Float.isFinite(t)) {
         float var4 = lllllillillllill.liiiIIllIl(ehp, res);
         if (epf.iiIIlIIlIl()) {
            return epf.lIiiIiIlilli(var4, t, false);
         } else {
            return ilIiliilIiIiliil.Illlllllilll(var4, t) ? false : var4 <= t - (epf.llIIlilIIl() ? 2.0F : 4.0F) + 0.001F;
         }
      } else {
         return false;
      }
   }

   public static double lilIliilIl(Iiliiililiii nav) {
      if (nav == null) {
         return Double.NaN;
      } else {
         iiilllIIIill var1 = nav.IliIlllilIi();
         return var1 != iiilllIIIill.lillllIiiillllIi && var1 != iiilllIIIill.iIilllIiIlilllIi && var1 != iiilllIIIill.llilllIiililllIi
            ? Double.NaN
            : nav.iIlIlllllill();
      }
   }

   public static class_243 iIIIlIlIIl(class_243 vz, class_243 closing, double centre, double vx, double us) {
      if (vz != null && !Double.isNaN(us) && us < -0.05) {
         double var8 = Math.sqrt(centre * centre + vx * vx);
         return !(var8 > 0.1) ? closing : new class_243(vz.field_1352 + centre / var8 * 4.0, vz.field_1351, vz.field_1350 + vx / var8 * 4.0);
      } else {
         return closing;
      }
   }

   private static llIIIIililIIIIil iiiIlIIIll(illlIiIiIillIiIi in) {
      lIiiiiiiIiiiii var1 = in.IliIlllilIi();
      ililIlIiIiilIlIi var2 = var1.IiIlliIliiIl().Illlllllilll(var1.iIlIlllllill().iIlIlllllill(), var1.IliIlllilIi(), 20);
      class_243 var3 = in.lIiiIiIlilli() != null ? in.lIiiIiIlilli() : in.IilliliilIIi();
      if (var2 != null && var2.iIlIlllllill() != null && var3 != null) {
         if (IliIlIIllliIlIIl.IIIIllIIIl(var3, var2.iIlIlllllill()) > 4.0) {
            return null;
         } else {
            double var4 = IliIlIIllliIlIIl.IIIIllIIIl(in.liiiIIllIl(), var3);
            return !(var4 > 5.0)
               ? null
               : new llIIIIililIIIIil(var3, 24, var4, IIIillIIil<"IIIillIIil","csg58E5k1g/T4uQ7HfWr/SYobY3tFXnbC14empgQsYC8HJc=">(), true, -1);
         }
      } else {
         return null;
      }
   }
}
