package gg.corz;

import net.minecraft.class_10055;
import net.minecraft.class_591;
import net.minecraft.class_630;
import org.joml.Vector3f;

final class IIIlilIIli extends class_591 {
   static final float iIiIliiIliIlii = -4.0F;
   static final float llIIliiilIIlii = 0.12F;
   final Vector3f iIllliiIllllii;
   static final float iiIIliiIIlIlii = 0.12F;
   boolean liIlliiiiIllii;
   float ilIlliiIiIllii = 1.0F;
   static final float IiiIliiliiIlii = 0.12F;
   static final float lliIliiiliIlii = 0.12F;
   static final float IIIIliilIIIlii = 0.35F;
   static final float illIliiIilIlii = 0.3F;
   static final float iIIIliiIlIIlii = 0.5F;
   static final float IIiIliilIiIlii = 0.5F;
   lliIllIliliIllIl IIllliilIlllii;
   static final float lilIliiiilIlii = -0.4F;
   final Vector3f llllliiillllii;
   static final float IiIIliiliIIlii = 5.0F;
   static final float IlIlliillIllii = (float)Math.toRadians(12.0);
   static final float lIiiIiiiIiiIii = 0.32F;
   static final float iliiIiiIiiiIii = 0.06F;
   static final float IliiIiilliiIii = 0.22F;
   static final float iiiIliiIIIllii = 0.06F;
   static final float liiiIiiiiiiIii = 0.07F;
   static final float lIlIliiiIlIlii = -1.45F;
   static final float IllIliilllIlii = -0.08F;
   static final float lIIlliiiIIllii = (float)Math.toRadians(20.0);

   IIIlilIIli(class_630 root, boolean slim) {
      super(root, slim);
      this.iIllliiIllllii = new Vector3f();
      this.llllliiillllii = new Vector3f();
   }

   private static float liiiIIllIl(float a, float t, float b) {
      return a + (t - a) * b;
   }

   private void IliIlllilIi(lliIllIliliIllIl a) {
      float var2 = this.field_3401.field_3654;
      float var3 = this.field_3401.field_3675;
      float var4 = this.field_3401.field_3674;
      float var5 = this.iIllliiIllllii.x - this.field_3401.field_3657;
      float var6 = this.iIllliiIllllii.y + 5.0F - this.field_3401.field_3656;
      float var7 = this.iIllliiIllllii.z - this.field_3401.field_3655;
      float var8 = (float)Math.sqrt((double)(var5 * var5 + var6 * var6 + var7 * var7));
      float var9 = a.lliiIiIiIl + 0.5F * a.iliiIiIiIl;
      float var10 = var8 > 1.0E-4F ? -((float)Math.acos((double)iIlIlllllill(var6 / var8, -1.0F, 1.0F))) : var2;
      float var11 = var8 > 1.0E-4F ? (float)Math.atan2((double)(-var5), (double)(-var7)) : var3;
      var10 += 0.3F * var9 + 0.12F * a.iIiiIiIiIl + a.iIlIliIiIl;
      var11 += -0.4F * var9 + a.IllIliIiIl;
      float var12 = liiiIIllIl(var2 + 0.5F, var10, a.IIiiIiIiIl);
      float var13 = liiiIIllIl(var3, var11, a.IIiiIiIiIl);
      float var14 = liiiIIllIl(var4 - 0.12F, 0.0F, a.IIiiIiIiIl);
      this.field_3401.field_3654 = liiiIIllIl(var12, -1.45F, a.lIiiIiIiIl);
      this.field_3401.field_3675 = liiiIIllIl(var13, -0.08F, a.lIiiIiIiIl);
      this.field_3401.field_3674 = liiiIIllIl(var14, 0.0F, a.lIiiIiIiIl);
      float var15 = this.llllliiillllii.x - this.field_3398.field_3657;
      float var16 = this.llllliiillllii.y - this.field_3398.field_3656 - -4.0F;
      float var17 = this.llllliiillllii.z - this.field_3398.field_3655;
      float var18 = iIlIlllllill((float)Math.atan2((double)(-var15), (double)(-var17)), -lIIlliiiIIllii, lIIlliiiIIllii);
      float var19 = iIlIlllllill((float)Math.atan2((double)var16, Math.sqrt((double)(var15 * var15 + var17 * var17))), -IlIlliillIllii, IlIlliillIllii);
      this.field_3398.field_3675 = liiiIIllIl(this.field_3398.field_3675, var18, a.liiiIiIiIl);
      this.field_3398.field_3654 = iIlIlllllill(
         liiiIIllIl(this.field_3398.field_3654, var19, a.liiiIiIiIl) + 0.12F * a.iIiiIiIiIl, -IlIlliillIllii, IlIlliillIllii
      );
      this.field_3398.field_3674 = this.field_3398.field_3674 - (0.12F * a.liiiIiIiIl + 0.06F * a.iIiiIiIiIl) * (var18 / lIIlliiiIIllii);
   }

   static float IilliliilIIi(float power) {
      float var1 = ilillIiIiillIi.IIillIiliIil(power);
      return 0.35F + 0.65F * var1;
   }

   private static float iIlIlllllill(float hi, float v, float lo) {
      return hi < v ? v : (hi > lo ? lo : hi);
   }

   public void method_62110(class_10055 s) {
      super.method_62110(s);
      this.field_3392.field_3675 = 0.07F;
      this.field_3397.field_3675 = -0.07F;
      if (!this.liIlliiiiIllii) {
         this.field_3401.field_3654 = this.field_3401.field_3654 - 0.32F * this.ilIlliiIiIllii;
         this.field_3401.field_3674 += 0.22F;
         this.field_27433.field_3654 += 0.06F;
         if (this.IIllliilIlllii != null) {
            this.IliIlllilIi(this.IIllliilIlllii);
         }
      }
   }
}
