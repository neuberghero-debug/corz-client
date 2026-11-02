package gg.corz;

import java.util.ArrayDeque;
import net.minecraft.class_10370;
import net.minecraft.class_1309;
import net.minecraft.class_1675;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2797;
import net.minecraft.class_2805;
import net.minecraft.class_2811;
import net.minecraft.class_2813;
import net.minecraft.class_2820;
import net.minecraft.class_2824;
import net.minecraft.class_2828;
import net.minecraft.class_2840;
import net.minecraft.class_2846;
import net.minecraft.class_2863;
import net.minecraft.class_2873;
import net.minecraft.class_2877;
import net.minecraft.class_2885;
import net.minecraft.class_2886;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_7472;
import net.minecraft.class_9449;
import net.minecraft.class_239.class_240;
import net.minecraft.class_2846.class_2847;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.joml.Matrix4f;

public class llIIIIIlilIIIIIl extends ilIllIiIll {
   private static final double ilIlIiIlIl = 3.0;
   private int lillIiIlIl;
   private static final double IlIlIiIlIl = 10.0;
   private static final int liIlIiIlIl = 1078233343;
   private class_243 iillIiIlIl;
   private long lIilIiIlIl;
   private static final double IiIlIiIlIl = 0.0025;
   private final lliliIIiililiIIi iIllIiIlIl = new lliliIIiililiIIi(
      IliIlllilIi<"IliIlllilIi","zvbIlPx1ck5pQmSF4zALiddsyBxRAW48627qIXRLtxg=">(),
      IliIlllilIi<"IliIlllilIi","hkRkPifIwf1KAfB+wf5YlEvu7rvZemqwxYYBQTJmxaJZe/P8rC/jxWTh0/vSbOye2MWQZoCz6gyRKPLkP4tYPnnDbh/OdA112AjeAjp4Y5oSeQSAiui1cYVyI+gUk4OBlrsFGZptcURScG5feGl27n87bppavB5ZUAoI9oCNwA==">(),
      IliIlllilIi<"IliIlllilIi","iCaht4qm30XMtu70IdEI3xW+2H61ZfsmFVnCfRG+JjHJsLw=">(),
      IliIlllilIi<"IliIlllilIi","NkF2Z0zsSpP5nyg8uQeVITz2IXOaHWb8mL3EbI3avcx9e5E=">(),
      IliIlllilIi<"IliIlllilIi","iCaht4qm30XMtu70IdEI3xW+2H61ZfsmFVnCfRG+JjHJsLw=">()
   );
   private long iIilIiIlIl;
   private final IiIllliliIllli IillIiIlIl;
   private final ArrayDeque<lIIllIlliIIllIll> illlIiIlIl;
   private long llilIiIlIl;
   private final iiIiiilIIliiil llllIiIlIl;
   private static final long llIlIiIlIl = 500L;
   private class_243 IIilIiIlIl;
   private static final float IIllIiIlIl = 1.5F;
   private static final int iiIlIiIlIl = -1438349057;
   private final iilliIlIIiliIl IlllIiIlIl = new iilliIlIIiliIl(
      IliIlllilIi<"IliIlllilIi","KRY/8Pz/lT5lQXDO9UmPCtPV+/JBSD5tOiMgzU6bOkQS">(),
      IliIlllilIi<"IliIlllilIi","ZzzfQgG93oDPOOZ3olA/nWJCjhmP/3xSYPY89hrnDa/lGup97/XYcb7F0C6OYXzNQWlL+tb2SthlsDLJiPauZA8OGXS1Z+gfcKpE+Qo9HjcX4HBXKXDCfjtWCKYps84=">(),
      100,
      10,
      1000,
      10
   );
   private long IlilIiIlIl;
   private static final lilllliiilllli lIllIiIlIl = lilllliiilllli.IIliIiIIIl.IilliliilIIi(true);

   private void iIlllIllll(IiIiIlIiliIiIlIi moved, class_243 event) {
      if (event != null && !moved.IilliliilIIi()) {
         if (this.illlIiIlIl.isEmpty()) {
            this.IIilIiIlIl = event;
         } else {
            this.illlIiIlIl.addLast(new lIIllIlliIIllIll(event, 0L));
         }
      }
   }

   private void iilllIIill() {
      this.illlIiIlIl.clear();
      this.lillIiIlIl = -1;
      this.iillIiIlIl = null;
      this.IIilIiIlIl = null;
      this.lIilIiIlIl = 0L;
      this.iIilIiIlIl = -246764351101195405L ^ 8976607685753580403L;
      this.IlilIiIlIl = 0L;
   }

   private static boolean ilIllIiIll(class_2596<?> p) {
      return p instanceof class_2824
         || p instanceof class_2885
         || p instanceof class_2886
         || p instanceof class_2846
         || p instanceof class_2797
         || p instanceof class_7472
         || p instanceof class_9449
         || p instanceof class_2805
         || p instanceof class_2873
         || p instanceof class_2811
         || p instanceof class_2863
         || p instanceof class_2840
         || p instanceof class_2877
         || p instanceof class_2820
         || p instanceof class_10370;
   }

   @Override
   protected void IIiilIiiiIii(illlllIillll event) {
      if (this.llllIiIlIl.Iilllilliill() && Iiiilllliiilll.field_1724 != null) {
         this.lllllillll(IIIiillllIIiilll.IliIlllilIi());
         class_243 var2 = this.IIilIiIlIl;
         if (var2 != null && iiIliillIIlliill.iIlIlllllill(this)) {
            if (!(var2.method_1025(Iiiilllliiilll.field_1724.method_73189()) < 0.0025)) {
               float var3 = Iiiilllliiilll.field_1724.method_17681() / 2.0F;
               float var4 = Iiiilllliiilll.field_1724.method_17682();
               if (!iIiiIIilIliiIIil.IlIillIiilIi(var2.field_1352, var2.field_1351 + (double)var4 / 2.0, var2.field_1350, var4)) {
                  Matrix4f var5 = iIiiIIilIliiIIil.IIillIiliIil();
                  float var6 = iIiiIIilIliiIIil.Ililllililil(var2.field_1352 - (double)var3);
                  float var7 = iIiiIIilIliiIIil.Iiilliiliiil(var2.field_1351);
                  float var8 = iIiiIIilIliiIIil.IIIilIIiiIIi(var2.field_1350 - (double)var3);
                  float var9 = iIiiIIilIliiIIil.Ililllililil(var2.field_1352 + (double)var3);
                  float var10 = iIiiIIilIliiIIil.Iiilliiliiil(var2.field_1351 + (double)var4);
                  float var11 = iIiiIIilIliiIIil.IIIilIIiiIIi(var2.field_1350 + (double)var3);
                  iIiiIIilIliiIIil.IIlilIliiIli(var5, var6, var7, var8, var9, var10, var11, 0.26666668F, 0.53333336F, 1.0F, 0.2509804F);
                  iIiiIIilIliiIIil.iIIIlIlIIl(var5, var6, var7, var8, var9, var10, var11, -1438349057, 1.5F);
               }
            }
         }
      }
   }

   @Override
   protected void Illillliilli() {
      this.iilllIIill();
      this.IillIiIlIl.IliIlllilIi(Iiiilllliiilll.field_1687);
      this.llilIiIlIl = IIIiillllIIiilll.iIlIlllllill();
      this.IIilIiIlIl = Iiiilllliiilll.field_1724 != null ? Iiiilllliiilll.field_1724.method_73189() : null;
   }

   private void IIllllIlll() {
      this.lIilIiIlIl = 0L;
      if (iiIliillIIlliill.iIlIlllllill(this)) {
         iiIliillIIlliill.iliIiiliiiii(this);
      }

      this.Iillllilll();
   }

   private void Iillllilll() {
      lIIllIlliIIllIll var1 = this.illlIiIlIl.peekLast();
      if (var1 != null) {
         this.IIilIiIlIl = var1.IliIlllilIi();
      }

      this.illlIiIlIl.clear();
   }

   private static boolean IlIllllIll(class_2596<?> p) {
      if (p instanceof class_2824 var2) {
         return IIIliiIilIIliiIi.IliIlllilIi(var2);
      } else if (p instanceof class_2813) {
         return true;
      } else {
         if (p instanceof class_2846 var1 && var1.method_12363() == class_2847.field_12969) {
            return true;
         }

         return false;
      }
   }

   private boolean iiiIlIIIll() {
      return IliIlllilIi<"IliIlllilIi","iCaht4qm30XMtu70IdEI3xW+2H61ZfsmFVnCfRG+JjHJsLw=">().equals(this.iIllIiIlIl.Iilllilliill());
   }

   private boolean lIIlliIIll(long previous, class_243 now, class_243 moved) {
      if (previous < this.IlilIiIlIl) {
         return false;
      } else if (Iiiilllliiilll.field_1724.method_6115() && !Iiiilllliiilll.field_1724.method_6039()) {
         return false;
      } else if (!Iiiilllliiilll.field_1724.method_24828()
         && Iiiilllliiilll.field_1724.field_6017 > Double.longBitsToDouble(7181978356480884175L ^ 2568040538239811023L)) {
         return false;
      } else {
         if (!(
               (this.lillIiIlIl == (-453077031 * 49 ^ 89 ^ 725937967) ? null : Iiiilllliiilll.field_1687.method_8469(this.lillIiIlIl)) instanceof class_1309 var6
            )
            || var6.method_31481()
            || !var6.method_5805()) {
            return false;
         }

         if (moved != null && now != null) {
            double var7 = Iiiilllliiilll.field_1724.method_23320() - Iiiilllliiilll.field_1724.method_23318();
            double var9 = (double)var6.method_17681() / Double.longBitsToDouble(-5234543533902931928L ^ -622857515475544024L);
            double var11 = (double)var6.method_17682();
            double var13 = lIlIlIIiiIlIlIIi.IliIlllilIi(
               now.field_1352, now.field_1351 + var7, now.field_1350, var6.method_23317(), var6.method_23318(), var6.method_23321(), var9, var11
            );
            double var15 = lIlIlIIiiIlIlIIi.IliIlllilIi(
               moved.field_1352, moved.field_1351 + var7, moved.field_1350, var6.method_23317(), var6.method_23318(), var6.method_23321(), var9, var11
            );
            return !IllIIlIilllIIlIi.liiiIIllIl(var13, var15);
         } else {
            return true;
         }
      }
   }

   public llIIIIIlilIIIIIl() {
      super(IliIlllilIi<"IliIlllilIi","eVjw/zOgOsYRV14TeJqq8vHtp3PnLGszzCke6TvxsmKRGMOL">(), lllIllillIll.iiIlIIIiIIllIIIi);
      this.llllIiIlIl = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","htceAfvWbb90VUd56zghsa29rd9yktbh4TQ+WrQHZsP8Xw==">(),
         IliIlllilIi<"IliIlllilIi","nSBMNA05TNeqtq7sXCsWg6v/Gr+lqKNlGsklCziE4RjcZrAOZR5xXFx4+rMXWDR5V73eUsMAqF8LW6YPt6/DA9pvObRxanh0hHgewxnIn3d4ikqGdarTEAXFIvNcsbw=">(),
         true
      );
      this.illlIiIlIl = new ArrayDeque<>();
      this.IillIiIlIl = new IiIllliliIllli();
      this.lillIiIlIl = -1;
      this.iIilIiIlIl = Long.MIN_VALUE;
      this.llilIiIlIl = -1L;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iIllIiIlIl, this.IlllIiIlIl, this.llllIiIlIl});
   }

   private void lllllillll(long now) {
      if (!this.illlIiIlIl.isEmpty()) {
         if (!iiIliillIIlliill.iIlIlllllill(this)) {
            this.Iillllilll();
         } else {
            while (!this.illlIiIlIl.isEmpty() && this.illlIiIlIl.peekFirst().liiiIIllIl() <= now) {
               this.IIilIiIlIl = this.illlIiIlIl.pollFirst().IliIlllilIi();
            }
         }
      }
   }

   @Override
   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         if (!this.IillIiIlIl.liiiIIllIl(Iiiilllliiilll.field_1687)) {
            iiIliillIIlliill.iliIiiliiiii(this);
            this.iilllIIill();
            this.IillIiIlIl.IliIlllilIi(Iiiilllliiilll.field_1687);
            this.IIilIiIlIl = Iiiilllliiilll.field_1724.method_73189();
         }

         long var1 = IIIiillllIIiilll.iIlIlllllill();
         if (var1 != this.llilIiIlIl) {
            this.llilIiIlIl = var1;
            this.iillIiIlIl = null;
            this.lIilIiIlIl = 0L;
            this.illlIiIlIl.clear();
            this.IIilIiIlIl = Iiiilllliiilll.field_1724.method_73189();
         }

         boolean var3 = this.iiiIlIIIll();
         this.lillIiIlIl = var3 ? this.liIlliiIll() : -1;
         if (var3 && this.lillIiIlIl == -1) {
            this.IIllllIlll();
         }

         this.lllllillll(IIIiillllIIiilll.IliIlllilIi());
      }
   }

   @Override
   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      if (Iiiilllliiilll.method_18854() && Iiiilllliiilll.field_1724 != null && this.IillIiIlIl.liiiIIllIl(Iiiilllliiilll.field_1687)) {
         if (!event.lIiiIiIlilli()) {
            class_2596 var2;
            long var3;
            long var5;
            class_243 var7;
            class_243 var10000;
            label60: {
               var2 = event.lIiilIIIIi;
               var3 = IIIiillllIIiilll.IliIlllilIi();
               var5 = IIllIIlilIllIIli.IlIlllIlilIl();
               var7 = this.iillIiIlIl;
               if (var2 instanceof class_2828 var9 && var9.method_36171()) {
                  var10000 = new class_243(var9.method_12269(0.0), var9.method_12268(0.0), var9.method_12274(0.0));
                  break label60;
               }

               var10000 = null;
            }

            class_243 var8 = var10000;
            if (var8 != null) {
               this.iillIiIlIl = var8;
            }

            if (IlIllllIll(var2)) {
               this.IIllllIlll();
               this.iIilIiIlIl = var5;
               this.iIlllIllll(event, var8);
            } else if (this.iIilIiIlIl != var5 && !Iiiilllliiilll.field_1724.method_29504()) {
               long var11;
               if (this.iiiIlIIIll()) {
                  if (ilIllIiIll(var2)) {
                     this.IIllllIlll();
                     this.iIilIiIlIl = var5;
                     if (var2 instanceof class_2885) {
                        this.IlilIiIlIl = var3 + 500L;
                     }

                     this.iIlllIllll(event, var8);
                     return;
                  }

                  if (!this.lIIlliIIll(var3, var7, var8)) {
                     this.IIllllIlll();
                     this.iIlllIllll(event, var8);
                     return;
                  }

                  var11 = IllIIlIilllIIlIi.IliIlllilIi(var3, (long)this.IlllIiIlIl.Iilllilliill(), this.lIilIiIlIl);
               } else {
                  var11 = var3 + (long)this.IlllIiIlIl.Iilllilliill();
               }

               if (var11 > var3 && iiIliillIIlliill.IliIlllilIi(this, event, var11)) {
                  if (var8 != null) {
                     this.lIilIiIlIl = var11;
                     this.illlIiIlIl.addLast(new lIIllIlliIIllIll(var8, var11));
                  }
               } else {
                  this.iIlllIllll(event, var8);
               }
            } else {
               this.iIlllIllll(event, var8);
            }
         }
      }
   }

   private int liIlliiIll() {
      class_243 var1 = Iiiilllliiilll.field_1724.method_33571();
      class_243 var2 = ilIiiIiIii.Iiilliiliiil(iIiIlillIliIlill.ilillIiill(), iIiIlillIliIlill.liilliiill());
      class_243 var3 = var1.method_1019(var2.method_1021(Double.longBitsToDouble(-5448532694783934543L ^ -844727975704445007L)));
      class_3965 var4 = Iiiilllliiilll.field_1687
         .method_17742(new class_3959(var1, var3, class_3960.field_17558, class_242.field_1348, Iiiilllliiilll.field_1724));
      if (var4 != null && var4.method_17783() != class_240.field_1333) {
         var3 = var4.method_17784();
      }

      class_238 var5 = Iiiilllliiilll.field_1724.method_5829().method_18804(var3.method_1020(var1)).method_1014(1.0);
      class_3966 var6 = class_1675.method_18075(
         Iiiilllliiilll.field_1724,
         var1,
         var3,
         var5,
         e -> e != Iiiilllliiilll.field_1724 && !e.method_7325() && e.method_5863() && liiIIIlliiiIIIll.IliIlllilIi(e, lIllIiIlIl),
         var1.method_1025(var3)
      );
      return var6 != null && var6.method_17782() instanceof class_1309 var7 ? var7.method_5628() : -1;
   }

   @Override
   protected void Iilililiiili() {
      iiIliillIIlliill.iliIiiliiiii(this);
      this.iilllIIill();
      this.IillIiIlIl.iIlIlllllill();
   }
}
