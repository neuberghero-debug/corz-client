package gg.corz;

import net.minecraft.class_1802;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_746;

public final class Iliilllllliillll {
   private final class_310 iililiIill = class_310.method_1551();
   private final IIiIIlilIiIIli IIiiliIill;
   private int liiiliIill;
   public static final double lililiIill = 2.0;
   private class_243 lliiliIill;
   private final IllIllIllllIllIl IliiliIill;
   public static final double illiliIill = 1.2;
   private int IiiiliIill;
   private iIIIllilIlIIllil lIiiliIill;
   public static final int IililiIill = 12;
   private final liliilIiiiliilIi iIiiliIill = new liliilIiiiliilIi();
   private int iliiliIill;

   public Iliilllllliillll(IIiIIlilIiIIli body) {
      this.IliiliIill = new IllIllIllllIllIl();
      this.IIiiliIill = body;
   }

   public illiiIilIiliiIil lIiiIiIlilli(long target, class_243 sprint, boolean tick) {
      class_746 var5 = this.iililiIill.field_1724;
      if (var5 != null && sprint != null) {
         if (this.lIiiliIill == null) {
            this.lIiiliIill = iIIIllilIlIIllil.IIIllIIliIIl(null, null);
         }

         if (this.lliiliIill == null || this.lliiliIill.method_1025(sprint) > 4.0) {
            this.lliiliIill = sprint;
            this.IliiliIill.IliIlllilIi();
            this.liiiliIill = 0;
         }

         class_243 var6 = var5.method_73189();
         double var7 = Math.hypot(sprint.field_1352 - var6.field_1352, sprint.field_1350 - var6.field_1350);
         if (var7 <= 1.2 && Math.abs(sprint.field_1351 - var6.field_1351) <= 1.5) {
            return illiiIilIiliiIil.iliililIil;
         } else {
            boolean var9 = var5.method_6079().method_31574(class_1802.field_8288) || var5.method_6047().method_31574(class_1802.field_8288);
            this.lIiiliIill
               .IiIlliIliiIl(
                  new lIlIilIiiIlIilIi(
                     Math.max(1.0F, var5.method_6032() + var5.method_6067()),
                     var9,
                     liliilIiiiliilIi.IiIlliIliiIl(var5),
                     -1,
                     var5.method_5753(),
                     var5.method_7344().method_7586(),
                     var5.method_6115(),
                     0,
                     2
                  )
               );
            iIllIlllIlllIlll var10 = iIllIlllIlllIlll.IliIlllilIi(sprint);
            boolean var15 = false;
            boolean var16 = tick;
            double var11;
            double var13;
            if (this.lIiiliIill.Iilllilliill(target, var6, var10)) {
               var11 = sprint.field_1352 - var6.field_1352;
               var13 = sprint.field_1350 - var6.field_1350;
            } else {
               illiIiIlIiliIiIl var17 = this.lIiiliIill
                  .Ililllililil(target, var6, var5.method_18798(), var5.method_24828(), var5.field_5976, var5.method_5799(), var10);
               if (var17 == null) {
                  return illiiIilIiliiIil.IiiililIil;
               }

               if (var17.iliIiiliiiii() && this.lIiiliIill.IliIlllilIi() != iiilllIIIill.llilllIiililllIi) {
                  return var7 <= 2.4 ? illiiIilIiliiIil.iliililIil : illiiIilIiliiIil.IiiililIil;
               }

               if (!var17.IliIlllilIi()) {
                  if (this.lIiiliIill.IliIlllilIi() == iiilllIIIill.IiilllIiliilllIi && ++this.liiiliIill > 60) {
                     return illiiIilIiliiIil.IiiililIil;
                  }

                  return illiiIilIiliiIil.lliililIil;
               }

               var11 = var17.liiiIIllIl();
               var13 = var17.iIlIlllllill();
               var15 = var17.IilliliilIIi();
               var16 = tick || var17.lIiiIiIlilli();
            }

            iiiIilllIIIlilll var19 = this.IliiliIill.liiiIIllIl(true, var6.field_1352, var6.field_1350, var7, var5.field_5976, var5.method_24828());
            switch (var19) {
               case IlillIlill:
                  var15 = true;
                  break;
               case llillIlill:
                  int[] var20 = this.lIiiliIill.iIiIlIliIl();
                  if (var20 != null) {
                     this.lIiiliIill.illIlIilIl(var20[0], var20[1], var20[2], target);
                  }
                  break;
               case ilillIlill:
                  this.IiiiliIill = this.iIlIlllllill(var5, var6);
                  this.iliiliIill = this.IiiiliIill == 0 ? 0 : 12;
                  if (this.IiiiliIill == 0) {
                     int[] var18 = this.lIiiliIill.iIiIlIliIl();
                     if (var18 != null) {
                        this.lIiiliIill.illIlIilIl(var18[0], var18[1], var18[2], target);
                     }
                  }
                  break;
               case IiillIlill:
                  this.lIiiliIill.lilIliilIl(target);
                  return illiiIilIiliiIil.IiiililIil;
            }

            if (this.iliiliIill > 0) {
               this.iliiliIill--;
               if (this.liiiIIllIl(var5, var6, this.IiiiliIill == 4 ? 1 : -1)) {
                  this.IIiiliIill.IilliliilIIi(this.IiiiliIill | 32);
                  this.IIiiliIill.Iilililiiili(var11, var13, false, false);
                  return illiiIilIiliiIil.lliililIil;
               }

               this.iliiliIill = 0;
            }

            if (var5.method_5799()) {
               var15 = true;
            }

            this.IIiiliIill.Iilililiiili(var11, var13, var16, var15);
            return illiiIilIiliiIil.lliililIil;
         }
      } else {
         return illiiIilIiliiIil.IiiililIil;
      }
   }

   public String IilliliilIIi() {
      return this.lIiiliIill == null ? iliIiiliiiii<"iliIiiliiiii","ktqIz5vgQTHym/iLlSuC2nghentzMQWriWY8q6g=">() : this.lIiiliIill.IliIlllilIi().name();
   }

   private boolean liiiIIllIl(class_746 p, class_243 pos, int side) {
      double var4 = Math.toRadians((double)p.method_36454());
      double var6 = Math.cos(var4) * (double)side;
      double var8 = Math.sin(var4) * (double)side;
      class_243 var10 = new class_243(
         pos.field_1352 + var6 * Double.longBitsToDouble(4186730908178805963L ^ 8798416926606193867L),
         pos.field_1351,
         pos.field_1350 + var8 * Double.longBitsToDouble(2481789403289091275L ^ 7093475421716479179L)
      );
      return iiliillIIiiill.lIiiIiIlilli(
         this.iIiiliIill, pos, var10, true, Double.longBitsToDouble(522013942019755439L ^ 5133699960447143343L), Math.min(this.lIiiliIill.lIiiIiIlilli(), 3)
      );
   }

   private int iIlIlllllill(class_746 pos, class_243 p) {
      if (this.liiiIIllIl(pos, p, 1)) {
         return 4;
      } else {
         return this.liiiIIllIl(pos, p, -1) ? -(298921459 + 109) - 21 + 115 ^ -298921482 : 0;
      }
   }

   public void IliIlllilIi() {
      if (this.lIiiliIill != null) {
         this.lIiiliIill.IiiIlliiIl();
      }

      this.IliiliIill.IliIlllilIi();
      this.lliiliIill = null;
      this.iliiliIill = 0;
      this.IiiiliIill = 0;
      this.liiiliIill = 0;
   }
}
