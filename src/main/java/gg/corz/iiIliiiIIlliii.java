package gg.corz;

import net.minecraft.class_4587;
import org.joml.Matrix3x2fStack;

public final class iiIliiiIIlliii {
   private float iiIiIIIlIl;
   public float IiliIIIlIl;
   public float liliIIIlIl;
   private long IlliIIIlIl;
   private int llliIIIlIl;
   private boolean iIliIIIlIl;
   private float liIiIIIlIl = 1.0F;
   private float lIliIIIlIl;
   public float illiIIIlIl;
   private float IIliIIIlIl;

   public void iliIiiliiiii(class_4587 ms, float k) {
      ms.method_22903();
      ms.method_23760().method_23761().identity();
      ms.method_46416(this.IiliIIIlIl * k, this.liliIIIlIl * k, 0.0F);
      ms.method_22905(this.illiIIIlIl, this.illiIIIlIl, 1.0F);
      ms.method_46416(-this.IiliIIIlIl * k, -this.liliIIIlIl * k, 0.0F);
   }

   public void IIIllIIliIIl(Matrix3x2fStack m) {
      m.translate(this.IiliIIIlIl, this.liliIIIlIl);
      m.scale(this.illiIIIlIl, this.illiIIIlIl);
      m.translate(-this.IiliIIIlIl, -this.liliIIIlIl);
   }

   public iiIliiiIIlliii() {
      this.iiIiIIIlIl = 1.0F;
      this.llliIIIlIl = -1;
      this.illiIIIlIl = 1.0F;
   }

   public void IilliliilIIi(class_4587 ms) {
      ms.method_22903();
      ms.method_46416(this.IiliIIIlIl, this.liliIIIlIl, 0.0F);
      ms.method_22905(this.illiIIIlIl, this.illiIIIlIl, 1.0F);
      ms.method_46416(-this.IiliIIIlIl, -this.liliIIIlIl, 0.0F);
   }

   private float IliIlllilIi() {
      if (this.llliIIIlIl == IIililillIililil.iiillIllil) {
         return this.iiIiIIIlIl;
      } else {
         this.llliIIIlIl = IIililillIililil.iiillIllil;
         long var1 = System.nanoTime();
         if (this.iiIiIIIlIl != this.liIiIIIlIl) {
            float var3 = this.IlliIIIlIl == 0L ? 0.0F : (float)(var1 - this.IlliIIIlIl) / 1.0E9F;
            if (var3 > 0.25F) {
               this.iiIiIIIlIl = this.liIiIIIlIl;
            } else {
               this.iiIiIIIlIl = this.iiIiIIIlIl + (this.liIiIIIlIl - this.iiIiIIIlIl) * (1.0F - (float)Math.exp((double)(-var3 / 0.045F)));
               if (Math.abs(this.liIiIIIlIl - this.iiIiIIIlIl) < 0.0015F) {
                  this.iiIiIIIlIl = this.liIiIIIlIl;
               }
            }
         }

         this.IlliIIIlIl = var1;
         return this.iiIiIIIlIl;
      }
   }

   public float liiiIIllIl(float v) {
      return this.IiliIIIlIl + (v - this.IiliIIIlIl) * this.illiIIIlIl;
   }

   public void lIiiIiIlilli(class_4587 ms, float k) {
      ms.method_22903();
      ms.method_46416(this.IiliIIIlIl * k, this.liliIIIlIl * k, 0.0F);
      ms.method_22905(this.illiIIIlIl, this.illiIIIlIl, 1.0F);
      ms.method_46416(-this.IiliIIIlIl * k, -this.liliIIIlIl * k, 0.0F);
   }

   public float iIlIlllllill(float v) {
      return this.liliIIIlIl + (v - this.liliIIIlIl) * this.illiIIIlIl;
   }
}
