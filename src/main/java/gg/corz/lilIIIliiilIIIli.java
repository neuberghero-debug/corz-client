package gg.corz;

import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;

public final class lilIIIliiilIIIli {
   private float iillIlIlIi;
   private float lillIlIlIi;
   public static final int ilIlIlIlIi = 1;
   public static final int llIlIlIlIi = 0;
   private int IlllIlIlIi;
   public static final int IiIlIlIlIi = 2;
   private final float IIllIlIlIi;
   private float lIllIlIlIi = 30.0F;
   private final float iiIlIlIlIi;
   private static final class_310 liIlIlIlIi = class_310.method_1551();
   private boolean IillIlIlIi;
   private float IIilIlIlIi;
   private float llllIlIlIi;
   private float illlIlIlIi;
   private boolean iIllIlIlIi;
   private float lIilIlIlIi;

   public void iliIiiliiiii(iIIlIlIlIlIlIlIl e) {
      if (this.IillIlIlIi && liIlIlIlIi.field_1724 != null) {
         float var2 = e.Illlllllilll();
         e.IlIlllIlilIl(class_3532.method_17821(var2, this.lillIlIlIi, this.IIilIlIlIi));
         e.IIlllIlliIll(class_3532.method_16439(var2, this.iillIlIlIi, this.lIilIlIlIi));
         e.IIillIiliIil();
      }
   }

   public void lIiiIiIlilli() {
      if (liIlIlIlIi.field_1724 == null) {
         this.IillIlIlIi = false;
      } else if (!this.iIllIlIlIi) {
         this.IillIlIlIi = false;
      } else {
         this.lillIlIlIi = liIlIlIlIi.field_1724.method_36454();
         this.iillIlIlIi = liIlIlIlIi.field_1724.method_36455();
         float var1 = lilllliillll.liiiIIllIl(this.lillIlIlIi, this.llllIlIlIi, this.iiIlIlIlIi, this.lIllIlIlIi, this.IIllIlIlIi);
         float var2 = class_3532.method_15363(
            lilllliillll.liiiIIllIl(this.iillIlIlIi, this.illlIlIlIi, this.iiIlIlIlIi, this.lIllIlIlIi, this.IIllIlIlIi), -90.0F, 90.0F
         );
         liIlIlIlIi.field_1724.method_36456(var1);
         liIlIlIlIi.field_1724.method_36457(var2);
         this.IIilIlIlIi = var1;
         this.lIilIlIlIi = var2;
         this.IillIlIlIi = true;
      }
   }

   public void iIlIlllllill(float pitch, float yaw, int prio) {
      if (!this.iIllIlIlIi || prio >= this.IlllIlIlIi) {
         this.iIllIlIlIi = true;
         this.IlllIlIlIi = prio;
         this.llllIlIlIi = pitch;
         this.illlIlIlIi = class_3532.method_15363(yaw, -90.0F, 90.0F);
      }
   }

   public lilIIIliiilIIIli(float fraction, float minStep) {
      this.iiIlIlIlIi = fraction;
      this.IIllIlIlIi = minStep;
   }

   public void IilliliilIIi(class_243 target, int prio) {
      if (liIlIlIlIi.field_1724 != null && target != null) {
         float[] var3 = ilIiiIiIii.Ililllililil(liIlIlIlIi.field_1724.method_33571(), target);
         this.iIlIlllllill(var3[0], var3[1], prio);
      }
   }

   public void liiiIIllIl() {
      this.iIllIlIlIi = false;
   }

   public void IliIlllilIi(float cap) {
      this.lIllIlIlIi = class_3532.method_15363(cap, 4.0F, 60.0F);
   }

   public boolean IlIlllIlilIl(class_243 tol, float target) {
      if (liIlIlIlIi.field_1724 != null && tol != null) {
         float[] var3 = ilIiiIiIii.Ililllililil(liIlIlIlIi.field_1724.method_33571(), tol);
         return this.IIIllIIliIIl(var3[0], var3[1], target);
      } else {
         return false;
      }
   }

   public boolean IIIllIIliIIl(float yaw, float pitch, float tol) {
      if (liIlIlIlIi.field_1724 == null) {
         return false;
      } else {
         float var4 = Math.abs(class_3532.method_15393(yaw - liIlIlIlIi.field_1724.method_36454()));
         float var5 = Math.abs(pitch - liIlIlIlIi.field_1724.method_36455());
         return var4 <= tol && var5 <= tol;
      }
   }

   public void IiIlliIliiIl() {
      this.iIllIlIlIi = false;
      this.IillIlIlIi = false;
   }
}
