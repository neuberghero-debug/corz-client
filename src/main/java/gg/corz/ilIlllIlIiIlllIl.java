package gg.corz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_746;

public final class ilIlllIlIiIlllIl {
   private lIIIlliIIIll IilIiiIiIl;
   public static final int IlIIiiIiIl = 60;
   private long IIiIiiIiIl;
   private final IiIIiIIlliIIiIIl IllIiiIiIl;
   public static final double IliiliIiIl = 45.0;
   public static final double iiIIiiIiIl = 6.0;
   private String IiiIiiIiIl;
   private final IIiIIlilIiIIli iIlIiiIiIl;
   public static final double lIiiliIiIl = 2.0;
   private long IliIiiIiIl;
   private long iilIiiIiIl;
   public static final double iililiIiIl = 42.0;
   private class_243 lIiIiiIiIl;
   private class_243 iIiIiiIiIl;
   public static final int ilIIiiIiIl = 3;
   public static final float IiiiliIiIl = 0.75F;
   public static final double lililiIiIl = 10.0;
   public static final String IIlIiiIiIl = "anchor-hunter";
   private boolean iliIiiIiIl;
   public static final double lliiliIiIl = 0.003;
   public static final double IililiIiIl = 18.0;
   public static final int iiiiliIiIl = 90;
   public static final int liIIiiIiIl = 100;
   public static final int llIIiiIiIl = 6;
   public static final double IIiiliIiIl = 34.0;
   private int lliIiiIiIl;
   private long lilIiiIiIl;
   public static final int liiiliIiIl = 12;
   public static final float iliiliIiIl = 12.0F;
   private final class_310 lIlIiiIiIl = class_310.method_1551();
   public static final int iIIIiiIiIl = 20;
   public static final int IiIIiiIiIl = 3;
   public static final int IIIIiiIiIl = 30;
   private iiiiilllIIIIIill illIiiIiIl = iiiiilllIIIIIill.illllllill;
   public static final int lIIIiiIiIl = 40;
   public static final double iIiiliIiIl = -55.0;
   private final Object lllIiiIiIl;

   public iiiiilllIIIIIill liiiIIllIl() {
      return this.illIiiIiIl;
   }

   static int Iilililiiili(class_1661 inv) {
      for (int var1 = 8; var1 >= 0; var1--) {
         if (!IIiIiIillIiIiIil.IIlllIlliIll(inv.method_5438(var1)) && var1 != inv.method_67532()) {
            return var1;
         }
      }

      return -1;
   }

   public void Illlllllilll(long tick) {
      class_746 var3 = this.lIlIiiIiIl.field_1724;
      this.illIiiIiIl = iiiiilllIIIIIill.lilllllill;
      this.iilIiiIiIl = tick;
      this.lIiIiiIiIl = var3 == null ? class_243.field_1353 : var3.method_73189();
      this.lliIiiIiIl++;
      this.IiiIiiIiIl = IIIIllIIIl<"IIIIllIIIl","cNYWZRauYD2SFH7oXeZEPZ+Uvtu9HQtB9cmJT4uvNQfiuw==">();
   }

   public ilIlllIlIiIlllIl(IIiIIlilIiIIli owner, IiIIiIIlliIIiIIl cells, Object body) {
      this.IiiIiiIiIl = "";
      this.iIlIiiIiIl = owner;
      this.IllIiiIiIl = cells;
      this.lllIiiIiIl = body;
   }

   public boolean IiIlliIliiIl(class_746 p) {
      if (p == null || !IIIllIIliIIl(p) || !IlIlllIlilIl(p)) {
         return false;
      } else if (p.method_24828() && !p.method_5799() && !p.method_6115() && !p.method_5715()) {
         return p.method_7357().method_7904(new class_1799(class_1802.field_8634)) ? false : IIlilIliiIli(p.method_31548()) >= 0;
      } else {
         return false;
      }
   }

   private IlliIiilllliIiil IIillIiliIil(long tick, class_746 p) {
      if (tick - this.lilIiiIiIl > 40L) {
         this.Iilllilliill(tick, IIIIllIIIl<"IIIIllIIIl","m1G3KaB2XuZEJ4VOrB+1v6nmI/YfZ2J24IHiWxpdmfvCXHbxVqsX">());
         return IlliIiilllliIiil.llIiIIilil;
      } else if (!this.IiIlliIliiIl(p)) {
         this.Iilllilliill(tick, IIIIllIIIl<"IIIIllIIIl","qTPNLypoPYby+8SO2HLIF446rCehx0AERtplOnpnKw7Ja1uIxg==">());
         return IlliIiilllliIiil.llIiIIilil;
      } else {
         this.iIlIiiIiIl.IiIlliIliiIl(this.IilIiiIiIl.IliIlllilIi(), this.IilIiiIiIl.liiiIIllIl(), 2);
         class_1661 var4 = p.method_31548();
         int var5 = Illillliilli(var4);
         if (var5 < 0) {
            if (!this.IIiilIiiiIii(p, var4)) {
               this.iIiIiiIiIl = p.method_73189();
               this.IliIiiIiIl = tick;
               this.Iilllilliill(tick, IIIIllIIIl<"IIIIllIIIl","A6Adi8bwHsxK/96EydCJpy4lfuGL/cEYN1P3GpfaqO7aHscYZ3JrWjZF2u2l">());
            }

            return IlliIiilllliIiil.ilIiIIilil;
         } else {
            this.iIlIiiIiIl.Ililllililil(var5);
            if (!this.iIlIiiIiIl.IIillIiliIil(var5)) {
               return IlliIiilllliIiil.ilIiIIilil;
            } else if (Math.abs(p.method_23317() - p.field_6014) > 0.003 || Math.abs(p.method_23321() - p.field_5969) > 0.003) {
               return IlliIiilllliIiil.ilIiIIilil;
            } else if (!(Math.abs(class_3532.method_15393(this.IilIiiIiIl.IliIlllilIi() - p.method_36454())) > 0.75F)
               && !(Math.abs(this.IilIiiIiIl.liiiIIllIl() - p.method_36455()) > 0.75F)) {
               lIililiIilil var6 = this.IlIillIiilIi(p, p.method_36454(), p.method_36455(), true);
               if (var6 != null
                  && var6.IIilIIiilIilIIii < 0
                  && var6.iIIlIIiiIlIlIIii
                  && var6.IiIlIIiiliIlIIii != null
                  && IIiiIIillIiiIIil.liiiIIllIl(var6.IiIlIIiiliIlIIii, this.IilIiiIiIl.iIlIlllllill(), 2.0)
                  && this.IIIilIIiiIIi(var6.IiIlIIiiliIlIIii) != null) {
                  return IlliIiilllliIiil.IiIiIIilil;
               } else {
                  this.Iilllilliill(tick, IIIIllIIIl<"IIIIllIIIl","tMlDEqwHKfHHxovIANSVBj0D51KV9hFHHTgf1nRPm60FiGUeXQjJpUE=">());
                  return IlliIiilllliIiil.llIiIIilil;
               }
            } else {
               return IlliIiilllliIiil.ilIiIIilil;
            }
         }
      }
   }

   public int IilliliilIIi() {
      return this.lliIiiIiIl;
   }

   public lIIIlliIIIll iIlIlllllill() {
      return this.IilIiiIiIl;
   }

   private List<class_2338> Iiilliiliiil(class_243 range, class_2338 me, double anchor) {
      ArrayList var5 = new ArrayList();
      if (!(anchor < 10.0) && this.lIlIiiIiIl.field_1687 != null) {
         double var6 = (double)me.method_10263() + 0.5 - range.field_1352;
         double var8 = (double)me.method_10260() + 0.5 - range.field_1350;
         double var10 = Math.hypot(var6, var8);
         if (var10 < 0.001) {
            return var5;
         } else {
            int var12 = class_3532.method_15357(range.field_1352 + var6 / var10 * anchor);
            int var13 = class_3532.method_15357(range.field_1350 + var8 / var10 * anchor);
            ArrayList var14 = new ArrayList();

            for (int var15 = -3; var15 <= 3; var15++) {
               for (int var16 = -3; var16 <= 3; var16++) {
                  if (var15 * var15 + var16 * var16 <= 9) {
                     var14.add(new int[]{var15, var16});
                  }
               }
            }

            var14.sort((b, a) -> Integer.compare(b[0] * b[0] + b[1] * b[1], a[0] * a[0] + a[1] * a[1]));

            for (int[] var19 : var14) {
               if (var5.size() >= 3) {
                  break;
               }

               class_2338 var17 = illIIiIlIilIIiIl.liiiIIllIl(this.IllIiiIiIl, this.lIlIiiIiIl.field_1687, var12 + var19[0], var13 + var19[1]);
               if (var17 != null) {
                  var5.add(var17);
               }
            }

            return var5;
         }
      } else {
         return var5;
      }
   }

   private lIIIlliIIIll Ililllililil(long p, class_746 tick, class_2338 goals, List<class_2338> anchor) {
      class_243 var6 = tick.method_73189();
      double var7 = IiIiliIiiiIi(var6, goals);
      if (var7 < 18.0) {
         return null;
      } else {
         ArrayList var9 = new ArrayList();
         if (var7 <= 42.0) {
            for (class_2338 var11 : anchor) {
               if (var9.size() >= 3) {
                  break;
               }

               if (var11 != null && IiIiliIiiiIi(var6, var11) <= 42.0) {
                  var9.add(var11);
               }
            }
         }

         if (var9.isEmpty()) {
            var9.addAll(this.Iiilliiliiil(var6, goals, Math.min(34.0, var7 - 10.0)));
         }

         if (var9.isEmpty()) {
            return null;
         } else {
            class_243 var26 = liIiililiiIiilil.Illlllllilll(tick);
            double[] var27 = new double[]{0.0, 0.0, 0.0};
            lIIIlliIIIll var12 = null;
            double var13 = Double.NEGATIVE_INFINITY;

            for (class_2338 var16 : var9) {
               class_243 var17 = class_243.method_24955(var16);
               float var18 = liIiililiiIiilil.IiIlliIliiIl(var26, var17, 1.5, 0.03);
               iIiIiilIliIiil var19 = Iiiiilliiiil.IIillIiliIil(
                  var26, var27, var17, 90, 2.0, p, IIIIllIIIl<"IIIIllIIIl","38ffTzeBCznuZrj7tOsuvif6yNUz5jkkh8I26wkLYQGY5prbvcpSfFk=">(), -55.0, 45.0, var18
               );
               if (var19 != null && var19.iIlIlllllill() != null) {
                  class_2338 var20 = this.IIIilIIiiIIi(var19.iIlIlllllill());
                  if (var20 != null) {
                     double var21 = var7 - IiIiliIiiiIi(class_243.method_24955(var20), goals);
                     if (!(var21 < 10.0)) {
                        lIililiIilil var23 = this.IlIillIiilIi(tick, var19.IliIlllilIi(), var19.liiiIIllIl(), true);
                        if (var23 != null
                           && var23.IIilIIiilIilIIii < 0
                           && var23.IiIlIIiiliIlIIii != null
                           && IIiiIIillIiiIIil.liiiIIllIl(var23.IiIlIIiiliIlIIii, var19.iIlIlllllill(), 2.0)) {
                           double var24 = var21 - 0.05 * (double)var19.IilliliilIIi();
                           if (var24 > var13) {
                              var13 = var24;
                              var12 = new lIIIlliIIIll(
                                 var19.IliIlllilIi(),
                                 var19.liiiIIllIl(),
                                 var19.iIlIlllllill(),
                                 var20,
                                 var19.IilliliilIIi(),
                                 List.copyOf(var23.liiIIIiiiiiIIIii)
                              );
                           }
                        }
                     }
                  }
               }
            }

            return var12;
         }
      }
   }

   private lIililiIilil IlIillIiilIi(class_746 pitch, float p, float yaw, boolean entities) {
      double var5 = pitch.method_23317() - pitch.field_6014;
      double var7 = pitch.method_23321() - pitch.field_5969;
      double var9 = pitch.method_24828() ? 0.0 : pitch.method_23318() - pitch.field_6036;
      double[] var11 = Iilllilillli.IliIlllilIi(p, yaw, var5, var9, var7);
      return liIiililiiIiilil.lIiiIiIlilli(
         liIiililiiIiilil.Illlllllilll(pitch),
         new class_243(var11[0], var11[1], var11[2]),
         false,
         0,
         null,
         pitch,
         entities,
         (~2032010046 >>> 11 | ~2032010046 << 21) ^ -1741628169
      );
   }

   class_2338 IIIilIIiiIIi(class_243 landing) {
      long var5 = -20251991570180881L;
      class_2338 var2 = class_2338.method_49637(
         landing.field_1352, landing.field_1351 + Double.longBitsToDouble(-2360745848568103470L ^ -2253901213060781655L), landing.field_1350
      );
      if (lIilIiliIilIil.liiiIIllIl(this.IllIiiIiIl.IliIlllilIi(var2.method_10263(), var2.method_10264(), var2.method_10260()), 1)) {
         var2 = var2.method_10084();
      }

      var5 ^= ((long)IiIliillliIliill.iliIiiliiiii(this.IllIiiIiIl, var2.method_10263(), var2.method_10264(), var2.method_10260(), 4) << 32 ^ var5) & -1L << 32;
      if ((int)(var5 >>> 32) > (~1342094906 - -77 ^ -1342094831)) {
         return null;
      } else {
         class_2338 var4 = var2.method_10087((int)(var5 >>> 32));
         return illIIiIlIilIIiIl.IliIlllilIi(this.IllIiiIiIl, var4.method_10263(), var4.method_10264(), var4.method_10260()) ? var4 : null;
      }
   }

   static int Illillliilli(class_1661 inv) {
      for (int var1 = 0; var1 <= 8; var1++) {
         if (inv.method_5438(var1).method_31574(class_1802.field_8634)) {
            return var1;
         }
      }

      return -1;
   }

   private boolean IIiilIiiiIii(class_746 p, class_1661 inv) {
      if (!this.iliIiiIiIl && !lIlIiIliIlIiIl.Illlllllilll()) {
         if (p.field_7512 != p.field_7498) {
            return false;
         } else {
            for (int var3 = 9; var3 <= 35; var3++) {
               if (inv.method_5438(var3).method_31574(class_1802.field_8634)) {
                  int var4 = IIiIiIillIiIiIil.IIIilIIiiIIi(inv);
                  if (IIiIiIillIiIiIil.IIlllIlliIll(inv.method_5438(var4))) {
                     var4 = Iilililiiili(inv);
                  }

                  if (var4 < 0) {
                     return false;
                  }

                  if (!lIlillliIlilll.IliIlllilIi(this.lllIiiIiIl)) {
                     return true;
                  }

                  int var5 = var3;
                  int var6 = var4;
                  lIlIiIliIlIiIl.iIlIlllllill(
                     () -> {
                        class_746 var3x = this.lIlIiiIiIl.field_1724;
                        if (var3x != null && this.lIlIiiIiIl.field_1761 != null && var3x.field_7512 == var3x.field_7498) {
                           if (var3x.method_31548().method_5438(var5).method_31574(class_1802.field_8634)) {
                              if (!IIiIiIillIiIiIil.IIlllIlliIll(var3x.method_31548().method_5438(var6))) {
                                 this.lIlIiiIiIl
                                    .field_1761
                                    .method_2906(
                                       var3x.field_7498.field_7763,
                                       iiilIiIiIIIiIiIi.IliIlllilIi(var5),
                                       iiilIiIiIIIiIiIi.iIlIlllllill(var6),
                                       class_1713.field_7791,
                                       var3x
                                    );
                              }
                           }
                        }
                     },
                     true
                  );
                  this.iliIiiIiIl = true;
                  return true;
               }
            }

            return false;
         }
      } else {
         return true;
      }
   }

   static int IIlilIliiIli(class_1661 inv) {
      for (int var1 = 0; var1 <= 35; var1++) {
         if (inv.method_5438(var1).method_31574(class_1802.field_8634)) {
            return var1;
         }
      }

      return -1;
   }

   public static boolean IlIlllIlilIl(class_746 p) {
      return p != null && p.method_6032() + p.method_6067() >= 12.0F;
   }

   private static double IiIiliIiiiIi(class_243 b, class_2338 a) {
      return Math.hypot(
         (double)a.method_10263() + Double.longBitsToDouble(7942812573631124357L ^ 5898178342804919173L) - b.field_1352,
         (double)a.method_10260() + Double.longBitsToDouble(-3385721272631706144L ^ -1233000650748609056L) - b.field_1350
      );
   }

   public static boolean IIIllIIliIIl(class_746 p) {
      return p != null && p.method_6096() >= ((-2016630221 * -587345955 ^ 65) * -59 ^ 1530857170);
   }

   public String lIiiIiIlilli() {
      return this.IiiIiiIiIl;
   }

   public void IliIlllilIi() {
      this.illIiiIiIl = iiiiilllIIIIIill.illllllill;
      this.IilIiiIiIl = null;
      this.lliIiiIiIl = 0;
      this.IIiIiiIiIl = 297319266984411741L ^ -2008523742229282211L;
      this.iIiIiiIiIl = null;
      this.iliIiiIiIl = false;
      this.IiiIiiIiIl = "";
   }

   public void Iilllilliill(long reason, String tick) {
      if (this.illIiiIiIl != iiiiilllIIIIIill.lilllllill) {
         this.illIiiIiIl = iiiiilllIIIIIill.illllllill;
         this.IIiIiiIiIl = reason + (1937563887295396556L ^ 1937563887295396592L);
         this.IiiIiiIiIl = tick;
      }
   }

   public boolean iliIiiliiiii() {
      return this.illIiiIiIl != iiiiilllIIIIIill.illllllill;
   }

   public IlliIiilllliIiil IIlllIlliIll(long goals, class_2338 anchor, Supplier<List<class_2338>> tick) {
      class_746 var5 = this.lIlIiiIiIl.field_1724;
      if (var5 != null && this.lIlIiiIiIl.field_1687 != null) {
         if (this.iliIiiIiIl && !lIlIiIliIlIiIl.Illlllllilll()) {
            this.iliIiiIiIl = false;
         }

         if (anchor == null && this.illIiiIiIl != iiiiilllIIIIIill.lilllllill) {
            if (this.illIiiIiIl == iiiiilllIIIIIill.Iilllllill) {
               this.Iilllilliill(goals, IIIIllIIIl<"IIIIllIIIl","qGpyHrXFL/qqbUPbowjnjnw1DARgJ/GHghswqGbV4drBZqLvhQ==">());
            }

            return IlliIiilllliIiil.llIiIIilil;
         } else {
            switch (this.illIiiIiIl) {
               case Iilllllill:
                  return this.IIillIiliIil(goals, var5);
               case lilllllill:
                  if (!(var5.method_73189().method_1022(this.lIiIiiIiIl) > 3.0) && goals - this.iilIiiIiIl <= (long)(this.IilIiiIiIl.lIiiIiIlilli() + 30)) {
                     return IlliIiilllliIiil.ilIiIIilil;
                  }

                  this.illIiiIiIl = iiiiilllIIIIIill.illllllill;
                  this.IIiIiiIiIl = goals + 20L;
                  return IlliIiilllliIiil.llIiIIilil;
               default:
                  if (goals >= this.IIiIiiIiIl && this.lliIiiIiIl < 6 && this.IiIlliIliiIl(var5)) {
                     if (this.iIiIiiIiIl != null && var5.method_73189().method_1022(this.iIiIiiIiIl) < 6.0 && goals - this.IliIiiIiIl < 100L) {
                        return IlliIiilllliIiil.llIiIIilil;
                     } else {
                        this.IIiIiiIiIl = goals + 20L;
                        lIIIlliIIIll var6 = this.Ililllililil(goals, var5, anchor, tick == null ? List.of() : (List)tick.get());
                        if (var6 == null) {
                           this.iIiIiiIiIl = var5.method_73189();
                           this.IliIiiIiIl = goals;
                           return IlliIiilllliIiil.llIiIIilil;
                        } else {
                           this.iIiIiiIiIl = null;
                           this.IilIiiIiIl = var6;
                           this.illIiiIiIl = iiiiilllIIIIIill.Iilllllill;
                           this.lilIiiIiIl = goals;
                           this.IiiIiiIiIl = IIIIllIIIl<"IIIIllIIIl","42puD9/8NAsAEbH7Gathv3X0qeRqQ2Hv9Qq49JEjBE1e8g==">();
                           return this.IIillIiliIil(goals, var5);
                        }
                     }
                  } else {
                     return IlliIiilllliIiil.llIiIIilil;
                  }
            }
         }
      } else {
         return IlliIiilllliIiil.llIiIIilil;
      }
   }
}
