package gg.corz;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.IntFunction;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3726;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import net.minecraft.class_746;

public final class IiIIlIllliIIlIll {
   private final StringBuilder IIiIIillll;
   private final lIlIiIIliIlIiIIl iiIIIillll;
   private class_2338 lIIlIillll;
   public static final double lIIIIillll = 10.0;
   public static final String Iiliilllll = "sent";
   public static final double IIIIIillll = 20.0;
   public static final float Iiiiilllll = 2.0F;
   private boolean liiIIillll;
   private final iliIliilIiiIliil IIlIIillll;
   private class_2338 iiIlIillll;
   private boolean llIlIillll;
   public static final String lIliilllll = "nether";
   private final IilIllililIlli lIlIIillll;
   public static final String liliilllll = "block";
   private IlIIllllllIIllll liIlIillll;
   private long iliIIillll;
   private IlIIllllllIIllll iiiIIillll;
   private long ilIlIillll;
   private static final class_2350[] llIIIillll = class_2350.values();
   private iIiiiiilIliiiiil lliIIillll;
   private static final class_2350[] ilIIIillll = new class_2350[]{
      class_2350.field_11043, class_2350.field_11035, class_2350.field_11039, class_2350.field_11034
   };
   public static final double iiiiilllll = 3.0;
   public static final String iiliilllll = "face";
   private int lIiIIillll;
   private boolean IiiIIillll;
   public static final String iIliilllll = "quiet";
   private boolean IlIlIillll;
   private final Map<Long, Long> lllIIillll;
   private final Map<Long, Long> lilIIillll;
   private class_2338 IIIlIillll;
   private boolean iIIlIillll;
   public static final int IIiiilllll = 4;
   private final lilllllliillllll liIIIillll;
   public static final String llliilllll = "busy";
   public static final String Illiilllll = "none";
   public static final int iIiiilllll = 4;
   private int lIllIillll;
   public static final int lliiilllll = 40;
   private IntFunction<iillilIIilil> iIiIIillll;
   private final ArrayDeque<Long> IllIIillll = new ArrayDeque<>();
   private static final double IiIIIillll = 0.05;
   public static final int iliiilllll = 60;
   private final IlIIiIIillIIiIIi iIlIIillll;
   private double IiIlIillll;
   private final Map<Long, Long> IilIIillll;
   public static final double iIIIIillll = 0.3;
   public static final String iiIiilllll = "defuse";
   static final int IlIIIillll = 16;
   private int iIllIillll;
   private double IIllIillll;
   public static final String illiilllll = "spot";
   public static final int Iliiilllll = 2;
   public static final float liiiilllll = 0.15F;
   public static final int lIiiilllll = 6;
   private iiliiiIiIIiiiiIi IliIIillll;
   private final Map<Long, Long> iilIIillll;
   private final Map<Long, Long> illIIillll;
   public static final String IIliilllll = "shield";

   private static void iiiIlIIIll(Map<Long, Long> tick, class_2338 cell, long bans) {
      lIIlliIIll(tick, cell, bans, 40);
   }

   static String IIillIiliIil(IlIIllllllIIllll k) {
      return k == IlIIllllllIIllll.iiilllIill
         ? iIiilIliil<"iIiilIliil","3TPi/PIRTwrB08DGkqJPCehN6WeQgrJnVkJDlng6uPFvrQ==">()
         : (
            k == IlIIllllllIIllll.IIIillIill
               ? iIiilIliil<"iIiilIliil","t4ZWx0T15AiV2ZcuPRYb6ngpl8R4pwAPMwQvRd6U6aglyw==">()
               : iIiilIliil<"iIiilIliil","oISmMpE3ZIyC3/aaZ+eqjmG71g7dFkul14VkgzeZsYg=">()
         );
   }

   private float iiIIlIIlIl(IIllIIllIllIIl prep, IIIilIIiiIIi s, int a) {
      liiilIiliiiilIil var4 = prep.IiIlliIliiIl();
      if (var4 != null && var4.lIiiIiIlilli() != null) {
         float var5 = this.IIlIIillll.Ililllililil(s.lIiiIiIlilli());
         if (Float.isNaN(var5)) {
            if (this.lIlIIillll != null && !this.lIlIIillll.liiiIIllIl(45, 3)) {
               return 0.0F;
            }

            iIIlIIiIlIlIIi var6 = lllIliIlillIliIl.iIIilIlIil(var4.lIiiIiIlilli(), Math.max(1, a), false, true);
            var5 = IiliiIililiiIi.IliIlllilIi(var4.lIiiIiIlilli(), var6, s.lIiiIiIlilli(), null);
         }

         iiIllIlIIlllIl var7 = var4.IlIillIiilIi() == null ? iiIllIlIIlllIl.lliIilIlliliIilIll : var4.IlIillIiilIi();
         return iiIiiliIIliili.IIIllIIliIIl(var5, var7, new IilIlIIllilIlIIl(Math.max(0, prep.Iilllilliill()), var4.llIIlilIIl()), a);
      } else {
         return 0.0F;
      }
   }

   private static int Iillllilll() {
      return Math.round((float)illIllilIilIllil.IiIlliIliiIl() / 50.0F);
   }

   private iIiiiiilIliiiiil iIIIlIlIIl(IIllIIllIllIIl recent, class_746 world, class_638 s, int player) {
      if (player >= 2) {
         return null;
      } else {
         liiilIiliiiilIil var5 = recent.IiIlliIliiIl();
         iillilIIilil var6 = this.Illillliilli(var5);
         iIilIiIiIlilIiIi var7 = var6 == null ? null : var6.iIlIlllllill(recent.IIIllIIliIIl());
         if (var7 == null) {
            return null;
         } else {
            class_2338 var8 = new class_2338(var7.lIiiIiIlilli(), var7.iliIiiliiiii(), var7.IIIllIIliIIl());
            if (!IIlilIliiIli(this.iilIIillll, var8, recent.IIIllIIliIIl())) {
               return null;
            } else {
               iililiIlIIiiliIl var9 = this.llIIlilIIl(recent, var7, var8, var6.IilliliilIIi(recent.IIIllIIliIIl()), world, s, var5);
               if (!var9.IliIlllilIi().IliIlllilIi()) {
                  return null;
               } else {
                  double var10 = IiIiliIiiiIi(var9.IliIlllilIi().IilliliilIIi(), var7.IIlllIlliIll());
                  if (!(var10 > 0.0)) {
                     return null;
                  } else {
                     liliiiiliiliiiil var12 = new liliiiiliiliiiil(
                        IlIIllllllIIllll.IIIillIill, var9.IliIlllilIi().liiiIIllIl(), var9.IliIlllilIi().iIlIlllllill(), var10
                     );
                     return new iIiiiiilIliiiiil(
                        var12,
                        var9.IliIlllilIi().lIiiIiIlilli(),
                        var9.liiiIIllIl(),
                        var8,
                        iIiilIliil<"iIiilIliil","6h63RUGszTwsGdDbLXjrq3XQki3H9ID0flXODg8MPeA=">(),
                        0
                     );
                  }
               }
            }
         }
      }
   }

   private void lliIliliIl() {
      this.iIlIIillll.IiIlliIliiIl();
      this.IiiIIillll = false;
      this.liiIIillll = false;
      this.iiiIIillll = IlIIllllllIIllll.liilllIill;
      this.IIIlIillll = null;
      this.lIIlIillll = null;
      this.iIIlIillll = false;
      this.IlIlIillll = false;
      this.llIlIillll = false;
      this.ilIlIillll = 0L;
      this.IiIlIillll = 0.0;
   }

   private iIilIiIiIlilIiIi Iilililiiili(liiilIiliiiilIil tick, long t) {
      iillilIIilil var4 = this.Illillliilli(tick);
      return var4 == null ? null : var4.iIlIlllllill(t);
   }

   private static boolean ilIllIiIll(Map<Long, Long> tick, class_2338 bans, long cell) {
      Long var4 = bans == null ? null : (Long)tick.get(bans.method_10063());
      return var4 != null && var4 >= cell;
   }

   private static double lllllillll(class_243 eye, class_243 point, float pitch, float yaw) {
      float[] var4 = ilIiiIiIii.Ililllililil(eye, point);
      return liiIIliliiiIIlil.Iilllilliill(pitch, yaw, var4[0], var4[1]);
   }

   static int Iiilliiliiil(ArrayDeque<Long> ticks, long tick) {
      long var7 = -2670210672631567335L;
      var7 ^= (0L ^ var7) & -1L << 32;

      for (long var5 : ticks) {
         if (tick >= var5 && tick - var5 < 40L) {
            var7 += 4294967296L;
         }
      }

      return (int)(var7 >>> 32);
   }

   private static void lIIlliIIll(Map<Long, Long> cell, class_2338 ticks, long tick, int bans) {
      if (ticks != null) {
         cell.put(ticks.method_10063(), tick + (long)bans);
      }
   }

   private static List<class_2338> iIlllIllll(iiliiiIiIIiiiiIi c) {
      ArrayList var1 = new ArrayList(3);
      if (c == null) {
         return var1;
      } else {
         if (c.IlIlllIlilIl() != null && c.IlIlllIlilIl().IliIlllilIi() != null) {
            var1.add(c.IlIlllIlilIl().IliIlllilIi());
            var1.add(c.IlIlllIlilIl().IliIlllilIi().method_10084());
         }

         if (c.Illlllllilll() != null && c.Illlllllilll().IliIlllilIi() != null) {
            var1.add(c.Illlllllilll().IliIlllilIi());
         }

         return var1;
      }
   }

   private IiiIIlIiliiIIlIi IiIIlliIIl(IIllIIllIllIIl a, IIIilIIiiIIi player, class_746 s) {
      long var17 = 4936006415336093719L;
      if (player.iliIiiliiiii() >= 1 && player.lIiiIiIlilli() != null) {
         if (!this.liIIIillll.IiIlliIliiIl() && !s.method_6079().method_31574(class_1802.field_8801)) {
            class_243 var4 = s.method_33571();
            double var5 = this.liIIIillll.Iilllilliill();
            if (lllIliIlillIliIl.IIlilIliiIli(var4, lllIliIlillIliIl.lIiiIiIlilli(player.lIiiIiIlilli())) > var5) {
               return IiiIIlIiliiIIlIi.iiliiiiiil;
            } else {
               var17 ^= ((long)this.iiIIIillll.IilliliilIIi(lIlllIliIlllIl::iIlIlllllill, false) << 32 ^ var17) & -1L << 32;
               if ((int)(var17 >>> 32) < 0) {
                  var17 ^= ((long)this.iiIIIillll.IilliliilIIi(lliiIliliiIl::IlIillIiilIi, false) << 32 ^ var17) & -1L << 32;
               }

               if ((int)(var17 >>> 32) < 0) {
                  return IiiIIlIiliiIIlIi.iiliiiiiil;
               } else {
                  float var8 = this.liIIIillll.IliIlllilIi();
                  float var9 = this.liIIIillll.liiiIIllIl();
                  class_3965 var10 = IiIiiiilliIiiiil.liiiIIllIl(player.lIiiIiIlilli(), llIIIillll, null, var5, var8, var9);
                  if (var10 == null) {
                     return IiiIIlIiliiIIlIi.iiliiiiiil;
                  } else {
                     var17 ^= ((long)lIiIIilliIiIIill.IiIiliIiiiIi(lllllillll(var4, var10.method_17784(), var8, var9)) ^ var17) & -1L >>> 32;
                     lliiilIiiliiilIi var12 = a.IlIlllIlilIl();
                     iiIllIlIIlllIl var13 = var12.IiIlliIliiIl() == null ? iiIllIlIIlllIl.lliIilIlliliIilIll : var12.IiIlliIliiIl();
                     IilIlIIllilIlIIl var14 = new IilIlIIllilIlIIl(Math.max(0, a.IIillIiliIil()), var12.iIIIlIlIIl());
                     float var15 = iiIiiliIIliili.iliIiiliiiii(player.IIIllIIliIIl(), var13, var14, (int)var17);
                     float var16 = this.iiIIlIIlIl(a, player, (int)var17);
                     return new IiiIIlIiliiIIlIi(new lIiliIiliIiliIil(true, var15, var16, (int)var17), (int)(var17 >>> 32));
                  }
               }
            }
         } else {
            return IiiIIlIiliiIIlIi.iiliiiiiil;
         }
      } else {
         return IiiIIlIiliiIIlIi.iiliiiiiil;
      }
   }

   private static class_2338 IlIllllIll(iIiiiiilIliiiiil p) {
      return iIiilIliil<"iIiilIliil","0nBPfpKmcFCtsoIAmh34GsRGB0rGZKVW4bNyWMVvD6U=">().equals(p.lIiiIiIlilli()) && p.IliIlllilIi().liiiIIllIl() != null
         ? p.IliIlllilIi().liiiIIllIl().method_10074()
         : p.IilliliilIIi();
   }

   private iIiiiiilIliiiiil Iliilliiilii(IIllIIllIllIIl s) {
      if (this.iliIIillll == s.IIIllIIliIIl()) {
         return this.lliIIillll;
      } else {
         iIiiiiilIliiiiil var2 = this.Iiiiliiiiiii(s);
         this.lliIIillll = var2;
         this.iliIIillll = s.IIIllIIliIIl();
         if (!this.IiiIIillll) {
            this.liIlIillll = var2.IliIlllilIi().IliIlllilIi();
            this.iiIlIillll = var2.IliIlllilIi().liiiIIllIl();
            this.IIllIillll = var2.IliIlllilIi().IilliliilIIi();
         }

         return var2;
      }
   }

   public IilliIIllilliIIl iIlIlllllill(IIllIIllIllIIl s) {
      if (s == null) {
         return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.llIIiiIiil, iIiilIliil<"iIiilIliil","oISmMpE3ZIyC3/aaZ+eqjmG71g7dFkul14VkgzeZsYg=">());
      } else if (s.Ililllililil()) {
         return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.llIIiiIiil, iIiilIliil<"iIiilIliil","hX2nEuirH0hiFqPDLryjDdhBeQD9sKLvpo8zl6pgrDxfrA==">());
      } else if (!this.IiiIIillll) {
         lliiilIiiliiilIi var4 = s.IlIlllIlilIl();
         if (var4 == null || this.IIlIIillll == null) {
            return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.llIIiiIiil, iIiilIliil<"iIiilIliil","oISmMpE3ZIyC3/aaZ+eqjmG71g7dFkul14VkgzeZsYg=">());
         } else if (var4.lIlIliIlIl()) {
            return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.llIIiiIiil, iIiilIliil<"iIiilIliil","RLdnoSCMDBF+6t+6lUuFsi9EAKG1kblsvFK1SJPIBqo=">());
         } else {
            iIiiiiilIliiiiil var3 = this.Iliilliiilii(s);
            return var3.IliIlllilIi().IliIlllilIi() == IlIIllllllIIllll.liilllIill
               ? IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.llIIiiIiil, var3.lIiiIiIlilli())
               : new IilliIIllilliIIl(
                  iIlIIIIiIllIIIIi.llIIiiIiil, true, var3.IliIlllilIi().IilliliilIIi(), var3.liiiIIllIl(), false, false, var3.lIiiIiIlilli()
               );
         }
      } else {
         String var2 = this.liiIIillll && this.iiiIIillll == IlIIllllllIIllll.iiilllIill
            ? iIiilIliil<"iIiilIliil","FAZ+V01dMRGpsIFy1xp1it2bSnqIlNU00WMPkLlB0Tg=">()
            : (this.iIIlIillll ? iIiilIliil<"iIiilIliil","6h63RUGszTwsGdDbLXjrq3XQki3H9ID0flXODg8MPeA=">() : IIillIiliIil(this.iiiIIillll));
         if (this.IlIlIillll) {
            var2 = this.liiIIillll
               ? iIiilIliil<"iIiilIliil","FAZ+V01dMRGpsIFy1xp1it2bSnqIlNU00WMPkLlB0Tg=">()
               : iIiilIliil<"iIiilIliil","Q1k0RKaTs9reajnrZJDyXqd0Uky14uN7WQfPAwLJdYWG">();
         }

         return new IilliIIllilliIIl(iIlIIIIiIllIIIIi.llIIiiIiil, true, Math.max(0.0, this.IiIlIillll), 0, false, false, var2);
      }
   }

   static boolean IlIillIiilIi(float gain, float fullUs, float ehp) {
      return IIIilIIiiIIi(gain, fullUs) && Float.isFinite(ehp) && ehp >= 1.5F && ehp >= 0.4F * gain;
   }

   private iIiiiiilIliiiiil IIIIllIIIl(IIllIIllIllIIl player, class_746 world, class_638 s) {
      long var33 = -1715048198777901550L;
      long var31 = 4922099350313123675L;
      liiilIiliiiilIil var4 = player.IiIlliIliiIl();
      lliiilIiiliiilIi var5 = player.IlIlllIlilIl();
      if (var4 != null && var4.IIlllIlliIll()) {
         class_243 var6 = var4.IIIllIIliIIl() != null ? var4.IIIllIIliIIl() : var4.iliIiiliiiii();
         if (var6 == null) {
            return null;
         } else {
            class_2338 var7 = class_2338.method_49637(var6.field_1352, var6.field_1351 + 0.001, var6.field_1350);
            if (!iliiiillIiiiiill.llIIlilIIl(IilIilllilIill.lIiiIiIlilli(s, var7), true)) {
               return null;
            } else {
               class_243 var8 = var5.liiiIIllIl();
               if (var8.field_1351 - var6.field_1351 < 0.75) {
                  return null;
               } else {
                  long var9 = player.IIIllIIliIIl();
                  iIilIiIiIlilIiIi var11 = this.Iilililiiili(var4, var9);
                  if (var11 == null
                     || var11.iliIiiliiiii() != var7.method_10264()
                     || !iliiiillIiiiiill.IiIIlliIIl(
                        var11.IliIlllilIi(), var11.iIlIlllllill(), var11.iliIiiliiiii(), var6.field_1352, var6.field_1350, var7.method_10264()
                     )) {
                     return null;
                  } else if ((var11.IliIlllilIi() - var6.field_1352) * (var8.field_1352 - var6.field_1352)
                        + (var11.iIlIlllllill() - var6.field_1350) * (var8.field_1350 - var6.field_1350)
                     <= 0.0) {
                     return null;
                  } else {
                     class_2338 var12 = new class_2338(var11.lIiiIiIlilli(), var11.iliIiiliiiii(), var11.IIIllIIliIIl());
                     if (!IIlilIliiIli(this.iilIIillll, var12, var9)) {
                        return null;
                     } else {
                        class_2338 var13 = var12.method_10084();
                        if (!iIlllIllll(this.IIllllIlll(player)).contains(var13) && !ilIllIiIll(this.lilIIillll, var13, var9)) {
                           class_2680 var14 = class_2246.field_10540.method_9564();
                           if (lliiIliliiIl.lIiiIiIlilli(var13)
                              && s.method_8628(var14, var13, class_3726.method_16194())
                              && !iliilliIiiilli.Iiilliiliiil(var13, iliilliIiiilli.IIillIiliIil())) {
                              class_2338 var15 = class_2338.method_49638(var8);
                              boolean[] var16 = new boolean[ilIIIillll.length];
                              var31 ^= (-4294967296L ^ var31) & -1L << 32;

                              for (var31 ^= (0L ^ var31) & -1L >>> 32; (int)var31 < ilIIIillll.length; var31 ^= (var31 ^ var31 + (long)1) & -1L >>> 32) {
                                 var16[(int)var31] = !lliiIliliiIl.lIiiIiIlilli(var15.method_10093(ilIIIillll[(int)var31]));
                                 if (var15.method_10093(ilIIIillll[(int)var31]).equals(var13)) {
                                    var31 ^= ((long)((int)var31) << 32 ^ var31) & -1L << 32;
                                 }
                              }

                              if ((int)(var31 >>> 32) >= 0 && !lIiIIilliIiIIill.IIIilIIiiIIi(lIiIIilliIiIIill.IlIillIiilIi(var16, (int)(var31 >>> 32)))) {
                                 return null;
                              } else {
                                 var31 ^= ((long)(player.Iiilliiliiil() != null && !player.Iiilliiliiil().IIIllIIliIIl() ? 0 : 1) ^ var31) & -1L >>> 32;
                                 if ((int)var31 != 0 && var5.Iiilliiliiil() > 0) {
                                    var33 ^= ((long)this.iiIIIillll.IilliliilIIi(st -> st.method_31574(class_1802.field_8281), false) << 32 ^ var33)
                                       & -1L << 32;
                                    if ((int)(var33 >>> 32) < 0) {
                                       return null;
                                    } else if (this.lIlIIillll != null && !this.lIlIIillll.liiiIIllIl(45, 3)) {
                                       return null;
                                    } else {
                                       iiIllIlIIlllIl var20 = var5.IiIlliIliiIl() == null ? iiIllIlIIlllIl.lliIilIlliliIilIll : var5.IiIlliIliiIl();
                                       class_243 var21 = new class_243(var11.IliIlllilIi(), var11.liiiIIllIl(), var11.iIlIlllllill());
                                       float var22 = iiIiiliIIliili.lIiiIiIlilli(
                                          lllIliIlillIliIl.IlIllllIll(world, var21, var8, var5.IilliliilIIi(), null, null, 6.0F), var20
                                       );
                                       if (!IIIilIIiiIIi(var22, var5.IliIlllilIi())) {
                                          return null;
                                       } else {
                                          class_243 var23 = var4.IiIlliIliiIl() != null ? var4.IiIlliIliiIl() : var6.method_1031(0.0, 1.62, 0.0);
                                          var33 ^= (
                                                (long)(
                                                      s.method_22347(var13.method_10084())
                                                            && var23.method_1022(class_243.method_24953(var13.method_10084())) <= 4.6
                                                         ? 1
                                                         : 0
                                                   )
                                                   ^ var33
                                             )
                                             & -1L >>> 32;
                                          float var25 = (int)var33 != 0
                                             ? iiIiiliIIliili.lIiiIiIlilli(
                                                lllIliIlillIliIl.IlIllllIll(
                                                   world, lllIliIlillIliIl.liiiIIllIl(var13), var8, var5.IilliliilIIi(), var13, null, 6.0F
                                                ),
                                                var20
                                             )
                                             : 0.0F;
                                          float var26 = var22 - var25;
                                          if (!IlIillIiilIi(var22, var5.IliIlllilIi(), var26)) {
                                             return null;
                                          } else {
                                             float var27 = this.liIIIillll.IliIlllilIi();
                                             float var28 = this.liIIIillll.liiiIIllIl();
                                             class_3965 var29 = IiIiiiilliIiiiil.liiiIIllIl(
                                                var12,
                                                new class_2350[]{class_2350.field_11036},
                                                class_2350.field_11036,
                                                this.liIIIillll.Iilllilliill(),
                                                var27,
                                                var28
                                             );
                                             if (var29 == null) {
                                                return null;
                                             } else {
                                                liliiiiliiliiiil var30 = new liliiiiliiliiiil(
                                                   IlIIllllllIIllll.IIIillIill, var13, false, IiIiliIiiiIi(var26, var11.IIlllIlliIll())
                                                );
                                                return new iIiiiiilIliiiiil(
                                                   var30,
                                                   lIiIIilliIiIIill.IiIiliIiiiIi(lllllillll(world.method_33571(), var29.method_17784(), var27, var28)),
                                                   (int)(var33 >>> 32),
                                                   null,
                                                   iIiilIliil<"iIiilIliil","0nBPfpKmcFCtsoIAmh34GsRGB0rGZKVW4bNyWMVvD6U=">(),
                                                   0
                                                );
                                             }
                                          }
                                       }
                                    }
                                 } else {
                                    return null;
                                 }
                              }
                           } else {
                              return null;
                           }
                        } else {
                           return null;
                        }
                     }
                  }
               }
            }
         }
      } else {
         return null;
      }
   }

   private iililiIlIIiiliIl lIlIliIlIl(IIllIIllIllIIl a, IIIilIIiiIIi player, class_746 world, class_638 recent, int s) {
      long var64 = 7068567347203985266L;
      long var66 = 114621583269660178L;
      long var52 = 233458228516128732L;
      long var68 = -8764924314362975803L;
      long var54 = 1989352919697491825L;
      long var56 = -7156752351938142019L;
      long var58 = -6907451806202946009L;
      long var60 = 7468645914085330556L;
      long var62 = -7582979103945446089L;
      class_2338 var6 = player.lIiiIiIlilli();
      if (var6 != null && !this.lllIIillll.containsKey(var6.method_10063())) {
         var52 ^= ((long)lIiIIilliIiIIill.Illlllllilll(player.Illlllllilll(), iilllIIill(a)) << 32 ^ var52) & -1L << 32;
         if ((int)(var52 >>> 32) < 0) {
            return iililiIlIIiiliIl.IllIlIIlll;
         } else {
            lliiilIiiliiilIi var8 = a.IlIlllIlilIl();
            float var9 = var8.IliIlllilIi();
            var52 ^= ((long)(a.Iiilliiliiil() != null && !a.Iiilliiliiil().IIIllIIliIIl() ? 0 : 1) ^ var52) & -1L >>> 32;
            var54 ^= ((long)(var8.IlIillIiilIi() > 20 ? this.iiIIIillll.IilliliilIIi(st -> st.method_31574(class_1802.field_8801), false) : -1) << 32 ^ var54)
               & -1L << 32;
            var54 ^= (
                  (long)((int)var52 != 0 && var8.Iiilliiliiil() > 0 ? this.iiIIIillll.IilliliilIIi(st -> st.method_31574(class_1802.field_8281), false) : -1)
                     ^ var54
               )
               & -1L >>> 32;
            if ((int)(var54 >>> 32) < 0 && (int)var54 < 0) {
               return iililiIlIIiiliIl.IllIlIIlll;
            } else {
               var56 ^= ((long)((int)(var54 >>> 32) >= 0 ? 1 : 0) << 32 ^ var56) & -1L << 32;
               var56 ^= ((long)((int)(var56 >>> 32) != 0 ? (int)(var54 >>> 32) : (int)var54) ^ var56) & -1L >>> 32;
               class_2680 var15 = (int)(var56 >>> 32) != 0 ? class_2246.field_10171.method_9564() : class_2246.field_10540.method_9564();
               var58 ^= ((long)(player.IiIlliIliiIl() >= var9 - 0.5F ? 1 : 0) << 32 ^ var58) & -1L << 32;
               class_238 var17 = var8.IilliliilIIi();
               class_243 var18 = var8.liiiIIllIl();
               class_243 var19 = var8.lIiiIiIlilli() == null ? class_243.field_1353 : var8.lIiiIiIlilli();
               class_238 var20 = var17.method_989(
                     var19.field_1352 * (double)((int)(var52 >>> 32) + 1), 0.0, var19.field_1350 * (double)((int)(var52 >>> 32) + 1)
                  )
                  .method_1014(0.05);
               liiilIiliiiilIil var21 = a.IiIlliIliiIl();
               class_238 var22 = null;
               class_238 var23 = null;
               if (var21 != null && var21.lIiiIiIlilli() != null) {
                  var23 = var21.lIiiIiIlilli().method_5829();
                  var22 = lllIliIlillIliIl.iIIilIlIil(var21.lIiiIiIlilli(), Math.max(1, Math.min(8, player.Illlllllilll())), false, true).liiiIIllIl();
               }

               List var24 = iIlllIllll(this.IIllllIlll(a));
               class_243 var25 = class_243.method_24953(var6);
               double[][] var26 = lIiIIilliIiIIill.IIlilIliiIli(
                  var17.field_1323, var17.field_1322, var17.field_1321, var17.field_1320, var17.field_1325, var17.field_1324
               );
               class_243 var27 = var17.method_1005();
               var58 ^= ((long)iliilliIiiilli.IIillIiliIil() ^ var58) & -1L >>> 32;
               ArrayList var29 = new ArrayList();
               var60 ^= (-4294967296L ^ var60) & -1L << 32;

               while ((int)(var60 >>> 32) <= 1) {
                  for (var60 ^= ~var60 & -1L >>> 32; (int)var60 <= 1; var60 ^= (var60 ^ var60 + (long)1) & -1L >>> 32) {
                     for (var62 ^= (-4294967296L ^ var62) & -1L << 32; (int)(var62 >>> 32) <= 1; var62 += 4294967296L) {
                        if ((int)(var60 >>> 32) != 0 || (int)var60 != 0 || (int)(var62 >>> 32) != 0) {
                           class_2338 var33 = var6.method_10069((int)(var60 >>> 32), (int)var60, (int)(var62 >>> 32));
                           var62 ^= (
                                 (long)lIiIIilliIiIIill.Illillliilli(
                                       var25.field_1352,
                                       var25.field_1351,
                                       var25.field_1350,
                                       var26,
                                       var33.method_10263(),
                                       var33.method_10264(),
                                       var33.method_10260()
                                    )
                                    ^ var62
                              )
                              & -1L >>> 32;
                           if ((int)var62 > 0
                              && lliiIliliiIl.lIiiIiIlilli(var33)
                              && !var24.contains(var33)
                              && !ilIllIiIll(this.lilIIillll, var33, a.IIIllIIliIIl())) {
                              class_238 var35 = lllIliIlillIliIl.lIiiIiIlilli(var33);
                              if (!var35.method_994(var17.method_1014(0.05))
                                 && !var35.method_994(var20)
                                 && (var22 == null || !var35.method_994(var22))
                                 && (var23 == null || !var35.method_994(var23))
                                 && !iliilliIiiilli.Iiilliiliiil(var33, (int)var58)) {
                                 var29.add(new IlIlIIlillIlIIli(var33, (int)var62, class_243.method_24953(var33).method_1025(var27)));
                              }
                           }
                        }
                     }
                  }

                  var60 += 4294967296L;
               }

               if (var29.isEmpty()) {
                  return iililiIlIIiiliIl.IllIlIIlll;
               } else {
                  var29.sort(Comparator.<IlIlIIlillIlIIli>comparingInt(c -> -c.liiiIIllIl()).thenComparingDouble(IlIlIIlillIlIIli::iIlIlllllill));
                  class_2338 var30 = class_2338.method_49638(var18);
                  boolean[] var31 = new boolean[ilIIIillll.length];

                  for (long var82 = var62 ^ (0L ^ var62) & -1L << 32; (int)(var82 >>> 32) < ilIIIillll.length; var82 += 4294967296L) {
                     var31[(int)(var82 >>> 32)] = !lliiIliliiIl.lIiiIiIlilli(var30.method_10093(ilIIIillll[(int)(var82 >>> 32)]));
                  }

                  iiIllIlIIlllIl var32 = var8.IiIlliIliiIl() == null ? iiIllIlIIlllIl.lliIilIlliliIilIll : var8.IiIlliIliiIl();
                  IilIlIIllilIlIIl var70 = new IilIlIIllilIlIIl(Math.max(0, a.IIillIiliIil()), var8.iIIIlIlIIl());
                  class_243 var34 = world.method_33571();
                  double var71 = this.liIIIillll.Iilllilliill();
                  float var37 = this.liIIIillll.IliIlllilIi();
                  float var38 = this.liIIIillll.liiiIIllIl();
                  iIiiilllIliiilll var39 = iIiiilllIliiilll.lliiIllill;
                  float var40 = Float.NEGATIVE_INFINITY;
                  var64 ^= (0L ^ var64) & -1L << 32;
                  var64 ^= (0L ^ var64) & -1L >>> 32;

                  for (IlIlIIlillIlIIli var44 : var29) {
                     int var10000 = (int)var64;
                     var64 ^= (var64 ^ var64 + (long)1) & -1L >>> 32;
                     if (var10000 >= 3) {
                        break;
                     }

                     class_2338 var45 = var44.IliIlllilIi();
                     var66 ^= (-4294967296L ^ var66) & -1L << 32;

                     for (var66 ^= (0L ^ var66) & -1L >>> 32; (int)var66 < ilIIIillll.length; var66 ^= (var66 ^ var66 + (long)1) & -1L >>> 32) {
                        if (var30.method_10093(ilIIIillll[(int)var66]).equals(var45)) {
                           var66 ^= ((long)((int)var66) << 32 ^ var66) & -1L << 32;
                        }
                     }

                     if (lIiIIilliIiIIill.IIIilIIiiIIi(lIiIIilliIiIIill.IlIillIiilIi(var31, (int)(var66 >>> 32)))
                        && ((int)(var56 >>> 32) != 0 || (int)(var58 >>> 32) != 0 || !this.illIlIilIl(var45, recent, var18, var21, var32, world))
                        && recent.method_8628(var15, var45, class_3726.method_16194())) {
                        IlIilIIlllIilIIl var47 = this.IllIllllIl(var45, var6, var34, var71, var37, var38);
                        if (!Double.isNaN(var47.IliIlllilIi()) || var47.liiiIIllIl()) {
                           var68 ^= (
                                 (long)lIiIIilliIiIIill.IIlllIlliIll(var47.IliIlllilIi(), var47.liiiIIllIl(), (double)lIlllIIliIlllIIl.liiiIIllIl()) << 32
                                    ^ var68
                              )
                              & -1L << 32;
                           if ((int)(var68 >>> 32) <= (int)(var52 >>> 32)) {
                              if (this.lIlIIillll != null && !this.lIlIIillll.liiiIIllIl(45, 2)) {
                                 break;
                              }

                              float var49 = lllIliIlillIliIl.IlIllllIll(world, var25, var18, var17, var45, var6, 5.0F);
                              float var50 = player.IiIlliIliiIl() - iiIiiliIIliili.IIIllIIliIIl(var49, var32, var70, player.Illlllllilll());
                              if (lIiIIilliIiIIill.Iilllilliill(var50, player.IiIlliIliiIl(), (int)(var68 >>> 32), (int)(var52 >>> 32), s)) {
                                 float var51 = lIiIIilliIiIIill.IIillIiliIil(var50, (int)(var68 >>> 32));
                                 if (var51 > var40 || var51 == var40 && var44.liiiIIllIl() > (int)(var64 >>> 32)) {
                                    var39 = new iIiiilllIliiilll(true, var45, (boolean)((int)(var56 >>> 32)), var50, (int)(var68 >>> 32));
                                    var40 = var51;
                                    var64 ^= ((long)var44.liiiIIllIl() << 32 ^ var64) & -1L << 32;
                                 }
                              }
                           }
                        }
                     }
                  }

                  return var39.IliIlllilIi() ? new iililiIlIIiiliIl(var39, (int)var56) : iililiIlIIiiliIl.IllIlIIlll;
               }
            }
         }
      } else {
         return iililiIlIIiiliIl.IllIlIIlll;
      }
   }

   private void liIlliiIll(String kind, class_2338 cell) {
      if (cell != null && this.lIiIIillll < 16) {
         if (!this.IIiIIillll.isEmpty()) {
            this.IIiIIillll.append(' ');
         }

         this.IIiIIillll.append(kind).append(cell.method_10263()).append(',').append(cell.method_10264()).append(',').append(cell.method_10260());
         this.lIiIIillll++;
      }
   }

   private boolean IIiilIiiiIii(liiilIiliiiilIil tick, class_2338 base, long t) {
      iIilIiIiIlilIiIi var5 = this.Iilililiiili(tick, t);
      return var5 != null
         && base != null
         && var5.lIiiIiIlilli() == base.method_10263()
         && var5.iliIiiliiiii() == base.method_10264()
         && var5.IIIllIIliIIl() == base.method_10260();
   }

   private IlIilIIlllIilIIl IllIllllIl(class_2338 cell, class_2338 sp, class_243 sy, double anchor, float eye, float reach) {
      long var20 = 4763114048214786155L;
      long var22 = 5435789056875032119L;
      double var8 = Double.NaN;
      var20 ^= (0L ^ var20) & -1L << 32;
      class_2350[] var11 = llIIIillll;
      var20 ^= ((long)var11.length ^ var20) & -1L >>> 32;

      for (long var26 = var22 ^ (0L ^ var22) & -1L << 32; (int)(var26 >>> 32) < (int)var20; var26 += 4294967296L) {
         class_2350 var14 = var11[(int)(var26 >>> 32)];
         class_2338 var15 = cell.method_10093(var14);
         if (!var15.equals(sp) && !lliiIliliiIl.lIiiIiIlilli(var15) && !iliilliIiiilli.lIiiIiIlilli(var15) && !iliilliIiiilli.IiIiliIiiiIi(var15)) {
            class_2350 var16 = var14.method_10153();
            if (lllIliIlillIliIl.Iilllilliill(var15, var16)) {
               if (IiIiiiilliIiiiil.IliIlllilIi(var15, var16, anchor, eye, reach) != null) {
                  var20 ^= (4294967296L ^ var20) & -1L << 32;
               }

               class_3965 var17 = IiIiiiilliIiiiil.liiiIIllIl(var15, new class_2350[]{var16}, var16, anchor, eye, reach);
               if (var17 != null) {
                  double var18 = lllllillll(sy, var17.method_17784(), eye, reach);
                  if (Double.isNaN(var8) || var18 < var8) {
                     var8 = var18;
                  }
               }
            }
         }
      }

      return Double.isNaN(var8) && (int)(var20 >>> 32) == 0 ? IlIilIIlllIilIIl.IIiiiillIl : new IlIilIIlllIilIIl(var8, (boolean)((int)(var20 >>> 32)));
   }

   private iiliiiIiIIiiiiIi IIllllIlll(IIllIIllIllIIl s) {
      return s.IIIIllIIIl() != null && s.IIIIllIIIl() != iiliiiIiIIiiiiIi.iIiliIIlIi ? s.IIIIllIIIl() : this.IliIIillll;
   }

   public void IliIlllilIi(IntFunction<iillilIIilil> source) {
      this.iIiIIillll = source;
   }

   public String Illlllllilll() {
      IlIIllllllIIllll var1 = this.IiiIIillll ? this.iiiIIillll : this.liIlIillll;
      class_2338 var2 = this.IiiIIillll ? this.IIIlIillll : this.iiIlIillll;
      double var3 = this.IiiIIillll ? this.IiIlIillll : this.IIllIillll;
      return var1 != null && var1 != IlIIllllllIIllll.liilllIill && var2 != null
         ? var1.name()
            + iIiilIliil<"iIiilIliil","w06Lo9uiOrJRPApbcmPwwpWWJ38NrTfJ0v9/0AA=">()
            + var2.method_10263()
            + iIiilIliil<"iIiilIliil","UPSNfIwaf5iKJ5xZZXxS/hlleF8YGYlg4lKClx4=">()
            + var2.method_10264()
            + iIiilIliil<"iIiilIliil","UPSNfIwaf5iKJ5xZZXxS/hlleF8YGYlg4lKClx4=">()
            + var2.method_10260()
            + iIiilIliil<"iIiilIliil","pftKmEioaG6YjSBNkdyl3s9rqRBQcdO9D6vq90E=">()
            + String.format(Locale.ROOT, iIiilIliil<"iIiilIliil","uH90aEukPT9odtZbA/wneCK7DY5nGN/IUQxqo9B8Bp0=">(), var3)
         : iIiilIliil<"iIiilIliil","EdGtfbhoieXApcPDfTofaCW4UW+b3qM02ybVetU=">();
   }

   private double lilIliilIl(class_2338 sp, class_2338 eye, class_243 cell, double reach, float sy, float anchor) {
      long var19 = -4678209779216581361L;
      double var8 = Double.NaN;
      class_2350[] var10 = llIIIillll;
      var19 ^= ((long)var10.length << 32 ^ var19) & -1L << 32;

      for (long var22 = var19 ^ (0L ^ var19) & -1L >>> 32; (int)var22 < (int)(var22 >>> 32); var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
         class_2350 var13 = var10[(int)var22];
         class_2338 var14 = sp.method_10093(var13);
         if (!var14.equals(eye) && !lliiIliliiIl.lIiiIiIlilli(var14)) {
            class_2350 var15 = var13.method_10153();
            if (lllIliIlillIliIl.Iilllilliill(var14, var15)) {
               class_3965 var16 = IiIiiiilliIiiiil.liiiIIllIl(var14, new class_2350[]{var15}, var15, reach, sy, anchor);
               if (var16 != null) {
                  double var17 = lllllillll(cell, var16.method_17784(), sy, anchor);
                  if (Double.isNaN(var8) || var17 < var8) {
                     var8 = var17;
                  }
               }
            }
         }
      }

      return var8;
   }

   public int IiIlliIliiIl() {
      return this.iIllIillll;
   }

   private void iIiIlIliIl(long tick) {
      if (this.iiiIIillll == IlIIllllllIIllll.IIIillIill) {
         this.iIllIillll++;
         this.IllIIillll.addLast(tick);
         if (this.lIIlIillll != null) {
            (this.iIIlIillll ? this.iilIIillll : this.lllIIillll).put(this.lIIlIillll.method_10063(), tick);
         }

         this.liIlliiIll(iIiilIliil<"iIiilIliil","00Qwq4lGoIfqFUxPL9UdPtkeq2mDkCyXkOOkBmHsHKU=">(), this.IIIlIillll);
      } else if (this.iiiIIillll == IlIIllllllIIllll.iiilllIill) {
         this.lIllIillll++;
         this.liIlliiIll(iIiilIliil<"iIiilIliil","3YlwpQMp298jYKPHeeNF9usIZjJug514MGZZ/EQV418=">(), this.IIIlIillll);
      }
   }

   public IiIIlIllliIIlIll(lilllllliillllll anchors, lIlIiIIliIlIiIIl rays, iliIliilIiiIliil host, IilIllililIlli slots) {
      this.lllIIillll = new HashMap<>();
      this.illIIillll = new HashMap<>();
      this.IilIIillll = new HashMap<>();
      this.lilIIillll = new HashMap<>();
      this.iilIIillll = new HashMap<>();
      this.IIiIIillll = new StringBuilder();
      this.IliIIillll = iiliiiIiIIiiiiIi.iIiliIIlIi;
      this.lliIIillll = iIiiiiilIliiiiil.iilIliIiil;
      this.iliIIillll = Long.MIN_VALUE;
      this.iiiIIillll = IlIIllllllIIllll.liilllIill;
      this.liIlIillll = IlIIllllllIIllll.liilllIill;
      this.liIIIillll = anchors;
      this.iiIIIillll = rays;
      this.IIlIIillll = host;
      this.lIlIIillll = slots;
      this.iIlIIillll = new IlIIiIIillIIiIIi(anchors);
   }

   static boolean Ililllililil(
      IlIIllllllIIllll freshKind, class_2338 runCell, class_2338 runKind, IlIIllllllIIllll freshCell, class_2338 runAnchor, class_2338 freshAnchor
   ) {
      if (freshKind == null || freshKind == IlIIllllllIIllll.liilllIill || freshKind != freshCell) {
         return false;
      } else {
         return !Objects.equals(runCell, runAnchor) ? false : freshKind == IlIIllllllIIllll.IIIillIill || Objects.equals(runKind, freshAnchor);
      }
   }

   private iililiIlIIiiliIl llIIlilIIl(IIllIIllIllIIl world, iIilIiIiIlilIiIi spot, class_2338 s, int t, class_746 base, class_638 eta, liiilIiliiiilIil player) {
      long var48 = -348940185975072228L;
      long var50 = -7530895499967134970L;
      long var52 = -2463270910196417580L;
      long var54 = 618915325318253801L;
      long var56 = -4448910412689515644L;
      long var46 = 4260293184656302510L;
      lliiilIiiliiilIi var8 = world.IlIlllIlilIl();
      class_238 var9 = var8.IilliliilIIi();
      class_243 var10 = var8.liiiIIllIl();
      float var11 = var8.IliIlllilIi();
      iiIllIlIIlllIl var12 = var8.IiIlliIliiIl() == null ? iiIllIlIIlllIl.lliIilIlliliIilIll : var8.IiIlliIliiIl();
      class_243 var13 = new class_243(spot.IliIlllilIi(), spot.liiiIIllIl(), spot.iIlIlllllill());
      if (var10.method_1022(var13) > 12.0) {
         return iililiIlIIiiliIl.IllIlIIlll;
      } else if (this.lIlIIillll != null && !this.lIlIIillll.liiiIIllIl(45, 3)) {
         return iililiIlIIiiliIl.IllIlIIlll;
      } else {
         float var14 = iiIiiliIIliili.lIiiIiIlilli(lllIliIlillIliIl.IlIllllIll(base, var13, var10, var9, null, null, 6.0F), var12);
         if (!IIIilIIiiIIi(var14, var11)) {
            return iililiIlIIiiliIl.IllIlIIlll;
         } else {
            class_238 var15 = null;
            class_238 var16 = null;
            if (player != null && player.lIiiIiIlilli() != null) {
               var16 = player.lIiiIiIlilli().method_5829();
               var15 = lllIliIlillIliIl.iIIilIlIil(player.lIiiIiIlilli(), Math.max(1, Math.min(8, t)), false, true).liiiIIllIl();
            }

            List var17 = iIlllIllll(this.IIllllIlll(world));
            double[][] var18 = lIiIIilliIiIIill.IIlilIliiIli(
               var9.field_1323, var9.field_1322, var9.field_1321, var9.field_1320, var9.field_1325, var9.field_1324
            );
            class_243 var19 = var9.method_1005();
            class_2338 var20 = class_2338.method_49638(var10);
            class_2338 var21 = s.method_10084();
            var46 ^= ((long)iliilliIiiilli.IIillIiliIil() << 32 ^ var46) & -1L << 32;
            ArrayList var23 = new ArrayList();

            for (long var61 = var46 ^ ~var46 & -1L >>> 32; (int)var61 <= 1; var61 ^= (var61 ^ var61 + (long)1) & -1L >>> 32) {
               var48 ^= (0L ^ var48) & -1L << 32;

               while ((int)(var48 >>> 32) <= 1) {
                  for (var48 ^= ~var48 & -1L >>> 32; (int)var48 <= 1; var48 ^= (var48 ^ var48 + (long)1) & -1L >>> 32) {
                     if ((int)var61 != 0 || (int)var48 != 0) {
                        class_2338 var27 = var20.method_10069((int)var61, (int)(var48 >>> 32), (int)var48);
                        if (!var27.equals(s) && !var27.equals(var21)) {
                           var50 ^= (
                                 (long)lIiIIilliIiIIill.Illillliilli(
                                          var13.field_1352,
                                          var13.field_1351,
                                          var13.field_1350,
                                          var18,
                                          var27.method_10263(),
                                          var27.method_10264(),
                                          var27.method_10260()
                                       )
                                       << 32
                                    ^ var50
                              )
                              & -1L << 32;
                           if ((int)(var50 >>> 32) > 0
                              && lliiIliliiIl.lIiiIiIlilli(var27)
                              && !var17.contains(var27)
                              && !ilIllIiIll(this.lilIIillll, var27, world.IIIllIIliIIl())) {
                              class_238 var29 = lllIliIlillIliIl.lIiiIiIlilli(var27);
                              if (!var29.method_994(var9.method_1014(0.05))
                                 && (var15 == null || !var29.method_994(var15))
                                 && (var16 == null || !var29.method_994(var16))
                                 && !iliilliIiiilli.Iiilliiliiil(var27, (int)(var61 >>> 32))) {
                                 var23.add(new IlIlIIlillIlIIli(var27, (int)(var50 >>> 32), class_243.method_24953(var27).method_1025(var19)));
                              }
                           }
                        }
                     }
                  }

                  var48 += 4294967296L;
               }
            }

            if (var23.isEmpty()) {
               return iililiIlIIiiliIl.IllIlIIlll;
            } else {
               var23.sort(Comparator.<IlIlIIlillIlIIli>comparingInt(c -> -c.liiiIIllIl()).thenComparingDouble(IlIlIIlillIlIIli::iIlIlllllill));
               boolean[] var24 = new boolean[ilIIIillll.length];

               for (var48 ^= (0L ^ var48) & -1L << 32; (int)(var48 >>> 32) < ilIIIillll.length; var48 += 4294967296L) {
                  var24[(int)(var48 >>> 32)] = !lliiIliliiIl.lIiiIiIlilli(var20.method_10093(ilIIIillll[(int)(var48 >>> 32)]));
               }

               var48 ^= ((long)(world.Iiilliiliiil() != null && !world.Iiilliiliiil().IIIllIIliIIl() ? 0 : 1) << 32 ^ var48) & -1L << 32;
               class_243 var26 = base.method_33571();
               double var58 = this.liIIIillll.Iilllilliill();
               float var59 = this.liIIIillll.IliIlllilIi();
               float var30 = this.liIIIillll.liiiIIllIl();
               iIiiilllIliiilll var31 = iIiiilllIliiilll.lliiIllill;
               var50 ^= ~var50 & -1L >>> 32;
               var52 ^= (0L ^ var52) & -1L << 32;

               for (IlIlIIlillIlIIli var35 : var23) {
                  int var10000 = (int)(var52 >>> 32);
                  var52 += 4294967296L;
                  if (var10000 >= 3) {
                     break;
                  }

                  class_2338 var36 = var35.IliIlllilIi();
                  var52 ^= ~var52 & -1L >>> 32;

                  for (var54 ^= (0L ^ var54) & -1L << 32; (int)(var54 >>> 32) < ilIIIillll.length; var54 += 4294967296L) {
                     if (var20.method_10093(ilIIIillll[(int)(var54 >>> 32)]).equals(var36)) {
                        var52 ^= ((long)((int)(var54 >>> 32)) ^ var52) & -1L >>> 32;
                     }
                  }

                  if (lIiIIilliIiIIill.IIIilIIiiIIi(lIiIIilliIiIIill.IlIillIiilIi(var24, (int)var52))) {
                     var54 ^= ((long)this.illIlIilIl(var36, eta, var10, player, var12, base) << 32 ^ var54) & -1L << 32;
                     var54 ^= (
                           (long)lIiIIilliIiIIill.Ililllililil(
                                 (boolean)((int)(var54 >>> 32)), (int)(var48 >>> 32) != 0 ? var8.Iiilliiliiil() : 0, var8.IlIillIiilIi()
                              )
                              ^ var54
                        )
                        & -1L >>> 32;
                     if (lIiIIilliIiIIill.Iiilliiliiil(
                        (boolean)((int)var54), (boolean)((int)(var54 >>> 32)), (int)(var48 >>> 32) != 0 ? var8.Iiilliiliiil() : 0, var8.IlIillIiilIi()
                     )) {
                        class_2680 var40 = (int)var54 != 0 ? class_2246.field_10171.method_9564() : class_2246.field_10540.method_9564();
                        if (eta.method_8628(var40, var36, class_3726.method_16194())) {
                           var56 ^= (
                                 (long)(
                                          (int)var54 != 0
                                             ? this.iiIIIillll.IilliliilIIi(st -> st.method_31574(class_1802.field_8801), false)
                                             : this.iiIIIillll.IilliliilIIi(st -> st.method_31574(class_1802.field_8281), false)
                                       )
                                       << 32
                                    ^ var56
                              )
                              & -1L << 32;
                           if ((int)(var56 >>> 32) >= 0) {
                              double var42 = this.lilIliilIl(var36, s, var26, var58, var59, var30);
                              if (!Double.isNaN(var42)) {
                                 if (this.lIlIIillll != null && !this.lIlIIillll.liiiIIllIl(45, 3)) {
                                    break;
                                 }

                                 float var44 = lllIliIlillIliIl.IlIllllIll(base, var13, var10, var9, var36, null, 6.0F);
                                 float var45 = var14 - iiIiiliIIliili.lIiiIiIlilli(var44, var12);
                                 if (IlIillIiilIi(var14, var11, var45) && var45 > var31.IilliliilIIi()) {
                                    var31 = new iIiiilllIliiilll(true, var36, (boolean)((int)var54), var45, lIiIIilliIiIIill.IiIiliIiiiIi(var42));
                                    var50 ^= ((long)((int)(var56 >>> 32)) ^ var50) & -1L >>> 32;
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               return var31.IliIlllilIi() ? new iililiIlIIiiliIl(var31, (int)var50) : iililiIlIIiiliIl.IllIlIIlll;
            }
         }
      }
   }

   public IlIIllllllIIllll IIIllIIliIIl() {
      return this.IiiIIillll ? this.iiiIIillll : this.liIlIillll;
   }

   static double IiIiliIiiiIi(float gain, double interval) {
      double var3 = Double.isFinite(interval) ? interval : 6.0;
      return (double)gain * Math.min(3.0, 20.0 / Math.max(var3, 10.0)) - 0.3;
   }

   private static int iilllIIill(IIllIIllIllIIl s) {
      return Math.round((float)Math.max(0, s.IlIlllIlilIl().lilIliilIl()) / 50.0F);
   }

   public lilIillliilIilll IilliliilIIi(IIllIIllIllIIl s) {
      if (s != null && this.IIlIIillll != null) {
         long var2 = this.liIIIillll.IIillIiliIil();
         if (this.IiiIIillll && !this.liiIIillll && !this.IlIlIillll) {
            iIiiiiilIliiiiil var4 = this.Iliilliiilii(s);
            if (!Ililllililil(
               var4.IliIlllilIi().IliIlllilIi(), IlIllllIll(var4), var4.IliIlllilIi().liiiIIllIl(), this.iiiIIillll, this.lIIlIillll, this.IIIlIillll
            )) {
               this.lliIliliIl();
            }
         }

         if (this.IiiIIillll && this.IlIlIillll && !this.liiIIillll && var2 > this.ilIlIillll) {
            lIIlliIIll(this.lilIIillll, this.IIIlIillll, var2, 4);
         }

         if (this.IiiIIillll && this.IlIlIillll && (this.liiIIillll ? !this.IIlIIillll.IllIllllIl(this.lIIlIillll) : var2 > this.ilIlIillll)) {
            this.lliIliliIl();
         }

         if (this.IiiIIillll
            && this.iiiIIillll == IlIIllllllIIllll.IIIillIill
            && !this.liiIIillll
            && (this.iIIlIillll ? !this.IIiilIiiiIii(s.IiIlliIliiIl(), this.lIIlIillll, var2) : !this.IIlIIillll.IllIllllIl(this.lIIlIillll))) {
            this.lliIliliIl();
         }

         if (!this.IiiIIillll) {
            iIiiiiilIliiiiil var5 = this.Iliilliiilii(s);
            if (var5.IliIlllilIi().IliIlllilIi() == IlIIllllllIIllll.liilllIill) {
               return lilIillliilIilll.IiiIlIlill;
            }

            if (!this.IIiIllIiIl(var5, var2)) {
               if (iIiilIliil<"iIiilIliil","0nBPfpKmcFCtsoIAmh34GsRGB0rGZKVW4bNyWMVvD6U=">().equals(var5.lIiiIiIlilli())) {
                  lIIlliIIll(this.lilIIillll, var5.IliIlllilIi().liiiIIllIl(), var2, 4);
               } else {
                  iiiIlIIIll(
                     var5.IliIlllilIi().IliIlllilIi() == IlIIllllllIIllll.iiilllIill ? this.illIIillll : this.lilIIillll, var5.IliIlllilIi().liiiIIllIl(), var2
                  );
               }

               return lilIillliilIilll.iIIllIlill;
            }
         }

         lilIillliilIilll var6 = this.iIlIIillll.iIlIlllllill();
         if (var6 == lilIillliilIilll.IIIllIlill) {
            if (!this.liiIIillll) {
               this.iIiIlIliIl(var2);
            }

            this.liiIIillll = true;
            if (this.iiiIIillll == IlIIllllllIIllll.IIIillIill) {
               this.IIlIIillll.iIlIlllllill(this.IIIlIillll, var2);
            }
         } else if (var6 == lilIillliilIilll.lIIllIlill) {
            this.lliIliliIl();
         } else if (var6 == lilIillliilIilll.iIIllIlill) {
            if (this.llIlIillll) {
               lIIlliIIll(this.lilIIillll, this.IIIlIillll, var2, 4);
            } else {
               iiiIlIIIll(this.iiiIIillll == IlIIllllllIIllll.iiilllIill ? this.illIIillll : this.lilIIillll, this.IIIlIillll, var2);
            }

            this.lliIliliIl();
         }

         return var6;
      } else {
         return lilIillliilIilll.IiiIlIlill;
      }
   }

   private boolean illIlIilIl(class_2338 armS, class_638 player, class_243 t, liiilIiliiiilIil feet, iiIllIlIIlllIl cell, class_746 world) {
      class_2338 var7 = armS.method_10084();
      if (!player.method_22347(var7)) {
         return false;
      } else {
         class_243 var8 = lllIliIlillIliIl.liiiIIllIl(armS);
         if (feet != null) {
            class_243 var9 = feet.IiIlliIliiIl() != null
               ? feet.IiIlliIliiIl()
               : (feet.IIIllIIliIIl() != null ? feet.IIIllIIliIIl().method_1031(0.0, 1.62, 0.0) : null);
            if (var9 == null || var9.method_1022(class_243.method_24953(var7)) > 4.6) {
               return false;
            }
         }

         float var10 = iiIiiliIIliili.lIiiIiIlilli(lllIliIlillIliIl.ilIllIiIll(world, t.method_1022(var8), 6.0F), cell);
         return var10 >= 4.0F;
      }
   }

   public boolean lIiiIiIlilli() {
      return this.IiiIIillll;
   }

   public void liiiIIllIl(iiliiiIiIIiiiiIi c) {
      this.IliIIillll = c == null ? iiliiiIiIIiiiiIi.iIiliIIlIi : c;
   }

   private iIiiiiilIliiiiil Iiiiliiiiiii(IIllIIllIllIIl s) {
      long var25 = 4157084409244190624L;
      long var27 = 3675897943636684379L;
      long var29 = -6784351125888031262L;
      class_310 var2 = class_310.method_1551();
      class_746 var3 = var2.field_1724;
      class_638 var4 = var2.field_1687;
      lliiilIiiliiilIi var5 = s.IlIlllIlilIl();
      if (var3 != null && var4 != null && var5 != null && var5.liiiIIllIl() != null && var5.IilliliilIIi() != null) {
         long var6 = s.IIIllIIliIIl();
         this.IiiIlliiIl(var6);
         float var8 = var5.IliIlllilIi();
         IlIIIlilllIIIlil var9 = s.Iiilliiliiil() != null && s.Iiilliiliiil().IliIlllilIi() != null
            ? s.Iiilliiliiil().IliIlllilIi()
            : IlIIIlilllIIIlil.iliIiilIil;
         lilliIiiilliIi var10 = lilliIiiilliIi.IliIlllilIi(s.Iiiiliiiiiii(), var9);
         liiilIiliiiilIil var11 = s.IiIlliIliiIl();
         float var12 = var11 == null ? Float.POSITIVE_INFINITY : var11.IliIlllilIi();
         var25 ^= ((long)Iiilliiliiil(this.IllIIillll, var6) << 32 ^ var25) & -1L << 32;
         var25 ^= (0L ^ var25) & -1L >>> 32;
         var27 ^= (0L ^ var27) & -1L << 32;

         for (IIIilIIiiIIi var17 : this.IIlIIillll.iliIiiliiiii()) {
            var27 ^= ((long)lIiIIilliIiIIill.IlIlllIlilIl(var17.IiIlliIliiIl(), var8, var17.Iilllilliill()) ^ var27) & -1L >>> 32;
            if ((int)var27 != 0 || lIiIIilliIiIIill.IliIlllilIi(var17, var8)) {
               var25 ^= (1L ^ var25) & -1L >>> 32;
               if (!ilIllIiIll(this.IilIIillll, var17.lIiiIiIlilli(), var6)) {
                  int var10000 = (int)(var27 >>> 32);
                  var27 += 4294967296L;
                  if (var10000 >= 2) {
                     break;
                  }

                  IiiIIlIiliiIIlIi var19 = ilIllIiIll(this.illIIillll, var17.lIiiIiIlilli(), var6)
                     ? IiiIIlIiliiIIlIi.iiliiiiiil
                     : this.IiIIlliIIl(s, var17, var3);
                  var29 ^= (
                        (long)(var17.IlIlllIlilIl() >= var8 - 0.5F && s.IIillIiliIil() <= var19.IliIlllilIi().IilliliilIIi() + iilllIIill(s) ? 1 : 0) << 32
                           ^ var29
                     )
                     & -1L << 32;
                  var29 ^= ((long)(var11 != null && var19.IliIlllilIi().iIlIlllllill() >= var12 && !var11.Iilililiiili() ? 1 : 0) ^ var29) & -1L >>> 32;
                  if ((int)(var29 >>> 32) != 0 && (int)var29 == 0) {
                     var19 = IiiIIlIiliiIIlIi.iiliiiiiil;
                  }

                  if (var19.IliIlllilIi().IliIlllilIi() && var19.IliIlllilIi().liiiIIllIl() <= 0.1F) {
                     double var34 = lIiIIilliIiIIill.IilliliilIIi(
                        var10.liiiIIllIl(),
                        var10.iIlIlllllill(),
                        var19.IliIlllilIi().iIlIlllllill(),
                        var19.IliIlllilIi().liiiIIllIl(),
                        var17.Iilllilliill(),
                        var17.IiIlliIliiIl()
                     );
                     liliiiiliiliiiil var24 = new liliiiiliiliiiil(IlIIllllllIIllll.iiilllIill, var17.lIiiIiIlilli(), false, Math.max(0.0, var34));
                     return new iIiiiiilIliiiiil(
                        var24,
                        var19.IliIlllilIi().IilliliilIIi(),
                        var19.liiiIIllIl(),
                        var17.lIiiIiIlilli(),
                        iIiilIliil<"iIiilIliil","3TPi/PIRTwrB08DGkqJPCehN6WeQgrJnVkJDlng6uPFvrQ==">(),
                        0
                     );
                  }

                  if ((int)var27 != 0 && (int)(var25 >>> 32) < 4) {
                     iililiIlIIiiliIl var22 = this.lIlIliIlIl(s, var17, var3, var4, (int)(var25 >>> 32));
                     if (var22.IliIlllilIi().IliIlllilIi()) {
                        liliiiiliiliiiil var35 = new liliiiiliiliiiil(
                           IlIIllllllIIllll.IIIillIill,
                           var22.IliIlllilIi().liiiIIllIl(),
                           var22.IliIlllilIi().iIlIlllllill(),
                           (double)(var17.Iilllilliill() * var22.IliIlllilIi().IilliliilIIi())
                        );
                        return new iIiiiiilIliiiiil(
                           var35,
                           var22.IliIlllilIi().lIiiIiIlilli(),
                           var22.liiiIIllIl(),
                           var17.lIiiIiIlilli(),
                           iIiilIliil<"iIiilIliil","Q1k0RKaTs9reajnrZJDyXqd0Uky14uN7WQfPAwLJdYWG">(),
                           lIiIIilliIiIIill.Illlllllilll(var17.Illlllllilll(), iilllIIill(s))
                        );
                     }
                  }

                  iiIllilIIlllil var33 = new iiIllilIIlllil(
                     var17,
                     var8,
                     var5.Iilllilliill(),
                     var10.liiiIIllIl(),
                     var10.iIlIlllllill(),
                     var19.IliIlllilIi(),
                     iIiiilllIliiilll.lliiIllill,
                     (int)(var25 >>> 32)
                  );
                  liliiiiliiliiiil var23 = lIiIIilliIiIIill.iIlIlllllill(var33, var12);
                  if (var23.IliIlllilIi() == IlIIllllllIIllll.iiilllIill) {
                     return new iIiiiiilIliiiiil(
                        var23,
                        var19.IliIlllilIi().IilliliilIIi(),
                        var19.liiiIIllIl(),
                        var17.lIiiIiIlilli(),
                        iIiilIliil<"iIiilIliil","3TPi/PIRTwrB08DGkqJPCehN6WeQgrJnVkJDlng6uPFvrQ==">(),
                        0
                     );
                  }
               }
            }
         }

         iIiiiiilIliiiiil var31 = this.IIIIllIIIl(s, var3, var4);
         if (var31 != null) {
            return var31;
         } else {
            iIiiiiilIliiiiil var32 = this.iIIIlIlIIl(s, var3, var4, (int)(var25 >>> 32));
            if (var32 != null) {
               return var32;
            } else {
               return (int)var25 != 0 ? iIiiiiilIliiiiil.iilIliIiil : iIiiiiilIliiiiil.lilIliIiil;
            }
         }
      } else {
         return iIiiiiilIliiiiil.iilIliIiil;
      }
   }

   public void iliIiiliiiii() {
      if (this.IiiIIillll && this.liiIIillll && this.iiiIIillll == IlIIllllllIIllll.iiilllIill && this.IIIlIillll != null) {
         this.IilIIillll.merge(this.IIIlIillll.method_10063(), this.liIIIillll.IIillIiliIil() + 6L + (long)Iillllilll(), Math::max);
      }

      this.lliIliliIl();
   }

   private void IiiIlliiIl(long tick) {
      while (!this.IllIIillll.isEmpty() && (tick < this.IllIIillll.peekFirst() || tick - this.IllIIillll.peekFirst() >= 40L)) {
         this.IllIIillll.removeFirst();
      }

      this.lllIIillll.values().removeIf(tickx -> tick < tickx || tick - tickx > 200L);
      this.lllIIillll.keySet().removeIf(k -> !this.IIlIIillll.IllIllllIl(class_2338.method_10092(k)));
      this.iilIIillll.values().removeIf(t -> tick < t || tick - t > 60L);
      this.illIIillll.values().removeIf(until -> until < tick);
      this.IilIIillll.values().removeIf(until -> until < tick);
      this.lilIIillll.values().removeIf(until -> until < tick);
   }

   private iillilIIilil Illillliilli(liiilIiliiiilIil t) {
      IntFunction var2 = this.iIiIIillll;
      return var2 != null && t != null ? (iillilIIilil)var2.apply(t.iIlIlllllill()) : null;
   }

   static boolean IIIilIIiiIIi(float ehp, float fullUs) {
      return Float.isFinite(ehp) && ehp >= Math.max(2.0F, 0.15F * fullUs);
   }

   static boolean IIlilIliiIli(Map<Long, Long> base, class_2338 tick, long shielded) {
      Long var4 = tick == null ? null : (Long)base.get(tick.method_10063());
      return var4 == null || shielded < var4 || shielded - var4 > 60L;
   }

   public String Iilllilliill() {
      String var1 = this.IIiIIillll.toString();
      this.IIiIIillll.setLength(0);
      this.lIiIIillll = 0;
      return var1;
   }

   public int IlIlllIlilIl() {
      return this.lIllIillll;
   }

   public void IIlllIlliIll() {
      this.lliIliliIl();
      this.IllIIillll.clear();
      this.lllIIillll.clear();
      this.illIIillll.clear();
      this.IilIIillll.clear();
      this.lilIIillll.clear();
      this.iilIIillll.clear();
      this.IliIIillll = iiliiiIiIIiiiiIi.iIiliIIlIi;
      this.IIiIIillll.setLength(0);
      this.lIiIIillll = 0;
      this.lliIIillll = iIiiiiilIliiiiil.iilIliIiil;
      this.iliIIillll = Long.MIN_VALUE;
      this.liIlIillll = IlIIllllllIIllll.liilllIill;
      this.iiIlIillll = null;
      this.IIllIillll = 0.0;
      this.lIllIillll = 0;
      this.iIllIillll = 0;
   }

   private boolean IIiIllIiIl(iIiiiiilIliiiiil tick, long p) {
      long var8 = 6519532422295689063L;
      long var10 = 1592791205209846395L;
      liliiiiliiliiiil var4 = tick.IliIlllilIi();
      if (var4.IliIlllilIi() == IlIIllllllIIllll.iiilllIill) {
         var8 ^= ((long)(6 + Iillllilll()) << 32 ^ var8) & -1L << 32;
         var8 ^= (
               (long)this.iIlIIillll.liiiIIllIl(var4.liiiIIllIl(), tick.iIlIlllllill(), st -> !st.method_27852(class_2246.field_23152), (int)(var8 >>> 32))
                  ^ var8
            )
            & -1L >>> 32;
      } else {
         if (var4.IliIlllilIi() != IlIIllllllIIllll.IIIillIill) {
            return false;
         }

         var8 ^= ((long)(4 + Iillllilll()) << 32 ^ var8) & -1L << 32;
         class_2680 var7 = var4.iIlIlllllill() ? class_2246.field_10171.method_9564() : class_2246.field_10540.method_9564();
         var8 ^= ((long)this.iIlIIillll.IliIlllilIi(var4.liiiIIllIl(), tick.iIlIlllllill(), var7, tick.IilliliilIIi(), (int)(var8 >>> 32)) ^ var8) & -1L >>> 32;
         if ((int)var8 != 0) {
            this.IIlIIillll.iIlIlllllill(var4.liiiIIllIl(), p);
         }
      }

      if ((int)var8 == 0) {
         return false;
      } else {
         var10 ^= ((long)iIiilIliil<"iIiilIliil","0nBPfpKmcFCtsoIAmh34GsRGB0rGZKVW4bNyWMVvD6U=">().equals(tick.lIiiIiIlilli()) << 32 ^ var10) & -1L << 32;
         this.IiiIIillll = true;
         this.liiIIillll = false;
         this.iiiIIillll = var4.IliIlllilIi();
         this.IIIlIillll = var4.liiiIIllIl();
         this.lIIlIillll = (int)(var10 >>> 32) != 0 ? var4.liiiIIllIl().method_10074() : tick.IilliliilIIi();
         this.iIIlIillll = iIiilIliil<"iIiilIliil","6h63RUGszTwsGdDbLXjrq3XQki3H9ID0flXODg8MPeA=">().equals(tick.lIiiIiIlilli()) || (int)(var10 >>> 32) != 0;
         this.llIlIillll = (boolean)((int)(var10 >>> 32));
         this.IlIlIillll = iIiilIliil<"iIiilIliil","Q1k0RKaTs9reajnrZJDyXqd0Uky14uN7WQfPAwLJdYWG">().equals(tick.lIiiIiIlilli());
         this.ilIlIillll = p + (long)Math.max(0, tick.iliIiiliiiii());
         this.IiIlIillll = var4.IilliliilIIi();
         this.liIlIillll = this.iiiIIillll;
         this.iiIlIillll = this.IIIlIillll;
         this.IIllIillll = this.IiIlIillll;
         return true;
      }
   }
}
